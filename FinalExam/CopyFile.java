import java.io.*;
import java.util.*;

public class CopyFile {
	public static void main(String[] args)
		throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Source File Dir: ");
		String input = scanner.nextLine();

		System.out.print("Target File Dir: ");
		String output = scanner.nextLine();

		FileInputStream fis = new FileInputStream(input);
		FileOutputStream fos = new FileOutputStream(output);

		int data = 0;
	
		do {
			data = fis.read();
			fos.write(data);
		} while (data != -1);

		fis.close();
		fos.close();
	}

}

