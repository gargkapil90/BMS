package models;

import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.List;

@Getter
@Setter
public class User extends BaseModel{
    String name;
    String email;
    int contact;
    List<Booking> bookings;
}
