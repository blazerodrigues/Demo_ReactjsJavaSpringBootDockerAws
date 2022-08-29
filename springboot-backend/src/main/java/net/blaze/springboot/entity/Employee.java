package net.blaze.springboot.entity;

import lombok.*;

import javax.persistence.*;

@Getter //lombok
@Setter //lombok
@NoArgsConstructor //lombok
@AllArgsConstructor //lombok
@Builder //lombok
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name", nullable = false)
    private String firstName;
    @Column(name="last_name", nullable = false)
    private String lastName;
    private String email;
}
