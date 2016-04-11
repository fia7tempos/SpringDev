package net.developia.www.di07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.ClassUtils;

public class TVuser {
	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext(
				ClassUtils.classPackageAsResourcePath(TVuser.class) + "/beaninit.xml");
		
		System.out.println("----------------------------------------");
		TV tv = (TV) context.getBean("tv"); /* new LgTV(); */
		System.out.println("----------------------------------------");
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();		
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
