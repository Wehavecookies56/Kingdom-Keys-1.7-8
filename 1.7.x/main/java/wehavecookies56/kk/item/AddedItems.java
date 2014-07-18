package wehavecookies56.kk.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.common.ChestGenHooks;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.keyblades.*;
import wehavecookies56.kk.item.keychains.*;
import wehavecookies56.kk.item.recipes.*;
import wehavecookies56.kk.item.synthesis.ItemBlazingCrystal;
import wehavecookies56.kk.item.synthesis.ItemBlazingGem;
import wehavecookies56.kk.item.synthesis.ItemBlazingShard;
import wehavecookies56.kk.item.synthesis.ItemBlazingStone;
import wehavecookies56.kk.item.synthesis.ItemBrightCrystal;
import wehavecookies56.kk.item.synthesis.ItemBrightGem;
import wehavecookies56.kk.item.synthesis.ItemBrightShard;
import wehavecookies56.kk.item.synthesis.ItemBrightStone;
import wehavecookies56.kk.item.synthesis.ItemDarkCrystal;
import wehavecookies56.kk.item.synthesis.ItemDarkGem;
import wehavecookies56.kk.item.synthesis.ItemDarkMatter;
import wehavecookies56.kk.item.synthesis.ItemDarkShard;
import wehavecookies56.kk.item.synthesis.ItemDarkStone;
import wehavecookies56.kk.item.synthesis.ItemDenseCrystal;
import wehavecookies56.kk.item.synthesis.ItemDenseGem;
import wehavecookies56.kk.item.synthesis.ItemDenseShard;
import wehavecookies56.kk.item.synthesis.ItemDenseStone;
import wehavecookies56.kk.item.synthesis.ItemEnergyCrystal;
import wehavecookies56.kk.item.synthesis.ItemEnergyGem;
import wehavecookies56.kk.item.synthesis.ItemEnergyShard;
import wehavecookies56.kk.item.synthesis.ItemEnergyStone;
import wehavecookies56.kk.item.synthesis.ItemFrostCrystal;
import wehavecookies56.kk.item.synthesis.ItemFrostGem;
import wehavecookies56.kk.item.synthesis.ItemFrostShard;
import wehavecookies56.kk.item.synthesis.ItemFrostStone;
import wehavecookies56.kk.item.synthesis.ItemLightningCrystal;
import wehavecookies56.kk.item.synthesis.ItemLightningGem;
import wehavecookies56.kk.item.synthesis.ItemLightningShard;
import wehavecookies56.kk.item.synthesis.ItemLightningStone;
import wehavecookies56.kk.item.synthesis.ItemLucidCrystal;
import wehavecookies56.kk.item.synthesis.ItemLucidGem;
import wehavecookies56.kk.item.synthesis.ItemLucidShard;
import wehavecookies56.kk.item.synthesis.ItemLucidStone;
import wehavecookies56.kk.item.synthesis.ItemMythrilCrystal;
import wehavecookies56.kk.item.synthesis.ItemMythrilGem;
import wehavecookies56.kk.item.synthesis.ItemMythrilShard;
import wehavecookies56.kk.item.synthesis.ItemMythrilStone;
import wehavecookies56.kk.item.synthesis.ItemOrichalcum;
import wehavecookies56.kk.item.synthesis.ItemOrichalcumPlus;
import wehavecookies56.kk.item.synthesis.ItemPowerCrystal;
import wehavecookies56.kk.item.synthesis.ItemPowerGem;
import wehavecookies56.kk.item.synthesis.ItemPowerShard;
import wehavecookies56.kk.item.synthesis.ItemPowerStone;
import wehavecookies56.kk.item.synthesis.ItemRemembranceCrystal;
import wehavecookies56.kk.item.synthesis.ItemRemembranceGem;
import wehavecookies56.kk.item.synthesis.ItemRemembranceShard;
import wehavecookies56.kk.item.synthesis.ItemRemembranceStone;
import wehavecookies56.kk.item.synthesis.ItemSerenityCrystal;
import wehavecookies56.kk.item.synthesis.ItemSerenityGem;
import wehavecookies56.kk.item.synthesis.ItemSerenityShard;
import wehavecookies56.kk.item.synthesis.ItemSerenityStone;
import wehavecookies56.kk.item.synthesis.ItemShinyCrystal;
import wehavecookies56.kk.item.synthesis.ItemTranquilCrystal;
import wehavecookies56.kk.item.synthesis.ItemTranquilGem;
import wehavecookies56.kk.item.synthesis.ItemTranquilShard;
import wehavecookies56.kk.item.synthesis.ItemTranquilStone;
import wehavecookies56.kk.item.synthesis.ItemTwilightCrystal;
import wehavecookies56.kk.item.synthesis.ItemTwilightGem;
import wehavecookies56.kk.item.synthesis.ItemTwilightShard;
import wehavecookies56.kk.item.synthesis.ItemTwilightStone;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddedItems {

	public static Item Guide, Interdiction, SharpShooter, LindWorm, FrozenPride, SkySplitter, BookOfRetribution, Lunatic, Appregio, FairGame, GracefulDahlia, Foudre, Pouch, Munny1, Munny5, Munny10, Munny20, Munny50, Munny100, Munny200, Munny500, Munny800, Munny1000, Munny1200, Munny1500, Munny1800, Munny2000, Munny3000, Munny4000, Munny5000, Munny6000, BlazingShard, BlazingStone, BlazingGem, BlazingCrystal, FrostShard, FrostStone, FrostGem, FrostCrystal, LightningShard, LightningStone, LightningGem, LightningCrystal, LucidShard, LucidStone, LucidGem, LucidCrystal, PowerShard, PowerStone, PowerGem, PowerCrystal, DarkShard, DarkStone, DarkGem, DarkCrystal, DarkMatter, DenseShard, DenseStone, DenseGem, DenseCrystal, TwilightShard, TwilightStone, TwilightGem, TwilightCrystal, MythrilShard, MythrilStone, MythrilGem, MythrilCrystal, BrightShard, BrightStone, BrightGem, BrightCrystal, EnergyShard, EnergyStone, EnergyGem, EnergyCrystal, SerenityShard, SerenityStone, SerenityGem, SerenityCrystal, Orichalcum, OrichalcumPlus, RemembranceShard, RemembranceStone, RemembranceGem, RemembranceCrystal, TranquilShard, TranquilStone, TranquilGem, TranquilCrystal, MysteryGoo, ShinyCrystal, Disc1, Disc2, PureHeart, DarkHeart, Heart, KingdomHearts, OrganizationHood, OrganizationCoat, OrganizationLegs, OrganizationBoots, DarkLeather, HP, Potion, Disc3, Disc4, Disc5, Disc6, Disc7, Disc8, Disc9, WaywardWindChain, KeybladeAHelm, KeybladeAChest, KeybladeALegs, KeybladeABoots, KeybladeTHelm, KeybladeTChest, KeybladeTLegs, KeybladeTBoots, KeybladeEHelm, KeybladeEChest, KeybladeELegs, KeybladeEBoots, KeybladeVHelm, KeybladeVChest, KeybladeVLegs, KeybladeVBoots, Vulpeus, Ursus, Unicornis, K4, K5, K6, K7, K8, K9, K10, K11, K12, K13, K14, K15, K16, K17, K18, K19, K20, K21, K22, K23, K24, K25, K26, K27, K28, K29, K30, K31, K32, K33, K34, K35, K36, K37, K38, K39, K40, K41, K42, K43, K44, K45, K46, K47, K48, K49, K50, K51, K52, K53, K54, K55, K56, K57, K58, K59, K60, K61, K62, K63, K64, K65, K66, K67, K68, K69, K70, K71, K72, K73, K74, K75, K76, K77, K78, K79, K80, K81, K82, K83, K84, K85, K86, K87, K88, K89, K90, K91, K92, K93, K94, K95, K96, K97, K98, K99, K100, K101, K102, K103, K104, K105, K106, K107, K108, K109, K110, K111, K112, K113, K114, K1c, K2c, K3c, K4c, K5c, K6c, K7c, K8c, K9c, K10c, K11c, K12c, K13c, K14c, K15c, K16c, K17c, K18c, K19c, K20c, K21c, K22c, K23c, K24c, K25c, K26c, K27c, K28c, K29c, K30c, K31c, K32c, K33c, K34c, K35c, K36c, K37c, K38c, K39c, K40c, K41c, K42c, K43c, K44c, K45c, K46c, K47c, K48c, K49c, K50c, K51c, K52c, K53c, K54c, K55c, K56c, K57c, K58c, K59c, K60c, K61c, K62c, K63c, K64c, K65c, K66c, K67c, K68c, K69c, K70c, K71c, K72c, K73c, K74c, K75c, K76c, K77c, K78c, K79c, K80c, K81c, K82c, K83c, K84c, K85c, K86c, K87c, K88c, K89c, K90c, K91c, K92c, K93c, K94c, K95c, K96c, K97c, K98c, K99c, K100c, K101c, K102c, K103c, K104c, K105c, K106c, K107c, K108c, K109c, K110c, K111c, K112c, K113c, K114c, EternalFlames, K1r, K2r, K3r, K4r, K5r, K6r, K7r, K8r, K9r, K10r, K11r, K12r, K13r, K14r, K15r, K16r, K17r, K18r, K19r, K20r, K21r, K22r, K23r, K24r, K25r, K26r, K27r, K28r, K29r, K30r, K31r, K32r, K33r, K34r, K35r, K36r, K37r, K38r, K39r, K40r, K41r, K42r, K43r, K44r, K45r, K46r, K47r, K48r, K49r, K50r, K51r, K52r, K53r, K54r, K55r, K56r, K57r, K58r, K59r, K60r, K61r, K62r, K63r, K64r, K65r, K66r, K67r, K68r, K69r, K70r, K71r, K72r, K73r, K74r, K75r, K76r, K77r, K78r, K79r, K80r, K81r, K82r, K83r, K84r, K85r, K86r, K87r, K88r, K89r, K90r, K91r, K92r, K93r, K94r, K95r, K96r, K97r, K98r, K99r, K100r, K101r, K102r, K103r, K104r, K105r, K106r, K107r, K108r, K109r, K110r, K111r, K112r, K113r, K114r;
	public static ArmorMaterial OrganizationArmourMaterial, KeybladeAArmourMaterial, KeybladeTArmourMaterial, KeybladeVArmourMaterial, KeybladeEArmourMaterial;
	public static ToolMaterial SharpShooterMaterial, LindWormMaterial, FrozenPrideMaterial, SkySplitterMaterial, LunaticMaterial, AppregioMaterial, FairGameMaterial, GracefulDahliaMaterial, FoudreMaterial, InterdictionMaterial, BookOfRetributionMaterial, VulpeusMaterial, UrsusMaterial, UnicornisMaterial, K4m, K5m, K6m, K7m, K8m, K9m, K10m, K11m, K12m, K13m, K14m, K15m, K16m, K17m, K18m, K19m, K20m, K21m, K22m, K23m, K24m, K25m, K26m, K27m, K28m, K29m, K30m, K31m, K32m, K33m, K34m, K35m, K36m, K37m, K38m, K39m, K40m, K41m, K42m, K43m, K44m, K45m, K46m, K47m, K48m, K49m, K50m, K51m, K52m, K53m, K54m, K55m, K56m, K57m, K58m, K59m, K60m, K61m, K62m, K63m, K64m, K65m, K66m, K67m, K68m, K69m, K70m, K71m, K72m, K73m, K74m, K75m, K76m, K77m, K78m, K79m, K80m, K81m, K82m, K83m, K84m, K85m, K86m, K87m, K88m, K89m, K90m, K91m, K92m, K93m, K94m, K95m, K96m, K97m, K98m, K99m, K100m, K101m, K102m, K103m, K104m, K105m, K106m, K107m, K108m, K109m, K110m, K111m, K112m, K113m, K114m, EternalFlamesMaterial;

	static int chainStackSize = 1;
	
	public static void initKeyBlades(){
		VulpeusMaterial = EnumHelperClient.addToolMaterial(Strings.Vulpeus, 3, -1, 6.0F, 16, 30); Vulpeus = new ItemVulpeus(VulpeusMaterial).setFull3D().setUnlocalizedName(Strings.Vulpeus); GameRegistry.registerItem(Vulpeus, Strings.Vulpeus);
		UrsusMaterial = EnumHelperClient.addToolMaterial(Strings.Ursus, 3, -1, 6.0F, 18, 30); Ursus = new ItemUrsus(UrsusMaterial).setFull3D().setUnlocalizedName(Strings.Ursus); GameRegistry.registerItem(Ursus, Strings.Ursus);
		UnicornisMaterial = EnumHelperClient.addToolMaterial(Strings.Unicornis, 3, -1, 6.0F, 15, 30); Unicornis = new ItemUnicornis(UnicornisMaterial).setFull3D().setUnlocalizedName(Strings.Unicornis); GameRegistry.registerItem(Unicornis, Strings.Unicornis);
		K4m = EnumHelperClient.addToolMaterial(Strings.Leopardos, 3, -1, 6.0F, 17, 30); K4 = new ItemLeopardos(K4m).setFull3D().setUnlocalizedName(Strings.Leopardos); GameRegistry.registerItem(K4, Strings.Leopardos);
		K5m = EnumHelperClient.addToolMaterial(Strings.Anguis, 3, -1, 6.0F, 9, 30); K5 = new ItemAnguis(K5m).setFull3D().setUnlocalizedName(Strings.Anguis); GameRegistry.registerItem(K5, Strings.Anguis);
		K6m = EnumHelperClient.addToolMaterial(Strings.Leaskeyblade, 3, -1, 6.0F, 8, 30); K6 = new ItemLeasKeyblade(K6m).setFull3D().setUnlocalizedName(Strings.Leaskeyblade); GameRegistry.registerItem(K6, Strings.Leaskeyblade);
		K7m = EnumHelperClient.addToolMaterial(Strings.Youngxehanortskeyblade, 3, -1, 6.0F, 15, 30); K7 = new ItemYoungXehanort(K7m).setFull3D().setUnlocalizedName(Strings.Youngxehanortskeyblade); GameRegistry.registerItem(K7, Strings.Youngxehanortskeyblade);
		K8m = EnumHelperClient.addToolMaterial(Strings.Oceanrage, 3, -1, 6.0F, 8, 30); K8 = new ItemOceanRage(K8m).setFull3D().setUnlocalizedName(Strings.Oceanrage); GameRegistry.registerItem(K8, Strings.Oceanrage);
		K9m = EnumHelperClient.addToolMaterial(Strings.Endofpain, 3, -1, 6.0F, 9, 30); K9 = new ItemEndOfPain(K9m).setFull3D().setUnlocalizedName(Strings.Endofpain); GameRegistry.registerItem(K9, Strings.Endofpain);
		K10m = EnumHelperClient.addToolMaterial(Strings.Unbound, 3, -1, 6.0F, 13, 30); K10 = new ItemUnbound(K10m).setFull3D().setUnlocalizedName(Strings.Unbound); GameRegistry.registerItem(K10, Strings.Unbound);
		K11m = EnumHelperClient.addToolMaterial(Strings.Sweetdreams, 3, -1, 6.0F, 9, 30); K11 = new ItemSweetDreams(K11m).setFull3D().setUnlocalizedName(Strings.Sweetdreams); GameRegistry.registerItem(K11, Strings.Sweetdreams);
		K12m = EnumHelperClient.addToolMaterial(Strings.Divewing, 3, -1, 6.0F, 7, 30); K12 = new ItemDiveWing(K12m).setFull3D().setUnlocalizedName(Strings.Divewing); GameRegistry.registerItem(K12, Strings.Divewing);
		K13m = EnumHelperClient.addToolMaterial(Strings.Counterpoint, 3, -1, 6.0F, 7, 30); K13 = new ItemCounterPoint(K13m).setFull3D().setUnlocalizedName(Strings.Counterpoint); GameRegistry.registerItem(K13, Strings.Counterpoint);
		K14m = EnumHelperClient.addToolMaterial(Strings.Allforone, 3, -1, 6.0F, 5, 30); K14 = new ItemAllForOne(K14m).setFull3D().setUnlocalizedName(Strings.Allforone); GameRegistry.registerItem(K14, Strings.Allforone);
		K15m = EnumHelperClient.addToolMaterial(Strings.Knockoutpunch, 3, -1, 6.0F, 5, 30); K15 = new ItemKnockoutPunch(K15m).setFull3D().setUnlocalizedName(Strings.Knockoutpunch); GameRegistry.registerItem(K15, Strings.Knockoutpunch);
		K16m = EnumHelperClient.addToolMaterial(Strings.Ferrisgear, 3, -1, 6.0F, 6, 30); K16 = new ItemFerrisGear(K16m).setFull3D().setUnlocalizedName(Strings.Ferrisgear); GameRegistry.registerItem(K16, Strings.Ferrisgear);
		K17m = EnumHelperClient.addToolMaterial(Strings.Dualdisc, 3, -1, 6.0F, 7, 30); K17 = new ItemDualDisc(K17m).setFull3D().setUnlocalizedName(Strings.Dualdisc); GameRegistry.registerItem(K17, Strings.Dualdisc);
		K18m = EnumHelperClient.addToolMaterial(Strings.Guardianbell, 3, -1, 6.0F, 7, 30); K18 = new ItemGuardianBell(K18m).setFull3D().setUnlocalizedName(Strings.Guardianbell); GameRegistry.registerItem(K18, Strings.Guardianbell);
		K19m = EnumHelperClient.addToolMaterial(Strings.Skullnoise, 3, -1, 6.0F, 6, 30); K19 = new ItemSkullNoise(K19m).setFull3D().setUnlocalizedName(Strings.Skullnoise); GameRegistry.registerItem(K19, Strings.Skullnoise);
		K20m = EnumHelperClient.addToolMaterial(Strings.Woodenkeyblade, 3, -1, 6.0F, 2, 30); K20 = new ItemWoodenKeyBlade(K20m).setFull3D().setUnlocalizedName(Strings.Woodenkeyblade); GameRegistry.registerItem(K20, Strings.Woodenkeyblade);
		K21m = EnumHelperClient.addToolMaterial(Strings.Kyebladebroken, 3, -1, 6.0F, 13, 30); K21 = new ItemkyeBladeBroken(K21m).setFull3D().setUnlocalizedName(Strings.Kyebladebroken); GameRegistry.registerItem(K21, Strings.Kyebladebroken);
		K22m = EnumHelperClient.addToolMaterial(Strings.Kyeblade, 3, -1, 6.0F, 25, 30); K22 = new ItemkyeBlade(K22m).setFull3D().setUnlocalizedName(Strings.Kyeblade); GameRegistry.registerItem(K22, Strings.Kyeblade);
		K23m = EnumHelperClient.addToolMaterial(Strings.Lightseeker, 3, -1, 6.0F, 9, 30); K23 = new ItemLightSeeker(K23m).setFull3D().setUnlocalizedName(Strings.Lightseeker); GameRegistry.registerItem(K23, Strings.Lightseeker);
		K24m = EnumHelperClient.addToolMaterial(Strings.Lostmemory, 3, -1, 6.0F, 12, 30); K24 = new ItemLostMemory(K24m).setFull3D().setUnlocalizedName(Strings.Lostmemory); GameRegistry.registerItem(K24, Strings.Lostmemory);
		K25m = EnumHelperClient.addToolMaterial(Strings.Frolicflame, 3, -1, 6.0F, 6, 30); K25 = new ItemFrolicFlame(K25m).setFull3D().setUnlocalizedName(Strings.Frolicflame); GameRegistry.registerItem(K25, Strings.Frolicflame);
		K26m = EnumHelperClient.addToolMaterial(Strings.Masterkeeper, 3, -1, 6.0F, 13, 30); K26 = new ItemMasterKeeper(K26m).setFull3D().setUnlocalizedName(Strings.Masterkeeper); GameRegistry.registerItem(K26, Strings.Masterkeeper);
		K27m = EnumHelperClient.addToolMaterial(Strings.Brigthcrest, 3, -1, 6.0F, 7, 30); K27 = new ItemBrightCrest(K27m).setFull3D().setUnlocalizedName(Strings.Brigthcrest); GameRegistry.registerItem(K27, Strings.Brigthcrest);
		K28m = EnumHelperClient.addToolMaterial(Strings.Crownunlimit, 3, -1, 6.0F, 10, 30); K28 = new ItemCrownUnLimit(K28m).setFull3D().setUnlocalizedName(Strings.Crownunlimit); GameRegistry.registerItem(K28, Strings.Crownunlimit);
		K29m = EnumHelperClient.addToolMaterial(Strings.Noname, 3, -1, 6.0F, 12, 30); K29 = new ItemNoName(K29m).setFull3D().setUnlocalizedName(Strings.Noname); GameRegistry.registerItem(K29, Strings.Noname);
		K30m = EnumHelperClient.addToolMaterial(Strings.Voidgear, 3, -1, 6.0F, 11, 30); K30 = new ItemVoidGear(K30m).setFull3D().setUnlocalizedName(Strings.Voidgear); GameRegistry.registerItem(K30, Strings.Voidgear);
		K31m = EnumHelperClient.addToolMaterial(Strings.Sweetstack, 3, -1, 6.0F, 8, 30); K31 = new ItemSweetStack(K31m).setFull3D().setUnlocalizedName(Strings.Sweetstack); GameRegistry.registerItem(K31, Strings.Sweetstack);
		K32m = EnumHelperClient.addToolMaterial(Strings.Pixiepetal, 3, -1, 6.0F, 6, 30); K32 = new ItemPixiePetal(K32m).setFull3D().setUnlocalizedName(Strings.Pixiepetal); GameRegistry.registerItem(K32, Strings.Pixiepetal);
		K33m = EnumHelperClient.addToolMaterial(Strings.Hyperdrive, 3, -1, 6.0F, 8, 30); K33 = new ItemHyperDrive(K33m).setFull3D().setUnlocalizedName(Strings.Hyperdrive); GameRegistry.registerItem(K33, Strings.Hyperdrive);
		K34m = EnumHelperClient.addToolMaterial(Strings.Markofahero, 3, -1, 6.0F, 7, 30); K34 = new ItemMarkOfAHero(K34m).setFull3D().setUnlocalizedName(Strings.Markofahero); GameRegistry.registerItem(K34, Strings.Markofahero);
		K35m = EnumHelperClient.addToolMaterial(Strings.Victoryline, 3, -1, 6.0F, 7, 30); K35 = new ItemVictoryLine(K35m).setFull3D().setUnlocalizedName(Strings.Victoryline); GameRegistry.registerItem(K35, Strings.Victoryline);
		K36m = EnumHelperClient.addToolMaterial(Strings.Fairystars, 3, -1, 6.0F, 6, 30); K36 = new ItemFairyStars(K36m).setFull3D().setUnlocalizedName(Strings.Fairystars); GameRegistry.registerItem(K36, Strings.Fairystars);
		K37m = EnumHelperClient.addToolMaterial(Strings.Strokeofmidnight, 3, -1, 6.0F, 6, 30); K37 = new ItemStrokeOfMidnight(K37m).setFull3D().setUnlocalizedName(Strings.Strokeofmidnight); GameRegistry.registerItem(K37, Strings.Strokeofmidnight);
		K38m = EnumHelperClient.addToolMaterial(Strings.Chaosripper, 3, -1, 6.0F, 7, 30); K38 = new ItemChaosRipper(K38m).setFull3D().setUnlocalizedName(Strings.Chaosripper); GameRegistry.registerItem(K38, Strings.Chaosripper);
		K39m = EnumHelperClient.addToolMaterial(Strings.Xehanortskeyblade, 3, -1, 6.0F, 18, 30); K39 = new ItemXehanortsKeyblade(K39m).setFull3D().setUnlocalizedName(Strings.Xehanortskeyblade); GameRegistry.registerItem(K39, Strings.Xehanortskeyblade);
		K40m = EnumHelperClient.addToolMaterial(Strings.Darkgnaw, 3, -1, 6.0F, 10, 30); K40 = new ItemDarkGnaw(K40m).setFull3D().setUnlocalizedName(Strings.Darkgnaw); GameRegistry.registerItem(K40, Strings.Darkgnaw);
		K41m = EnumHelperClient.addToolMaterial(Strings.Zeroone, 3, -1, 6.0F, 12, 30); K41 = new ItemZeroOne(K41m).setFull3D().setUnlocalizedName(Strings.Zeroone); GameRegistry.registerItem(K41, Strings.Zeroone);
		K42m = EnumHelperClient.addToolMaterial(Strings.Dreamsword, 3, -1, 6.0F, 5, 30); K42 = new ItemDreamSword(K42m).setFull3D().setUnlocalizedName(Strings.Dreamsword); GameRegistry.registerItem(K42, Strings.Dreamsword);
		K43m = EnumHelperClient.addToolMaterial(Strings.Aubade, 3, -1, 6.0F, 9, 30); K43 = new ItemAubade(K43m).setFull3D().setUnlocalizedName(Strings.Aubade); GameRegistry.registerItem(K43, Strings.Aubade);
		K44m = EnumHelperClient.addToolMaterial(Strings.Umbrella, 3, -1, 6.0F, 4, 30); K44 = new ItemUmbrella(K44m).setFull3D().setUnlocalizedName(Strings.Umbrella); GameRegistry.registerItem(K44, Strings.Umbrella);
		K45m = EnumHelperClient.addToolMaterial(Strings.Omegaweapon, 3, -1, 6.0F, 13, 30); K45 = new ItemOmegaWeapon(K45m).setFull3D().setUnlocalizedName(Strings.Omegaweapon); GameRegistry.registerItem(K45, Strings.Omegaweapon);
		K46m = EnumHelperClient.addToolMaterial(Strings.Twilightblaze, 3, -1, 6.0F, 11, 30); K46 = new ItemTwilightBlaze(K46m).setFull3D().setUnlocalizedName(Strings.Twilightblaze); GameRegistry.registerItem(K46, Strings.Twilightblaze);
		K47m = EnumHelperClient.addToolMaterial(Strings.Maverickflare, 3, -1, 6.0F, 9, 30); K47 = new ItemMaverickFlare(K47m).setFull3D().setUnlocalizedName(Strings.Maverickflare); GameRegistry.registerItem(K47, Strings.Maverickflare);
		K48m = EnumHelperClient.addToolMaterial(Strings.Astralblast, 3, -1, 6.0F, 9, 30); K48 = new ItemAstralBlast(K48m).setFull3D().setUnlocalizedName(Strings.Astralblast); GameRegistry.registerItem(K48, Strings.Astralblast);
		K49m = EnumHelperClient.addToolMaterial(Strings.Darkerthandark, 3, -1, 6.0F, 8, 30); K49 = new ItemDarkerThanDark(K49m).setFull3D().setUnlocalizedName(Strings.Darkerthandark); GameRegistry.registerItem(K49, Strings.Darkerthandark);
		K50m = EnumHelperClient.addToolMaterial(Strings.Lunareclipse, 3, -1, 6.0F, 6, 30); K50 = new ItemLunarEclipse(K50m).setFull3D().setUnlocalizedName(Strings.Lunareclipse); GameRegistry.registerItem(K50, Strings.Lunareclipse);
		K51m = EnumHelperClient.addToolMaterial(Strings.Silentdirge, 3, -1, 6.0F, 7, 30); K51 = new ItemSilentDirge(K51m).setFull3D().setUnlocalizedName(Strings.Silentdirge); GameRegistry.registerItem(K51, Strings.Silentdirge);
		K52m = EnumHelperClient.addToolMaterial(Strings.Totaleclipse, 3, -1, 6.0F, 9, 30); K52 = new ItemTotalEclipse(K52m).setFull3D().setUnlocalizedName(Strings.Totaleclipse); GameRegistry.registerItem(K52, Strings.Totaleclipse);
		K53m = EnumHelperClient.addToolMaterial(Strings.Glimpseofdarkness, 3, -1, 6.0F, 6, 30); K53 = new ItemGlimpseOfDarkness(K53m).setFull3D().setUnlocalizedName(Strings.Glimpseofdarkness); GameRegistry.registerItem(K53, Strings.Glimpseofdarkness);
		K54m = EnumHelperClient.addToolMaterial(Strings.Midnightroar, 3, -1, 6.0F, 6, 30); K54 = new ItemMidnightRoar(K54m).setFull3D().setUnlocalizedName(Strings.Midnightroar); GameRegistry.registerItem(K54, Strings.Midnightroar);
		K55m = EnumHelperClient.addToolMaterial(Strings.Rejectionoffate, 3, -1, 6.0F, 8, 30); K55 = new ItemRejectionOfFate(K55m).setFull3D().setUnlocalizedName(Strings.Rejectionoffate); GameRegistry.registerItem(K55, Strings.Rejectionoffate);
		K56m = EnumHelperClient.addToolMaterial(Strings.Truelightsflight, 3, -1, 6.0F, 8, 30); K56 = new ItemTrueLightsFlight(K56m).setFull3D().setUnlocalizedName(Strings.Truelightsflight); GameRegistry.registerItem(K56, Strings.Truelightsflight);
		K57m = EnumHelperClient.addToolMaterial(Strings.Leviathan, 3, -1, 6.0F, 9, 30); K57 = new ItemLeviathan(K57m).setFull3D().setUnlocalizedName(Strings.Leviathan); GameRegistry.registerItem(K57, Strings.Leviathan);
		K58m = EnumHelperClient.addToolMaterial(Strings.Abyssaltide, 3, -1, 6.0F, 7, 30); K58 = new ItemAbyssalTide(K58m).setFull3D().setUnlocalizedName(Strings.Abyssaltide); GameRegistry.registerItem(K58, Strings.Abyssaltide);
		K59m = EnumHelperClient.addToolMaterial(Strings.Crownofguilt, 3, -1, 6.0F, 9, 30); K59 = new ItemCrownOfGuilt(K59m).setFull3D().setUnlocalizedName(Strings.Crownofguilt); GameRegistry.registerItem(K59, Strings.Crownofguilt);
		K60m = EnumHelperClient.addToolMaterial(Strings.Signofinnocence, 3, -1, 6.0F, 6, 30); K60 = new ItemSignOfInnocence(K60m).setFull3D().setUnlocalizedName(Strings.Signofinnocence); GameRegistry.registerItem(K60, Strings.Signofinnocence);
		K61m = EnumHelperClient.addToolMaterial(Strings.Painofsolitude, 3, -1, 6.0F, 5, 30); K61 = new ItemPainOfSolitude(K61m).setFull3D().setUnlocalizedName(Strings.Painofsolitude); GameRegistry.registerItem(K61, Strings.Painofsolitude);
		K62m = EnumHelperClient.addToolMaterial(Strings.Abbadonplasma, 3, -1, 6.0F, 7, 30); K62 = new ItemAbaddonplasma(K62m).setFull3D().setUnlocalizedName(Strings.Abbadonplasma); GameRegistry.registerItem(K62, Strings.Abbadonplasma);
		K63m = EnumHelperClient.addToolMaterial(Strings.Ominousblight, 3, -1, 6.0F, 10, 30); K63 = new ItemOminousBlight(K63m).setFull3D().setUnlocalizedName(Strings.Ominousblight); GameRegistry.registerItem(K63, Strings.Ominousblight);
		K64m = EnumHelperClient.addToolMaterial(Strings.Missingache, 3, -1, 6.0F, 8, 30); K64 = new ItemMissingAche(K64m).setFull3D().setUnlocalizedName(Strings.Missingache); GameRegistry.registerItem(K64, Strings.Missingache);
		K65m = EnumHelperClient.addToolMaterial(Strings.Winnersproof, 3, -1, 6.0F, 12, 30); K65 = new ItemWinnersProof(K65m).setFull3D().setUnlocalizedName(Strings.Winnersproof); GameRegistry.registerItem(K65, Strings.Winnersproof);
		K66m = EnumHelperClient.addToolMaterial(Strings.Fatalcrest, 3, -1, 6.0F, 17, 30); K66 = new ItemFatalCrest(K66m).setFull3D().setUnlocalizedName(Strings.Fatalcrest); GameRegistry.registerItem(K66, Strings.Fatalcrest);
		K67m = EnumHelperClient.addToolMaterial(Strings.Twobecomesone, 3, -1, 6.0F, 20, 30); K67 = new ItemTwoBecomeOne(K67m).setFull3D().setUnlocalizedName(Strings.Twobecomesone); GameRegistry.registerItem(K67, Strings.Twobecomesone);
		K68m = EnumHelperClient.addToolMaterial(Strings.Bondofflame, 3, -1, 6.0F, 14, 30); K68 = new ItemBondOfFlame(K68m).setFull3D().setUnlocalizedName(Strings.Bondofflame); GameRegistry.registerItem(K68, Strings.Bondofflame);
		K69m = EnumHelperClient.addToolMaterial(Strings.Fenrir, 3, -1, 6.0F, 24, 30); K69 = new ItemFenrir(K69m).setFull3D().setUnlocalizedName(Strings.Fenrir); GameRegistry.registerItem(K69, Strings.Fenrir);
		K70m = EnumHelperClient.addToolMaterial(Strings.Sleepinglion, 3, -1, 6.0F, 13, 30); K70 = new ItemSleepingLion(K70m).setFull3D().setUnlocalizedName(Strings.Sleepinglion); GameRegistry.registerItem(K70, Strings.Sleepinglion);
		K71m = EnumHelperClient.addToolMaterial(Strings.Guardiansoul, 3, -1, 6.0F, 8, 30); K71 = new ItemGuardianSoul(K71m).setFull3D().setUnlocalizedName(Strings.Guardiansoul); GameRegistry.registerItem(K71, Strings.Guardiansoul);
		K72m = EnumHelperClient.addToolMaterial(Strings.Gullwing, 3, -1, 6.0F, 5, 30); K72 = new ItemGullWing(K72m).setFull3D().setUnlocalizedName(Strings.Gullwing); GameRegistry.registerItem(K72, Strings.Gullwing);
		K73m = EnumHelperClient.addToolMaterial(Strings.Photondebugger, 3, -1, 6.0F, 6, 30); K73 = new ItemPhotonDebugger(K73m).setFull3D().setUnlocalizedName(Strings.Photondebugger); GameRegistry.registerItem(K73, Strings.Photondebugger);
		K74m = EnumHelperClient.addToolMaterial(Strings.Sweetmemories, 3, -1, 6.0F, 7, 30); K74 = new ItemSweetMemories(K74m).setFull3D().setUnlocalizedName(Strings.Sweetmemories); GameRegistry.registerItem(K74, Strings.Sweetmemories);
		K75m = EnumHelperClient.addToolMaterial(Strings.Circleoflife, 3, -1, 6.0F, 9, 30); K75 = new ItemCircleOfLife(K75m).setFull3D().setUnlocalizedName(Strings.Circleoflife); GameRegistry.registerItem(K75, Strings.Circleoflife);
		K76m = EnumHelperClient.addToolMaterial(Strings.Decisivepumpkin, 3, -1, 6.0F, 21, 30); K76 = new ItemDecisivePumpkin(K76m).setFull3D().setUnlocalizedName(Strings.Decisivepumpkin); GameRegistry.registerItem(K76, Strings.Decisivepumpkin);
		K77m = EnumHelperClient.addToolMaterial(Strings.Wishinglamp, 3, -1, 6.0F, 7, 30); K77 = new ItemWishingLamp(K77m).setFull3D().setUnlocalizedName(Strings.Wishinglamp); GameRegistry.registerItem(K77, Strings.Wishinglamp);
		K78m = EnumHelperClient.addToolMaterial(Strings.Followthewind, 3, -1, 6.0F, 8, 30); K78 = new ItemFollowTheWind(K78m).setFull3D().setUnlocalizedName(Strings.Followthewind); GameRegistry.registerItem(K78, Strings.Followthewind);
		K79m = EnumHelperClient.addToolMaterial(Strings.Mysteriousabyss, 3, -1, 6.0F, 6, 30); K79 = new ItemMysteriousAbyss(K79m).setFull3D().setUnlocalizedName(Strings.Mysteriousabyss); GameRegistry.registerItem(K79, Strings.Mysteriousabyss);
		K80m = EnumHelperClient.addToolMaterial(Strings.Monochrome, 3, -1, 6.0F, 6, 30); K80 = new ItemMonochrome(K80m).setFull3D().setUnlocalizedName(Strings.Monochrome); GameRegistry.registerItem(K80, Strings.Monochrome);
		K81m = EnumHelperClient.addToolMaterial(Strings.Heroscrest, 3, -1, 6.0F, 6, 30); K81 = new ItemHerosCrest(K81m).setFull3D().setUnlocalizedName(Strings.Heroscrest); GameRegistry.registerItem(K81, Strings.Heroscrest);
		K82m = EnumHelperClient.addToolMaterial(Strings.Rumblingrose, 3, -1, 6.0F, 11, 30); K82 = new ItemRumblingRose(K82m).setFull3D().setUnlocalizedName(Strings.Rumblingrose); GameRegistry.registerItem(K82, Strings.Rumblingrose);
		K83m = EnumHelperClient.addToolMaterial(Strings.Hiddendragon, 3, -1, 6.0F, 7, 30); K83 = new ItemHiddenDragon(K83m).setFull3D().setUnlocalizedName(Strings.Hiddendragon); GameRegistry.registerItem(K83, Strings.Hiddendragon);
		K84m = EnumHelperClient.addToolMaterial(Strings.Endsofearth, 3, -1, 6.0F, 9, 30); K84 = new ItemEndsOfEarth(K84m).setFull3D().setUnlocalizedName(Strings.Endsofearth); GameRegistry.registerItem(K84, Strings.Endsofearth);
		K85m = EnumHelperClient.addToolMaterial(Strings.Stormfall, 3, -1, 6.0F, 8, 30); K85 = new ItemStormFall(K85m).setFull3D().setUnlocalizedName(Strings.Stormfall); GameRegistry.registerItem(K85, Strings.Stormfall);
		K86m = EnumHelperClient.addToolMaterial(Strings.Destinysembrace, 3, -1, 6.0F, 7, 30); K86 = new ItemDestinysEmbrace(K86m).setFull3D().setUnlocalizedName(Strings.Destinysembrace); GameRegistry.registerItem(K86, Strings.Destinysembrace);
		K87m = EnumHelperClient.addToolMaterial(Strings.Waytodawn, 3, -1, 6.0F, 9, 30); K87 = new ItemWayToDawn(K87m).setFull3D().setUnlocalizedName(Strings.Waytodawn); GameRegistry.registerItem(K87, Strings.Waytodawn);
		K88m = EnumHelperClient.addToolMaterial(Strings.Onewingedangel, 3, -1, 6.0F, 15, 30); K88 = new ItemOneWingedAngel(K88m).setFull3D().setUnlocalizedName(Strings.Onewingedangel); GameRegistry.registerItem(K88, Strings.Onewingedangel);
		K89m = EnumHelperClient.addToolMaterial(Strings.Diamonddust, 3, -1, 6.0F, 10, 30); K89 = new ItemDiamondDust(K89m).setFull3D().setUnlocalizedName(Strings.Diamonddust); GameRegistry.registerItem(K89, Strings.Diamonddust);
		K90m = EnumHelperClient.addToolMaterial(Strings.Lionheart, 3, -1, 6.0F, 7, 30); K90 = new ItemLionHeart(K90m).setFull3D().setUnlocalizedName(Strings.Lionheart); GameRegistry.registerItem(K90, Strings.Lionheart);
		K91m = EnumHelperClient.addToolMaterial(Strings.Metalchocobo, 3, -1, 6.0F, 7, 30); K91 = new ItemMetalChocobo(K91m).setFull3D().setUnlocalizedName(Strings.Metalchocobo); GameRegistry.registerItem(K91, Strings.Metalchocobo);
		K92m = EnumHelperClient.addToolMaterial(Strings.Spellbinder, 3, -1, 6.0F, 6, 30); K92 = new ItemSpellbinder(K92m).setFull3D().setUnlocalizedName(Strings.Spellbinder); GameRegistry.registerItem(K92, Strings.Spellbinder);
		K93m = EnumHelperClient.addToolMaterial(Strings.Divinerose, 3, -1, 6.0F, 6, 30); K93 = new ItemDivineRose(K93m).setFull3D().setUnlocalizedName(Strings.Divinerose); GameRegistry.registerItem(K93, Strings.Divinerose);
		K94m = EnumHelperClient.addToolMaterial(Strings.Fairyharp, 3, -1, 6.0F, 7, 30); K94 = new ItemFairyHarp(K94m).setFull3D().setUnlocalizedName(Strings.Fairyharp); GameRegistry.registerItem(K94, Strings.Fairyharp);
		K95m = EnumHelperClient.addToolMaterial(Strings.Crabclaw, 3, -1, 6.0F, 5, 30); K95 = new ItemCrabClaw(K95m).setFull3D().setUnlocalizedName(Strings.Crabclaw); GameRegistry.registerItem(K95, Strings.Crabclaw);
		K96m = EnumHelperClient.addToolMaterial(Strings.Wishingstar, 3, -1, 6.0F, 9, 30); K96 = new ItemWishingStar(K96m).setFull3D().setUnlocalizedName(Strings.Wishingstar); GameRegistry.registerItem(K96, Strings.Wishingstar);
		K97m = EnumHelperClient.addToolMaterial(Strings.Pumpkinhead, 3, -1, 6.0F, 10, 30); K97 = new ItemPumpkinHead(K97m).setFull3D().setUnlocalizedName(Strings.Pumpkinhead); GameRegistry.registerItem(K97, Strings.Pumpkinhead);
		K98m = EnumHelperClient.addToolMaterial(Strings.Threewishes, 3, -1, 6.0F, 8, 30); K98 = new ItemThreeWishes(K98m).setFull3D().setUnlocalizedName(Strings.Threewishes); GameRegistry.registerItem(K98, Strings.Threewishes);
		K99m = EnumHelperClient.addToolMaterial(Strings.Jungleking, 3, -1, 6.0F, 7, 30); K99 = new ItemJungleKing(K99m).setFull3D().setUnlocalizedName(Strings.Jungleking); GameRegistry.registerItem(K99, Strings.Jungleking);
		K100m = EnumHelperClient.addToolMaterial(Strings.Olympia, 3, -1, 6.0F, 9, 30); K100 = new ItemOlympia(K100m).setFull3D().setUnlocalizedName(Strings.Olympia); GameRegistry.registerItem(K100, Strings.Olympia);
		K101m = EnumHelperClient.addToolMaterial(Strings.Ladyluck, 3, -1, 6.0F, 6, 30); K101 = new ItemLadyLuck(K101m).setFull3D().setUnlocalizedName(Strings.Ladyluck); GameRegistry.registerItem(K101, Strings.Ladyluck);
		K102m = EnumHelperClient.addToolMaterial(Strings.Peopleshearts, 3, -1, 6.0F, 13, 30); K102 = new ItemKeybladeOfPeoplesHearts(K102m).setFull3D().setUnlocalizedName(Strings.Peopleshearts); GameRegistry.registerItem(K102, Strings.Peopleshearts);
		K103m = EnumHelperClient.addToolMaterial(Strings.Ultimaweapon, 3, -1, 6.0F, 18, 30); K103 = new ItemUltimaWeapon(K103m).setFull3D().setUnlocalizedName(Strings.Ultimaweapon); GameRegistry.registerItem(K103, Strings.Ultimaweapon);
		K104m = EnumHelperClient.addToolMaterial(Strings.Treasuretrove, 3, -1, 6.0F, 7, 30); K104 = new ItemTreasureTrove(K104m).setFull3D().setUnlocalizedName(Strings.Treasuretrove); GameRegistry.registerItem(K104, Strings.Treasuretrove);
		K105m = EnumHelperClient.addToolMaterial(Strings.Starseeker, 3, -1, 6.0F, 12, 30); K105 = new ItemStarseeker(K105m).setFull3D().setUnlocalizedName(Strings.Starseeker); GameRegistry.registerItem(K105, Strings.Starseeker);
		K111m = EnumHelperClient.addToolMaterial(Strings.KingdomKey, 3, -1, 6.0F, 5, 30); K111 = new ItemKingdomKey(K111m).setFull3D().setUnlocalizedName(Strings.KingdomKey); GameRegistry.registerItem(K111, Strings.KingdomKey);
		K113m = EnumHelperClient.addToolMaterial(Strings.KingdomKeyD, 3, -1, 6.0F, 5, 30); K113 = new ItemKingdomKeyD(K113m).setFull3D().setUnlocalizedName(Strings.KingdomKeyD); GameRegistry.registerItem(K113, Strings.KingdomKeyD);
		K112m = EnumHelperClient.addToolMaterial(Strings.Oathkeeper, 3, -1, 6.0F, 11, 30); K112 = new ItemOathKeeper(K112m).setFull3D().setUnlocalizedName(Strings.Oathkeeper); GameRegistry.registerItem(K112, Strings.Oathkeeper);
		K114m = EnumHelperClient.addToolMaterial(Strings.Oblivion, 3, -1, 6.0F, 13, 30); K114 = new ItemOblivion(K114m).setFull3D().setUnlocalizedName(Strings.Oblivion); GameRegistry.registerItem(K114, Strings.Oblivion);
		K110m = EnumHelperClient.addToolMaterial(Strings.Waywardwind, 3, -1, 6.0F, 8, 30); K110 = new ItemWaywardWind(K110m).setFull3D().setUnlocalizedName(Strings.Waywardwind); GameRegistry.registerItem(K110, Strings.Waywardwind);
		K109m = EnumHelperClient.addToolMaterial(Strings.Earthshaker, 3, -1, 6.0F, 10, 30); K109 = new ItemEarthShaker(K109m).setFull3D().setUnlocalizedName(Strings.Earthshaker); GameRegistry.registerItem(K109, Strings.Earthshaker);
		K108m = EnumHelperClient.addToolMaterial(Strings.Rainfell, 3, -1, 6.0F, 6, 30); K108 = new ItemRainFell(K108m).setFull3D().setUnlocalizedName(Strings.Rainfell); GameRegistry.registerItem(K108, Strings.Rainfell);
		K107m = EnumHelperClient.addToolMaterial(Strings.Starlight, 3, -1, 6.0F, 6, 30); K107 = new ItemStarLight(K107m).setFull3D().setUnlocalizedName(Strings.Starlight); GameRegistry.registerItem(K107, Strings.Starlight);
		K106m = EnumHelperClient.addToolMaterial(Strings.Souleater, 3, -1, 6.0F, 12, 30); K106 = new ItemSoulEater(K106m).setFull3D().setUnlocalizedName(Strings.Souleater); GameRegistry.registerItem(K106, Strings.Souleater);
		K1c = new ItemVulpeusChain().setUnlocalizedName(Strings.VulpeusChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K1c, Strings.VulpeusChain);
		K2c = new ItemUrsusChain().setUnlocalizedName(Strings.UrsusChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K2c, Strings.UrsusChain);
		K3c = new ItemUnicornisChain().setUnlocalizedName(Strings.UnicornisChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K3c, Strings.UnicornisChain);
		K4c = new ItemLeopardosChain().setUnlocalizedName(Strings.LeopardosChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K4c, Strings.LeopardosChain);
		K5c = new ItemAnguisChain().setUnlocalizedName(Strings.AnguisChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K5c, Strings.AnguisChain);
		K6c = new ItemLeasKeybladeChain().setUnlocalizedName(Strings.LeaskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K6c, Strings.LeaskeybladeChain);
		K7c = new ItemYoungXehanortChain().setUnlocalizedName(Strings.YoungxehanortskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K7c, Strings.YoungxehanortskeybladeChain);
		K8c = new ItemOceanRageChain().setUnlocalizedName(Strings.OceanrageChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K8c, Strings.OceanrageChain);
		K9c = new ItemEndOfPainChain().setUnlocalizedName(Strings.EndofpainChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K9c, Strings.EndofpainChain);
		K10c = new ItemUnboundChain().setUnlocalizedName(Strings.UnboundChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K10c, Strings.UnboundChain);
		K11c = new ItemSweetDreamsChain().setUnlocalizedName(Strings.SweetdreamsChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K11c, Strings.SweetdreamsChain);
		K12c = new ItemDiveWingChain().setUnlocalizedName(Strings.DivewingChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K12c, Strings.DivewingChain);
		K13c = new ItemCounterPointChain().setUnlocalizedName(Strings.CounterpointChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K13c, Strings.CounterpointChain);
		K14c = new ItemAllForOneChain().setUnlocalizedName(Strings.AllforoneChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K14c, Strings.AllforoneChain);
		K15c = new ItemKnockoutPunchChain().setUnlocalizedName(Strings.KnockoutpunchChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K15c, Strings.KnockoutpunchChain);
		K16c = new ItemFerrisGearChain().setUnlocalizedName(Strings.FerrisgearChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K16c, Strings.FerrisgearChain);
		K17c = new ItemDualDiscChain().setUnlocalizedName(Strings.DualdiscChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K17c, Strings.DualdiscChain);
		K18c = new ItemGuardianBellChain().setUnlocalizedName(Strings.GuardianbellChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K18c, Strings.GuardianbellChain);
		K19c = new ItemSkullNoiseChain().setUnlocalizedName(Strings.SkullnoiseChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K19c, Strings.SkullnoiseChain);
		K20c = new ItemWoodenKeybladeChain().setUnlocalizedName(Strings.WoodenkeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K20c, Strings.WoodenkeybladeChain);
		K21c = new ItemKyeBladeBrokenChain().setUnlocalizedName(Strings.KyebladebrokenChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K21c, Strings.KyebladebrokenChain);
		K22c = new ItemKyeBladeChain().setUnlocalizedName(Strings.KyebladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K22c, Strings.KyebladeChain);
		K23c = new ItemLightSeekerChain().setUnlocalizedName(Strings.LightseekerChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K23c, Strings.LightseekerChain);
		K24c = new ItemLostMemoryChain().setUnlocalizedName(Strings.LostmemoryChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K24c, Strings.LostmemoryChain);
		K25c = new ItemFrolicFlameChain().setUnlocalizedName(Strings.FrolicflameChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K25c, Strings.FrolicflameChain);
		K26c = new ItemMasterKeeperChain().setUnlocalizedName(Strings.MasterkeeperChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K26c, Strings.MasterkeeperChain);
		K27c = new ItemBrightCrestChain().setUnlocalizedName(Strings.BrigthcrestChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K27c, Strings.BrigthcrestChain);
		K28c = new ItemCrownUnlimitChain().setUnlocalizedName(Strings.CrownunlimitChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K28c, Strings.CrownunlimitChain);
		K29c = new ItemNoNameChain().setUnlocalizedName(Strings.NonameChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K29c, Strings.NonameChain);
		K30c = new ItemVoidGearChain().setUnlocalizedName(Strings.VoidgearChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K30c, Strings.VoidgearChain);
		K31c = new ItemSweetStackChain().setUnlocalizedName(Strings.SweetstackChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K31c, Strings.SweetstackChain);
		K32c = new ItemPixiePetalChain().setUnlocalizedName(Strings.PixiepetalChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K32c, Strings.PixiepetalChain);
		K33c = new ItemHyperDriveChain().setUnlocalizedName(Strings.HyperdriveChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K33c, Strings.HyperdriveChain);
		K34c = new ItemMarkOfAHeroChain().setUnlocalizedName(Strings.MarkofaheroChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K34c, Strings.MarkofaheroChain);
		K35c = new ItemVictoryLineChain().setUnlocalizedName(Strings.VictorylineChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K35c, Strings.VictorylineChain);
		K36c = new ItemFairyStarsChain().setUnlocalizedName(Strings.FairystarsChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K36c, Strings.FairystarsChain);
		K37c = new ItemStrokeOfMidnightChain().setUnlocalizedName(Strings.StrokeofmidnightChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K37c, Strings.StrokeofmidnightChain);
		K38c = new ItemChaosRipperChain().setUnlocalizedName(Strings.ChaosripperChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K38c, Strings.ChaosripperChain);
		K39c = new ItemXehanortsKeybladeChain().setUnlocalizedName(Strings.XehanortskeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K39c, Strings.XehanortskeybladeChain);
		K40c = new ItemDarkGnawChain().setUnlocalizedName(Strings.DarkgnawChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K40c, Strings.DarkgnawChain);
		K41c = new ItemZeroOneChain().setUnlocalizedName(Strings.ZerooneChain).setCreativeTab(KingdomKeys.KHRECODEDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K41c, Strings.ZerooneChain);
		K42c = new ItemDreamSwordChain().setUnlocalizedName(Strings.DreamswordChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K42c, Strings.DreamswordChain);
		K43c = new ItemAubadeChain().setUnlocalizedName(Strings.AubadeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K43c, Strings.AubadeChain);
		K44c = new ItemUmbrellaChain().setUnlocalizedName(Strings.UmbrellaChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K44c, Strings.UmbrellaChain);
		K45c = new ItemOmegaWeaponChain().setUnlocalizedName(Strings.OmegaweaponChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K45c, Strings.OmegaweaponChain);
		K46c = new ItemTwilightBlazeChain().setUnlocalizedName(Strings.TwilightblazeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K46c, Strings.TwilightblazeChain);
		K47c = new ItemMaverickFlareChain().setUnlocalizedName(Strings.MaverickflareChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K47c, Strings.MaverickflareChain);
		K48c = new ItemAstralBlastChain().setUnlocalizedName(Strings.AstralblastChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K48c, Strings.AstralblastChain);
		K49c = new ItemDarkerThanDarkChain().setUnlocalizedName(Strings.DarkerthandarkChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K49c, Strings.DarkerthandarkChain);
		K50c = new ItemLunarEclipseChain().setUnlocalizedName(Strings.LunareclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K50c, Strings.LunareclipseChain);
		K51c = new ItemSilentDirgeChain().setUnlocalizedName(Strings.SilentdirgeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K51c, Strings.SilentdirgeChain);
		K52c = new ItemTotalEclipseChain().setUnlocalizedName(Strings.TotaleclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K52c, Strings.TotaleclipseChain);
		K53c = new ItemGlimpseOfDarknessChain().setUnlocalizedName(Strings.GlimpseofdarknessChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K53c, Strings.GlimpseofdarknessChain);
		K54c = new ItemMidnightRoarChain().setUnlocalizedName(Strings.MidnightroarChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K54c, Strings.MidnightroarChain);
		K55c = new ItemRejectionOfFateChain().setUnlocalizedName(Strings.RejectionoffateChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K55c, Strings.RejectionoffateChain);
		K56c = new ItemTrueLightsFlightChain().setUnlocalizedName(Strings.TruelightsflightChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K56c, Strings.TruelightsflightChain);
		K57c = new ItemLeviathanChain().setUnlocalizedName(Strings.LeviathanChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K57c, Strings.LeviathanChain);
		K58c = new ItemAbyssalTideChain().setUnlocalizedName(Strings.AbyssaltideChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K58c, Strings.AbyssaltideChain);
		K59c = new ItemCrownOfGuiltChain().setUnlocalizedName(Strings.CrownofguiltChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K59c, Strings.CrownofguiltChain);
		K60c = new ItemSignOfInnocenceChain().setUnlocalizedName(Strings.SignofinnocenceChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K60c, Strings.SignofinnocenceChain);
		K61c = new ItemPainOfSolitudeChain().setUnlocalizedName(Strings.PainofsolitudeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K61c, Strings.PainofsolitudeChain);
		K62c = new ItemAbaddonPlasmaChain().setUnlocalizedName(Strings.AbbadonplasmaChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K62c, Strings.AbbadonplasmaChain);
		K63c = new ItemOminousBlightChain().setUnlocalizedName(Strings.OminousblightChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K63c, Strings.OminousblightChain);
		K64c = new ItemMissingAcheChain().setUnlocalizedName(Strings.MissingacheChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K64c, Strings.MissingacheChain);
		K65c = new ItemWinnersProofChain().setUnlocalizedName(Strings.WinnersproofChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K65c, Strings.WinnersproofChain);
		K66c = new ItemFatalCrestChain().setUnlocalizedName(Strings.FatalcrestChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K66c, Strings.FatalcrestChain);
		K67c = new ItemTwoBecomeOneChain().setUnlocalizedName(Strings.TwobecomesoneChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K67c, Strings.TwobecomesoneChain);
		K68c = new ItemBondOfFlameChain().setUnlocalizedName(Strings.BondofflameChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K68c, Strings.BondofflameChain);
		K69c = new ItemFenrirChain().setUnlocalizedName(Strings.FenrirChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K69c, Strings.FenrirChain);
		K70c = new ItemSleepingLionChain().setUnlocalizedName(Strings.SleepinglionChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K70c, Strings.SleepinglionChain);
		K71c = new ItemGuardianSoulChain().setUnlocalizedName(Strings.GuardiansoulChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K71c, Strings.GuardiansoulChain);
		K72c = new ItemGullWingChain().setUnlocalizedName(Strings.GullwingChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K72c, Strings.GullwingChain);
		K73c = new ItemPhotonDebuggerChain().setUnlocalizedName(Strings.PhotondebuggerChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K73c, Strings.PhotondebuggerChain);
		K74c = new ItemSweetMemoriesChain().setUnlocalizedName(Strings.SweetmemoriesChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K74c, Strings.SweetmemoriesChain);
		K75c = new ItemCircleOfLifeChain().setUnlocalizedName(Strings.CircleoflifeChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K75c, Strings.CircleoflifeChain);
		K76c = new ItemDecisivePumpkinChain().setUnlocalizedName(Strings.DecisivepumpkinChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K76c, Strings.DecisivepumpkinChain);
		K77c = new ItemWishingLampChain().setUnlocalizedName(Strings.WishinglampChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K77c, Strings.WishinglampChain);
		K78c = new ItemFollowTheWindChain().setUnlocalizedName(Strings.FollowthewindChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K78c, Strings.FollowthewindChain);
		K79c = new ItemMysteriousAbyssChain().setUnlocalizedName(Strings.MysteriousabyssChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K79c, Strings.MysteriousabyssChain);
		K80c = new ItemMonochromeChain().setUnlocalizedName(Strings.MonochromeChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K80c, Strings.MonochromeChain);
		K81c = new ItemHerosCrestChain().setUnlocalizedName(Strings.HeroscrestChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K81c, Strings.HeroscrestChain);
		K82c = new ItemRumblingRoseChain().setUnlocalizedName(Strings.RumblingroseChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K82c, Strings.RumblingroseChain);
		K83c = new ItemHiddenDragonChain().setUnlocalizedName(Strings.HiddendragonChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K83c, Strings.HiddendragonChain);
		K84c = new ItemEndsOfEarthChain().setUnlocalizedName(Strings.EndsofearthChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K84c, Strings.EndsofearthChain);
		K85c = new ItemStormFallChain().setUnlocalizedName(Strings.StormfallChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K85c, Strings.StormfallChain);
		K86c = new ItemDestinysEmbraceChain().setUnlocalizedName(Strings.DestinysembraceChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K86c, Strings.DestinysembraceChain);
		K87c = new ItemWayToTheDawnChain().setUnlocalizedName(Strings.WaytodawnChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K87c, Strings.WaytodawnChain);
		K88c = new ItemOneWingedAngelChain().setUnlocalizedName(Strings.OnewingedangelChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K88c, Strings.OnewingedangelChain);
		K89c = new ItemDiamondDustChain().setUnlocalizedName(Strings.DiamonddustChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K89c, Strings.DiamonddustChain);
		K90c = new ItemLionHeartChain().setUnlocalizedName(Strings.LionheartChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K90c, Strings.LionheartChain);
		K91c = new ItemMetalChocoboChain().setUnlocalizedName(Strings.MetalchocoboChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K91c, Strings.MetalchocoboChain);
		K92c = new ItemSpellBinderChain().setUnlocalizedName(Strings.SpellbinderChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K92c, Strings.SpellbinderChain);
		K93c = new ItemDivineRoseChain().setUnlocalizedName(Strings.DivineroseChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K93c, Strings.DivineroseChain);
		K94c = new ItemFairyHarpChain().setUnlocalizedName(Strings.FairyharpChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K94c, Strings.FairyharpChain);
		K95c = new ItemCrabClawChain().setUnlocalizedName(Strings.CrabclawChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K95c, Strings.CrabclawChain);
		K96c = new ItemWishingStarChain().setUnlocalizedName(Strings.WishingstarChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K96c, Strings.WishingstarChain);
		K97c = new ItemPumpkinHeadChain().setUnlocalizedName(Strings.PumpkinheadChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K97c, Strings.PumpkinheadChain);
		K98c = new ItemThreeWishesChain().setUnlocalizedName(Strings.ThreewishesChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K98c, Strings.ThreewishesChain);
		K99c = new ItemJunglekingChain().setUnlocalizedName(Strings.JunglekingChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K99c, Strings.JunglekingChain);
		K100c = new ItemOlympiaChain().setUnlocalizedName(Strings.OlympiaChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K100c, Strings.OlympiaChain);
		K101c = new ItemLadyLuckChain().setUnlocalizedName(Strings.LadyluckChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K101c, Strings.LadyluckChain);
		K102c = new ItemPeoplesHeartsChain().setUnlocalizedName(Strings.PeoplesheartsChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K102c, Strings.PeoplesheartsChain);
		K103c = new ItemUltimaWeaponChain().setUnlocalizedName(Strings.UltimaweaponChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K103c, Strings.UltimaweaponChain);
		K104c = new ItemTreasureTroveChain().setUnlocalizedName(Strings.TreasuretroveChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K104c, Strings.TreasuretroveChain);
		K105c = new ItemStarSeekerChain().setUnlocalizedName(Strings.StarseekerChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K105c, Strings.StarseekerChain);
		K106c = new ItemSoulEaterChain().setUnlocalizedName(Strings.SouleaterChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K106c, Strings.SouleaterChain);
		K107c = new ItemStarlightChain().setUnlocalizedName(Strings.StarlightChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K107c, Strings.StarlightChain);
		K111c = new ItemKingdomKeyChain().setUnlocalizedName(Strings.KingdomKeyChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K111c, Strings.KingdomKeyChain);
		K113c = new ItemKingdomKeyDChain().setUnlocalizedName(Strings.KingdomKeyDChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K113c, Strings.KingdomKeyDChain);
		K112c = new ItemOathkeeperChain().setUnlocalizedName(Strings.OathkeeperChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K112c, Strings.OathkeeperChain);
		K114c = new ItemOblivionChain().setUnlocalizedName(Strings.OblivionChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K114c, Strings.OblivionChain);
		K110c = new ItemWaywardWindChain().setUnlocalizedName(Strings.WaywardwindChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K110c, Strings.WaywardwindChain);
		K109c = new ItemEarthShakerChain().setUnlocalizedName(Strings.EarthshakerChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K109c, Strings.EarthshakerChain);
		K108c = new ItemRainFellChain().setUnlocalizedName(Strings.RainfellChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K108c, Strings.RainfellChain);
		
		//Org XIII Weapons
		EternalFlamesMaterial = EnumHelperClient.addToolMaterial(Strings.EternalFlames, 3, -1, 6.0F, 4, 30); EternalFlames = new ItemEternalFlames(EternalFlamesMaterial).setFull3D().setUnlocalizedName(Strings.EternalFlames); GameRegistry.registerItem(EternalFlames, Strings.EternalFlames);
		BookOfRetributionMaterial = EnumHelperClient.addToolMaterial(Strings.BookOfRetribution, 3, -1, 6.0F, 2, 30); BookOfRetribution = new ItemBookOfRetribution(BookOfRetributionMaterial).setFull3D().setUnlocalizedName(Strings.BookOfRetribution); GameRegistry.registerItem(BookOfRetribution, Strings.BookOfRetribution);
		InterdictionMaterial = EnumHelperClient.addToolMaterial(Strings.Interdiction, 3, -1, 6.0F, 6, 30); Interdiction = new ItemInterdiction(InterdictionMaterial).setFull3D().setUnlocalizedName(Strings.Interdiction); GameRegistry.registerItem(Interdiction, Strings.Interdiction);
		SharpShooterMaterial = EnumHelperClient.addToolMaterial(Strings.SharpShooter, 3, -1, 6.0F, 0, 30); SharpShooter = new ItemSharpShooter(SharpShooterMaterial).setFull3D().setUnlocalizedName(Strings.SharpShooter); GameRegistry.registerItem(SharpShooter, Strings.SharpShooter);
		LindWormMaterial = EnumHelperClient.addToolMaterial(Strings.LindWorm, 3, -1, 6.0F, 3, 30); LindWorm = new ItemLindWorm(LindWormMaterial).setFull3D().setUnlocalizedName(Strings.LindWorm); GameRegistry.registerItem(LindWorm, Strings.LindWorm);
		FrozenPrideMaterial = EnumHelperClient.addToolMaterial(Strings.FrozenPride, 3, -1, 6.0F, 6, 30); FrozenPride = new ItemFrozenPride(FrozenPrideMaterial).setFull3D().setUnlocalizedName(Strings.FrozenPride); GameRegistry.registerItem(FrozenPride, Strings.FrozenPride);
		SkySplitterMaterial = EnumHelperClient.addToolMaterial(Strings.Skysplitter, 3, -1, 6.0F, 20, 30); SkySplitter = new ItemSkySplitter(SkySplitterMaterial).setFull3D().setUnlocalizedName(Strings.Skysplitter); GameRegistry.registerItem(SkySplitter, Strings.Skysplitter);
		LunaticMaterial = EnumHelperClient.addToolMaterial(Strings.Lunatic, 3, -1, 6.0F, 8, 30); Lunatic = new ItemLunatic(LunaticMaterial).setFull3D().setUnlocalizedName(Strings.Lunatic); GameRegistry.registerItem(Lunatic, Strings.Lunatic);
		AppregioMaterial = EnumHelperClient.addToolMaterial(Strings.Appregio, 3, -1, 6.0F, 5, 30); Appregio = new ItemAppregio(AppregioMaterial).setFull3D().setUnlocalizedName(Strings.Appregio); GameRegistry.registerItem(Appregio, Strings.Appregio);
		FairGameMaterial = EnumHelperClient.addToolMaterial(Strings.FairGame, 3, -1, 6.0F, 2, 30); FairGame = new ItemFairGame(FairGameMaterial).setFull3D().setUnlocalizedName(Strings.FairGame); GameRegistry.registerItem(FairGame, Strings.FairGame);
		GracefulDahliaMaterial = EnumHelperClient.addToolMaterial(Strings.GracefulDahlia, 3, -1, 6.0F, 12, 30); GracefulDahlia = new ItemGracefulDahlia(GracefulDahliaMaterial).setFull3D().setUnlocalizedName(Strings.GracefulDahlia); GameRegistry.registerItem(GracefulDahlia, Strings.GracefulDahlia);
		FoudreMaterial = EnumHelperClient.addToolMaterial(Strings.Foudre, 3, -1, 6.0F, 9, 30); Foudre = new ItemFoudre(FoudreMaterial).setFull3D().setUnlocalizedName(Strings.Foudre); GameRegistry.registerItem(Foudre, Strings.Foudre);
	}
	
	public static void initRecipes(){
		K1r = new ItemVulpeusRecipe().setUnlocalizedName(Strings.VulpeusRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K1r, Strings.VulpeusRecipe);
		K2r = new ItemUrsusRecipe().setUnlocalizedName(Strings.UrsusRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K2r, Strings.UrsusRecipe);
		K3r = new ItemUnicornisRecipe().setUnlocalizedName(Strings.UnicornisRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K3r, Strings.UnicornisRecipe);
		K4r = new ItemLeopardosRecipe().setUnlocalizedName(Strings.LeopardosRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K4r, Strings.LeopardosRecipe);
		K5r = new ItemAnguisRecipe().setUnlocalizedName(Strings.AnguisRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K5r, Strings.AnguisRecipe);
		K6r = new ItemLeasKeybladeRecipe().setUnlocalizedName(Strings.LeaskeybladeRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K6r, Strings.LeaskeybladeRecipe);
		K7r = new ItemYoungXehanortsRecipe().setUnlocalizedName(Strings.YoungxehanortskeybladeRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K7r, Strings.YoungxehanortskeybladeRecipe);
		K8r = new ItemOceanRageRecipe().setUnlocalizedName(Strings.OceanrageRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K8r, Strings.OceanrageRecipe);
		K9r = new ItemEndofpainRecipe().setUnlocalizedName(Strings.EndofpainRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K9r, Strings.EndofpainRecipe);
		K10r = new ItemUnboundRecipe().setUnlocalizedName(Strings.UnboundRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K10r, Strings.UnboundRecipe);
		K11r = new ItemSweetDreamsRecipe().setUnlocalizedName(Strings.SweetdreamsRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K11r, Strings.SweetdreamsRecipe);
		K12r = new ItemDivewingRecipe().setUnlocalizedName(Strings.DivewingRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K12r, Strings.DivewingRecipe);
		K13r = new ItemCounterpointRecipe().setUnlocalizedName(Strings.CounterpointRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K13r, Strings.CounterpointRecipe);
		K14r = new ItemAllForOneRecipe().setUnlocalizedName(Strings.AllforoneRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K14r, Strings.AllforoneRecipe);
		K15r = new ItemKnockoutPunchRecipe().setUnlocalizedName(Strings.KnockoutpunchRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K15r, Strings.KnockoutpunchRecipe);
		K16r = new ItemFerrisgearRecipe().setUnlocalizedName(Strings.FerrisgearRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K16r, Strings.FerrisgearRecipe);
		K17r = new ItemDualDiscRecipe().setUnlocalizedName(Strings.DualdiscRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K17r, Strings.DualdiscRecipe);
		K18r = new ItemGuardianBellRecipe().setUnlocalizedName(Strings.GuardianbellRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K18r, Strings.GuardianbellRecipe);
		K19r = new ItemSkullNoiseRecipe().setUnlocalizedName(Strings.SkullnoiseRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K19r, Strings.SkullnoiseRecipe);
		K20r = new ItemWoodenKeybladeRecipe().setUnlocalizedName(Strings.WoodenkeybladeRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K20r, Strings.WoodenkeybladeRecipe);
		K21r = new ItemKyebladeBrokenRecipe().setUnlocalizedName(Strings.KyebladebrokenRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K21r, Strings.KyebladebrokenRecipe);
		K22r = new ItemKyebladeRecipe().setUnlocalizedName(Strings.KyebladeRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K22r, Strings.KyebladeRecipe);
		K23r = new ItemLightSeekerRecipe().setUnlocalizedName(Strings.LightseekerRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K23r, Strings.LightseekerRecipe);
		K24r = new ItemLostMemoryRecipe().setUnlocalizedName(Strings.LostmemoryRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K24r, Strings.LostmemoryRecipe);
		K25r = new ItemFrolicflameRecipe().setUnlocalizedName(Strings.FrolicflameRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K25r, Strings.FrolicflameRecipe);
		K26r = new ItemMasterKeeperRecipe().setUnlocalizedName(Strings.MasterkeeperRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K26r, Strings.MasterkeeperRecipe);
		K27r = new ItemBrightCrestRecipe().setUnlocalizedName(Strings.BrigthcrestRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K27r, Strings.BrigthcrestRecipe);
		K28r = new ItemCrownUnlimitRecipe().setUnlocalizedName(Strings.CrownunlimitRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K28r, Strings.CrownunlimitRecipe);
		K29r = new ItemNoNameRecipe().setUnlocalizedName(Strings.NonameRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K29r, Strings.NonameRecipe);
		K30r = new ItemVoidGearRecipe().setUnlocalizedName(Strings.VoidgearRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K30r, Strings.VoidgearRecipe);
		K31r = new ItemSweetStackRecipe().setUnlocalizedName(Strings.SweetstackRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K31r, Strings.SweetstackRecipe);
		K32r = new ItemPixiePetalRecipe().setUnlocalizedName(Strings.PixiepetalRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K32r, Strings.PixiepetalRecipe);
		K33r = new ItemHyperdriveRecipe().setUnlocalizedName(Strings.HyperdriveRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K33r, Strings.HyperdriveRecipe);
		K34r = new ItemMarkOfAHeroRecipe().setUnlocalizedName(Strings.MarkofaheroRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K34r, Strings.MarkofaheroRecipe);
		K35r = new ItemVictoryLineRecipe().setUnlocalizedName(Strings.VictorylineRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K35r, Strings.VictorylineRecipe);
		K36r = new ItemFairyStarsRecipe().setUnlocalizedName(Strings.FairystarsRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K36r, Strings.FairystarsRecipe);
		K37r = new ItemStrokeOfMidnightRecipe().setUnlocalizedName(Strings.StrokeofmidnightRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K37r, Strings.StrokeofmidnightRecipe);
		K38r = new ItemChaosRipperRecipe().setUnlocalizedName(Strings.ChaosripperRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K38r, Strings.ChaosripperRecipe);
		K39r = new ItemMasterXehanortsKeyRecipe().setUnlocalizedName(Strings.XehanortskeybladeRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K39r, Strings.XehanortskeybladeRecipe);
		K40r = new ItemDarkgnawRecipe().setUnlocalizedName(Strings.DarkgnawRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K40r, Strings.DarkgnawRecipe);
		K41r = new ItemZeroOneRecipe().setUnlocalizedName(Strings.ZerooneRecipe).setCreativeTab(KingdomKeys.KHRECODEDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K41r, Strings.ZerooneRecipe);
		K42r = new ItemDreamswordRecipe().setUnlocalizedName(Strings.DreamswordRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K42r, Strings.DreamswordRecipe);
		K43r = new ItemAubadeRecipe().setUnlocalizedName(Strings.AubadeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K43r, Strings.AubadeRecipe);
		K44r = new ItemUmbrellaRecipe().setUnlocalizedName(Strings.UmbrellaRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K44r, Strings.UmbrellaRecipe);
		K45r = new ItemOmegaWeaponRecipe().setUnlocalizedName(Strings.OmegaweaponRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K45r, Strings.OmegaweaponRecipe);
		K46r = new ItemTwilightBlazeRecipe().setUnlocalizedName(Strings.TwilightblazeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K46r, Strings.TwilightblazeRecipe);
		K47r = new ItemMaverickFlameRecipe().setUnlocalizedName(Strings.MaverickflareRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K47r, Strings.MaverickflareRecipe);
		K48r = new ItemAstralBlastRecipe().setUnlocalizedName(Strings.AstralblastRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K48r, Strings.AstralblastRecipe);
		K49r = new ItemDarkerThanDarkRecipe().setUnlocalizedName(Strings.DarkerthandarkRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K49r, Strings.DarkerthandarkRecipe);
		K50r = new ItemLunarEclipseRecipe().setUnlocalizedName(Strings.LunareclipseRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K50r, Strings.LunareclipseRecipe);
		K51r = new ItemSilentDirgeRecipe().setUnlocalizedName(Strings.SilentdirgeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K51r, Strings.SilentdirgeRecipe);
		K52r = new ItemTotalEclipseRecipe().setUnlocalizedName(Strings.TotaleclipseRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K52r, Strings.TotaleclipseRecipe);
		K53r = new ItemGlimpseofdarknessRecipe().setUnlocalizedName(Strings.GlimpseofdarknessRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K53r, Strings.GlimpseofdarknessRecipe);
		K54r = new ItemMidnightRoarRecipe().setUnlocalizedName(Strings.MidnightroarRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K54r, Strings.MidnightroarRecipe);
		K55r = new ItemRejectionOfFateRecipe().setUnlocalizedName(Strings.RejectionoffateRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K55r, Strings.RejectionoffateRecipe);
		K56r = new ItemTrueLightsFlightRecipe().setUnlocalizedName(Strings.TruelightsflightRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K56r, Strings.TruelightsflightRecipe);
		K57r = new ItemLeviathanRecipe().setUnlocalizedName(Strings.LeviathanRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K57r, Strings.LeviathanRecipe);
		K58r = new ItemAbyssalTideRecipe().setUnlocalizedName(Strings.AbyssaltideRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K58r, Strings.AbyssaltideRecipe);
		K59r = new ItemCrownOfGuiltRecipe().setUnlocalizedName(Strings.CrownofguiltRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K59r, Strings.CrownofguiltRecipe);
		K60r = new ItemSignOfInnocenceRecipe().setUnlocalizedName(Strings.SignofinnocenceRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K60r, Strings.SignofinnocenceRecipe);
		K61r = new ItemPainOfSolitudeRecipe().setUnlocalizedName(Strings.PainofsolitudeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K61r, Strings.PainofsolitudeRecipe);
		K62r = new ItemAbaddonPlasmaRecipe().setUnlocalizedName(Strings.AbbadonplasmaRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K62r, Strings.AbbadonplasmaRecipe);
		K63r = new ItemOminousBlightRecipe().setUnlocalizedName(Strings.OminousblightRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K63r, Strings.OminousblightRecipe);
		K64r = new ItemMissingAcheRecipe().setUnlocalizedName(Strings.MissingacheRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K64r, Strings.MissingacheRecipe);
		K65r = new ItemWinnersProofRecipe().setUnlocalizedName(Strings.WinnersproofRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K65r, Strings.WinnersproofRecipe);
		K66r = new ItemFatalcrestRecipe().setUnlocalizedName(Strings.FatalcrestRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K66r, Strings.FatalcrestRecipe);
		K67r = new ItemTwoBecomeOneRecipe().setUnlocalizedName(Strings.TwobecomesoneRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K67r, Strings.TwobecomesoneRecipe);
		K68r = new ItemBondOfFlamesRecipe().setUnlocalizedName(Strings.BondofflameRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K68r, Strings.BondofflameRecipe);
		K69r = new ItemFenrirRecipe().setUnlocalizedName(Strings.FenrirRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K69r, Strings.FenrirRecipe);
		K70r = new ItemSleepingLionRecipe().setUnlocalizedName(Strings.SleepinglionRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K70r, Strings.SleepinglionRecipe);
		K71r = new ItemGuardianSoulRecipe().setUnlocalizedName(Strings.GuardiansoulRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K71r, Strings.GuardiansoulRecipe);
		K72r = new ItemGullwingRecipe().setUnlocalizedName(Strings.GullwingRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K72r, Strings.GullwingRecipe);
		K73r = new ItemPhotonDebuggerRecipe().setUnlocalizedName(Strings.PhotondebuggerRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K73r, Strings.PhotondebuggerRecipe);
		K74r = new ItemSweetMemoriesRecipe().setUnlocalizedName(Strings.SweetmemoriesRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K74r, Strings.SweetmemoriesRecipe);
		K75r = new ItemCircleOfLifeRecipe().setUnlocalizedName(Strings.CircleoflifeRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K75r, Strings.CircleoflifeRecipe);
		K76r = new ItemDecisivePumpkinRecipe().setUnlocalizedName(Strings.DecisivepumpkinRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K76r, Strings.DecisivepumpkinRecipe);
		K77r = new ItemWishingLampRecipe().setUnlocalizedName(Strings.WishinglampRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K77r, Strings.WishinglampRecipe);
		K78r = new ItemFollowthewindRecipe().setUnlocalizedName(Strings.FollowthewindRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K78r, Strings.FollowthewindRecipe);
		K79r = new ItemMysteriousAbyssRecipe().setUnlocalizedName(Strings.MysteriousabyssRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K79r, Strings.MysteriousabyssRecipe);
		K80r = new ItemMonochromeRecipe().setUnlocalizedName(Strings.MonochromeRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K80r, Strings.MonochromeRecipe);
		K81r = new ItemHeroscrestRecipe().setUnlocalizedName(Strings.HeroscrestRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K81r, Strings.HeroscrestRecipe);
		K82r = new ItemRumblingRoseRecipe().setUnlocalizedName(Strings.RumblingroseRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K82r, Strings.RumblingroseRecipe);
		K83r = new ItemHiddenDragonRecipe().setUnlocalizedName(Strings.HiddendragonRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K83r, Strings.HiddendragonRecipe);
		K84r = new ItemEndsofearthRecipe().setUnlocalizedName(Strings.EndsofearthRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K84r, Strings.EndsofearthRecipe);
		K85r = new ItemStormFallRecipe().setUnlocalizedName(Strings.StormfallRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K85r, Strings.StormfallRecipe);
		K86r = new ItemDestinysembraceRecipe().setUnlocalizedName(Strings.DestinysembraceRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K86r, Strings.DestinysembraceRecipe);
		K87r = new ItemWayToDawnRecipe().setUnlocalizedName(Strings.WaytodawnRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K87r, Strings.WaytodawnRecipe);
		K88r = new ItemOneWingedAngelRecipe().setUnlocalizedName(Strings.OnewingedangelRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K88r, Strings.OnewingedangelRecipe);
		K89r = new ItemDiamonddustRecipe().setUnlocalizedName(Strings.DiamonddustRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K89r, Strings.DiamonddustRecipe);
		K90r = new ItemLionHeartRecipe().setUnlocalizedName(Strings.LionheartRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K90r, Strings.LionheartRecipe);
		K91r = new ItemMetalChocoboRecipe().setUnlocalizedName(Strings.MetalchocoboRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K91r, Strings.MetalchocoboRecipe);
		K92r = new ItemSpellBinderRecipe().setUnlocalizedName(Strings.SpellbinderRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K92r, Strings.SpellbinderRecipe);
		K93r = new ItemDivineRoseRecipe().setUnlocalizedName(Strings.DivineroseRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K93r, Strings.DivineroseRecipe);
		K94r = new ItemFairyharpRecipe().setUnlocalizedName(Strings.FairyharpRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K94r, Strings.FairyharpRecipe);
		K95r = new ItemCrabClawRecipe().setUnlocalizedName(Strings.CrabclawRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K95r, Strings.CrabclawRecipe);
		K96r = new ItemWishingStarRecipe().setUnlocalizedName(Strings.WishingstarRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K96r, Strings.WishingstarRecipe);
		K97r = new ItemPumpkinHeadRecipe().setUnlocalizedName(Strings.PumpkinheadRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K97r, Strings.PumpkinheadRecipe);
		K98r = new ItemThreeWishesRecipe().setUnlocalizedName(Strings.ThreewishesRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K98r, Strings.ThreewishesRecipe);
		K99r = new ItemJungleKingRecipe().setUnlocalizedName(Strings.JunglekingRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K99r, Strings.JunglekingRecipe);
		K100r = new ItemOlympiaRecipe().setUnlocalizedName(Strings.OlympiaRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K100r, Strings.OlympiaRecipe);
		K101r = new ItemLadyLuckRecipe().setUnlocalizedName(Strings.LadyluckRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K101r, Strings.LadyluckRecipe);
		K102r = new ItemKeybladeOfPeoplesHeartsRecipe().setUnlocalizedName(Strings.PeoplesheartsRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K102r, Strings.PeoplesheartsRecipe);
		K103r = new ItemUltimaWeaponRecipe().setUnlocalizedName(Strings.UltimaweaponRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K103r, Strings.UltimaweaponRecipe);
		K104r = new ItemTreasureTroveRecipe().setUnlocalizedName(Strings.TreasuretroveRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K104r, Strings.TreasuretroveRecipe);
		K105r = new ItemStarseekerRecipe().setUnlocalizedName(Strings.StarseekerRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K105r, Strings.StarseekerRecipe);
		K106r = new ItemSoulEaterRecipe().setUnlocalizedName(Strings.SouleaterRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K106r, Strings.SouleaterRecipe);
		K107r = new ItemStarlightRecipe().setUnlocalizedName(Strings.StarlightRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K107r, Strings.StarlightRecipe);
		K111r = new ItemKingdomKeyRecipe().setUnlocalizedName(Strings.KingdomKeyRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K111r, Strings.KingdomKeyRecipe);
		K113r = new ItemKingdomKeyDRecipe().setUnlocalizedName(Strings.KingdomKeyDRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K113r, Strings.KingdomKeyDRecipe);
		K112r = new ItemOathkeeperRecipe().setUnlocalizedName(Strings.OathkeeperRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K112r, Strings.OathkeeperRecipe);
		K114r = new ItemOblivionRecipe().setUnlocalizedName(Strings.OblivionRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K114r, Strings.OblivionRecipe);
		K110r = new ItemWaywardWindRecipe().setUnlocalizedName(Strings.WaywardwindRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K110r, Strings.WaywardwindRecipe);
		K109r = new ItemEarthshakerRecipe().setUnlocalizedName(Strings.EarthshakerRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K109r, Strings.EarthshakerRecipe);
		K108r = new ItemRainfellRecipe().setUnlocalizedName(Strings.RainfellRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K108r, Strings.RainfellRecipe);
	}

	public static void intiArmour(){
		//Organization
		OrganizationArmourMaterial = EnumHelperClient.addArmorMaterial("ORGANIZATION", 28, new int[] { 4, 8, 6, 3 }, 30);
		OrganizationHood = new OrganizationArmor(OrganizationArmourMaterial , KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 0, "ORGANIZATION_1", Strings.OHood); GameRegistry.registerItem(OrganizationHood, Strings.OHood);
		OrganizationCoat = new OrganizationArmor(OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 1, "ORGANIZATION_1", Strings.OCoat); GameRegistry.registerItem(OrganizationCoat, Strings.OCoat);
		OrganizationLegs = new OrganizationArmor(OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 2, "ORGANIZATION_2", Strings.OLegs); GameRegistry.registerItem(OrganizationLegs, Strings.OLegs);
		OrganizationBoots = new OrganizationArmor(OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 3, "ORGANIZATION_1", Strings.OBoots); GameRegistry.registerItem(OrganizationBoots, Strings.OBoots);
		//Keyblade
		//Aqua
		KeybladeAArmourMaterial = EnumHelperClient.addArmorMaterial("KEYBLADEA", 34, new int[] { 5, 8, 6, 4 }, 30);
		KeybladeAHelm = new KeybladeAArmor(KeybladeAArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 0, "KEYBLADEA_1", Strings.KAHelm); GameRegistry.registerItem(KeybladeAHelm, Strings.KAHelm);
		KeybladeAChest = new KeybladeAArmor(KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 1, "KEYBLADEA_1", Strings.KAChest); GameRegistry.registerItem(KeybladeAChest, Strings.KAChest);
		KeybladeALegs = new KeybladeAArmor(KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 2, "KEYBLADEA_2", Strings.KALegs); GameRegistry.registerItem(KeybladeALegs, Strings.KALegs);
		KeybladeABoots = new KeybladeAArmor(KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 3, "KEYBLADEA_1", Strings.KABoots); GameRegistry.registerItem(KeybladeABoots, Strings.KABoots);
		//Terra
		KeybladeTArmourMaterial = EnumHelperClient.addArmorMaterial("KEYBLADET", 40, new int[] { 6, 8, 7, 4 }, 30);
		KeybladeTHelm = new KeybladeTArmor(KeybladeTArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 0, "KEYBLADET_1", Strings.KTHelm); GameRegistry.registerItem(KeybladeTHelm, Strings.KTHelm);
		KeybladeTChest = new KeybladeTArmor(KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 1, "KEYBLADET_1", Strings.KTChest); GameRegistry.registerItem(KeybladeTChest, Strings.KTChest);
		KeybladeTLegs = new KeybladeTArmor(KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 2, "KEYBLADET_2", Strings.KTLegs); GameRegistry.registerItem(KeybladeTLegs, Strings.KTLegs);
		KeybladeTBoots = new KeybladeTArmor(KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 3, "KEYBLADET_1", Strings.KTBoots); GameRegistry.registerItem(KeybladeTBoots, Strings.KTBoots);
		//Ventus
		KeybladeVArmourMaterial = EnumHelperClient.addArmorMaterial("KEYBLADEV", 30, new int[] { 4, 8, 5, 4 }, 30);
		KeybladeVHelm = new KeybladeVArmor(KeybladeAArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 0, "KEYBLADEV_1", Strings.KVHelm); GameRegistry.registerItem(KeybladeVHelm, Strings.KVHelm);
		KeybladeVChest = new KeybladeVArmor(KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 1, "KEYBLADEV_1", Strings.KVChest); GameRegistry.registerItem(KeybladeVChest, Strings.KVChest);
		KeybladeVLegs = new KeybladeVArmor(KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 2, "KEYBLADEV_2", Strings.KVLegs); GameRegistry.registerItem(KeybladeVLegs, Strings.KVLegs);
		KeybladeVBoots = new KeybladeVArmor(KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 3, "KEYBLADEV_1", Strings.KVBoots); GameRegistry.registerItem(KeybladeVBoots, Strings.KVBoots);
		//Eraqus
		KeybladeEArmourMaterial = EnumHelperClient.addArmorMaterial("KEYBLADEE", 42, new int[] { 5, 7, 7, 5 }, 30);
		KeybladeEHelm = new KeybladeEArmor(KeybladeEArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 0, "KEYBLADEE_1", Strings.KEHelm); GameRegistry.registerItem(KeybladeEHelm, Strings.KEHelm);
		KeybladeEChest = new KeybladeEArmor(KeybladeEArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 1, "KEYBLADEE_1", Strings.KEChest); GameRegistry.registerItem(KeybladeEChest, Strings.KEChest);
		KeybladeELegs = new KeybladeEArmor(KeybladeEArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 2, "KEYBLADEE_2", Strings.KELegs); GameRegistry.registerItem(KeybladeELegs, Strings.KELegs);
		KeybladeEBoots = new KeybladeEArmor(KeybladeEArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 3, "KEYBLADEE_1", Strings.KEBoots); GameRegistry.registerItem(KeybladeEBoots, Strings.KEBoots);
		
		OrganizationArmourMaterial.customCraftingMaterial = DarkLeather;
		KeybladeVArmourMaterial.customCraftingMaterial = OrichalcumPlus;
		KeybladeTArmourMaterial.customCraftingMaterial = OrichalcumPlus;
		KeybladeAArmourMaterial.customCraftingMaterial = OrichalcumPlus;
		KeybladeEArmourMaterial.customCraftingMaterial = OrichalcumPlus;
	}

	public static void initHearts(){
		PureHeart = new ItemPureHeart(); GameRegistry.registerItem(PureHeart, Strings.PHeart);
		DarkHeart = new ItemDarkHeart(); GameRegistry.registerItem(DarkHeart, Strings.DHeart);
		Heart = new ItemHeart(); GameRegistry.registerItem(Heart, Strings.Heart);
		KingdomHearts = new ItemKingdomHearts(); GameRegistry.registerItem(KingdomHearts, Strings.KHearts);
	}

	public static void initLoot(){
		//DISC 1 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
		//DISC 2 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
		//DISC 3 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
		//DISC 4 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
		//DISC 5 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
		//DISC 6 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
		//DISC 7 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
		//DISC 8 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
		//DISC 9 CHEST GENERATION
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
		//Keyblade Recipes chest generation
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K11r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		
		
	}

	public static void initOthers(){
		Disc1 = new ItemDisc1(/*Reference.MOD_ID + ":" + */Strings.Disc1).setUnlocalizedName(Strings.Disc1); GameRegistry.registerItem(Disc1, Strings.Disc1);
		Disc2 = new ItemDisc2(/*Reference.MOD_ID + ":" + */Strings.Disc2).setUnlocalizedName(Strings.Disc2); GameRegistry.registerItem(Disc2, Strings.Disc2);
		Disc3 = new ItemDisc3(/*Reference.MOD_ID + ":" + */Strings.Disc3).setUnlocalizedName(Strings.Disc3); GameRegistry.registerItem(Disc3, Strings.Disc3);
		Disc4 = new ItemDisc4(/*Reference.MOD_ID + ":" + */Strings.Disc4).setUnlocalizedName(Strings.Disc4); GameRegistry.registerItem(Disc4, Strings.Disc4);
		Disc5 = new ItemDisc5(/*Reference.MOD_ID + ":" + */Strings.Disc5).setUnlocalizedName(Strings.Disc5); GameRegistry.registerItem(Disc5, Strings.Disc5);
		Disc6 = new ItemDisc6(/*Reference.MOD_ID + ":" + */Strings.Disc6).setUnlocalizedName(Strings.Disc6); GameRegistry.registerItem(Disc6, Strings.Disc6);
		Disc7 = new ItemDisc7(/*Reference.MOD_ID + ":" + */Strings.Disc7).setUnlocalizedName(Strings.Disc7); GameRegistry.registerItem(Disc7, Strings.Disc7);
		Disc8 = new ItemDisc8(/*Reference.MOD_ID + ":" + */Strings.Disc8).setUnlocalizedName(Strings.Disc8); GameRegistry.registerItem(Disc8, Strings.Disc8);
		Disc9 = new ItemDisc9(/*Reference.MOD_ID + ":" + */Strings.Disc9).setUnlocalizedName(Strings.Disc9); GameRegistry.registerItem(Disc9, Strings.Disc9);
		DarkLeather = new ItemDarkLeather(); GameRegistry.registerItem(DarkLeather, Strings.DLeather);
		HP = new ItemHP(); GameRegistry.registerItem(HP, Strings.HP);
		Munny1 = new ItemMunny1().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny1, Strings.Munny1);
		Munny5 = new ItemMunny5().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny5, Strings.Munny5);
		Munny10 = new ItemMunny10().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny10, Strings.Munny10);
		Munny20 = new ItemMunny20().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny20, Strings.Munny20);
		Munny50 = new ItemMunny50().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny50, Strings.Munny50);
		Munny100 = new ItemMunny100().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny100, Strings.Munny100);
		Munny200 = new ItemMunny200().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny200, Strings.Munny200);
		Munny500 = new ItemMunny500().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny500, Strings.Munny500);
		Munny800 = new ItemMunny800().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny800, Strings.Munny800);
		Munny1000 = new ItemMunny1000().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny1000, Strings.Munny1000);
		Munny1200 = new ItemMunny1200().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny1200, Strings.Munny1200);
		Munny1500 = new ItemMunny1500().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny1500, Strings.Munny1500);
		Munny1800 = new ItemMunny1800().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny1800, Strings.Munny1800);
		Munny2000 = new ItemMunny2000().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny2000, Strings.Munny2000);
		Munny3000 = new ItemMunny3000().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny3000, Strings.Munny3000);
		Munny4000 = new ItemMunny4000().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny4000, Strings.Munny4000);
		Munny5000 = new ItemMunny5000().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny5000, Strings.Munny5000);
		Munny6000 = new ItemMunny6000().setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Munny6000, Strings.Munny6000);
		Potion = new ItemPotion(0, 0, true); GameRegistry.registerItem(Potion, Strings.Potion);
		
		//Synthesis
		BlazingShard = new ItemBlazingShard().setUnlocalizedName(Strings.BlazingShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BlazingShard, Strings.BlazingShard);
		BlazingStone = new ItemBlazingStone().setUnlocalizedName(Strings.BlazingStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BlazingStone, Strings.BlazingStone);
		BlazingGem = new ItemBlazingGem().setUnlocalizedName(Strings.BlazingGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BlazingGem, Strings.BlazingGem);
		BlazingCrystal = new ItemBlazingCrystal().setUnlocalizedName(Strings.BlazingCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BlazingCrystal, Strings.BlazingCrystal);
		
		FrostShard = new ItemFrostShard().setUnlocalizedName(Strings.FrostShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(FrostShard, Strings.FrostShard);
		FrostStone = new ItemFrostStone().setUnlocalizedName(Strings.FrostStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(FrostStone, Strings.FrostStone);
		FrostGem = new ItemFrostGem().setUnlocalizedName(Strings.FrostGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(FrostGem, Strings.FrostGem);
		FrostCrystal = new ItemFrostCrystal().setUnlocalizedName(Strings.FrostCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(FrostCrystal, Strings.FrostCrystal);
		
		LightningShard = new ItemLightningShard().setUnlocalizedName(Strings.LightningShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LightningShard, Strings.LightningShard);
		LightningStone = new ItemLightningStone().setUnlocalizedName(Strings.LightningStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LightningStone, Strings.LightningStone);
		LightningGem = new ItemLightningGem().setUnlocalizedName(Strings.LightningGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LightningGem, Strings.LightningGem);
		LightningCrystal = new ItemLightningCrystal().setUnlocalizedName(Strings.LightningCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LightningCrystal, Strings.LightningCrystal);
		
		LucidShard = new ItemLucidShard().setUnlocalizedName(Strings.LucidShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LucidShard, Strings.LucidShard);
		LucidStone = new ItemLucidStone().setUnlocalizedName(Strings.LucidStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LucidStone, Strings.LucidStone);
		LucidGem = new ItemLucidGem().setUnlocalizedName(Strings.LucidGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LucidGem, Strings.LucidGem);
		LucidCrystal = new ItemLucidCrystal().setUnlocalizedName(Strings.LucidCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(LucidCrystal, Strings.LucidCrystal);
		
		PowerShard = new ItemPowerShard().setUnlocalizedName(Strings.PowerShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(PowerShard, Strings.PowerShard);
		PowerStone = new ItemPowerStone().setUnlocalizedName(Strings.PowerStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(PowerStone, Strings.PowerStone);
		PowerGem = new ItemPowerGem().setUnlocalizedName(Strings.PowerGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(PowerGem, Strings.PowerGem);
		PowerCrystal = new ItemPowerCrystal().setUnlocalizedName(Strings.PowerCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(PowerCrystal, Strings.PowerCrystal);
		
		DarkShard = new ItemDarkShard().setUnlocalizedName(Strings.DarkShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DarkShard, Strings.DarkShard);
		DarkStone = new ItemDarkStone().setUnlocalizedName(Strings.DarkStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DarkStone, Strings.DarkStone);
		DarkGem = new ItemDarkGem().setUnlocalizedName(Strings.DarkGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DarkGem, Strings.DarkGem);
		DarkCrystal = new ItemDarkCrystal().setUnlocalizedName(Strings.DarkCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DarkCrystal, Strings.DarkCrystal);
		DarkMatter = new ItemDarkMatter().setUnlocalizedName(Strings.DarkMatter).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DarkMatter, Strings.DarkMatter);
		
		DenseShard = new ItemDenseShard().setUnlocalizedName(Strings.DenseShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DenseShard, Strings.DenseShard);
		DenseStone = new ItemDenseStone().setUnlocalizedName(Strings.DenseStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DenseStone, Strings.DenseStone);
		DenseGem = new ItemDenseGem().setUnlocalizedName(Strings.DenseGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DenseGem, Strings.DenseGem);
		DenseCrystal = new ItemDenseCrystal().setUnlocalizedName(Strings.DenseCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(DenseCrystal, Strings.DenseCrystal);
		
		TwilightShard = new ItemTwilightShard().setUnlocalizedName(Strings.TwilightShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TwilightShard, Strings.TwilightShard);
		TwilightStone = new ItemTwilightStone().setUnlocalizedName(Strings.TwilightStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TwilightStone, Strings.TwilightStone);
		TwilightGem = new ItemTwilightGem().setUnlocalizedName(Strings.TwilightGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TwilightGem, Strings.TwilightGem);
		TwilightCrystal = new ItemTwilightCrystal().setUnlocalizedName(Strings.TwilightCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TwilightCrystal, Strings.TwilightCrystal);
		
		MythrilShard = new ItemMythrilShard().setUnlocalizedName(Strings.MythrilShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(MythrilShard, Strings.MythrilShard);
		MythrilStone = new ItemMythrilStone().setUnlocalizedName(Strings.MythrilStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(MythrilStone, Strings.MythrilStone);
		MythrilGem = new ItemMythrilGem().setUnlocalizedName(Strings.MythrilGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(MythrilGem, Strings.MythrilGem);
		MythrilCrystal = new ItemMythrilCrystal().setUnlocalizedName(Strings.MythrilCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(MythrilCrystal, Strings.MythrilCrystal);
		
		BrightShard = new ItemBrightShard().setUnlocalizedName(Strings.BrightShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BrightShard, Strings.BrightShard);
		BrightStone = new ItemBrightStone().setUnlocalizedName(Strings.BrightStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BrightStone, Strings.BrightStone);
		BrightGem = new ItemBrightGem().setUnlocalizedName(Strings.BrightGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BrightGem, Strings.BrightGem);
		BrightCrystal = new ItemBrightCrystal().setUnlocalizedName(Strings.BrightCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(BrightCrystal, Strings.BrightCrystal);
		
		EnergyShard = new ItemEnergyShard().setUnlocalizedName(Strings.EnergyShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(EnergyShard, Strings.EnergyShard);
		EnergyStone = new ItemEnergyStone().setUnlocalizedName(Strings.EnergyStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(EnergyStone, Strings.EnergyStone);
		EnergyGem = new ItemEnergyGem().setUnlocalizedName(Strings.EnergyGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(EnergyGem, Strings.EnergyGem);
		EnergyCrystal = new ItemEnergyCrystal().setUnlocalizedName(Strings.EnergyCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(EnergyCrystal, Strings.EnergyCrystal);
		
		SerenityShard = new ItemSerenityShard().setUnlocalizedName(Strings.SerenityShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(SerenityShard, Strings.SerenityShard);
		SerenityStone = new ItemSerenityStone().setUnlocalizedName(Strings.SerenityStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(SerenityStone, Strings.SerenityStone);
		SerenityGem = new ItemSerenityGem().setUnlocalizedName(Strings.SerenityGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(SerenityGem, Strings.SerenityGem);
		SerenityCrystal = new ItemSerenityCrystal().setUnlocalizedName(Strings.SerenityCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(SerenityCrystal, Strings.SerenityCrystal);
		
		Orichalcum = new ItemOrichalcum().setUnlocalizedName(Strings.Orichalcum).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(Orichalcum, Strings.Orichalcum);
		OrichalcumPlus = new ItemOrichalcumPlus().setUnlocalizedName(Strings.OrichalcumPlus).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(OrichalcumPlus, Strings.OrichalcumPlus);
		
		RemembranceShard = new ItemRemembranceShard().setUnlocalizedName(Strings.RemembranceShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(RemembranceShard, Strings.RemembranceShard);
		RemembranceStone = new ItemRemembranceStone().setUnlocalizedName(Strings.RemembranceStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(RemembranceStone, Strings.RemembranceStone);
		RemembranceGem = new ItemRemembranceGem().setUnlocalizedName(Strings.RemembranceGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(RemembranceGem, Strings.RemembranceGem);
		RemembranceCrystal = new ItemRemembranceCrystal().setUnlocalizedName(Strings.RemembranceCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(RemembranceCrystal, Strings.RemembranceCrystal);
		
		TranquilShard = new ItemTranquilShard().setUnlocalizedName(Strings.TranquilShard).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TranquilShard, Strings.TranquilShard);
		TranquilStone = new ItemTranquilStone().setUnlocalizedName(Strings.TranquilStone).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TranquilStone, Strings.TranquilStone);
		TranquilGem = new ItemTranquilGem().setUnlocalizedName(Strings.TranquilGem).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TranquilGem, Strings.TranquilGem);
		TranquilCrystal = new ItemTranquilCrystal().setUnlocalizedName(Strings.TranquilCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(TranquilCrystal, Strings.TranquilCrystal);
		
		ShinyCrystal = new ItemShinyCrystal().setUnlocalizedName(Strings.ShinyCrystal).setCreativeTab(KingdomKeys.KKSMTAB); GameRegistry.registerItem(ShinyCrystal, Strings.ShinyCrystal);
	}

}
