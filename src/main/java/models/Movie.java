package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    String name;
    List<Language> languages;
}
