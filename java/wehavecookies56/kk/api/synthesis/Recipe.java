package wehavecookies56.kk.api.synthesis;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipe implements IRecipe {

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

	@Override
	public void setType(RecipeType type) {
		this.type = type;
	}

	@Override
	public void setMaterials(ItemStack[] materials) {
		this.materials = materials;
	}

	@Override
	public void setResult(Item result) {
		this.result = result;
	}

	@Override
	public void setRecipe(Item recipe) {
		this.recipe = recipe;
	}

	@Override
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public RecipeType getType() {
		return type;
	}

	@Override
	public ItemStack[] getMaterials() {
		return materials;
	}

	@Override
	public Item getResult() {
		return result;
	}

	@Override
	public Item getRecipe() {
		return recipe;
	}

	@Override
	public int getCost() {
		return cost;
	}
	
}
