package com.task.libo.entity;

import java.time.LocalDateTime;
import java.util.List;

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
 */
@Entity
@Table(name="purchase")
public class Purchase {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="customer_id")
    private Integer customer_id;
    
    @Column(name="medicine_id")
    private Integer medicine_id;
    
    @Column(name="quantity")
    private Integer quantity;
    
    @Column(name="amount")
    private double amount;
    
    @Column(name="purchase_date")
    private LocalDateTime purchaseDate;
    
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id", insertable=false, updatable=false)
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "medicine_id",referencedColumnName = "id", insertable=false, updatable=false)
    private Medicine medicine;

    /** get the id.
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** set the id.
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /** get the customer_id.
     * @return the customer_id
     */
    public Integer getCustomer_id() {
        return customer_id;
    }

    /** set the customer_id.
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    /** get the medicine_id.
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

    /** get the quantity.
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /** get the amount
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the purchaseDate
     */
    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate the purchaseDate to set
     */
    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    

   

    
   
    
    
   


}
