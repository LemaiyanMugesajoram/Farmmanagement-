package Farm.Management.Inventory;

import java.util.List;


public interface InventoryService {
    void saveInventoryItem(Inventory inventory);
    List<Inventory> getAllInventoryItems();
}
