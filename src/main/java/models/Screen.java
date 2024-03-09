package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel{
    String name;
    List<Seat> seats;
    List<Feature> features;
}
