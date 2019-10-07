package com.czg.mapper;

import com.czg.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: czg
 * @create: 2019-10-06 19:32
 */
public class UserMappperTest {


    @Test
    public void getUsersTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserMapper mapper = (UserMapper) context.getBean("userMapper");

        List<User> users = mapper.getUsers();

        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
