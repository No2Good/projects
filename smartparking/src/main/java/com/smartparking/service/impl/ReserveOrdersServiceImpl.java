/**
 * 公司：金刚葫芦娃
 * 文件名：ReserveOrdersServiceImpl
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 15:09
 * 描述：
 */

package com.smartparking.service.impl;

import com.smartparking.dao.CarportDao;
import com.smartparking.dao.ReserveOrdersDao;
import com.smartparking.model.ReserveOrders;
import com.smartparking.service.ReserveOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveOrdersServiceImpl implements ReserveOrdersService {

    @Autowired
    private ReserveOrdersDao reserveOrdersDao;

    public void save(ReserveOrders reserveOrders) {
        reserveOrdersDao.save(reserveOrders);
    }

    public List<ReserveOrders> selectAll(ReserveOrders reserveOrders) {
        return reserveOrdersDao.selectAll(reserveOrders);
    }
}
