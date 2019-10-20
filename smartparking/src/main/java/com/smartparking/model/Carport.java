/**
 * 公司：金刚葫芦娃
 * 文件名：Carport
 * 作者：ZhaoJinGang
 * 时间：2019/6/25 18:07
 * 描述：
 */

package com.smartparking.model;

import java.util.Date;

public class Carport {

    private Integer carportId;

    private Integer garageId;

    private String cposition;

    private String isUse;

    private Date endTime;


    private Garage garage;



    public Integer getCarportId() {
        return carportId;
    }

    public void setCarportId(Integer carpostId) {
        this.carportId = carpostId;
    }

    public String getCposition() {
        return cposition;
    }

    public void setCposition(String cposition) {
        this.cposition = cposition;
    }

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Integer getGarageId() {
        return garageId;
    }

    public void setGarageId(Integer garageId) {
        this.garageId = garageId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
