package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel{
    Movie movie;
    Date showTime;
    Date endTime;
    Screen screen;
    List<Feature> features;
}
