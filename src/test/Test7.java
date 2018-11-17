package test;

import java.io.File;

public class Test7 {
	public static void main(String[] args) {

		File file = new File("d:/tools/Git");
//		System.out.println(file.list());
//		for (String str : file.list()) {
//			System.out.println(str);
//		}
//		for (File f : file.listFiles()) {
//			System.out.println(f.getName());
//		}
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
		for (File f : file.listFiles()) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
