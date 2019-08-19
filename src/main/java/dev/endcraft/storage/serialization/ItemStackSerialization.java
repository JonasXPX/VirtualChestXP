package dev.endcraft.storage.serialization;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.json.JSONObject;

/**
 * @author Jonas
 * 
 * Create date 19/08/2019
 */
public class ItemStackSerialization {

	
	private JSONObject object;
	
	public ItemStackSerialization() {}
	
	public ItemStackSerialization build() {
		object = new JSONObject();
		return this;
	}
	
	
	public ItemStackSerialization add(ItemStack item) {
		return this;
	}
	
	private JSONObject buildMeta(ItemMeta meta) {
		JSONObject jsonMeta = null;
		if(meta == null) {
			return jsonMeta;
		}
		
		jsonMeta = new JSONObject();
		
		jsonMeta.append("displayName", meta.hasDisplayName() ? meta.getDisplayName() : null);
		jsonMeta.append("lore", meta.hasLore() ? meta.getLore() : null);
		if(meta.hasEnchants()) {
			JSONObject jsonEnchant = new JSONObject();
			for (Enchantment enc : meta.getEnchants().keySet()) {
				jsonEnchant.append(enc.getKey().getNamespace(), meta.getEnchants().get(enc));
			}
			jsonMeta.append("enchants", jsonEnchant);
		}
		
		
		return jsonMeta;
	}
	
}
