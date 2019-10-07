package com.czg.mapper;

import com.czg.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    List<User> getUsers();

    int addUser(User user);

    int deleteUser(@Param("id") int id);

    int updateUser(User user);

    User queryById(@Param("id") int id);
}
