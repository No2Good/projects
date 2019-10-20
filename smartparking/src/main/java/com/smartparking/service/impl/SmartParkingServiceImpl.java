/**
 * 公司：金刚葫芦娃
 * 文件名：SmartParkingServiceImpl
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 21:18
 * 描述：
 */

package com.smartparking.service.impl;

import com.smartparking.dao.SmartParkingDao;
import com.smartparking.model.Carport;
import com.smartparking.model.SmartParking;
import com.smartparking.service.SmartParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartParkingServiceImpl implements SmartParkingService {

    @Autowired
    private SmartParkingDao smartParkingDao;

    @Override
    public void save(SmartParking smartParking) {
        smartParkingDao.save(smartParking);
    }

    @Override
    public List<SmartParking> selectSmartParkingByCondition(SmartParking smartParking) {
        return smartParkingDao.selectSmartParkingByCondition(smartParking);
    }

    @Override
    public void delete() {
        smartParkingDao.delete();
    }

    @Override
    public void update(SmartParking smartParking) {
        smartParkingDao.update(smartParking);
    }
}
