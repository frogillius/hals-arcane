///  TODO: Tab not rendering on creative or survival screen.

package hal.halsArcane.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class HalsArcaneOrbMenu extends ScreenHandler {
    private final SimpleInventory inventory;

    public HalsArcaneOrbMenu(int syncId, PlayerInventory playerInventory) {
        super(null, syncId); // Replace null with your custom ScreenHandlerType
        this.inventory = new SimpleInventory(5); // 5 slots

        // Arrange slots in a circular pattern
        int centerX = 88;
        int centerY = 62;
        int radius = 20;

        for (int i = 0; i < 5; i++) {
            double angle = Math.toRadians(i * 72); // 360° / 5 slots
            int slotX = centerX + (int) (radius * Math.cos(angle));
            int slotY = centerY + (int) (radius * Math.sin(angle));
            this.addSlot(new Slot(this.inventory, i, slotX, slotY));
        }

        // Add player's inventory slots
        int playerInvY = 84;
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, playerInvY + row * 18));
            }
        }

        // Add player's hotbar
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, playerInvY + 58));
        }
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return false;
    }
}