package ca.evannosich.slabtoblocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class SlabToBlocks extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// Oak Planks
		ItemStack oakPlanksItem = new ItemStack(Material.OAK_PLANKS);
		
		ItemMeta oakPlanksMeta = oakPlanksItem.getItemMeta();
		
		NamespacedKey oakPlanksKey = new NamespacedKey(this, "OAK_PLANKS");
		
		ShapedRecipe oakPlanksRecipe = new ShapedRecipe(oakPlanksKey, oakPlanksItem);
		
		oakPlanksRecipe.shape(" S ", " S ");
		
		oakPlanksRecipe.setIngredient('S', Material.OAK_SLAB);
		
		Bukkit.addRecipe(oakPlanksRecipe);
		
		// Acacia Planks
		ItemStack acaciaPlanksItem = new ItemStack(Material.ACACIA_PLANKS);
		
		ItemMeta acaciaPlanksMeta = acaciaPlanksItem.getItemMeta();
		
		NamespacedKey acaciaPlanksKey = new NamespacedKey(this, "ACACIA_PLANKS");
		
		ShapedRecipe acaciaPlanksRecipe = new ShapedRecipe(acaciaPlanksKey, acaciaPlanksItem);
		
		acaciaPlanksRecipe.shape(" S ", " S ");
		
		acaciaPlanksRecipe.setIngredient('S', Material.ACACIA_SLAB);
		
		Bukkit.addRecipe(acaciaPlanksRecipe);
	}
	
	@Override
	public void onDisable() {
		
	}
}
