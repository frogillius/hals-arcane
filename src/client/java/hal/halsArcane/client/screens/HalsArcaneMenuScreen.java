/// This is the main screen for the Arcane menu.
/// It provides functionality for navigating custom mod features.
package hal.halsArcane.client.screens;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class HalsArcaneMenuScreen extends Screen {

    public HalsArcaneMenuScreen(Text title) {
        super(title);
    }

    @Override
    protected void init() {
        // Add a button to return to the Title Screen. Do not uncomment this or else it will introduce game-breaking behaviour. The user should use the escape key to exit instead.
       /* this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height / 2, 200, 20, Text.literal("Return to Title Screen"), button -> {
            this.client.setScreen(new TitleScreen());
        })); */

        // Go to settings. Uncomment when settings are implemented.
        /* this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height / 2, 200, 20, Text.literal("Settings"), button -> {
            this.client.setScreen(new HalsArcaneSettingsScreen(Text.literal("Settings"));
        })); */

        // Go to credits.
        this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height / 2 + 30, 200, 20, Text.literal("Credits"), button -> {
            this.client.setScreen(new HalsArcaneCreditsScreen(Text.literal("Special Thanks...")));
        }));
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        // Render the background and title
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, this.title, this.width / 2, 40, 0x00FFFF);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return true; // If false, the game won't pause when this screen is open
    }
}
