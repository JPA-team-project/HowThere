package com.howthere.app.repository.rentcar;

import com.howthere.app.entity.rentCar.RentCarPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentCarPaymentRepository extends JpaRepository<RentCarPayment, Long> {
}