package net.developia.www.di06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Product {
	
	@Bean
	Speaker orangeSpeaker(){
		return new OrangeSpeaker();
	}
	
	@Bean
	TV lgTV(){
		return new LgTV();
	}
}
