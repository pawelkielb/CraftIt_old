package org.craftit.runtime.resources.entities.player.components

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import org.craftit.api.resources.entities.player.components.PlayerComponent
import org.craftit.runtime.resources.entities.player.NativeConnectorImpl
import org.craftit.runtime.resources.entities.player.NativePlayerImpl

class RuntimePlayerComponent @AssistedInject constructor(
    @Assisted val nativeConnector: NativeConnectorImpl,
    @Assisted val nativePlayer: NativePlayerImpl
) : PlayerComponent {

    @AssistedFactory
    interface Factory {
        fun create(nativeConnector: NativeConnectorImpl, nativePlayer: NativePlayerImpl): RuntimePlayerComponent
    }

    override fun onAttach() {
    }
}
