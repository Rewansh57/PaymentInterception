package com.example.learn.SpringStartsHere.repositories;

import com.example.learn.SpringStartsHere.model.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<AccountStatus, Long> {
    @Query("Select a from AccountStatus a where a.accountId= :accountid")
    Optional<AccountStatus> findByAccountId(@Param("accountid") Long accountid);


    @Modifying
    @Query("Update AccountStatus a Set a.balance= :amt Where a.accountId= :AccId")
    void updateBalance(@Param("amt") BigDecimal amt, @Param("AccId") Long AccId);

    @Query("Select balance from AccountStatus a where accountId=: accId)


}
