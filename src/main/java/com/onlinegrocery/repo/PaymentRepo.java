package com.onlinegrocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinegrocery.entity.Payment;




@Repository
public interface PaymentRepo  extends JpaRepository<Payment,Long> {
}
