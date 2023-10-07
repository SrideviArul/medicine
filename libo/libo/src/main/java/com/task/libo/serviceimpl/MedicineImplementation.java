package com.task.libo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.libo.entity.Medicine;
import com.task.libo.repository.MedicineRepository;
import com.task.libo.serviceinterface.MedicineInterface;

@Service
public class MedicineImplementation implements MedicineInterface{

    @Autowired
    MedicineRepository medicineRepo;
    
    @Override
    public Medicine save(Medicine medicine) {
       
        return medicineRepo.save(medicine);
    }

    @Override
    public Medicine read(int id) {
       
        return medicineRepo.findById(id);
    }

    @Override
    public void delete(int id) {
        medicineRepo.deleteById(id);
        
    }

    @Override
    public Medicine update(int id, Medicine medicine) {
       Medicine medi=medicineRepo.findById(id);
       if (medi != null) {
           medi.setAmount(medicine.getAmount());
           medi.setName(medicine.getName());
           return medicineRepo.save(medi);
       }
        return null;
    }

    @Override
    public List<Medicine> getAllMedicine() {
        
        return medicineRepo.findAll();
    }

}
