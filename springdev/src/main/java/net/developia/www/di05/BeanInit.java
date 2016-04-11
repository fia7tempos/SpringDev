package net.developia.www.di05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInit {
	
	@Bean
	IamImpl iam(){
		return new IamImpl();
	}
	
}
