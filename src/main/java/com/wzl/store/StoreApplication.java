package com.wzl.store;

import com.wzl.store.entities.Tag;
import com.wzl.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var user = new User();
		user.setName("Jon");

		var tag = new Tag("tag1");

	}

}
