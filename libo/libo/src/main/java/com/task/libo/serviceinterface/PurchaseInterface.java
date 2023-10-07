package com.task.libo.serviceinterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.task.libo.entity.Purchase;
@Service
public interface PurchaseInterface {

    Purchase save(Purchase purchase);

    Purchase read(int id);

    List<Purchase> findAll();

    Purchase update(int id, Purchase purchase);

    void delete(int id);

    List<Object[]> getAllOrdersWithCustomers();

    List<Object[]> getAllPurchases();
    
}
