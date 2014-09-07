package wehavecookies56.kk.api.synthesis;

import wehavecookies56.kk.item.AddedItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipe {

	RecipeType type;
	ItemStack[] materials;
	Item result;
	Item recipe;
	int cost;
	
	public Recipe(RecipeType type, Item recipe, Item result, int cost, ItemStack[] materials) {
		this.type = type;
		this.recipe = recipe;
		this.result = result;
		this.cost = cost;
		this.materials = materials;
	}

}
