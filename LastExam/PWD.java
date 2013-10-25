import java.io.*;
import java.util.*;

public class PWD {
	public static void main(String[] args)
		throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Directory: ");
		String dir = scanner.nextLine();

		System.out.print("Filename: ");
		String file = scanner.nextLine();

		File target = new File(dir + file);

		if (target.exists())
			System.out.println(target.getAbsolutePath());
		else
			System.out.println("File not exist");
	}

}

