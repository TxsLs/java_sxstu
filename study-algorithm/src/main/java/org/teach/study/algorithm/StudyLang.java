package org.teach.study.algorithm;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * <b>学习Common-Long3。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
public final class StudyLang {
	private StudyLang() {
	}

	public static void studyStringUtils_isBlank() {
		String str = null;
		boolean ok = StringUtils.isBlank(str);
		System.out.println(str + " isBlank: " + ok);

		str = "";
		ok = StringUtils.isBlank(str);
		System.out.println(str + " isBlank: " + ok);

		str = " ";
		ok = StringUtils.isBlank(str);
		System.out.println(str + " isBlank: " + ok);

		str = "         ";
		ok = StringUtils.isBlank(str);
		System.out.println(str + " isBlank: " + ok);

		str = "  a";
		ok = StringUtils.isBlank(str);
		System.out.println(str + " isBlank: " + ok);
	}

	public static void studyStringUtils_isEmpty() {
		String str = null;
		boolean ok = StringUtils.isEmpty(str);
		System.out.println(str + " isEmpty: " + ok);

		str = "";
		ok = StringUtils.isEmpty(str);
		System.out.println(str + " isEmpty: " + ok);

		str = " ";
		ok = StringUtils.isEmpty(str);
		System.out.println(str + " isEmpty: " + ok);
	}

	public static void studyStringUtils_isAnyBlank() {
		boolean ok = StringUtils.isAnyBlank(null, "123", "abc");
		System.out.println("isAnyBlank: " + ok);

		ok = StringUtils.isAnyBlank("", "123", "abc");
		System.out.println("isAnyBlank: " + ok);

		ok = StringUtils.isAnyBlank(" ", "123", "abc");
		System.out.println("isAnyBlank: " + ok);

		ok = StringUtils.isAnyBlank("cc", "123", "abc");
		System.out.println("isAnyBlank: " + ok);
	}

	public static void studyStringUtils_isAnyEmpty() {
		boolean ok = StringUtils.isAnyEmpty(null, "123", "abc");
		System.out.println("isAnyEmpty: " + ok);

		ok = StringUtils.isAnyEmpty("", "123", "abc");
		System.out.println("isAnyEmpty: " + ok);

		ok = StringUtils.isAnyEmpty(" ", "123", "abc");
		System.out.println("isAnyEmpty: " + ok);

		ok = StringUtils.isAnyEmpty("cc", "123", "abc");
		System.out.println("isAnyEmpty: " + ok);
	}

	public static void studySystemUtils() {
		File file = SystemUtils.getJavaHome();
		System.out.println("java_home="+file);
		
		file=SystemUtils.getUserDir();
		System.out.println("user_dir="+file);
		
		file=SystemUtils.getJavaIoTmpDir();
		System.out.println("tmp_dir="+file);
		
		String str=SystemUtils.getHostName();
		System.out.println("host_name="+str);
		
		boolean ok=SystemUtils.IS_JAVA_1_8;
		System.out.println("isJdk8="+ok);
		
		ok=SystemUtils.IS_OS_WINDOWS;
		System.out.println("isWindow="+ok);
	}

}
