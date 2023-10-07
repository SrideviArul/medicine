package com.task.libo.serviceimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.task.libo.entity.Purchase;
import com.task.libo.repository.PurchaseRepository;
import com.task.libo.serviceinterface.PurchaseInterface;

@Service
public class PurchaseImplementation implements PurchaseInterface {

    @Autowired
    PurchaseRepository purchaseRepo;
    
    @Override
    public Purchase save(Purchase purchase) {
        
        return purchaseRepo.save(purchase);
    }

    @Override
    public Purchase read(int id) {
       
        return purchaseRepo.findById(id);
    }

    @Override
    public Purchase update(int id, Purchase purchase) {
        
        return purchaseRepo.save(purchase);
    }

    @Override
    public void delete(int id) {
        
       purchaseRepo.deleteById(id);;
        
    }
    @Override
    public List<Purchase> findAll() {
        
        return purchaseRepo.findAll();
    }

    @Override
    public List<Object[]> getAllOrdersWithCustomers() {
      
        return purchaseRepo.findAllOrdersWithCustomers();
        
    }

    @Override
    public List<Object[]> getAllPurchases() {
      
        return purchaseRepo.findAllOrdersWithCustomer();
    }

}
