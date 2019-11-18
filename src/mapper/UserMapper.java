package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    public User login(User user);
    public List<User> selectUser(User user);
    public void insertUser(User user);
    public boolean userupdate(User user);
    public User selectByname(String name);
    public void deleteUser(Integer id);
    public void pwdUpdate(User user);
}
