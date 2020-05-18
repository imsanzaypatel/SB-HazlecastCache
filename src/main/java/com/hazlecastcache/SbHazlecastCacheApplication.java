package com.hazlecastcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SbHazlecastCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHazlecastCacheApplication.class, args);
	}

}
