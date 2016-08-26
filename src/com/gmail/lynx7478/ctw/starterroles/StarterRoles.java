package com.gmail.lynx7478.ctw.starterroles;

import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lynx7478.ctw.game.roles.RoleManager;
import com.gmail.lynx7478.ctw.starterroles.roles.*;
import com.gmail.lynx7478.ctw.utils.VersionUtils;

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
		if(VersionUtils.getVersion().contains("v1_9") || VersionUtils.getVersion().contains("v1_10"))
		{
			RoleManager.registerRole(new Bird());
		}
	}

}
