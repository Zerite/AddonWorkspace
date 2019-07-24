package cc.zerite.example

import net.zeriteclient.zerite.event.Subscribe
import net.zeriteclient.zerite.event.TickEvent
import net.zeriteclient.zerite.injection.bootstrap.impl.annotations.ConfigSettings
import net.zeriteclient.zerite.injection.bootstrap.impl.annotations.Instance
import net.zeriteclient.zerite.injection.bootstrap.impl.configuration.StoreConfig
import net.zeriteclient.zerite.util.game.ChatUtil

@Instance(true,  true)
@ConfigSettings("Example")
object ExampleMod {

    @StoreConfig("Test")
    var test = false

    @Subscribe
    private fun onUpdate(e: TickEvent) {
        if (test)
            ChatUtil.printChat("Test")
    }

}