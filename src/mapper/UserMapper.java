package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    public User login(User user);
    public List<User> selectUser(User user);
    public void insertUser(User user);
    public boolean update(User user);
    public User selectByname(String name);
}
