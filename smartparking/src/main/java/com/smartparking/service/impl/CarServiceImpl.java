/**
 * 公司：金刚葫芦娃
 * 文件名：CarServiceImpl
 * 作者：ZhaoJinGang
 * 时间：2019/6/27 15:15
 * 描述：
 */

package com.smartparking.service.impl;

import com.smartparking.dao.CarDao;
import com.smartparking.model.Car;
import com.smartparking.model.CarQuery;
import com.smartparking.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;


    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    public void deleteCar(Integer id) {
        carDao.deleteCar(id);
    }

    public List<Car> selectCarAll() {
        return carDao.selectCarAll();
    }

    public Car selectCarById(Integer id) {
        return carDao.selectCarById(id);
    }

    public List<Car> selectCarByUserId(Integer id) {
        return carDao.selectCarByUserId(id);
    }
}
