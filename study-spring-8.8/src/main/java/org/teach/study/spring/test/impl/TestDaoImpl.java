package org.teach.study.spring.test.impl;

import org.springframework.stereotype.Repository;
import org.teach.study.spring.test.TestDao;

/**
 * <b>TestDaoImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
@Repository
public class TestDaoImpl implements TestDao {

	@Override
	public void sayTest() {
		System.out.println("dao测试方法：sayTest");		
	}

}
