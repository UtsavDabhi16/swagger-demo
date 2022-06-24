package com.swaggerdemo.entity;

public class User {

    private String userName;
    private Integer salary;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public User(String userName, Integer salary) {
        this.userName = userName;
        this.salary = salary;
    }
}
