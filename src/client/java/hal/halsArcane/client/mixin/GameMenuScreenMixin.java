///  This adds the config button to the pause screen.

package hal.halsArcane.client.mixin;

import hal.halsArcane.client.screens.HalsArcaneMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameMenuScreen.class)
public abstract class GameMenuScreenMixin extends Screen {

    protected GameMenuScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "initWidgets")
    private void addCustomButton(CallbackInfo ci) {
        Text text = Text.literal("§b§kA");
        this.addDrawableChild(new ButtonWidget(this.width / 2 + 105, this.height / 4 + 24 + -16, 20, 20, text, (button) -> this.client.setScreen(new HalsArcaneMenuScreen(Text.literal("Arcane Menu")))));
    };
}
