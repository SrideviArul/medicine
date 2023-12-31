package com.task.libo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.task.libo.entity.Customer;
import com.task.libo.entity.Purchase;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
    @Query(value ="SELECT customer FROM Customer customer WHERE customer.id = :id")
    Customer findById(@Param("id") int id); 
    
}
