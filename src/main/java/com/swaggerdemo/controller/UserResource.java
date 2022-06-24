//package com.swaggerdemo.controller;
//
//import com.swaggerdemo.entity.User;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Arrays;
//import java.util.List;
//
//@RestController
//@RequestMapping("v1/user")
//public class UserResource {
//
//    @GetMapping
//    public List<User> getUsers() {
//        return Arrays.asList(
//                new User("John", 3000),
//                new User("Kevin", 2000)
//        );
//    }
//
//    @GetMapping("/{userName}")
//    public User getUser(@PathVariable("userName") String userName) {
//        return new User(userName, 2000);
//    }
//
//}
