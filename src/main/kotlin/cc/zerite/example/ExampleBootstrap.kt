package cc.zerite.example

import cc.zerite.client.injection.bootstrap.AbstractBootstrap

class ExampleBootstrap : AbstractBootstrap() {

    override fun bootstrapTweaker() {
        println("From bootstrap")
    }
}