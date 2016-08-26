package com.gmail.lynx7478.ctw.starterroles;

import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lynx7478.ctw.game.roles.RoleManager;
import com.gmail.lynx7478.ctw.starterroles.roles.*;

public class StarterRoles extends JavaPlugin {
	
	@Override
	public void onEnable()
	{
		RoleManager.registerRole(new Builder());
		RoleManager.registerRole(new Guard());
		RoleManager.registerRole(new Miner());
		RoleManager.registerRole(new Scout());
		RoleManager.registerRole(new Tank());
		RoleManager.registerRole(new Warrior());
	}

}
