package org.teach.study.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teach.study.spring.config.Config;
import org.teach.study.spring.config.ConfigService;
import org.teach.study.spring.hello.HelloDao;
import org.teach.study.spring.test.TestService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		testConfig();
		//test();
		//hello();
	}

	private static void hello() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		HelloDao dao = (HelloDao) context.getBean("hello");
		dao.sayHello();
		dao = context.getBean(HelloDao.class);
		dao.sayHello();
		context.close();
	}

	private static void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		TestService service = context.getBean(TestService.class);
		service.sayTest();
		context.close();
	}

	private static void testConfig() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		ConfigService service = context.getBean(ConfigService.class);
		service.add(new Config("新配置", "https://gitee.com/TxsLS/sxstu"));
		context.close();
	}
}
