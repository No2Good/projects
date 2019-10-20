/**
 * 公司：金刚葫芦娃
 * 文件名：UserServiceImpl
 * 作者：ZhaoJinGang
 * 时间：2019/6/26 22:05
 * 描述：
 */

package com.smartparking.service.impl;

import com.smartparking.dao.UserDao;
import com.smartparking.model.User;
import com.smartparking.model.UserQuery;
import com.smartparking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    public String register(User user) {
        UserQuery userQuery = new UserQuery();
        userQuery.setUserAccount(user.getUserAccount());
        List<User> userList = userDao.selectUsertByCondition(userQuery);
        if (userList != null  && userList.size() > 0){
            User user1 = userList.get(0);
            if (user.getPassword().equals(user1.getPassword())){
                return "yes";
            }
        }
        return "no";
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public List<User> selectUserAll() {
        return userDao.selectUserAll();
    }

    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    public List<User> selectUsertByCondition(UserQuery query) {
        return userDao.selectUsertByCondition(query);
    }
}
