package dev.endcraft.storage.chest;

import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.json.JSONObject;

public class Chest implements ChestSerializable {

	private String player;
	private List<ItemStack> items;
	private Integer chestId;
	
	
	public Chest() {}
	
	public List<ItemStack> getUnserializableItems() {
		return null;
	}
	
	public String getSerializableItems() {
		return null;
	}
}
