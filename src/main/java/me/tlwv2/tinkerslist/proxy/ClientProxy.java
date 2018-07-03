package me.tlwv2.tinkerslist.proxy;

import me.tlwv2.tinkerslist.Keybinds;
import me.tlwv2.tinkerslist.TinkersList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @SubscribeEvent
    public static void registerModels(){
        //
    }

    @SubscribeEvent
    public static void onKeyPress(InputEvent.KeyInputEvent event){
        if(Keybinds.openGUIKeyBind.isPressed()){
            //TODO: Player GUI
            EntityPlayerSP player = Minecraft.getMinecraft().player;
//            player.openGui(TinkersList.getInstance(), ,
//                    player.getEntityWorld(), 0, 0, 0);
            //I Presume this can just be all 0
        }
    }
}
