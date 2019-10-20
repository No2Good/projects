package com.smartparking.dao;

import com.smartparking.model.Carport;
import com.smartparking.model.CarportQuery;
import com.smartparking.model.ReserveOrders;

import java.util.List;

public interface ReserveOrdersDao {

    public void save(ReserveOrders reserveOrders);

    public List<ReserveOrders> selectAll(ReserveOrders reserveOrders);

}
