package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@MappedSuperclass
public class BaseModel {
    @Id
    Long id;
    Date createdAt;
    Date currModifiedAt;
}
