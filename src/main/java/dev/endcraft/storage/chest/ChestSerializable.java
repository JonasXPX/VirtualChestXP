package dev.endcraft.storage.chest;

import java.util.List;

import org.bukkit.inventory.ItemStack;

public interface ChestSerializable {

	
	public String getSerializableItems();
	
	public List<ItemStack> getUnserializableItems();
	
}
