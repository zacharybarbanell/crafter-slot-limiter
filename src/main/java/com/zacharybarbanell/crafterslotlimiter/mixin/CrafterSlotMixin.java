package com.zacharybarbanell.crafterslotlimiter.mixin;

import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.CrafterSlot;
import net.minecraft.world.inventory.Slot;

@Mixin(CrafterSlot.class)
public abstract class CrafterSlotMixin extends Slot {
    public CrafterSlotMixin(Container container, int i, int j, int k) {
        super(container, i, j, k);
        throw new NotImplementedException();
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}
