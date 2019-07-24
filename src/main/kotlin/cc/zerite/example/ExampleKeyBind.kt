package cc.zerite.example

import net.zeriteclient.zerite.injection.bootstrap.impl.keybinds.CustomKeyBind
import org.lwjgl.input.Keyboard

class ExampleKeyBind : CustomKeyBind("Example", Keyboard.KEY_J) {

    override fun onPressed() {
        ExampleMod.test = !ExampleMod.test
    }
}