package com.task.libo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.task.libo.entity.Medicine;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{

    @Query(value="SELECT medicine FROM Medicine medicine WHERE medicine.id = :id ")
    Medicine findById(@Param("id")int id);

}
