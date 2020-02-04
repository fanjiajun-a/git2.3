package com.jun.controller;

import com.jun.dao.UserDao;
import com.jun.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @date 2020-02-03 17:45
 */
@RestController
public class UserController {


    @Autowired
    private UserDao userDao;

    @GetMapping("findAll")
    public List<Users>findAll(){
        List<Users> usersList = userDao.findAll();
        for (Users users : usersList) {
            System.out.println(users);
            
        }
        return usersList;
    }
}
