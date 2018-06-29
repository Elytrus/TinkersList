package me.tlwv2.tinkerslist;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class Keybinds {
    private static KeyBinding openGUIKeyBind;

    public static void init(){
        openGUIKeyBind = new KeyBinding("key.modgui.open", Keyboard.KEY_L, "key.tinkerslist.category");
        ClientRegistry.registerKeyBinding(openGUIKeyBind);
    }
}
