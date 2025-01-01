package com.nexomc.example_mechanic;

import com.nexomc.nexo.api.events.NexoMechanicsRegisteredEvent;
import com.nexomc.nexo.mechanics.MechanicsManager;
import com.nexomc.nexo.utils.logs.Logs;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NexoMechanicExample extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Listener() {
            @EventHandler
            public void nRegister(NexoMechanicsRegisteredEvent event) {
                MechanicsManager.INSTANCE.registerMechanicFactory(new ExampleMechanicFactory(), true);
                Logs.logInfo("Registered Example Mechanic!");
            }
        }, this);
    }
}
