package kz.bitlab.JPASpringPro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "foods")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", length = 200)
    private String name;

    @Column(name = "Calories(Cal)", length = 200)
    private int calories;

    @Column(name = "Amount")
    private int amounts;

    @Column(name = "Price(KZT)")
    private int price;
}
