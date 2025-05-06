package com.example.learn.SpringStartsHere.repositories;

import com.example.learn.SpringStartsHere.model.Receipt;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface ReceiptRepository extends JpaRepository<Receipt,Long>{

}
