package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    String SeatNumber;
    @ManyToOne
    private SeatType seatType;
    int rowVal;
    int colVal;
}
