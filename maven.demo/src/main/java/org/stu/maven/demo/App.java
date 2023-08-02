package org.stu.maven.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.quincy.rock.core.util.IOUtil;
import org.quincy.rock.core.util.StringUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		testIO();
		testLang();
		// System.out.println( "Hello World!" );
	}

	private static void testLang() {
		//				System.out.print("hhhhh123123" + "\n");
		//		
		//				System.out.print("hello" + "\n");
		//		
		//				String str = " ";
		//		
		//				String str1 = "e";
		//				if (str1 == null || str1.equals("") || str1.trim().equals("")) {
		//					System.out.println("dasd");
		//				}
		//				if (StringUtils.isEmpty(str)) {
		//					System.out.println("str is null!");
		//				}
		//		
		//				if (StringUtils.isBlank(str)) {
		//					System.out.println("str is Blank!");
		//				}
		String strr = "      ";
		//		System.out.println("6." + strr + ".");
		//		strr = StringUtils.trim(strr);
		//		System.out.println("7." + strr + ".");
		//
		//		strr = " 1 23 ";
		//		System.out.println("8." + strr + ".");
		//		strr = StringUtils.trim(strr);
		//		System.out.println("9." + strr + ".");
		//		System.out.println();

		//	Object[] arr=new Object[] {"123", "456", "7890"};		
		//		Object[] arr = new Object[4];
		//		arr[0] = "123";
		//		arr[1] = "456";
		//		arr[2] = "789";
		//		arr[3]="ls";
		//		strr = StringUtils.joinWith("@", arr);
		//		System.out.println(strr);
		//		strr = StringUtils.joinWith("./*-", "123", "456", "789");
		//		System.out.println(strr);

		//		strr = SystemUtils.getHostName();
		//		System.out.println("主机名：" + strr);
		//		strr = SystemUtils.getUserName();
		//		System.out.println("用户名：" + strr);
		//
		//		File file = SystemUtils.getJavaHome();
		//		System.out.println("java变量：" + file);
		//		file = SystemUtils.getJavaIoTmpDir();
		//		System.out.println("java临时目录：" + file);
		//		file = SystemUtils.getUserDir();
		//		System.out.println("java用户目录：" + file);
		//		System.out.println("is java 8:"+SystemUtils.IS_JAVA_1_8);
		//		System.out.println("is java 11:"+SystemUtils.IS_JAVA_11);
		//		if(SystemUtils.IS_OS_WINDOWS_10) {
		//			System.out.println("shi");
		//		}else {
		//			System.out.println("bu");
		//		}

	}

	private static void testIO() {
		File dir = SystemUtils.getUserDir();
		System.out.println(dir);
		//File srcfile = new File(dir, "pom.xml");
		File destFile = new File("D:\\文档\\StudyTxs\\shixun\\pom.xml");
		//
		//		try {
		//			FileUtils.copyFile(srcfile, destFile);
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		System.out.println(destFile.exists());

		try {
			FileInputStream fis = FileUtils.openInputStream(destFile);

			try {
				//				List<String> list = IOUtils.readLines(fis, "utf-8");
				List<String> list = IOUtils.readLines(fis, StringUtil.UTF_8);
				//				for (String lis : list) {
				//
				//					System.out.println(lis);
				//				}

				//				for(int i=0,l=list.size();i<l;i++) {
				//					String string=list.get(i);
				//					System.out.println(string);
				//				}

				//				list.forEach(new Consumer<String>() {
				//					@Override
				//					public void accept(String line) {
				//						System.out.println(line);
				//						
				//					}
				//				});

				//表达式
				list.forEach(line -> System.out.println(line));

			} finally {
				//fis.close();
				//IOUtils.close(fis);
				IOUtil.closeQuietly(fis);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	
	
}
