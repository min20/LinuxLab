import java.io.File;

public class GetFileList {
	static final int MAX = 512;

	public static void main(String[] args) {
		File file = new File("./");
		String[] arrayStr = new String[MAX];

		if (file.isDirectory()) {
			arrayStr = file.list();
		}
		else {
			System.err.printf("%s is not directory", file.getName());
			System.exit(1);
		}

		for (String str : arrayStr) {
			System.out.println(str);
		}
	}

}
