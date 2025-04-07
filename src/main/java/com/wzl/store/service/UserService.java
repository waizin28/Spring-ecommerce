package com.wzl.store.service;

import com.wzl.store.entities.User;
import com.wzl.store.repositories.AddressRepository;
import com.wzl.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    public void showEntityState(){
        var user = User.builder()
                .name("John Doe")
                .email("jw@gmail.com")
                .password("Pwds")
                .build();
        userRepository.save(user);
    }

    public void fetchAddress(){
        var address = addressRepository.findById(1L).orElseThrow();
    }
}
