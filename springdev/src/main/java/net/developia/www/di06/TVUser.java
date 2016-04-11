package net.developia.www.di06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVUser {
	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(Product.class);
		
		// TV tv = context.getBean(TV.class); // 
		TV tv = (TV) context.getBean("lgTV"); // Config 클래스에서 메서드 이름 = id(name)
		tv.powerOn();
		tv.powerOff();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
	}

}
