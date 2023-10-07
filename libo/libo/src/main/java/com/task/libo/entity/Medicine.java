package com.task.libo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

/**
 * 
 * Entity for user.
 *
 */
@Entity
@Table(name="medicine")
public class Medicine {
    
    /** Unique id of medicine. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="amount")
    private double amount;

    /**
     * Get the id.
     *
     * @return the id
     */
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    /**
     * Get the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name.
     *
     * @param id the id to name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the amount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Set the amount.
     *
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
