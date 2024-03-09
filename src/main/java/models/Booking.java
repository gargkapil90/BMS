package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel{
    BookingStatus bookingStatus;
    List<ShowSeat> showSeats;
    User user;
    Date bookedAt;
    double amount;
    List<Payment> payments;
}
