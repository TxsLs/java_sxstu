package org.stu.maven.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * <b>学习common-io。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
public final class StudyIO {
	private StudyIO() {

	}

	public static void studyIOUtils() throws IOException {
		File dir = SystemUtils.getUserDir();
		File file = new File(dir, "pom.xml");
		System.out.println(file);
		FileUtils.copyFile(file, new File("d:\\aa.txt"));

		FileInputStream fis = FileUtils.openInputStream(file);
		try {
			List<String> list = IOUtils.readLines(fis, "utf-8");
			list.forEach(str -> System.out.println(str));
		} finally {
			IOUtils.close(fis);
		}

	}
}
