package org.study_spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study_spring.hello.HelloDao;
import org.study_spring.impl.HelloDaoImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
			HelloDao dao = new HelloDaoImpl();
			dao.sayHello();

			/*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml") ;
				HelloDao dao = ctx.getBean(HelloDao.class);
				dao.sayHello();*/
	
	}
}
