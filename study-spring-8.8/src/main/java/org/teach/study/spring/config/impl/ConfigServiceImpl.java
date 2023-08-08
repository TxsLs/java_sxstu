package org.teach.study.spring.config.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.teach.study.spring.config.Config;
import org.teach.study.spring.config.ConfigDao;
import org.teach.study.spring.config.ConfigService;

/**
 * <b>ConfigServiceImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
public class ConfigServiceImpl implements ConfigService {
	/**
	 * dao。
	 */
	@Autowired
	private ConfigDao dao;

	/** 
	 * add。
	 * @see org.teach.study.spring.config.ConfigService#add(org.teach.study.spring.config.Config)
	 */
	@Override
	public void add(Config config) {
		dao.insert(config);
	}

}
