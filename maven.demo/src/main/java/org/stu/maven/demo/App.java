package org.stu.maven.demo;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		testLang();
		// System.out.println( "Hello World!" );
	}

	private static void testLang() {
		//		System.out.print("hhhhh123123" + "\n");
		//
		//		System.out.print("hello" + "\n");
		//
		//		String str = " ";
		//
		//		String str1 = "e";
		//		if (str1 == null || str1.equals("") || str1.trim().equals("")) {
		//			System.out.println("dasd");
		//		}
		//		if (StringUtils.isEmpty(str)) {
		//			System.out.println("str is null!");
		//		}
		//
		//		if (StringUtils.isBlank(str)) {
		//			System.out.println("str is Blank!");
		//		}
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

		strr = StringUtils.joinWith("./*-", "123", "456", "789");
		System.out.println(strr);

	}

}
