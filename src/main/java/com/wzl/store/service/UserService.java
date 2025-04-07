package com.wzl.store.service;

import com.wzl.store.entities.Address;
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

    public void persistRelated(){
        var user = User.builder()
                .name("John")
                .email("john@gmail,com")
                .password("pw")
                .build();

        var address = Address.builder()
                .street("street2")
                .state("WI")
                .zip("55428")
                .city("Madison")
                .build();

        user.addAddress(address);
        userRepository.save(user);
    }

}
