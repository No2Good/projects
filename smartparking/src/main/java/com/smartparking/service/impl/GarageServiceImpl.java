/**
 * 公司：金刚葫芦娃
 * 文件名：GarageServiceImpl
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 16:03
 * 描述：
 */

package com.smartparking.service.impl;

import com.smartparking.dao.GarageDao;
import com.smartparking.model.Garage;
import com.smartparking.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GarageServiceImpl implements GarageService {

    @Autowired
    private GarageDao garageDao;

    public Garage selectGarageById(Integer garageId) {
        return garageDao.selectGarageById(garageId);
    }

    @Override
    public Garage selectGarageByGarageName(String garageName) {
        return garageDao.selectGarageByGarageName(garageName);
    }
}
