/**
 * 公司：金刚葫芦娃
 * 文件名：Garage
 * 作者：ZhaoJinGang
 * 时间：2019/6/26 11:31
 * 描述：
 */

package com.smartparking.model;

import java.util.List;

public class Garage {

    private Integer garageId;

    private String garageName;

    private Double price;


    private List<Carport> carportList;



    public Integer getGarageId() {
        return garageId;
    }

    public void setGarageId(Integer garageId) {
        this.garageId = garageId;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Carport> getCarportList() {
        return carportList;
    }

    public void setCarportList(List<Carport> carportList) {
        this.carportList = carportList;
    }
}
