package com.example.rpgskill.skills;

import com.example.rpgskill.Skill;
import org.bukkit.entity.Player;

public class HealSkill implements Skill {
    @Override
    public void activate(Player player) {
        player.setHealth(Math.min(20.0, player.getHealth() + 10.0));
        player.sendMessage("§aYou cast Heal!");
    }
}
