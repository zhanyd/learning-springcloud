package com.zhanyd.springcloud.service;

import com.zhanyd.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
