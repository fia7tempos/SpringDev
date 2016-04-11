package net.developia.www.di03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.ClassUtils;

public class TVuser {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext(
				ClassUtils.classPackageAsResourcePath(TVuser.class) + "/beaninit.xml");
		TV tv = (TV) context.getBean("lgTV"); /* new LgTV(); */
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();		
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}

}
