package com.smartparking.service;

import com.smartparking.model.Garage;

public interface GarageService {

    public Garage selectGarageById(Integer garageId);

    public Garage selectGarageByGarageName(String garageName);

}
