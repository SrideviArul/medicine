package com.task.libo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.task.libo.entity.Orders;

@Repository
public interface OrdersRepository  extends JpaRepository<Orders, Integer>{

    @Query(value="SELECT orders FROM Orders orders WHERE orders.id = :id ")
    Orders findById(@Param("id")int id);
    
    /*
     * @Query(value="SELECT medicine FROM Medicine order WHERE medicine.id = :id ")
     * Orders findByIds(@Param("id")int medicine_id);
     */
}
