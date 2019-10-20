package com.smartparking.dao;

import com.smartparking.model.User;
import com.smartparking.model.UserQuery;

import java.util.List;

public interface UserDao {

    public void saveUser(User user);

    public void deleteUser(Integer id);

    public void updateUser(User user);

    public List<User> selectUserAll();

    public User selectUserById(Integer id);

    public List<User> selectUsertByCondition(UserQuery query);

}
