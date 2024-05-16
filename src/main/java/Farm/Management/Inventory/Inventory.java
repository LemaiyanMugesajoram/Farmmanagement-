package Farm.Management.Inventory;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(name = "item_description")
    private String description;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_cost")
    private double unitCost;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "item_usage")
    private String itemUsage;

    @Column(name = "reordering_point")
    private int reorderingPoint;

    @Column(name = "inventory_value")
    private double inventoryValue;

    // Getters and setters
}
