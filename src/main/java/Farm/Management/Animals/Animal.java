package Farm.Management.Animals;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identification")
    private Long identification;

    @Column(name = "Animal_Sex")
    private String animalSex;

    @Column(name = "birthday_date")
    private LocalDate birthdayDate;

    @Column(name = "family_no")
    private String familyNo;

    @Column(name = "insemination_date")
    private LocalDate inseminationDate;

    @Column(name = "breed")
    private String animalBreeding;

    @Column(name = "health")
    private String animalHealth;

    @Column(name = "feeding")
    private String animalFeeding;

    @Column(name = "Feed_Rationing")
    private String animalFeedingRationing;

    @Column(name = "production")
    private String animalProduction;

    @Column(name = "movements")
    private String animalMovements;

    @Column(name = "behavior")
    private String animalBehavior;

    @Column(name = "date")
    private LocalDate date;
}
