package com.example.user.controller;


import com.example.user.eneity.User;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository ur;

    @Value("${server.port}")
    private String port;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {

        System.out.print("++++++++++++++++"+port+"\n");
        return this.ur.findById(id).get();
    }

}
