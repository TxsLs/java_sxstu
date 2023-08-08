package org.teach.study.spring.hello.impl;

import org.teach.study.spring.hello.HelloDao;

/**
 * <b>HelloDaoImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex20
 * @since 1.0
 */
public class HelloDaoImpl implements HelloDao {
	/**
	 * name。
	 */
	private String name="world";

	/** 
	 * sayHello。
	 * @see org.teach.study.spring.hello.HelloDao#sayHello()
	 */
	@Override
	public void sayHello() {
		System.out.println("Hello " + name);
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
