package org.study_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study_spring.hello.HelloDao;
import org.study_spring.impl.HelloDaoImpl;
import org.study_spring.test.Service.TestService;
import org.study_spring.test.dao.TestDao;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		//			HelloDao dao = new HelloDaoImpl();
		//			dao.sayHello();

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
		/*HelloDao dao = ctx.getBean(HelloDao.class);
		dao.sayHello();
		
		dao = (HelloDao) ctx.getBean("HelloDao");
		dao.sayHello();
		ctx.close();*/

		TestService service = ctx.getBean(TestService.class);
		service.sayHello();
		ctx.close();
		
		
		//AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext();
	}
}
