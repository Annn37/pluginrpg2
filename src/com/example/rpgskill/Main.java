package com.example.rpgskill;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SkillManager(), this);
        getCommand("skill").setExecutor(new SkillModeTracker());
    }
}
