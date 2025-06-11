package com.example.rpgskill.skills;

import com.example.rpgskill.Skill;
import org.bukkit.entity.Player;
import org.bukkit.entity.Fireball;
import org.bukkit.util.Vector;

public class FireballSkill implements Skill {
    @Override
    public void activate(Player player) {
        Fireball fireball = player.launchProjectile(Fireball.class);
        fireball.setVelocity(player.getLocation().getDirection().multiply(2));
        player.sendMessage("§6You cast Fireball!");
    }
}
