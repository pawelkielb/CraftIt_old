package org.craftit.runtime

import org.craftit.runtime.resources.commands.RootNoteFiller
import org.craftit.runtime.resources.entities.player.PlayerFactory
import javax.inject.Inject

class CraftItBridge @Inject constructor(private val playerFactory: PlayerFactory, private val rootNodeFiller: RootNoteFiller) {
    fun setup() {
        CraftItBridge.playerFactory = playerFactory
        CraftItBridge.rootNodeFiller = rootNodeFiller
    }

    companion object {
        @JvmField
        var playerFactory: PlayerFactory? = null

        @JvmField
        var rootNodeFiller: RootNoteFiller? = null
    }
}
