package web.model;

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

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "level")
    private int level;

    @Column(name = "points")
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
