package com.czg.pojo;

/**
 * @program: ssm
 * @description:
 * @author: czg
 * @create: 2019-10-06 18:16
 */
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private Integer tid;

    public User() {
    }

    public User(Integer id, String name, Integer age, Integer tid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tid = tid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
