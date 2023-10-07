package com.task.libo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.task.libo.entity.Customer;
import com.task.libo.serviceinterface.ServiceInterface;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {
    
    @Autowired
    ServiceInterface customerInterface;
    //create da
    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        return customerInterface.save(customer);
        }    
        
    @GetMapping("/{id}")
    public Customer read(@PathVariable int id) {
        return customerInterface.read(id);
    }
    
    @GetMapping("/full")
    public List<Customer> getAllCustomers() {
        return customerInterface.getAllCustomers();
    }
        
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Customer update(@RequestBody Customer customer,@PathVariable int  id) {
        return customerInterface.update(id,customer);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public  void delete( @PathVariable int  id) {
        customerInterface.delete(id);
        
        
    }

}
