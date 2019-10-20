/**
 * 公司：金刚葫芦娃
 * 文件名：User
 * 作者：ZhaoJinGang
 * 时间：2019/6/26 11:30
 * 描述：
 */

package com.smartparking.model;

import java.util.List;

public class User {

    private Integer userId;

    private String userName;

    private String userAccount;

    private String password;

    private Double balance;


    private List<Car> carList;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

}
