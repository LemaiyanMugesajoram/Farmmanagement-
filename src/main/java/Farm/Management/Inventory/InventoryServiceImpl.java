package Farm.Management.Inventory;

import java.util.List;

import Farm.Management.Inventory.Inventory;
import Farm.Management.Inventory.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InventoryServiceImpl implements InventoryService {


    @Override
    public void saveInventoryItem(Inventory inventory) {

    }

    @Override
    public List<Inventory> getAllInventoryItems() {
        return null;
    }
}
