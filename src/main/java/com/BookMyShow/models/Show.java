package com.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows")
public class Show extends BaseModel{
    //1:1
    //M:1
    @ManyToOne
    Movie movie;
    Date showTime;
    Date endTime;
    //1:1
    //M:1
    @ManyToOne
    Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    List<Feature> features;
}
