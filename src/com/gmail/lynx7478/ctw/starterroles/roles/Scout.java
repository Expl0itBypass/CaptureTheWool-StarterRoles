package com.gmail.lynx7478.ctw.starterroles.roles;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.gmail.lynx7478.ctw.CTW;
import com.gmail.lynx7478.ctw.game.roles.Loadout;
import com.gmail.lynx7478.ctw.game.roles.Role;
import com.gmail.lynx7478.ctw.utils.ItemUtils;

public class Scout extends Role implements Listener {

	@Override
	public List<String> getDescription() 
	{
		return createList(
				"You are the eyes.",
				" ",
				"Use your mobility",
				"to run across enemy fields",
				"while stealing their resources",
				"and gathering information",
				"so your team can counter it.");
	}

	@Override
	public ItemStack getIcon() 
	{
		return new ItemStack(Material.FISHING_ROD);
	}

	@Override
	public Loadout getLoadout() {
		return new Loadout().addWoodSword().addWoodPickaxe().addItem(this.getSpecialItem());
	}

	@Override
	public String getName() 
	{
		return "Scout";
	}

	@Override
	public ItemStack getSpecialItem() 
	{
		ItemStack i = ItemUtils.createNewSoulboud(Material.FISHING_ROD);
		ItemMeta m = i.getItemMeta();
		m.setDisplayName(ChatColor.AQUA+"Grapple");
		i.setItemMeta(m);
		return i;
	}
	
	@EventHandler
	public void onRespawn(PlayerRespawnEvent e)
	{
		final Player p = e.getPlayer();
		Bukkit.getScheduler().runTaskLater(CTW.getInstance(), new Runnable()
				{
			public void run()
			{
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
			}
				}, 5L);
	}

	@Override
	public void onSpecialItemClick(Player arg0, ItemStack arg1) {
		//TODO: Scout pull thing.
		return;
		
	}

}
