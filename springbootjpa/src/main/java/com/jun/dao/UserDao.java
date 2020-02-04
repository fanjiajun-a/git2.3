package com.jun.dao;

import com.jun.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author
 * @date 2020-02-04 9:40
 */

public interface UserDao extends JpaRepository<Users,Integer> {
}
