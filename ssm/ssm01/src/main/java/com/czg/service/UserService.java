package com.czg.service;

import com.czg.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    User queryById(int id);
}
