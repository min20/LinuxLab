import java.io.*;
import java.util.*;

public class MakeFile {
	static Random random = new Random();
	static final String PRE = "file_";
	static final String STR = "This is file\n" + "Bye Bye~\n";

	public static void main(String[] args)
		throws IOException {
		
		String fileName = PRE + random.nextInt(100);
		File file = new File("./", fileName);
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		bos.write(STR.getBytes());
		bos.close();
		fos.close();
	}

}
