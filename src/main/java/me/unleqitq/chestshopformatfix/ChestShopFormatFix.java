package me.unleqitq.chestshopformatfix;

import com.Acrobot.ChestShop.Events.Economy.CurrencyFormatEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChestShopFormatFix extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}
	
	@EventHandler
	public void onFormatRequest(CurrencyFormatEvent event) {
		event.setFormattedAmount(String.format("%.02f", event.getAmount().doubleValue()));
	}
	
}
