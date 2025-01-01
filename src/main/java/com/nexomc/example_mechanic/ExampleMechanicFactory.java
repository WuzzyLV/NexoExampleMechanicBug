package com.nexomc.example_mechanic;

import com.nexomc.nexo.mechanics.Mechanic;
import com.nexomc.nexo.mechanics.MechanicFactory;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExampleMechanicFactory extends MechanicFactory {

    public ExampleMechanicFactory() {
        super("example");
    }

    @Override @Nullable
    public ExampleMechanic getMechanic(String itemId) {
        return (ExampleMechanic) super.getMechanic(itemId);
    }

    @Override @Nullable
    public ExampleMechanic getMechanic(ItemStack itemStack) {
        return (ExampleMechanic) super.getMechanic(itemStack);
    }

    @Override
    public @Nullable Mechanic parse(@NotNull ConfigurationSection configurationSection) {
        ExampleMechanic mechanic = new ExampleMechanic(this, configurationSection);
        addToImplemented(mechanic);
        return mechanic;
    }
}
