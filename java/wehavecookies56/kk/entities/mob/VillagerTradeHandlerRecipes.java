package wehavecookies56.kk.entities.mob;

import java.util.List;
import java.util.Random;

import wehavecookies56.kk.item.AddedItems;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class VillagerTradeHandlerRecipes implements IVillageTradeHandler {
	
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 10),
				new ItemStack(AddedItems.DarkHeart, 32),
				new ItemStack(AddedItems.K111r))
		);
		
		recipeList.add(new MerchantRecipe(
				new ItemStack(AddedItems.Heart, 64),
				new ItemStack(AddedItems.DarkHeart, 64),
				new ItemStack(AddedItems.K113r))
		);
	}
	
}
