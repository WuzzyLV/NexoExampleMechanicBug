package com.nexomc.mechanic_example

import com.nexomc.nexo.api.events.NexoMechanicsRegisteredEvent
import com.nexomc.nexo.mechanics.MechanicsManager
import com.nexomc.nexo.utils.logs.Logs
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class NexoMechanicExample : JavaPlugin() {

    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(object : Listener {

            @EventHandler
            fun NexoMechanicsRegisteredEvent.onRegister() {
                MechanicsManager.registerMechanicFactory(ExampleMechanicFactory(), true)
                Logs.logInfo("Registered Example Mechanic!")
            }

        }, this)
    }
}
