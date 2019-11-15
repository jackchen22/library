package service;

import pojo.User;

import java.util.List;

public interface UserDao {
    public  User login(User user);
    public List<User> selectUser(User user);
    public User selectByname(String name);
    public void insertUser(User user);
    public boolean update(User user);

}
