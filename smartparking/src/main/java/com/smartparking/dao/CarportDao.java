package com.smartparking.dao;

import com.smartparking.model.Car;
import com.smartparking.model.CarQuery;
import com.smartparking.model.Carport;
import com.smartparking.model.CarportQuery;

import java.util.List;

public interface CarportDao {

    public void save(Carport carport);

    public List<Carport> selectCarportByCondition(CarportQuery query);

    public Carport selectCarportById(Integer carportId);

    public void updateCarport(CarportQuery query);

    public void updateCarportReserve(Carport carport);

}
