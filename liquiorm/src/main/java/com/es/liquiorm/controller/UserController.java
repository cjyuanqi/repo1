package com.es.liquiorm.controller;

import com.es.liquiorm.entity.User;
import com.es.liquiorm.repository.UserRepository;
import com.es.liquiorm.tools.KeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by:chenjun
 * 2019-06-25 11:21
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/user/save")
    public @ResponseBody User save(String username, String password) {
        return userRepository.save(username,password);
    }

    @RequestMapping("/user/findAll")
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
