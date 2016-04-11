package net.developia.www.di05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanInit.class);
		
		Iam iam = context.getBean(Iam.class);
		iam.sayIam();
	}

}
