package net.developia.www.di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.ClassUtils;

public class BeanTest {
	public static void main(String[] args) {
		ApplicationContext context = 
			new GenericXmlApplicationContext(
					ClassUtils.classPackageAsResourcePath(BeanTest.class)+"/beaninit.xml");
		Iam iam = (Iam) context.getBean("iam");
		iam.sayIam();
	}
}
