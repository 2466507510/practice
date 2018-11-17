package reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File springfile=new File("D:\\how2j\\workspaces\\practice\\src\\spring.txt");
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream(springfile));
			String className=properties.getProperty("class");
			String methodName=properties.getProperty("method");
			
			//根据类名称获取类对象
			Class clazz=Class.forName(className);
			//根据方法名获取方法对象
			Method m=clazz.getMethod(methodName);
			//获取构造器
			Constructor c=clazz.getConstructor();
			//根据构造器实例化出对象
			Object service=c.newInstance();
			//调用指定对象的方法
			m.invoke(service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
