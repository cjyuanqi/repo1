package com.es.liquiorm.repository;

import com.es.liquiorm.entity.User;
import com.es.liquiorm.tools.KeyUtil;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by:chenjun
 * 2019-06-25 13:50
 */
@Repository
public class UserRepository {

    public User save(String username, String password) {
        return new User(KeyUtil.genUniqueKey(),username,password);
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        list.add(new User(KeyUtil.genUniqueKey(),"zhangsan",null));
        list.add(new User(KeyUtil.genUniqueKey(), "lisi", null));
        list.add(new User(KeyUtil.genUniqueKey(),"wangwu",null));
        return list;
    }
}
