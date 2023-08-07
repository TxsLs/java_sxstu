package org.study_spring.impl;

import org.study_spring.hello.HelloDao;

/**
 * <b>HelloDaoImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author 刘
 * @since 1.0
 */
public class HelloDaoImpl implements HelloDao {

	/** 
	 * sayHello。
	 * @see org.study_spring.hello.HelloDao#sayHello()
	 */
	@Override
	public void sayHello() {
		System.out.println("hello Spring!!!!!!");

	}

}
