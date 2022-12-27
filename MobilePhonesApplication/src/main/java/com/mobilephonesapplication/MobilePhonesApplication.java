package com.mobilephonesapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mobilephonesapplication.mapper.MobilePhoneMapper;
import com.mobilephonesapplication.mapper.MobilePhoneMapperImpl;

@SpringBootApplication
public class MobilePhonesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilePhonesApplication.class, args);
	}
	
	@Bean
	public MobilePhoneMapper getMapper() {
		return new MobilePhoneMapperImpl();
	}
	
}
