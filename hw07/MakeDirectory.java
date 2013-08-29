import java.io.*;
import java.util.*;

public class MakeDirectory {
	static Random random = new Random();
	static final String PRE = "dir_";

	public static void main(String[] args)
		throws FileNotFoundException {
		
		boolean isCreate = false;
		String dirName = PRE + random.nextInt(100);
		File file = new File("./", dirName);

		if (file.exists()) {
			System.err.printf("%s exists!\n", dirName);
			System.exit(1);
		}
		else {
			isCreate = file.mkdir();
		}

		if (isCreate) {
			System.out.printf("created %s", file.getAbsolutePath());
		}
		else {
			System.out.println("fail to create");
		}
	}

}
