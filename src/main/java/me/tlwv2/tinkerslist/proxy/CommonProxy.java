package me.tlwv2.tinkerslist.proxy;

import me.tlwv2.tinkerslist.material.MaterialWrapperManager;
import me.tlwv2.tinkerslist.material.Util;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    //TODO: Keybind Proxy Work
    public CommonProxy() {
        /*
        Init List:

        Util.init
        MaterialWrapperManager.init

         */
    }

    public void preInit(FMLPreInitializationEvent event){
        Util.init();
        MaterialWrapperManager.init();
    }

    public void init(FMLInitializationEvent event){
        //
    }

    public void postInit(FMLPostInitializationEvent event){
        //
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //
    }
}