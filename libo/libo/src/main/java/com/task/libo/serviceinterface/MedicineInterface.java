package com.task.libo.serviceinterface;

import java.util.List;

import com.task.libo.entity.Customer;
import com.task.libo.entity.Medicine;

public interface MedicineInterface {
    
    Medicine save(Medicine medicine);

    Medicine read(int id);

    void delete(int id);

    Medicine update(int id, Medicine medicine);

    List<Medicine> getAllMedicine();

    
}
