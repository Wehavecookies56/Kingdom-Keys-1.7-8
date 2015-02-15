package wehavecookies56.kk.entities.mob;

import java.util.Random;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import wehavecookies56.kk.item.AddedItems;

public class VillagerTradeHandlerRecipes implements IVillageTradeHandler {
	
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 32),
				new ItemStack(Items.emerald, 15),
				new ItemStack(AddedItems.K1r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 32),
				new ItemStack(Items.emerald , 15),
				new ItemStack(AddedItems.K2r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 32),
				new ItemStack(Items.emerald , 15),
				new ItemStack(AddedItems.K3r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 32),
				new ItemStack(Items.emerald , 15),
				new ItemStack(AddedItems.K4r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 32),
				new ItemStack(Items.emerald , 15),
				new ItemStack(AddedItems.K5r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.DarkHeart, 40),
				new ItemStack(Items.emerald , 8),
				new ItemStack(AddedItems.K7r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.KingdomHearts, 8),
				new ItemStack(Items.emerald , 32),
				new ItemStack(AddedItems.K22r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.PureHeart, 16),
				new ItemStack(Items.emerald , 12),
				new ItemStack(AddedItems.K26r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.DarkHeart, 64),
				new ItemStack(Items.emerald , 15),
				new ItemStack(AddedItems.K39r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.PureHeart, 22),
				new ItemStack(Items.emerald , 10),
				new ItemStack(AddedItems.K45r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 32),
				new ItemStack(Items.emerald , 5),
				new ItemStack(AddedItems.K67r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 64),
				new ItemStack(Items.emerald , 18),
				new ItemStack(AddedItems.K69r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.PureHeart, 52),
				new ItemStack(Items.emerald , 18),
				new ItemStack(AddedItems.K88r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.DarkHeart, 52),
				new ItemStack(Items.emerald , 20),
				new ItemStack(AddedItems.K103r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.DarkHeart, 32),
				new ItemStack(Items.emerald , 14),
				new ItemStack(AddedItems.K114r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(Items.diamond, 1),
				new ItemStack(Items.emerald , 1),
				new ItemStack(AddedItems.Orichalcum))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Orichalcum, 1),
				new ItemStack(Items.emerald , 3),
				new ItemStack(AddedItems.OrichalcumPlus))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Orichalcum),
				null,
				new ItemStack(Items.emerald, 1))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.OrichalcumPlus),
				null,
				new ItemStack(Items.emerald, 2))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(Items.emerald, 5),
				null,
				new ItemStack(AddedItems.MythrilShardRecipe))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(Items.emerald, 7),
				null,
				new ItemStack(AddedItems.MythrilStoneRecipe))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(Items.emerald, 9),
				null,
				new ItemStack(AddedItems.MythrilGemRecipe))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(Items.emerald, 12),
				null,
				new ItemStack(AddedItems.MythrilCrystalRecipe))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.DarkHeart, 64),
				new ItemStack(Items.emerald, 6),
				new ItemStack(AddedItems.DarkMatterRecipe))
		);
	}
	
}
