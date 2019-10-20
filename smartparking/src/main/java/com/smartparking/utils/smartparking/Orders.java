/**
 * 公司：金刚葫芦娃
 * 文件名：Orders
 * 作者：ZhaoJinGang
 * 时间：2019/6/27 17:16
 * 描述：
 */

package com.smartparking.utils.smartparking;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders implements WritableComparable<Orders> {

    private Integer garageId;

    private Integer carportId;

    private String licenseNumber;

    private String startTime;

    private String endTime;

    private Long totalTime;

    private Double totalPrice;

    private String isComplete;

    private Integer userId;


    public Orders(){

    }

    public int compareTo(Orders orders) {
        try {
            return this.totalTime > orders.getTotalTime() ? -1:1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(garageId);
        dataOutput.writeInt(carportId);
        dataOutput.writeInt(userId);

        dataOutput.writeChars(licenseNumber);
        dataOutput.writeChars(isComplete);

        dataOutput.writeChars(startTime);
        dataOutput.writeChars(endTime);

        dataOutput.writeDouble(totalPrice);

        dataOutput.writeLong(totalTime);
    }

    public void readFields(DataInput dataInput) throws IOException {
        garageId = dataInput.readInt();
        carportId = dataInput.readInt();
        userId = dataInput.readInt();

        licenseNumber = dataInput.readLine();
        isComplete = dataInput.readLine();

        startTime = dataInput.readLine();
        endTime = dataInput.readLine();

        totalPrice = dataInput.readDouble();
        totalTime = dataInput.readLong();
    }




    public Integer getGarageId() {
        return garageId;
    }

    public void setGarageId(Integer garageId) {
        this.garageId = garageId;
    }

    public Integer getCarportId() {
        return carportId;
    }

    public void setCarportId(Integer carportId) {
        this.carportId = carportId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Long getTotalTime() throws ParseException {
        Date startTimeDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startTime);
        Date endTimeDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endTime);
        return endTimeDate.getTime() - startTimeDate.getTime();
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(String isComplete) {
        this.isComplete = isComplete;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
