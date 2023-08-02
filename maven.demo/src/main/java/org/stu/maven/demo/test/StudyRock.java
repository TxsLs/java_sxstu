package org.stu.maven.demo.test;

import org.quincy.rock.core.util.DateUtil;
import org.quincy.rock.core.util.RockUtil;
import org.slf4j.Logger;

/**
 * <b>StudyRock。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
public final class StudyRock {
	/**
	 * logger。
	 */
	private static Logger logger = RockUtil.getLogger(StudyRock.class);

	private StudyRock() {

	}

	public static void studyRockUtil_DupleStartup() {
		if (RockUtil.isDupleStartup("myapp")) {
			throw new UnsupportedOperationException("不支持重复启动");
		}
		logger.info("程序已经启动...");
		DateUtil.sleep(1000 * 5);

		logger.info("程序已经退出。");
	}

}
