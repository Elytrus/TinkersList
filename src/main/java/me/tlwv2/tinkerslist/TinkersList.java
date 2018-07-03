//May make an addon for Azanor's Massive Chode 6 Mod at some point
// ~ ( ͡° ͜ʖ ͡°)

package me.tlwv2.tinkerslist;

import me.tlwv2.tinkerslist.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TinkersList.MOD_ID, name = TinkersList.NAME, version = TinkersList.VERSION, useMetadata = true)
public class TinkersList {
    public static final String MOD_ID = "tinkerslist";
    public static final String NAME = "Tinkers' Listings";
    public static final String VERSION = "1.0";

    private static Logger logger;
    @SidedProxy(clientSide = "me.tlwv2.tinkerslist.proxy.ClientProxy",
            serverSide = "me.tlwv2.tinkerslist.proxy.ServerProxy")
    private static CommonProxy commonProxy;

    @Mod.Instance
    private static TinkersList instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        commonProxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        commonProxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        commonProxy.postInit(event);
    }
}
