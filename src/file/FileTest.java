package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\how2j\\filetest\\1", "a.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		
		System.out.println(file.getAbsoluteFile().getAbsolutePath());
		System.out.println(file.getParentFile().getAbsolutePath());
		
		//file.createNewFile();
	}

}
