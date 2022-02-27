package FactoryTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
	Resource ac=new ClassPathResource("FactoryTest/applicationContext.xml");
	BeanFactory b=new XmlBeanFactory(ac);
	A aa=(A)b.getBean("a");
	aa.msg();
	
	}

}
