import java.util.Random;

public class GetPi implements Runnable {
	final static int TOTAL_SPOT = 1000000000;
	final static int TOTAL_THREAD = 100;
	static double IN_SPOT = 0;

	public static void main(String[] args) throws InterruptedException {
		GetPi getPi = new GetPi();
		Thread[] threads = new Thread[TOTAL_THREAD];
		
		System.out.println("Number Of Spots  : " + TOTAL_SPOT);
		System.out.println("Number Of Threads: " + TOTAL_THREAD);

		for (int idx = 0 ; idx < TOTAL_THREAD ; idx++) {
			threads[idx] = new Thread(getPi);
			threads[idx].start();
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

		Random random = new Random();

		float x = 0;
		float y = 0;

		for (int idx = 0 ; idx < TOTAL_SPOT / TOTAL_THREAD ; idx++) {
			x = random.nextFloat();
			y = random.nextFloat();

			if (x*x + y*y <= 1)
				localSpot++;
		}

		synchronized(this) {
			IN_SPOT = IN_SPOT + localSpot;
		}
	}

}
