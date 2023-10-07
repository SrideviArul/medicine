package com.task.libo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * Entity for user.
 *
 */
@Entity
@Table(name = "customer")
public class Customer {

    /** Unique id of user. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_no")
    private String no;

    /**
     * Get the id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id.
     *
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the no.
     *
     * @return the no
     */

    public String getNo() {
        return no;
    }

    /**
     * Set the no.
     *
     * @param no the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

}
