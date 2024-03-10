package models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    String name;
    String email;
    int contact;
    @OneToMany
    List<Booking> bookings;
}
