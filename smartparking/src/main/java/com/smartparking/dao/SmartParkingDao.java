package com.smartparking.dao;

import com.smartparking.model.Carport;
import com.smartparking.model.SmartParking;

import java.util.List;

public interface SmartParkingDao {

    public void save(SmartParking smartParking);

    public List<SmartParking> selectSmartParkingByCondition(SmartParking smartParking);

    public void delete();

    public void update(SmartParking smartParking);

}
