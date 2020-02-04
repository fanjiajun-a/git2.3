package com.jun.dao;

import com.jun.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author
 * @date 2020-02-03 17:43
 */
@Mapper
public interface UserDao {


    public List<Users>findAll();
}
