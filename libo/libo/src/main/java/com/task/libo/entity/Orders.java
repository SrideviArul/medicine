package com.task.libo.entity;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 * Entity for user.
 *
 */

@Entity
@Table(name="order_history")
public class Orders {
    
    /** Unique id of order. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="medicine_id")
    private Integer medicine_id;
    
    @ManyToOne
    @JoinColumn(name="medicine_id" ,referencedColumnName = "id",insertable=false,updatable = false)
    private Medicine medicine;
    
    @Column(name="quantity")
    private int quantity;
    
    @Column(name="order_date")
    private LocalDateTime orderDate;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the medicine_id
     */
    public Integer getMedicine_id() {
        return medicine_id;
    }

    /**
     * @param medicine_id the medicine_id to set
     */
    public void setMedicine_id(Integer medicine_id) {
        this.medicine_id = medicine_id;
    }

    /**
     * @return the medicine
     */
    public Medicine getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the orderDate
     */
    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    
    
    

}
