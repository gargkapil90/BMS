package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
    String SeatNumber;
    SeatType seatType;
    int row;
    int col;
}
