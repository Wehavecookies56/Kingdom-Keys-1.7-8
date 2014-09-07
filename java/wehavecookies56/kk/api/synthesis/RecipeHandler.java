package wehavecookies56.kk.api.synthesis;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeHandler {

	public static Map<String, Recipe> synthesisRecipes = new HashMap();
	
	public static void registerRecipe(String id, Recipe recipe){
		synthesisRecipes.put(id, recipe);
	}

	public static Recipe getRecipe(String id){
		return synthesisRecipes.get(id);
	}
	
	public static int getTotalRegistered(){
		return synthesisRecipes.size();
	}
	
}
