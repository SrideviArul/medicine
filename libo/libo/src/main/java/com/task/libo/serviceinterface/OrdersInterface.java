package com.task.libo.serviceinterface;

import java.util.List;

import com.task.libo.entity.Orders;

public interface OrdersInterface {

    Orders update(int medicine_id, int quantity); 

    void delete(int id);

    List<Orders> getAllOrders();

    Orders read(int id);

    Orders save(Orders orders);

}
