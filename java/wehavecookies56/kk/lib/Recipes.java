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
		
		if(ConfigBooleans.expensiveDarkMatter == true){
			GameRegistry.addRecipe(new ItemStack(AddedItems.DarkMatter,2), new Object[]{
				"DDD",
				"DOD",
				"DDD",
				'D', Items.diamond, 'O', Blocks.obsidian
			});
		}
		
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
		GameRegistry.addRecipe(new ItemStack(AddedItems.DarkLeather), new Object[]{
			"DDD",
			"DLD",
			"DDD",
			'D', AddedItems.DarkHeart, 'L', Items.leather,
		});
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
			'P', AddedItems.EmptyBottle, 'H', AddedItems.HP
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.EmptyBottle), new Object[]{
			"G G",
			"G G",
			" G ",
			'G', Blocks.glass
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
			"H5H",
			"ONO",
			'M', AddedBlocks.MetalBlox, 'C', Blocks.crafting_table, 'H', AddedBlocks.HardBlox, '5', Items.diamond, 'N', AddedBlocks.NormalBlox, 'O', AddedItems.HP
		});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.DarkKnowledge), new Object[]{		
			"BDB",		
			"DOD",		
			"BDB",		
			'B', Items.book, 'D', AddedItems.DarkCrystal, 'O', Blocks.obsidian		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.VoidedKnowledge), new Object[]{		
			"ODO",		
			"DKD",		
			"ODO",		
			'O', Blocks.obsidian, 'D', AddedItems.DarkMatter, 'K', AddedItems.DarkKnowledge		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeVHelm), new Object[]{		
			"POP",		
			"PKP",		
			'P', AddedItems.PureHeart, 'O', AddedItems.Orichalcum, 'K', AddedItems.KingdomHearts		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeVChest), new Object[]{		
			"POP",		
			"PKP",		
			"PKP",		
			'P', AddedItems.PureHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeVLegs), new Object[]{		
			"PKP",		
			"POP",		
			"P P",		
			'P', AddedItems.PureHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeVBoots), new Object[]{		
			"P P",		
			"POP",		
			'P', AddedItems.PureHeart, 'O', AddedItems.Orichalcum		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeAHelm), new Object[]{		
			"POP",		
			"HKH",		
			'P', AddedItems.PureHeart, 'O', AddedItems.Orichalcum, 'K', AddedItems.KingdomHearts, 'H', AddedItems.Heart		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeAChest), new Object[]{		
			"HOH",		
			"PKP",		
			"PKP",		
			'P', AddedItems.PureHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts, 'H', AddedItems.Heart		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeALegs), new Object[]{		
			"HKH",		
			"POP",		
			"P P",		
			'P', AddedItems.PureHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts, 'H', AddedItems.Heart		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeABoots), new Object[]{		
			"H H",		
			"POP",		
			'P', AddedItems.PureHeart, 'O', AddedItems.Orichalcum, 'H', AddedItems.Heart		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeTHelm), new Object[]{		
			"DOD",		
			"DKD",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.Orichalcum, 'K', AddedItems.KingdomHearts		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeTChest), new Object[]{		
			"DOD",		
			"DKD",		
			"DKD",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeTLegs), new Object[]{		
			"DKD",		
			"DOD",		
			"D D",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeTBoots), new Object[]{		
			"D D",		
			"DOD",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.Orichalcum		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeEHelm), new Object[]{		
			"DOD",		
			"PKP",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts, 'P', AddedItems.PureHeart		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeEChest), new Object[]{		
			"DOD",		
			"PKP",		
			"PKP",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts, 'P', AddedItems.PureHeart		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeELegs), new Object[]{		
			"DKD",		
			"POP",		
			"P P",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.OrichalcumPlus, 'K', AddedItems.KingdomHearts, 'P', AddedItems.PureHeart 		
		});		
				
		GameRegistry.addRecipe(new ItemStack(AddedItems.KeybladeEBoots), new Object[]{		
			"D D",		
			"POP",		
			'D', AddedItems.DarkHeart, 'O', AddedItems.Orichalcum, 'P', AddedItems.PureHeart		
 		});
			
	}
	public static void initShapelessRecipes(){
	
		
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVHelm), new ItemStack(AddedItems.KeybladeVHelm), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVChest), new ItemStack(AddedItems.KeybladeVChest), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVLegs), new ItemStack(AddedItems.KeybladeVLegs), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVBoots), new ItemStack(AddedItems.KeybladeVBoots), new ItemStack(AddedItems.OrichalcumPlus));
		if(ConfigBooleans.munnyDrops){
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1), new ItemStack(Items.gold_nugget));
		}
	}




}
