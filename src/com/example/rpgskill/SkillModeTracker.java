package com.example.rpgskill;

import org.bukkit.entity.Player;
import java.util.HashSet;
import java.util.Set;

public class SkillModeTracker {
    private static final Set<Player> skillModePlayers = new HashSet<>();

    public static void toggleSkillMode(Player player) {
        if (skillModePlayers.contains(player)) {
            skillModePlayers.remove(player);
            player.sendMessage("§cSkill mode OFF");
        } else {
            skillModePlayers.add(player);
            player.sendMessage("§aSkill mode ON");
        }
    }

    public static boolean isInSkillMode(Player player) {
        return skillModePlayers.contains(player);
    }
}
