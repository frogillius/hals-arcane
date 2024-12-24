///  TODO: Tab not rendering on creative or survival screen.

package hal.halsArcane.register;

import hal.halsArcane.container.HalsArcaneOrbMenu;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InventoryScreen {
    public static final ScreenHandlerType<HalsArcaneOrbMenu> CUSTOM_TAB;

    static {
        CUSTOM_TAB = new ScreenHandlerType<>(HalsArcaneOrbMenu::new);
    }

    public static void register() {
        Registry.register(Registry.SCREEN_HANDLER, new Identifier("hals-arcane", "orb"), CUSTOM_TAB);
    }
}
