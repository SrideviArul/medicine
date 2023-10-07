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
import com.task.libo.entity.Medicine;
import com.task.libo.serviceinterface.MedicineInterface;
import com.task.libo.serviceinterface.ServiceInterface;

@RestController
@RequestMapping("/api/medicine/")
public class MedicineController {

    @Autowired
    MedicineInterface medicineInterface;
    
    @PostMapping("/create")
    public Medicine create(@RequestBody Medicine medicine) {
        return medicineInterface.save(medicine);
        }    
        
    @GetMapping("/{id}")
    public Medicine read(@PathVariable int id) {
        return medicineInterface.read(id);
    }
    
    
    @GetMapping("/full")
    public List<Medicine> getAllCustomers() {
        return medicineInterface.getAllMedicine();
    }
        
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Medicine update(@RequestBody Medicine medicine,@PathVariable int id) {
        return medicineInterface.update(id,medicine);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public  void delete( @PathVariable int  id) {
        medicineInterface.delete(id);
        
        
    }
}
