package com.task.libo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.task.libo.entity.Purchase;
import com.task.libo.serviceinterface.PurchaseInterface;

@RestController
@RequestMapping("/api/purchase/")
public class PurchaseController {
    
    @Autowired
    PurchaseInterface purchaseInterface;
    
    @PostMapping("/create")
    public Purchase create(@RequestBody Purchase purchase) {
        return purchaseInterface.save(purchase);
        }    
        
    @GetMapping("/{id}")
    public Purchase read(@PathVariable int id) {
        return purchaseInterface.read(id);
    }
    
    @GetMapping("/full")
    public List<Purchase> getAllPurchase() {
        return purchaseInterface.findAll();
    }
        
    @GetMapping("/join")
    public List<Object[]> getjoin() {
        return purchaseInterface.getAllOrdersWithCustomers();
    }
    
    @GetMapping("/purchases")
    public String showPurchases(Model model) {
        List<Object[]> purchase = purchaseInterface.getAllPurchases();
        model.addAttribute("purchase", purchase);
        return "PurchaseList"; // Corresponds to your Thymeleaf template
    }
    
    /*
     * @GetMapping("/purchases") public String showPurchaseTable(Purchase purchase)
     * { List<Purchase> purchases = purchaseInterface.getAllOrdersWithCustomers();//
     * Replace with your data retrieval logic purchase.addAttribute("purchases",
     * purchases); return "purchaseTable"; }
     */
    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Purchase update(@RequestBody Purchase purchase,@PathVariable int  id) {
        return purchaseInterface.update(id,purchase);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public  void delete( @PathVariable int  id) {
        purchaseInterface.delete(id);
        
        
    }
    
}
