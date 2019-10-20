/**
 * 公司：金刚葫芦娃
 * 文件名：SmartParking
 * 作者：ZhaoJinGang
 * 时间：2019/7/1 18:10
 * 描述：
 */

package com.smartparking.model;

public class SmartParking {

    private Integer id;

    private Integer userId;

    private String garage;

    private Integer garageId;

    private String carport;

    private Long totalTime;


    public Integer getGarageId() {
        return garageId;
    }

    public void setGarageId(Integer garageId) {
        this.garageId = garageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getCarport() {
        return carport;
    }

    public void setCarport(String carport) {
        this.carport = carport;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "SmartParking{" +
                "id=" + id +
                ", userId=" + userId +
                ", garage='" + garage + '\'' +
                ", carport='" + carport + '\'' +
                ", totalTime=" + totalTime +
                '}';
    }
}
