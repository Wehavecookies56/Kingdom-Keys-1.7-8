package wehavecookies56.kk.lib;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wehavecookies56.kk.api.synthesis.Recipe;
import wehavecookies56.kk.api.synthesis.RecipeHandler;
import wehavecookies56.kk.api.synthesis.RecipeType;
import wehavecookies56.kk.item.AddedItems;

public class SynthesisRecipes {

	public static RecipeHandler recipes = new RecipeHandler();
	
	static ItemStack[] materials;
	
	public static void initSynthesisRecipes(){
		recipes.registerRecipe(AddedItems.AbaddonPlasma.getUnlocalizedName().toString(), 
				new Recipe(RecipeType.ATTACK, AddedItems.K62r, AddedItems.AbaddonPlasmaChain, 1050, 
					materials = new ItemStack[]{new ItemStack(AddedItems.Orichalcum, 1, 0)}));
	}
}
