package hal.halsArcane;

import hal.halsArcane.register.InventoryScreen;
import net.fabricmc.api.ModInitializer;

public class HalsArcane implements ModInitializer {
    @Override
    public void onInitialize() {
        InventoryScreen.register();
    }
}