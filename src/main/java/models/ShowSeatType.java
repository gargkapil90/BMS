package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModel{
    Show show;
    SeatType seatType;
    double price;
}
