package wehavecookies56.kk.api.synthesis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

import org.apache.logging.log4j.message.Message;

import wehavecookies56.kk.KingdomKeys;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeHandler {

	public static Map<String, IRecipe> synthesisRecipes = new HashMap();
	
	public static void registerRecipe(String id, IRecipe recipe){
		synthesisRecipes.put(id, recipe);
	}

	public static IRecipe getRecipe(String id){
		return synthesisRecipes.get(id);
	}
	
	public static int getTotalRegistered(){
		return synthesisRecipes.size();
	}
	
	public static Iterator<String> recipeIterator = synthesisRecipes.keySet().iterator();
	
	public static void iterateRecipes(){
		while (recipeIterator.hasNext()){
			String key = recipeIterator.next();
			System.out.println("Recipe id: " + key + " Materials: " + synthesisRecipes.get(key));
		}
	

	}
	
}
