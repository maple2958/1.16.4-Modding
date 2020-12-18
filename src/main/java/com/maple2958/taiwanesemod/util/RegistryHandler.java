package com.maple2958.taiwanesemod.util;

import com.maple2958.taiwanesemod.TaiwaneseMod;
import com.maple2958.taiwanesemod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TaiwaneseMod.MOD_ID);


    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> PIGBLOODCAKE = ITEMS.register( "pigbloodcake", ItemBase::new);

}
