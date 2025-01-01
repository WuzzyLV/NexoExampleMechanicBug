package com.nexomc.mechanic_example

import com.nexomc.nexo.mechanics.MechanicFactory
import org.bukkit.configuration.ConfigurationSection
import org.bukkit.inventory.ItemStack

class ExampleMechanicFactory : MechanicFactory("example") {

    init {
        registerListeners(ExampleMechanicListener(this))
    }

    override fun getMechanic(itemID: String?): ExampleMechanic? {
        return super.getMechanic(itemID) as? ExampleMechanic
    }
    override fun getMechanic(itemStack: ItemStack?): ExampleMechanic? {
        return super.getMechanic(itemStack) as? ExampleMechanic
    }

    override fun parse(section: ConfigurationSection): ExampleMechanic {
        val exampleMechanic = ExampleMechanic(this, section)
        addToImplemented(exampleMechanic)
        return exampleMechanic
    }
}