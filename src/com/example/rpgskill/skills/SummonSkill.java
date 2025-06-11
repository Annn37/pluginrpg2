package com.example.rpgskill.skills;

import com.example.rpgskill.Skill;
import org.bukkit.entity.Player;
import org.bukkit.entity.ArmorStand;
import org.bukkit.Location;

public class SummonSkill implements Skill {
    @Override
    public void activate(Player player) {
        Location loc = player.getLocation().add(player.getLocation().getDirection().multiply(2));
        ArmorStand stand = player.getWorld().spawn(loc, ArmorStand.class);
        stand.setVisible(false);
        stand.setCustomName("§dSummoned Spirit");
        stand.setCustomNameVisible(true);
        stand.setSmall(true);
        stand.setGravity(false);
        player.sendMessage("§bYou summon a spirit!");
    }
}
