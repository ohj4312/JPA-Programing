package com.myjpa.bookmanger.repository;

import com.myjpa.bookmanger.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //springcontext를 로딩해서 test에 활용하겠다는 의미
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){ //create, read, update, delete
        userRepository.save(new  User());

        System.out.println(">>>"+userRepository.findAll());
    }
}