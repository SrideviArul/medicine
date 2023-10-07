package com.task.libo.serviceinterface;

import java.util.*;
import com.task.libo.entity.Customer;

public interface ServiceInterface {

    Customer save(Customer customer);

    Customer read(int id);

    void delete(int id);

    Customer update(int id, Customer customer);

    List<Customer> getAllCustomers();

   

    

    
    

}
