package com.smartparking.dao;

import com.smartparking.model.Car;
import com.smartparking.model.CarQuery;
import com.smartparking.model.User;
import com.smartparking.model.UserQuery;

import java.util.List;

public interface CarDao {

    public void saveCar(Car car);

    public void deleteCar(Integer id);

    public List<Car> selectCarAll();

    public Car selectCarById(Integer id);

    public List<Car> selectCarByUserId(Integer id);

}
