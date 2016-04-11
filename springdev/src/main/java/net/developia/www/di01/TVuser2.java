package net.developia.www.di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.ClassUtils;

public class TVuser2 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext(
			ClassUtils.classPackageAsResourcePath(TVuser2.class)+"/beaninit.xml");
		TV tv = (TV) context.getBean("ntv");
		
		tv.powerOn();
		tv.channelUp();
		tv.soundUp();
		tv.soundDown();
		tv.channelDown();
		tv.powerOff();
	}

}
