package com.smartparking.service;

import com.smartparking.model.Car;
import com.smartparking.model.CarQuery;
import com.smartparking.model.User;

import java.util.List;

public interface CarService {

    public void saveCar(Car car);

    public void deleteCar(Integer id);

    public List<Car> selectCarAll();

    public Car selectCarById(Integer id);

    public List<Car> selectCarByUserId(Integer id);

}
