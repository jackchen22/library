package service;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<User> selectUser(User user) {
        return userMapper.selectUser (user);
    }

    @Override
    public User selectByname(String name) {
        return userMapper.selectByname(name);
    }

    @Override
    public void insertUser(User user) {
 userMapper.insertUser (user);
    }

    @Override
    public boolean update(User user) {
        return userMapper.update(user);
    }
}
