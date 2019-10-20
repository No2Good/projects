package com.smartparking.dao;

import com.smartparking.model.Carport;
import com.smartparking.model.CarportQuery;
import com.smartparking.model.Garage;

import java.util.List;

public interface GarageDao {

    public Garage selectGarageById(Integer garageId);

    public Garage selectGarageByGarageName(String garageName);

}
