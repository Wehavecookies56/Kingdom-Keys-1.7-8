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
	public static AchievementPage kingdomKeysAchievement;
	
	public static void initAchievements(){

		bugBlox = new Achievement("achievemnt.bugBlox", "bugBlox", 0, 0, AddedBlocks.NormalBlox, (Achievement)null).registerStat();
		recipe = new Achievement("achievement.recipe", "recipe", 2, -1, AddedItems.K1r, (Achievement)null).initIndependentStat().registerStat();
		kingdomKey = new Achievement("achievement.kingdomKey", "kingdomKey", 1, 2, AddedItems.KingdomKey, bugBlox).setSpecial().registerStat();
		
		AchievementPage.registerAchievementPage(kingdomKeysAchievement = new AchievementPage("Kingdom Keys", new Achievement[]{bugBlox, recipe, kingdomKey}));
	}

}
