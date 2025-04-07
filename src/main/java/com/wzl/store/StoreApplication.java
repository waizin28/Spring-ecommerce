package com.wzl.store;

import com.wzl.store.entities.Address;
import com.wzl.store.entities.User;
import com.wzl.store.repositories.AddressRepository;
import com.wzl.store.repositories.UserRepository;
import com.wzl.store.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var service = context.getBean(UserService.class);
		service.persistRelated();
//		repository.deleteById(1L);

	}

}
