package org.teach.study.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.teach.study.spring.config.ConfigDao;
import org.teach.study.spring.config.ConfigService;
import org.teach.study.spring.config.impl.ConfigDaoImpl;
import org.teach.study.spring.config.impl.ConfigServiceImpl;

/**
 * <b>Spring配置类。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
@Configuration
@ComponentScan("org.teach.study.spring.test.impl")
public class SpringConfig {

	@Bean
	public ConfigDao getConfigDao() {
		return new ConfigDaoImpl();
	}

	@Bean
	public ConfigService getConfigService() {
		return new ConfigServiceImpl();
	}
}
