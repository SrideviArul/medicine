package com.task.libo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.task.libo.entity.Orders;
import com.task.libo.repository.MedicineRepository;
import com.task.libo.serviceinterface.OrdersInterface;

@RestController
@RequestMapping("/api/orders/")
public class OrdersController {
    
    @Autowired
    OrdersInterface ordersInterface;
    
    @Autowired
    MedicineRepository medrepo;
    
    @PostMapping("/create")
    public Orders create(@RequestBody Orders orders) {
        return ordersInterface.save(orders);
        }    
        
    @GetMapping("/{id}")
    public Orders read(@PathVariable int id) {
        return ordersInterface.read(id);
    }
    
    @GetMapping("/full")
    public List<Orders> getAllOrders() {
        return ordersInterface.getAllOrders();
    }
        
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Orders update(@RequestBody  int medicine_id,int quantity) {
        return ordersInterface.update(medicine_id,quantity);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public  void delete( @PathVariable int  id) {
        ordersInterface.delete(id);
        
        
    }
    

}
