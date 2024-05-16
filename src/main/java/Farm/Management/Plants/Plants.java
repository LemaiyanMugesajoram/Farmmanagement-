package Farm.Management.Plants;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "crops")
public class Plants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crop_id")
    private Long id;

    @Column(name = "variety")
    private String variety;

    @Column(name = "planting")
    private String planting;

    @Column(name = "field_location")
    private String fieldLocation;

    @Column(name = "inputs")
    private String inputs;

    @Column(name = "monitoring")
    private String monitoring;

    @Column(name = "harvest")
    private String harvest;

    @Column(name = "yield")
    private String yield;

    @Column(name = "weather_conditions")
    private String weatherConditions;

    // Getters and setters
}
