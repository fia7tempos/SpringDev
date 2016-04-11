package net.developia.www.di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.ClassUtils;

public class TVuser {
	public static void main(String[] args) {
		// config.xml 파일 연결하기

		// Resource resource = new
		// ClassPathResource("net/developia/www/di01/beaninit.xml");
		// BeanFactory context = new XmlBeanFactory(resource);

		// ApplicationContext context =
		// new
		// ClassPathXmlApplicationContext("net/developia/www/di01/beaninit.xml",TVuser.class);

		// AnnotationConfigApplicationContext context =
		// new
		// AnnotationConfigApplicationContext("net/developia/www/di01/beaninit.xml");

		ApplicationContext context = new GenericXmlApplicationContext(
				ClassUtils.classPackageAsResourcePath(TVuser.class) + "/beaninit.xml");
		System.out.println("----------------------------------------");
		TV tv = (TV) context.getBean("stv"); /* new LgTV(); */
		System.out.println("----------------------------------------");
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();		
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();

		// TV tv2 = (TV) context.getBean("tv");
		// System.out.println(tv.hashCode());
		// System.out.println(tv2.hashCode());
	}

}
