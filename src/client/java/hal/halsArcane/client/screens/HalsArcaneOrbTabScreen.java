///  TODO: Tab not rendering on creative or survival screen.

package hal.halsArcane.client.screens;

import hal.halsArcane.container.HalsArcaneOrbMenu;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;

public class HalsArcaneOrbTabScreen extends HandledScreen<HalsArcaneOrbMenu> {
    public HalsArcaneOrbTabScreen(HalsArcaneOrbMenu handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        // Render your custom background
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}