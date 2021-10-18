package com.myjpa.bookmanger.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test(){

        //@NoArgsCoustructor
        User user=new User();
        user.setEmail("hj@aaa.com");
        user.setName("현지");

        //@AllAgsConstructor
        User user1=new User(null,"현지","hj@aaa.com", LocalDateTime.now(),LocalDateTime.now());
        //@RequireAgsConstructor
        User user2=new User("현지","hj@aaa.com");
        //@Builder
        User user3=User.builder().name("현지").email("hj@aaa.com").build();

        System.out.println(">>> "+user);
    }
}