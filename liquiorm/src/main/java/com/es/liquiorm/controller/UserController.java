package com.es.liquiorm.controller;

import com.es.liquiorm.entity.User;
import com.es.liquiorm.tools.KeyUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by:chenjun
 * 2019-06-25 11:21
 */
@RestController
public class UserController {

    @RequestMapping("/user/save")
    public @ResponseBody User save(String name) {
        User user = new User();
        user.setId(KeyUtil.genUniqueKey());
        user.setUsername(name);
        return user;
    }




}
