package ca.evannosich.slabtoblocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class SlabToBlocks extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// Oak Planks
		
		ItemStack oakPlanksItem = new ItemStack(Material.OAK_PLANKS);
		
		NamespacedKey oakPlanksKey = new NamespacedKey(this, "OAK_PLANKS");
		
		ShapelessRecipe oakPlanksRecipe = new ShapelessRecipe(oakPlanksKey, oakPlanksItem);
		
		oakPlanksRecipe.addIngredient(2, Material.OAK_SLAB);
		
		// Spruce Planks
		
		ItemStack sprucePlanksItem = new ItemStack(Material.SPRUCE_PLANKS);
		
		NamespacedKey sprucePlanksKey = new NamespacedKey(this, "SPRUCE_PLANKS");
		
		ShapelessRecipe sprucePlanksRecipe = new ShapelessRecipe(sprucePlanksKey, sprucePlanksItem);
		
		sprucePlanksRecipe.addIngredient(2, Material.SPRUCE_SLAB);
		
		// Birch Planks
		
		ItemStack birchPlanksItem = new ItemStack(Material.BIRCH_PLANKS);
		
		NamespacedKey birchPlanksKey = new NamespacedKey(this, "BIRCH_PLANKS");
		
		ShapelessRecipe birchPlanksRecipe = new ShapelessRecipe(birchPlanksKey, birchPlanksItem);
		
		birchPlanksRecipe.addIngredient(2, Material.BIRCH_SLAB);
		
		// Jungle Planks
		
		ItemStack junglePlanksItem = new ItemStack(Material.JUNGLE_PLANKS);
		
		NamespacedKey junglePlanksKey = new NamespacedKey(this, "JUNGLE_PLANKS");
		
		ShapelessRecipe junglePlanksRecipe = new ShapelessRecipe(junglePlanksKey, junglePlanksItem);
		
		junglePlanksRecipe.addIngredient(2, Material.JUNGLE_SLAB);
		
		// Acacia Planks
		
		ItemStack acaciaPlanksItem = new ItemStack(Material.ACACIA_PLANKS);
		
		NamespacedKey acaciaPlanksKey = new NamespacedKey(this, "ACACIA_PLANKS");
		
		ShapelessRecipe acaciaPlanksRecipe = new ShapelessRecipe(acaciaPlanksKey, acaciaPlanksItem);
		
		acaciaPlanksRecipe.addIngredient(2, Material.ACACIA_SLAB);
		
		// Dark Oak Planks
		
		ItemStack darkOakPlanksItem = new ItemStack(Material.DARK_OAK_PLANKS);
		
		NamespacedKey darkOakPlanksKey = new NamespacedKey(this, "DARK_OAK_PLANKS");
		
		ShapelessRecipe darkOakPlanksRecipe = new ShapelessRecipe(darkOakPlanksKey, darkOakPlanksItem);
		
		darkOakPlanksRecipe.addIngredient(2, Material.DARK_OAK_SLAB);
		
		// Add Recipes
		Bukkit.addRecipe(oakPlanksRecipe);
		Bukkit.addRecipe(sprucePlanksRecipe);
		Bukkit.addRecipe(birchPlanksRecipe);
		Bukkit.addRecipe(junglePlanksRecipe);
		Bukkit.addRecipe(acaciaPlanksRecipe);
		Bukkit.addRecipe(darkOakPlanksRecipe);
	}
	
	@Override
	public void onDisable() {
		
	}
}
