package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment  extends BaseModel{
    double amount;
    String refNumber;
    PaymentStatus paymentStatus;
    PaymentProvider paymentProvider;
    PaymentMode paymentMode;
}
