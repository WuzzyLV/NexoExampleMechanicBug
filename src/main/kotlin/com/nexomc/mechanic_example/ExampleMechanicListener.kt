package com.nexomc.mechanic_example

import com.nexomc.nexo.api.NexoItems
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class ExampleMechanicListener(private val factory: ExampleMechanicFactory) : Listener {

    @EventHandler
    fun PlayerJoinEvent.onJoin() {
        val itemId = NexoItems.idFromItem(player.inventory.itemInMainHand) ?: return
        val exampleMechanic = factory.getMechanic(itemId) ?: return
        player.sendMessage(exampleMechanic.something)
    }
}