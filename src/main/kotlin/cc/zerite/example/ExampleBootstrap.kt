package cc.zerite.example

import net.zeriteclient.zerite.injection.bootstrap.AbstractBootstrap

class ExampleBootstrap : AbstractBootstrap() {

    override fun bootstrapTweaker() {
        println("From bootstrap")
    }
}