package org.self.learn;

import org.self.learn.actor.Teachership;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanDirector {

	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("C:\\Users\\Sunayana\\Workspace\\SpringDIAndAPO\\src\\main\\resources\\spring-application-context.xml"));
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-application-context.xml");
		try {
			Teachership teachership = (Teachership) appContext.getBean("org.self.learn.actor.teachership");
			System.out.println(teachership.teach());
		} catch (BeansException e) {
			System.out.println(e.getMessage());
		}finally {
			((ClassPathXmlApplicationContext)appContext).close();
		}
		
	}
	
}
