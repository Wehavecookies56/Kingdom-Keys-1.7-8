package wehavecookies56.kk.achievements;

import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.item.AddedItems;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class AddedAchievments {


	public static Achievement bugBlox;
	public static Achievement recipe;
	public static Achievement kingdomKey;
	public static Achievement orichalcum;
	public static Achievement orichalcumPlus;
	public static AchievementPage kingdomKeysAchievement;
	
	public static void initAchievements(){

		bugBlox = new Achievement("achievemnt.bugBlox", "bugBlox", 0, 0, AddedBlocks.NormalBlox, (Achievement)null).initIndependentStat().registerStat();
		recipe = new Achievement("achievement.recipe", "recipe", 2, -1, AddedItems.K1r, (Achievement)null).initIndependentStat().registerStat();
		
		kingdomKey = new Achievement("achievement.kingdomKey", "kingdomKey", 3, -2, AddedItems.KingdomKey, recipe).setSpecial().registerStat();
		orichalcum = new Achievement("achievement.orichalcum", "orichalcum", -2, 3, AddedItems.Orichalcum, (Achievement)null).initIndependentStat().registerStat();
		orichalcumPlus = new Achievement("achievement.orichalcumPlus", "orichalcumPlus", -3, 3, AddedItems.OrichalcumPlus, orichalcum).setSpecial().registerStat();

		
		AchievementPage.registerAchievementPage(kingdomKeysAchievement = new AchievementPage("Kingdom Keys", new Achievement[]{bugBlox, recipe, kingdomKey}));
	}

}
