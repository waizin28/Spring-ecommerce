package com.wzl.store;

import com.wzl.store.entities.Profile;
import com.wzl.store.entities.Tag;
import com.wzl.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var user = User.builder()
//				.name("John")
//				.password("password")
//				.email("john@codewithmosh.com")
//				.build();
//
//		var profile = Profile.builder()
//				.bio("bio")
//				.build();
//
//		user.setProfile(profile);
//		profile.setUser(user);
//
//		System.out.println(user);
	}

}
