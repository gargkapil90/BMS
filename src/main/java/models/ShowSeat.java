package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends BaseModel{
    Show show;
    Seat seat;
    ShowSeatStatus showSeatStatus;
}
