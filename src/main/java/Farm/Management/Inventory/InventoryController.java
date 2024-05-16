package Farm.Management.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/inventory/save")
    public void saveInventoryItem(@RequestBody Inventory inventory) {
        inventoryService.saveInventoryItem(inventory);
    }

    @GetMapping("/all")
    public List<Inventory> getAllInventoryItems() {
        return inventoryService.getAllInventoryItems();
    }
}
