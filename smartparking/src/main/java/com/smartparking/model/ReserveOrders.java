/**
 * 公司：金刚葫芦娃
 * 文件名：ReserveOrdersService
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 14:56
 * 描述：
 */

package com.smartparking.model;

import java.util.Date;

public class ReserveOrders {

    private Integer reserveOrdersId;

    private Integer userId;

    private Integer carportId;

    private Date startTime;

    private Date endTime;


    private Carport carport;


    public Carport getCarport() {
        return carport;
    }

    public void setCarport(Carport carport) {
        this.carport = carport;
    }

    public Integer getReserveOrdersId() {
        return reserveOrdersId;
    }

    public void setReserveOrdersId(Integer reserveOrdersId) {
        this.reserveOrdersId = reserveOrdersId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarportId() {
        return carportId;
    }

    public void setCarportId(Integer carportId) {
        this.carportId = carportId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
