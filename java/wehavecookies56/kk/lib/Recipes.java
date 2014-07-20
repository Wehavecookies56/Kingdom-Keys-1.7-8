package wehavecookies56.kk.lib;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void initShapedRecipes(){
		ItemStack greenDye = new ItemStack(Items.dye, 1, 2);
		ItemStack blueDye = new ItemStack(Items.dye, 1, 4);
		ItemStack blackDye = new ItemStack(Items.dye, 1, 0);
		ItemStack yellowDye = new ItemStack(Items.dye, 1, 11);
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(AddedItems.Heart), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Blocks.soul_sand, 'D', AddedItems.DarkHeart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(AddedItems.Heart), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Blocks.soul_sand, 'D', AddedItems.DarkHeart
			});
		}
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(AddedItems.PureHeart), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Blocks.soul_sand, 'D', AddedItems.Heart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(AddedItems.PureHeart), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Blocks.soul_sand, 'D', AddedItems.Heart
			});
		}
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(AddedItems.KingdomHearts), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Blocks.soul_sand, 'D', AddedItems.PureHeart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(AddedItems.KingdomHearts), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Blocks.soul_sand, 'D', AddedItems.PureHeart
			});
		}
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationHood), new Object[]{
			"LLL",
			"LDL",
			"SGS",
			'D', AddedItems.DarkCrystal, 'L', AddedItems.DarkLeather, 'S', Items.string, 'G', AddedItems.DarkGem
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationCoat), new Object[]{
			"LGL",
			"LDL",
			"LLL",
			'D', AddedItems.DarkCrystal, 'L', AddedItems.DarkLeather, 'G', AddedItems.DarkGem
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationLegs), new Object[]{
			"LLL",
			"LGL",
			"LDL",
			'D', AddedItems.DarkCrystal, 'L', AddedItems.DarkLeather, 'G', AddedItems.DarkGem
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationBoots), new Object[]{
			"LDL",
			"LGL",
			'D', AddedItems.DarkCrystal, 'L', AddedItems.DarkLeather, 'G', AddedItems.DarkGem
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.Potion), new Object[]{
			"HHH",
			"HHH",
			"HPH",
			'P', Items.glass_bottle, 'H', AddedItems.HP
		});
		//Blast blox recipe
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.BlastBlox), new Object[]{
			"NLN",
			"HTH",
			"NHN",
			'N', AddedBlocks.NormalBlox, 'L', Items.lava_bucket , 'H', AddedBlocks.HardBlox, 'T', Blocks.tnt  
		});
		//Bounce blox recipe
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.BounceBlox), new Object[]{
			"MMM",
			"HPH",
			"NNN",
			'N', AddedBlocks.NormalBlox, 'P', Blocks.piston , 'H', AddedBlocks.HardBlox, 'M', AddedBlocks.MetalBlox  
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.NormalBlox), new Object[]{
			"ED",
			"DE",
			'E', Blocks.end_stone, 'D', Blocks.dirt
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.HardBlox), new Object[]{
			"ES",
			"SE",
			'E', Blocks.end_stone, 'S', Blocks.stone
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.MetalBlox), new Object[]{
			"EI",
			"IE",
			'E', Blocks.end_stone, 'I', Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.NormalBlox), new Object[]{
			"ED",
			"DE",
			'E', Blocks.end_stone, 'D', Blocks.dirt
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.Synthesiser), new Object[]{
			"MCM",
			"H5N",
			"OHO",
			'M', AddedBlocks.MetalBlox, 'C', Blocks.crafting_table, 'H', AddedBlocks.HardBlox, '5', AddedItems.Orichalcum, 'N', AddedBlocks.NormalBlox, 'O', AddedItems.HP
		});
	}
	public static void initShapelessRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny10, 1), new ItemStack(AddedItems.Munny10, 1), new ItemStack(AddedItems.Munny10, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny10));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny10));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny20), new ItemStack(AddedItems.Munny20));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny500), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny800), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1200), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny200));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1500), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny500));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1800), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny800));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny2000), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny2000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny1500), new ItemStack(AddedItems.Munny1500));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny4000), new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny5000), new ItemStack(AddedItems.Munny4000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny5000), new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny2000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny6000), new ItemStack(AddedItems.Munny5000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny6000), new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny3000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVHelm), new ItemStack(AddedItems.KeybladeVHelm), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVChest), new ItemStack(AddedItems.KeybladeVChest), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVLegs), new ItemStack(AddedItems.KeybladeVLegs), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVBoots), new ItemStack(AddedItems.KeybladeVBoots), new ItemStack(AddedItems.OrichalcumPlus));
		if(ConfigBooleans.munnyDrops){
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1), new ItemStack(Items.gold_nugget));
		}
	}




}
