package br.com.ctmait.cachectmaitredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheCtmaitRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheCtmaitRedisApplication.class, args);
	}

}
