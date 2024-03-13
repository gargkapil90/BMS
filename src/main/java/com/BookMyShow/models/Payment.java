package com.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment  extends BaseModel{
    double amount;
    String refNumber;
    @Enumerated(EnumType.ORDINAL)
    PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    PaymentProvider paymentProvider;
    @Enumerated(EnumType.ORDINAL)
    PaymentMode paymentMode;
}
