package com.mygel.crazyideasmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CrazyItemTab {
    public static final CreativeModeTab CrazyTab = new CreativeModeTab("crazytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CrazyItems.MANDM.get());
        }
    };
}
