package org.study_spring.test.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study_spring.test.Service.TestService;
import org.study_spring.test.dao.TestDao;

/**
 * <b>TestServiceImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author 刘
 * @since 1.0
 */

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao dao;

	/** 
	 * sayHello。
	 * @see org.study_spring.test.Service.TestService#sayHello()
	 */
	@Override
	public void sayHello() {
		dao.sayTest();

	}

}
