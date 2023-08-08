package org.teach.study.spring.test.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teach.study.spring.test.TestDao;
import org.teach.study.spring.test.TestService;

/**
 * <b>TestServiceImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
@Service
public class TestServiceImpl implements TestService {
	/**
	 * testDao。
	 */
	@Autowired
	private TestDao testDao;
	
	/** 
	 * sayTest。
	 * @see org.teach.study.spring.test.TestService#sayTest()
	 */
	@Override
	public void sayTest() {
		System.out.println("service测试方法调用dao测试方法begin.");
		testDao.sayTest();
		System.out.println("service测试方法调用dao测试方法end.");		
	}

}
