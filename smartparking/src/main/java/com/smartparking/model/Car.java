/**
 * 公司：金刚葫芦娃
 * 文件名：Car
 * 作者：ZhaoJinGang
 * 时间：2019/6/26 11:31
 * 描述：
 */

package com.smartparking.model;

public class Car {

    private Integer carId;

    private Integer userId;

    private String licenseNumber;


    private User user;



    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
