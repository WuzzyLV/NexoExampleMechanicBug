package com.nexomc.mechanic_example

import com.nexomc.nexo.mechanics.Mechanic
import org.bukkit.configuration.ConfigurationSection

class ExampleMechanic(factory: ExampleMechanicFactory, section: ConfigurationSection) : Mechanic(factory, section) {
    val something: String = section.getString("something") ?: "nothing"
    val bool: Boolean = section.getBoolean("bool")
}