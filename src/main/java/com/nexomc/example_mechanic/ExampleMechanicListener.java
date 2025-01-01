package com.nexomc.example_mechanic;

import com.nexomc.nexo.api.NexoItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class ExampleMechanicListener implements Listener {

    private ExampleMechanicFactory factory;

    public ExampleMechanicListener(ExampleMechanicFactory factory) {
        this.factory = factory;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        String itemId = NexoItems.idFromItem(itemInHand);
        if (itemId == null) return;
        ExampleMechanic mechanic = factory.getMechanic(itemId);
        if (mechanic == null) return;
        player.sendMessage(mechanic.something);
    }
}
