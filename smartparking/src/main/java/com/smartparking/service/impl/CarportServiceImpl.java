/**
 * 公司：金刚葫芦娃
 * 文件名：CarportServiceImpl
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 10:54
 * 描述：
 */

package com.smartparking.service.impl;

import com.smartparking.dao.CarportDao;
import com.smartparking.model.Carport;
import com.smartparking.model.CarportQuery;
import com.smartparking.service.CarportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarportServiceImpl implements CarportService {

    @Autowired
    private CarportDao carportDao;

    public void save(Carport carport) {
        carportDao.save(carport);
    }

    public List<Carport> selectCarportByCondition(CarportQuery query) {
        return carportDao.selectCarportByCondition(query);
    }

    public Carport selectCarportById(Integer carportId) {
        return carportDao.selectCarportById(carportId);
    }

    public void updateCarport(CarportQuery query) {
        carportDao.updateCarport(query);
    }

    public void updateCarportReserve(Carport carport) {
        carportDao.updateCarportReserve(carport);
    }
}
