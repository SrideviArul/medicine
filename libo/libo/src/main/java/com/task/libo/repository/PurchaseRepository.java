package com.task.libo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.task.libo.entity.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

    @Query(value ="SELECT purchase FROM Purchase purchase WHERE purchase.id = :id")
    Purchase findById(@Param("id") int id);
    
    @Query("SELECT c.id, c.name, o.amount FROM Customer c LEFT JOIN Purchase o ON c.id = o.customerId") 
    List<Object[]> findAllOrdersWithCustomers();

    @Query("SELECT c.id, c.name, o.amount FROM Customer c LEFT JOIN Purchase o ON c.id = o.customerId") 
    List<Object[]> findAllOrdersWithCustomer();
}
