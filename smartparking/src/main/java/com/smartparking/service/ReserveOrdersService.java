package com.smartparking.service;

import com.smartparking.model.ReserveOrders;

import java.util.List;

public interface ReserveOrdersService {

    public void save(ReserveOrders reserveOrders);

    public List<ReserveOrders> selectAll(ReserveOrders reserveOrders);

}
