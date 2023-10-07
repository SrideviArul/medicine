package com.task.libo.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.libo.entity.Medicine;
import com.task.libo.entity.Orders;
import com.task.libo.repository.MedicineRepository;
import com.task.libo.repository.OrdersRepository;
import com.task.libo.serviceinterface.OrdersInterface;

@Service
public class OrdersImplementation implements OrdersInterface {

    @Autowired
    MedicineRepository medrepo;
    
    @Autowired
    OrdersRepository orderRepo;

    @Override
    public void delete(int id) {
        orderRepo.deleteById(id);

    }

    @Override
    public List<Orders> getAllOrders() {

        return orderRepo.findAll();
    }

    @Override
    public Orders read(int id) {

        return orderRepo.findById(id);
    }

    @Override
    public Orders save(Orders orders) {

        return orderRepo.save(orders);
    }

    @Override
    public Orders update( int medicine_id,int quantity) {
        Medicine medicine = medrepo.findById(medicine_id);
        if (medicine != null) {
            Orders orders = new Orders();
           
            orders.setQuantity(quantity);
           
            return orderRepo.save(orders);
        }
        return null; 
    }

}
