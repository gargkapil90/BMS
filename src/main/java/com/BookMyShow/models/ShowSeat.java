package com.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    Show show;
    @ManyToOne
    Seat seat;
    @Enumerated(EnumType.ORDINAL)
    ShowSeatStatus showSeatStatus;
}
