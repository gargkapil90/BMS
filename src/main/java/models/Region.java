package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Region extends BaseModel{
    String name;
    List<Theater> theaters;
    List<Movie> movies;
}
