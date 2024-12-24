package hal.halsArcane.client;

import hal.halsArcane.client.screens.HalsArcaneOrbTabScreen;
import hal.halsArcane.register.InventoryScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public final class HalsArcaneClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(InventoryScreen.CUSTOM_TAB, HalsArcaneOrbTabScreen::new);
    }
}
