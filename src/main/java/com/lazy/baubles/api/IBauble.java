package com.lazy.baubles.api;

import net.minecraft.entity.LivingEntity;

/**
 * This interface should be extended by items that can be worn in bauble slots
 *
 * @author Azanor
 * @author lazynessmind - porter
 */

public interface IBauble {

    /**
     * This method return the type of bauble this is.
     * Type is used to determine the slots it can go into.
     */
    BaubleType getBaubleType();

    /**
     * This method is called once per tick if the bauble is being worn by a player
     */
    default void onWornTick(LivingEntity player, net.minecraft.item.ItemStack stackIn) {/* Changed: Added argument ItemStack stackIn. */
    }

    /**
     * This method is called when the bauble is equipped by a player
     */
    default void onEquipped(LivingEntity player, net.minecraft.item.ItemStack stackIn) {/* Changed: Added argument ItemStack stackIn. */
    }

    /**
     * This method is called when the bauble is unequipped by a player
     */
    default void onUnequipped(LivingEntity player, net.minecraft.item.ItemStack stackIn) {/* Changed: Added argument ItemStack stackIn. */
    }

    /**
     * can this bauble be placed in a bauble slot
     */
    default boolean canEquip(LivingEntity player) {
        return true;
    }

    /**
     * Can this bauble be removed from a bauble slot
     */
    default boolean canUnequip(LivingEntity player) {
        return true;
    }

    /**
     * Will bauble automatically sync to client if a change is detected in its NBT or damage values?
     * Default is off, so override and set to true if you want to auto sync.
     * This sync is not instant, but occurs every 10 ticks (.5 seconds).
     */
    default boolean willAutoSync(LivingEntity player) {
        return false;
    }
}