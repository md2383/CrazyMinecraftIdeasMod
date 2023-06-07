package com.mygel.crazyideasmod.item;

import com.mygel.crazyideasmod.CrazyIdeasMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class CrazyItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrazyIdeasMod.MOD_ID);

    //Wasabi
    public static final RegistryObject<Item> WASABI = ITEMS.register("wasabi",
            () -> new Item(new Item.Properties().tab(CrazyItemTab.CrazyTab)));

    //Taco Bell Taco
    public static final RegistryObject<Item> TACO = ITEMS.register("taco",
            () -> new Item(new Item.Properties().tab(CrazyItemTab.CrazyTab)));

    //Red M :)
    public static final RegistryObject<Item> MANDM = ITEMS.register("mandm",
            () -> new Item(new Item.Properties().tab(CrazyItemTab.CrazyTab)));

    //Happy Meal :D
    public static final RegistryObject<Item> HAPPYMEAL = ITEMS.register("happymeal",
            () -> new Item(new Item.Properties().tab(CrazyItemTab.CrazyTab)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
