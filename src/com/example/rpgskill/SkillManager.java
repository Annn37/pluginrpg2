package com.example.rpgskill;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.Map;

public class SkillManager implements Listener {

    private static final Map<Integer, Skill> skills = new HashMap<>();

    static {
        skills.put(0, new skills.FireballSkill());
        skills.put(1, new skills.HealSkill());
        skills.put(2, new skills.SummonSkill());
    }

    @EventHandler
    public void onItemHeld(PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        if (SkillModeTracker.isInSkillMode(player)) {
            Skill skill = skills.get(event.getNewSlot());
            if (skill != null) {
                skill.activate(player);
            }
        }
    }

    @EventHandler
    public void onSwapHand(PlayerSwapHandItemsEvent event) {
        SkillModeTracker.toggleSkillMode(event.getPlayer());
        event.setCancelled(true);
    }
}
