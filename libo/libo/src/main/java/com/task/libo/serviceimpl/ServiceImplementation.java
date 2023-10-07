package com.task.libo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.task.libo.entity.Customer;
import com.task.libo.repository.CustomerRepository;
import com.task.libo.serviceinterface.ServiceInterface;

@Service
public class ServiceImplementation implements ServiceInterface {

    @Autowired
    CustomerRepository customerRepo;

    @Override
    public Customer save(Customer customer) {

        return customerRepo.save(customer);
    }

    @Override
    public Customer read(int id) {

        return customerRepo.findById(id);
    }

    @Override
    public Customer update(@PathVariable int id, Customer customer) {
        Customer cus = customerRepo.findById(id);
        if (cus != null) {
            cus.setName(customer.getName());
            return customerRepo.save(cus);
        }
        return null;
    }

    @Override
    public void delete(int id) {

        customerRepo.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
      
        return customerRepo.findAll();
    }

}
