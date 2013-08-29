import java.util.Random;

public class GetPi implements Runnable {
	final static int TOTAL_SPOT = 100000000;
	final static int TOTAL_THREAD = 10;
	static double IN_SPOT = 0;

	static Random random = new Random();
	
	public static void main(String[] args) throws InterruptedException {
		GetPi getPi = new GetPi();
		Thread[] threads = new Thread[TOTAL_THREAD];
		
		System.out.println("Number Of Spots  : " + TOTAL_SPOT);
		System.out.println("Number Of Threads: " + TOTAL_THREAD);

		for (int idx = 0 ; idx < TOTAL_THREAD ; idx++) {
			threads[idx] = new Thread(getPi);
		}

		for (Thread thread : threads) {
			thread.start();
		}

		for (Thread thread : threads) {
			thread.join();
		}

		System.out.println(pi());
	}

	static double pi() {
		return (IN_SPOT / TOTAL_SPOT * 4);
	}

	public void run() {
		int localSpot = 0;

		double x = 0;
		double y = 0;

		for (int idx = 0 ; idx < TOTAL_SPOT / TOTAL_THREAD ; idx++) {
			x = random.nextDouble();
			y = random.nextDouble();

			if (x*x + y*y <= 1)
				localSpot++;
		}

		System.out.println(localSpot);

		synchronized(this) {
			IN_SPOT = IN_SPOT + localSpot;
		}
	}

}
