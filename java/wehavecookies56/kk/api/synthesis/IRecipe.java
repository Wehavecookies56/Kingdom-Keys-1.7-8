package wehavecookies56.kk.api.synthesis;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface IRecipe {
	
	void setType(RecipeType type);
	void setMaterials(ItemStack[] materials);
	void setResult(Item result);
	void setRecipe(Item recipe);
	void setCost(int cost);
	
	RecipeType getType();
	ItemStack getMaterials(int arrayPos);
	Item getResult();
	Item getRecipe();
	int getCost();
}
