package com.zacharybarbanell.crafterslotlimiter.mixin;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.CrafterBlockEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CrafterBlockEntity.class)
public abstract class CrafterBlockEntityMixin implements Container {
	@Override
	public int getMaxStackSize() {
		return 1;
	}

	@Redirect(method = "canPlaceItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getMaxStackSize()I"))
	public int maxStackSizeOverride(ItemStack itemStack){
		return 1;
	}
}