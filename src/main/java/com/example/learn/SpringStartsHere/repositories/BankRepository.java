package com.example.learn.SpringStartsHere.repositories;

import com.example.learn.SpringStartsHere.model.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<AccountStatus,Long> {


}
