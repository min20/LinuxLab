import java.io.File;

public class PrintCurrentDir {
	
	public static void main(String[] args) {
		File file = new File("./");
		
		System.out.println(file.getAbsolutePath());
	}

}
