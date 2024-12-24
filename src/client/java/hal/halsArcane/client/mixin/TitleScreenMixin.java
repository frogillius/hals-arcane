/// This adds the config button to the main menu.

package hal.halsArcane.client.mixin;

import hal.halsArcane.client.screens.HalsArcaneMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin extends Screen {

    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "initWidgetsNormal")
    private void addCustomButton(int y, int spacingY, CallbackInfo ci) {
        Text text = Text.literal("§b§kA");
        this.addDrawableChild(new ButtonWidget(this.width / 2 + 105, y, 20, 20, text, (button) -> this.client.setScreen(new HalsArcaneMenuScreen(Text.literal("Arcane Menu")))));
        };
    }
