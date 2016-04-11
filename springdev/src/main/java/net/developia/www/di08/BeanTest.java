package net.developia.www.di08;

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
		Iam iam2 = (Iam) context.getBean("iam2");
		iam2.sayIam();
	}
}
