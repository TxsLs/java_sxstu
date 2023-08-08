package org.teach.study.spring.config.impl;

import org.teach.study.spring.config.Config;
import org.teach.study.spring.config.ConfigDao;

/**
 * <b>ConfigDaoImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
public class ConfigDaoImpl implements ConfigDao {

	/** 
	 * save。
	 * @see org.teach.study.spring.config.ConfigDao#insert(org.teach.study.spring.config.Config)
	 */
	@Override
	public void insert(Config config) {
		System.out.println("插入配置:" + config.toString());
	}

}
