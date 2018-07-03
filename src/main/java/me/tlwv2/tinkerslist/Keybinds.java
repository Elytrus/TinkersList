package me.tlwv2.tinkerslist;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.input.Keyboard;

@Mod.EventBusSubscriber
public class Keybinds {
    public static final int KEYBIND_KEY = Keyboard.KEY_L;
    public static KeyBinding openGUIKeyBind;

    public static void init(){
        openGUIKeyBind = new KeyBinding("key.modgui.open", KEYBIND_KEY, "key.tinkerslist.category");
        ClientRegistry.registerKeyBinding(openGUIKeyBind);
    }
}
