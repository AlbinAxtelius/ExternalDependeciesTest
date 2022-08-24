package se.axtelius.libwithexternals

import no.nordicsemi.android.dfu.DfuServiceInitiator

interface MyInterface {
    fun testExternal(): Int
}

class MyExternal : MyInterface {
    override fun testExternal(): Int {
        return DfuServiceInitiator.SCOPE_SYSTEM_COMPONENTS
    }
}