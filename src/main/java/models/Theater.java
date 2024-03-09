package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theater extends BaseModel{
    String name;
    Region region;
    List<Screen> screens;
}
