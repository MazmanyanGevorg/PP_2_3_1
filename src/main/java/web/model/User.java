package web.model;

//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @NotEmpty(message = "not should be null")
//    @Size(min = 1, max = 25, message = "1 - 25 symbols")
    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
//    @Min(value = 0, message = "should be > 0")
    private int age;

    @Column(name = "level")
//    @Min(value = 0, message = "should be > 0")
    private int level;

    @Column(name = "points")
//    @Min(value = 0, message = "should be > 0")
    private int points;

    public User(Long id, String name, String surname, int age, int level, int points) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.level = level;
        this.points = points;
    }

    public User(String name, String surname, int age, int level, int points) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.level = level;
        this.points = points;
    }

}
