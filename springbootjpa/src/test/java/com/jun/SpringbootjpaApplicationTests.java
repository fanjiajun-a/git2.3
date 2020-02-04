package com.jun;

import com.jun.dao.UserDao;
import com.jun.pojo.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootjpaApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

        List<Users> usersList = userDao.findAll();
        for (Users users : usersList) {
            System.out.println(users);

        }
    }

}
