package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    Show show;
    @ManyToOne
    SeatType seatType;
    double price;
}
