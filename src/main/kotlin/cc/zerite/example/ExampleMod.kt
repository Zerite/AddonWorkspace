package cc.zerite.example

import cc.zerite.client.event.Subscribe
import cc.zerite.client.event.TickEvent
import cc.zerite.client.injection.bootstrap.impl.annotations.ConfigSettings
import cc.zerite.client.injection.bootstrap.impl.annotations.Instance
import cc.zerite.client.injection.bootstrap.impl.configuration.StoreConfig
import cc.zerite.client.util.game.ChatUtil

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