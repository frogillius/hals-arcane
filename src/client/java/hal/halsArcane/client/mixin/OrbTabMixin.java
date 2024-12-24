///  TODO: Tab not rendering on creative or survival screen.

package hal.halsArcane.client.mixin;

import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InventoryScreen.class)
public abstract class OrbTabMixin extends DrawableHelper {
    @Unique
    private static final Identifier ORB_TAB_ICON = new Identifier("hals-arcane", "resources/orb_tab_icon.png");

    @Inject(method = "render", at = @At("TAIL"))
    private void renderOrbTab(MatrixStack matrices, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        // Position for the custom tab
        int x = 10; // Adjust this to position the tab horizontally
        int y = 10; // Adjust this to position the tab vertically

        // Draw the tab background (optional)
        fill(matrices, x, y, x + 24, y + 24, 0xFFCCCCCC);

        // Draw the icon on the tab
        this.drawTexture(matrices, x + 4, y + 4, 0, 0, 16, 16);
    }
}
