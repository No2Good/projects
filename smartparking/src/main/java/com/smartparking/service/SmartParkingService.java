package com.smartparking.service;

import com.smartparking.model.Carport;
import com.smartparking.model.SmartParking;

import java.util.List;

public interface SmartParkingService {

    public void save(SmartParking smartParking);

    public List<SmartParking> selectSmartParkingByCondition(SmartParking smartParking);

    public void delete();

    public void update(SmartParking smartParking);

}
