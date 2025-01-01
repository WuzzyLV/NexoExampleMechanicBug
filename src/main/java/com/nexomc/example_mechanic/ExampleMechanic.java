package com.nexomc.example_mechanic;

import com.nexomc.nexo.mechanics.Mechanic;
import com.nexomc.nexo.mechanics.MechanicFactory;
import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExampleMechanic extends Mechanic {

    @NotNull public final String something;
    public final boolean bool;

    public ExampleMechanic(@Nullable MechanicFactory factory, @NotNull ConfigurationSection section) {
        super(factory, section);
        something = section.getString("something", "nothing");
        bool = section.getBoolean("bool", false);
    }
}
