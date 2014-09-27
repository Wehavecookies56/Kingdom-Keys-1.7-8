package wehavecookies56.kk.item;

import org.apache.commons.codec.language.Nysiis;

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
import wehavecookies56.kk.item.org13.ItemArpeggio;
import wehavecookies56.kk.item.org13.ItemBookOfRetribution;
import wehavecookies56.kk.item.org13.ItemEternalFlames;
import wehavecookies56.kk.item.org13.ItemFairGame;
import wehavecookies56.kk.item.org13.ItemFoudre;
import wehavecookies56.kk.item.org13.ItemFrozenPride;
import wehavecookies56.kk.item.org13.ItemGracefulDahlia;
import wehavecookies56.kk.item.org13.ItemInterdiction;
import wehavecookies56.kk.item.org13.ItemLindWorm;
import wehavecookies56.kk.item.org13.ItemLunatic;
import wehavecookies56.kk.item.org13.ItemSharpShooter;
import wehavecookies56.kk.item.org13.ItemSkySplitter;
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
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddedItems {

	//TODO Rename all keyblades, chains and recipes
	//TODO Add chest generation of all recipes
	//TODO Fix music discs

	public static Item DriveOrb, DarkMatterRecipe, VoidedKnowledge, DarkKnowledge, MythrilShardRecipe, MythrilStoneRecipe, MythrilGemRecipe, MythrilCrystalRecipe, Disc10, Disc11, Disc12, Disc13, Interdiction, SharpShooter, LindWorm, FrozenPride, SkySplitter, BookOfRetribution, Lunatic, Arpeggio, FairGame, GracefulDahlia, Foudre, Pouch, Munny1, Munny5, Munny10, Munny20, Munny50, Munny100, Munny200, Munny500, Munny800, Munny1000, Munny1200, Munny1500, Munny1800, Munny2000, Munny3000, Munny4000, Munny5000, Munny6000, BlazingShard, BlazingStone, BlazingGem, BlazingCrystal, FrostShard, FrostStone, FrostGem, FrostCrystal, LightningShard, LightningStone, LightningGem, LightningCrystal, LucidShard, LucidStone, LucidGem, LucidCrystal, PowerShard, PowerStone, PowerGem, PowerCrystal, DarkShard, DarkStone, DarkGem, DarkCrystal, DarkMatter, DenseShard, DenseStone, DenseGem, DenseCrystal, TwilightShard, TwilightStone, TwilightGem, TwilightCrystal, MythrilShard, MythrilStone, MythrilGem, MythrilCrystal, BrightShard, BrightStone, BrightGem, BrightCrystal, EnergyShard, EnergyStone, EnergyGem, EnergyCrystal, SerenityShard, SerenityStone, SerenityGem, SerenityCrystal, Orichalcum, OrichalcumPlus, RemembranceShard, RemembranceStone, RemembranceGem, RemembranceCrystal, TranquilShard, TranquilStone, TranquilGem, TranquilCrystal, MysteryGoo, ShinyCrystal, Disc1, Disc2, PureHeart, DarkHeart, Heart, KingdomHearts, OrganizationHood, OrganizationCoat, OrganizationLegs, OrganizationBoots, DarkLeather, HP, Potion, Disc3, Disc4, Disc5, Disc6, Disc7, Disc8, Disc9, KeybladeAHelm, KeybladeAChest, KeybladeALegs, KeybladeABoots, KeybladeTHelm, KeybladeTChest, KeybladeTLegs, KeybladeTBoots, KeybladeEHelm, KeybladeEChest, KeybladeELegs, KeybladeEBoots, KeybladeVHelm, KeybladeVChest, KeybladeVLegs, KeybladeVBoots, Vulpeus, Ursus, Unicornis, Leopardos, Anguis, LeasKeyblade, YoungXehanortsKeyblade, Oceanrage, EndOfPain, Unbound, SweetDreams, DiveWing, Counterpoint, AllForOne, KnockoutPunch, FerrisGear, DualDisc, GuardianBell, SkullNoise, WoodenKeyblade, KyebladeBroken, Kyeblade, Lightseeker, LostMemory, FrolicFlame, MasterKeeper, BrightCrest, CrownUnlimit, NoName, VoidGear, SweetStack, PixiePetal, Hyperdrive, MarkOfAHero, VictoryLine, FairyStars, StrokeOfMidnight, ChaosRipper, XehanortsKeyblade, Darkgnaw, ZeroOne, DreamSword, Aubade, Umbrella, OmegaWeapon, TwilightBlaze, MaverickFlare, AstralBlast, DarkerThanDark, LunarEclipse, SilentDirge, TotalEclipse, GlimpseOfDarkness, MidnightRoar, RejectionOfFate, TrueLightsFlight, Leviathan, AbyssalTide, CrownOfGuilt, SignOfInnocence, PainOfSolitude, AbaddonPlasma, OminousBlight, MissingAche, WinnersProof, FatalCrest, TwoBecomesOne, BondOfFlames, Fenrir, SleepingLion, GuardianSoul, Gullwing, PhotonDebugger, SweetMemories, CircleOfLife, DecisivePumpkin, WishingLamp, FollowTheWind, MysteriousAbyss, Monochrome, HerosCrest, RumblingRose, HiddenDragon, EndsOfEarth, Stormfall, DestinysEmbrace, WayToDawn, OneWingedAngel, DiamondDust, LionHeart, MetalChocobo, SpellBinder, DivineRose, FairyHarp, CrabClaw, WishingStar, PumpkinHead, ThreeWishes, JungleKing, Olympia, LadyLuck, PeoplesHearts, UltimaWeaopon, TreasureTrove, StarSeeker, SoulEater, StarLight, Rainfell, EarthShaker, WaywardWind, KingdomKey, Oathkeeper, KingdomKeyD, Oblivion, VulpeusChain, UrsusChain, UnicornisChain, LeopardosChain, AnguisChain, LeasKeybladeChain, YoungXehanortsKeybladeChain, OceanRageChain, EndOfPainChain, UnboundChain, SweetDreamsChain, DiveWingChain, CounterpointChain, AllForOneChain, KnockoutPunchChain, FerrisGearChain, DualDiscChain, GuardianBellChain, SkullNoiseChain, WoodenKeybladeChain, KyebladeBrokenChain, KyebladeChain, LightSeekerChain, LostMemoryChain, FrolicFlameChain, MasterKeeperChain, BrightCrestChain, CrownUnlimitChain, NoNameChain, VoidGearChain, SweetStackChain, PixiePetalChain, HyperdriveChain, MarkOfAHeroChain, VictoryLineChain, FairyStarsChain, StrokeOfMidnightChain, ChaosRipperChain, XehanortsKeybladeChain, DarkgnawChain, ZeroOneChain, DreamSwordChain, AubadeChain, UmbrellaChain, OmegaWeaponChain, TwilightBlazeChain, MaverickFlareChain, AstralBlastChain, DarkerThanDarkChain, LunarEclipseChain, SilentDirgeChain, TotalEclipseChain, GlimpseOfDarknessChain, MidnightRoarChain, RejectionOfFateChain, TrueLightsFlightChain, LeviathanChain, AbyssalTideChain, CrownOfGuiltChain, SignOfInnocenceChain, PainOfSolitudeChain, AbaddonPlasmaChain, OminousBlightChain, MissingAcheChain, WinnersProofChain, FatalCrestChain, TwoBecomesOneChain, BondOfFlamesChain, FenrirChain, SleepingLionChain, GuardianSoulChain, GullWingChain, PhotonDebuggerChain, SweetMemoriesChain, CircleOfLifeChain, DecisivePumpkinChain, WishingLampChain, FollowTheWindChain, MysteriousAbyssChain, MonochromeChain, HerosCrestChain, RumblingRoseChain, HiddenDragonChain, EndsOfEarthChain, StormfallChain, DestinysEmbraceChain, WayToDawnChain, OneWingedAngelChain, DiamondDustChain, LionHeartChain, MetalChocoboChain, SpellBinderChain, DivineRoseChain, FairyHarpChain, CrabClawChain, WishingStarChain, PumpkinHeadChain, ThreeWishesChain, JungleKingChain, OlympiaChain, LadyLuckChain, PeoplesHeartsChain, UltimaWeaponChain, TreasureTroveChain, StarseekerChain, SoulEaterChain, StarlightChain, RainfellChain, EarthShakerChain, WaywardWindChain, KingdomKeyChain, OathkeeperChain, KingdomKeyDChain, OblivionChain, EternalFlames, K1r, K2r, K3r, K4r, K5r, K6r, K7r, K8r, K9r, K10r, K11r, K12r, K13r, K14r, K15r, K16r, K17r, K18r, K19r, K20r, K21r, K22r, K23r, K24r, K25r, K26r, K27r, K28r, K29r, K30r, K31r, K32r, K33r, K34r, K35r, K36r, K37r, K38r, K39r, K40r, K41r, K42r, K43r, K44r, K45r, K46r, K47r, K48r, K49r, K50r, K51r, K52r, K53r, K54r, K55r, K56r, K57r, K58r, K59r, K60r, K61r, K62r, K63r, K64r, K65r, K66r, K67r, K68r, K69r, K70r, K71r, K72r, K73r, K74r, K75r, K76r, K77r, K78r, K79r, K80r, K81r, K82r, K83r, K84r, K85r, K86r, K87r, K88r, K89r, K90r, K91r, K92r, K93r, K94r, K95r, K96r, K97r, K98r, K99r, K100r, K101r, K102r, K103r, K104r, K105r, K106r, K107r, K108r, K109r, K110r, K111r, K112r, K113r, K114r, EmptyBottle;
	public static ArmorMaterial OrganizationArmourMaterial, KeybladeAArmourMaterial, KeybladeTArmourMaterial, KeybladeVArmourMaterial, KeybladeEArmourMaterial;
	public static ToolMaterial SharpShooterMaterial, LindWormMaterial, FrozenPrideMaterial, SkySplitterMaterial, LunaticMaterial, ArpeggioMaterial, FairGameMaterial, GracefulDahliaMaterial, FoudreMaterial, InterdictionMaterial, BookOfRetributionMaterial, VulpeusMaterial, UrsusMaterial, UnicornisMaterial, LeopardosMaterial, AnguisMaterial, LeasKeybladeMaterial, YoungXehanortsKeybladeMaterial, OceanRageMaterial, EndOfPainMaterial, UnboundMaterial, SweetDreamsMaterial, DivewingMaterial, CounterpointMaterial, AllForOneMaterial, KnockoutPunchMaterial, FerrisGearMaterial, DualDiscMaterial, GuardianBellMaterial, SkullNoiseMaterial, WoodenKeybladeMaterial, KyebladeBrokenMaterial, KyebladeMaterial, LightSeekerMaterial, LostMemoryMaterial, FrolicFlameMaterial, MasterKeeperMaterial, BrightCrestMaterial, CrownUnlimitMaterial, NoNameMaterial, VoidGearMaterial, SweetStackMaterial, PixiePetalMaterial, HyperdriveMaterial, MarkOfAHeroMaterial, VictoryLineMaterial, FairyStarsMaterial, StrokeOfMidnightMaterial, ChaosRipperMaterial, XehanortsKeybladeMaterial, DarkgnawMaterial, ZeroOneMaterial, DreamSwordMaterial, AubadeMaterial, UmbrellaMaterial, OmegaWeaponMaterial, TwilightBlazeMaterial, MaverickFlareMaterial, AstralBlastMaterial, DarkerThanDarkMaterial, LunarEclipseMaterial, SilentDirgeMaterial, TotalEclipseMaterial, GlimpseOfDarknessMaterial, MidnightRoarMaterial, RejectionOfFateMaterial, TrueLightsFlightMaterial, LeviathanMaterial, AbyssalTideMaterial, CrownOfGuiltMaterial, SignOfInnocenceMaterial, PainOfSolitudeMaterial, AbaddonPlasmaMaterial, OminousBlightMaterial, MissingAcheMaterial, WinnersProofMaterial, FatalCrestMaterial, TwoBecomesOneMaterial, BondOfFlamesMaterial, FenrirMaterial, SleepingLionMaterial, GuardianSoulMaterial, GullwingMaterial, PhotonDebuggerMaterial, SweetMemoriesMaterial, CircleOfLifeMaterial, DecisivePumpkinMaterial, WishingLampMaterial, FollowTheWindMaterial, MysteriousAbyssMaterial, MonochromeMaterial, HerosCrestMaterial, RumblingRoseMaterial, HiddenDragonMaterial, EndsOfEarthMaterial, StormfallMaterial, DestinysEmbraceMaterial, WayToDawnMaterial, OneWingedAngelMaterial, DiamondDustMaterial, LionHeartMaterial, MetalChocoboMaterial, SpellBinderMaterial, DivineRoseMaterial, FairyHarpMaterial, CrabClawMaterial, WishingStarMaterial, PumpkinHeadMaterial, ThreeWishesMaterial, JungleKingMaterial, OlympiaMaterial, LadyLuckMaterial, PeoplesHeartsMaterial, UltimaWeaopnMaterial, TreasureTroveMaterial, StarseekerMaterial, SoulEaterMaterial, StarlightMaterial, RainfellMaterial, EarthshakerMaterial, WaywardWindMaterial, KingdomKeyMaterial, OathkeeperMaterial, KingdomKeyDMaterial, OblivionMaterial, EternalFlamesMaterial;

	static int chainStackSize = 1;

	public static void initKeyBlades(){
		VulpeusMaterial = EnumHelperClient.addToolMaterial(Strings.Vulpeus, 3, -1, 6.0F, 16, 30); Vulpeus = new ItemVulpeus(VulpeusMaterial).setFull3D().setUnlocalizedName(Strings.Vulpeus); GameRegistry.registerItem(Vulpeus, Strings.Vulpeus);
		UrsusMaterial = EnumHelperClient.addToolMaterial(Strings.Ursus, 3, -1, 6.0F, 18, 30); Ursus = new ItemUrsus(UrsusMaterial).setFull3D().setUnlocalizedName(Strings.Ursus); GameRegistry.registerItem(Ursus, Strings.Ursus);
		UnicornisMaterial = EnumHelperClient.addToolMaterial(Strings.Unicornis, 3, -1, 6.0F, 15, 30); Unicornis = new ItemUnicornis(UnicornisMaterial).setFull3D().setUnlocalizedName(Strings.Unicornis); GameRegistry.registerItem(Unicornis, Strings.Unicornis);
		LeopardosMaterial = EnumHelperClient.addToolMaterial(Strings.Leopardos, 3, -1, 6.0F, 17, 30); Leopardos = new ItemLeopardos(LeopardosMaterial).setFull3D().setUnlocalizedName(Strings.Leopardos); GameRegistry.registerItem(Leopardos, Strings.Leopardos);
		AnguisMaterial = EnumHelperClient.addToolMaterial(Strings.Anguis, 3, -1, 6.0F, 9, 30); Anguis = new ItemAnguis(AnguisMaterial).setFull3D().setUnlocalizedName(Strings.Anguis); GameRegistry.registerItem(Anguis, Strings.Anguis);
		LeasKeybladeMaterial = EnumHelperClient.addToolMaterial(Strings.Leaskeyblade, 3, -1, 6.0F, 8, 30); LeasKeyblade = new ItemLeasKeyblade(LeasKeybladeMaterial).setFull3D().setUnlocalizedName(Strings.Leaskeyblade); GameRegistry.registerItem(LeasKeyblade, Strings.Leaskeyblade);
		YoungXehanortsKeybladeMaterial = EnumHelperClient.addToolMaterial(Strings.Youngxehanortskeyblade, 3, -1, 6.0F, 15, 30); YoungXehanortsKeyblade = new ItemYoungXehanort(YoungXehanortsKeybladeMaterial).setFull3D().setUnlocalizedName(Strings.Youngxehanortskeyblade); GameRegistry.registerItem(YoungXehanortsKeyblade, Strings.Youngxehanortskeyblade);
		OceanRageMaterial = EnumHelperClient.addToolMaterial(Strings.Oceanrage, 3, -1, 6.0F, 8, 30); Oceanrage = new ItemOceanRage(OceanRageMaterial).setFull3D().setUnlocalizedName(Strings.Oceanrage); GameRegistry.registerItem(Oceanrage, Strings.Oceanrage);
		EndOfPainMaterial = EnumHelperClient.addToolMaterial(Strings.Endofpain, 3, -1, 6.0F, 9, 30); EndOfPain = new ItemEndOfPain(EndOfPainMaterial).setFull3D().setUnlocalizedName(Strings.Endofpain); GameRegistry.registerItem(EndOfPain, Strings.Endofpain);
		UnboundMaterial = EnumHelperClient.addToolMaterial(Strings.Unbound, 3, -1, 6.0F, 13, 30); Unbound = new ItemUnbound(UnboundMaterial).setFull3D().setUnlocalizedName(Strings.Unbound); GameRegistry.registerItem(Unbound, Strings.Unbound);
		SweetDreamsMaterial = EnumHelperClient.addToolMaterial(Strings.Sweetdreams, 3, -1, 6.0F, 9, 30); SweetDreams = new ItemSweetDreams(SweetDreamsMaterial).setFull3D().setUnlocalizedName(Strings.Sweetdreams); GameRegistry.registerItem(SweetDreams, Strings.Sweetdreams);
		DivewingMaterial = EnumHelperClient.addToolMaterial(Strings.Divewing, 3, -1, 6.0F, 7, 30); DiveWing = new ItemDiveWing(DivewingMaterial).setFull3D().setUnlocalizedName(Strings.Divewing); GameRegistry.registerItem(DiveWing, Strings.Divewing);
		CounterpointMaterial = EnumHelperClient.addToolMaterial(Strings.Counterpoint, 3, -1, 6.0F, 7, 30); Counterpoint = new ItemCounterPoint(CounterpointMaterial).setFull3D().setUnlocalizedName(Strings.Counterpoint); GameRegistry.registerItem(Counterpoint, Strings.Counterpoint);
		AllForOneMaterial = EnumHelperClient.addToolMaterial(Strings.Allforone, 3, -1, 6.0F, 5, 30); AllForOne = new ItemAllForOne(AllForOneMaterial).setFull3D().setUnlocalizedName(Strings.Allforone); GameRegistry.registerItem(AllForOne, Strings.Allforone);
		KnockoutPunchMaterial = EnumHelperClient.addToolMaterial(Strings.Knockoutpunch, 3, -1, 6.0F, 5, 30); KnockoutPunch = new ItemKnockoutPunch(KnockoutPunchMaterial).setFull3D().setUnlocalizedName(Strings.Knockoutpunch); GameRegistry.registerItem(KnockoutPunch, Strings.Knockoutpunch);
		FerrisGearMaterial = EnumHelperClient.addToolMaterial(Strings.Ferrisgear, 3, -1, 6.0F, 6, 30); FerrisGear = new ItemFerrisGear(FerrisGearMaterial).setFull3D().setUnlocalizedName(Strings.Ferrisgear); GameRegistry.registerItem(FerrisGear, Strings.Ferrisgear);
		DualDiscMaterial = EnumHelperClient.addToolMaterial(Strings.Dualdisc, 3, -1, 6.0F, 7, 30); DualDisc = new ItemDualDisc(DualDiscMaterial).setFull3D().setUnlocalizedName(Strings.Dualdisc); GameRegistry.registerItem(DualDisc, Strings.Dualdisc);
		GuardianBellMaterial = EnumHelperClient.addToolMaterial(Strings.Guardianbell, 3, -1, 6.0F, 7, 30); GuardianBell = new ItemGuardianBell(GuardianBellMaterial).setFull3D().setUnlocalizedName(Strings.Guardianbell); GameRegistry.registerItem(GuardianBell, Strings.Guardianbell);
		SkullNoiseMaterial = EnumHelperClient.addToolMaterial(Strings.Skullnoise, 3, -1, 6.0F, 6, 30); SkullNoise = new ItemSkullNoise(SkullNoiseMaterial).setFull3D().setUnlocalizedName(Strings.Skullnoise); GameRegistry.registerItem(SkullNoise, Strings.Skullnoise);
		WoodenKeybladeMaterial = EnumHelperClient.addToolMaterial(Strings.Woodenkeyblade, 3, -1, 6.0F, 2, 30); WoodenKeyblade = new ItemWoodenKeyBlade(WoodenKeybladeMaterial).setFull3D().setUnlocalizedName(Strings.Woodenkeyblade); GameRegistry.registerItem(WoodenKeyblade, Strings.Woodenkeyblade);
		KyebladeBrokenMaterial = EnumHelperClient.addToolMaterial(Strings.Kyebladebroken, 3, -1, 6.0F, 13, 30); KyebladeBroken = new ItemkyeBladeBroken(KyebladeBrokenMaterial).setFull3D().setUnlocalizedName(Strings.Kyebladebroken); GameRegistry.registerItem(KyebladeBroken, Strings.Kyebladebroken);
		KyebladeMaterial = EnumHelperClient.addToolMaterial(Strings.Kyeblade, 3, -1, 6.0F, 25, 30); Kyeblade = new ItemkyeBlade(KyebladeMaterial).setFull3D().setUnlocalizedName(Strings.Kyeblade); GameRegistry.registerItem(Kyeblade, Strings.Kyeblade);
		LightSeekerMaterial = EnumHelperClient.addToolMaterial(Strings.Lightseeker, 3, -1, 6.0F, 9, 30); Lightseeker = new ItemLightSeeker(LightSeekerMaterial).setFull3D().setUnlocalizedName(Strings.Lightseeker); GameRegistry.registerItem(Lightseeker, Strings.Lightseeker);
		LostMemoryMaterial = EnumHelperClient.addToolMaterial(Strings.Lostmemory, 3, -1, 6.0F, 12, 30); LostMemory = new ItemLostMemory(LostMemoryMaterial).setFull3D().setUnlocalizedName(Strings.Lostmemory); GameRegistry.registerItem(LostMemory, Strings.Lostmemory);
		FrolicFlameMaterial = EnumHelperClient.addToolMaterial(Strings.Frolicflame, 3, -1, 6.0F, 6, 30); FrolicFlame = new ItemFrolicFlame(FrolicFlameMaterial).setFull3D().setUnlocalizedName(Strings.Frolicflame); GameRegistry.registerItem(FrolicFlame, Strings.Frolicflame);
		MasterKeeperMaterial = EnumHelperClient.addToolMaterial(Strings.Masterkeeper, 3, -1, 6.0F, 13, 30); MasterKeeper = new ItemMasterKeeper(MasterKeeperMaterial).setFull3D().setUnlocalizedName(Strings.Masterkeeper); GameRegistry.registerItem(MasterKeeper, Strings.Masterkeeper);
		BrightCrestMaterial = EnumHelperClient.addToolMaterial(Strings.Brigthcrest, 3, -1, 6.0F, 7, 30); BrightCrest = new ItemBrightCrest(BrightCrestMaterial).setFull3D().setUnlocalizedName(Strings.Brigthcrest); GameRegistry.registerItem(BrightCrest, Strings.Brigthcrest);
		CrownUnlimitMaterial = EnumHelperClient.addToolMaterial(Strings.Crownunlimit, 3, -1, 6.0F, 10, 30); CrownUnlimit = new ItemCrownUnLimit(CrownUnlimitMaterial).setFull3D().setUnlocalizedName(Strings.Crownunlimit); GameRegistry.registerItem(CrownUnlimit, Strings.Crownunlimit);
		NoNameMaterial = EnumHelperClient.addToolMaterial(Strings.Noname, 3, -1, 6.0F, 12, 30); NoName = new ItemNoName(NoNameMaterial).setFull3D().setUnlocalizedName(Strings.Noname); GameRegistry.registerItem(NoName, Strings.Noname);
		VoidGearMaterial = EnumHelperClient.addToolMaterial(Strings.Voidgear, 3, -1, 6.0F, 11, 30); VoidGear = new ItemVoidGear(VoidGearMaterial).setFull3D().setUnlocalizedName(Strings.Voidgear); GameRegistry.registerItem(VoidGear, Strings.Voidgear);
		SweetStackMaterial = EnumHelperClient.addToolMaterial(Strings.Sweetstack, 3, -1, 6.0F, 8, 30); SweetStack = new ItemSweetStack(SweetStackMaterial).setFull3D().setUnlocalizedName(Strings.Sweetstack); GameRegistry.registerItem(SweetStack, Strings.Sweetstack);
		PixiePetalMaterial = EnumHelperClient.addToolMaterial(Strings.Pixiepetal, 3, -1, 6.0F, 6, 30); PixiePetal = new ItemPixiePetal(PixiePetalMaterial).setFull3D().setUnlocalizedName(Strings.Pixiepetal); GameRegistry.registerItem(PixiePetal, Strings.Pixiepetal);
		HyperdriveMaterial = EnumHelperClient.addToolMaterial(Strings.Hyperdrive, 3, -1, 6.0F, 8, 30); Hyperdrive = new ItemHyperDrive(HyperdriveMaterial).setFull3D().setUnlocalizedName(Strings.Hyperdrive); GameRegistry.registerItem(Hyperdrive, Strings.Hyperdrive);
		MarkOfAHeroMaterial = EnumHelperClient.addToolMaterial(Strings.Markofahero, 3, -1, 6.0F, 7, 30); MarkOfAHero = new ItemMarkOfAHero(MarkOfAHeroMaterial).setFull3D().setUnlocalizedName(Strings.Markofahero); GameRegistry.registerItem(MarkOfAHero, Strings.Markofahero);
		VictoryLineMaterial = EnumHelperClient.addToolMaterial(Strings.Victoryline, 3, -1, 6.0F, 7, 30); VictoryLine = new ItemVictoryLine(VictoryLineMaterial).setFull3D().setUnlocalizedName(Strings.Victoryline); GameRegistry.registerItem(VictoryLine, Strings.Victoryline);
		FairyStarsMaterial = EnumHelperClient.addToolMaterial(Strings.Fairystars, 3, -1, 6.0F, 6, 30); FairyStars = new ItemFairyStars(FairyStarsMaterial).setFull3D().setUnlocalizedName(Strings.Fairystars); GameRegistry.registerItem(FairyStars, Strings.Fairystars);
		StrokeOfMidnightMaterial = EnumHelperClient.addToolMaterial(Strings.Strokeofmidnight, 3, -1, 6.0F, 6, 30); StrokeOfMidnight = new ItemStrokeOfMidnight(StrokeOfMidnightMaterial).setFull3D().setUnlocalizedName(Strings.Strokeofmidnight); GameRegistry.registerItem(StrokeOfMidnight, Strings.Strokeofmidnight);
		ChaosRipperMaterial = EnumHelperClient.addToolMaterial(Strings.Chaosripper, 3, -1, 6.0F, 7, 30); ChaosRipper = new ItemChaosRipper(ChaosRipperMaterial).setFull3D().setUnlocalizedName(Strings.Chaosripper); GameRegistry.registerItem(ChaosRipper, Strings.Chaosripper);
		XehanortsKeybladeMaterial = EnumHelperClient.addToolMaterial(Strings.Xehanortskeyblade, 3, -1, 6.0F, 18, 30); XehanortsKeyblade = new ItemXehanortsKeyblade(XehanortsKeybladeMaterial).setFull3D().setUnlocalizedName(Strings.Xehanortskeyblade); GameRegistry.registerItem(XehanortsKeyblade, Strings.Xehanortskeyblade);
		DarkgnawMaterial = EnumHelperClient.addToolMaterial(Strings.Darkgnaw, 3, -1, 6.0F, 10, 30); Darkgnaw = new ItemDarkGnaw(DarkgnawMaterial).setFull3D().setUnlocalizedName(Strings.Darkgnaw); GameRegistry.registerItem(Darkgnaw, Strings.Darkgnaw);
		ZeroOneMaterial = EnumHelperClient.addToolMaterial(Strings.Zeroone, 3, -1, 6.0F, 12, 30); ZeroOne = new ItemZeroOne(ZeroOneMaterial).setFull3D().setUnlocalizedName(Strings.Zeroone); GameRegistry.registerItem(ZeroOne, Strings.Zeroone);
		DreamSwordMaterial = EnumHelperClient.addToolMaterial(Strings.Dreamsword, 3, -1, 6.0F, 5, 30); DreamSword = new ItemDreamSword(DreamSwordMaterial).setFull3D().setUnlocalizedName(Strings.Dreamsword); GameRegistry.registerItem(DreamSword, Strings.Dreamsword);
		AubadeMaterial = EnumHelperClient.addToolMaterial(Strings.Aubade, 3, -1, 6.0F, 9, 30); Aubade = new ItemAubade(AubadeMaterial).setFull3D().setUnlocalizedName(Strings.Aubade); GameRegistry.registerItem(Aubade, Strings.Aubade);
		UmbrellaMaterial = EnumHelperClient.addToolMaterial(Strings.Umbrella, 3, -1, 6.0F, 4, 30); Umbrella = new ItemUmbrella(UmbrellaMaterial).setFull3D().setUnlocalizedName(Strings.Umbrella); GameRegistry.registerItem(Umbrella, Strings.Umbrella);
		OmegaWeaponMaterial = EnumHelperClient.addToolMaterial(Strings.Omegaweapon, 3, -1, 6.0F, 13, 30); OmegaWeapon = new ItemOmegaWeapon(OmegaWeaponMaterial).setFull3D().setUnlocalizedName(Strings.Omegaweapon); GameRegistry.registerItem(OmegaWeapon, Strings.Omegaweapon);
		TwilightBlazeMaterial = EnumHelperClient.addToolMaterial(Strings.Twilightblaze, 3, -1, 6.0F, 11, 30); TwilightBlaze = new ItemTwilightBlaze(TwilightBlazeMaterial).setFull3D().setUnlocalizedName(Strings.Twilightblaze); GameRegistry.registerItem(TwilightBlaze, Strings.Twilightblaze);
		MaverickFlareMaterial = EnumHelperClient.addToolMaterial(Strings.Maverickflare, 3, -1, 6.0F, 9, 30); MaverickFlare = new ItemMaverickFlare(MaverickFlareMaterial).setFull3D().setUnlocalizedName(Strings.Maverickflare); GameRegistry.registerItem(MaverickFlare, Strings.Maverickflare);
		AstralBlastMaterial = EnumHelperClient.addToolMaterial(Strings.Astralblast, 3, -1, 6.0F, 9, 30); AstralBlast = new ItemAstralBlast(AstralBlastMaterial).setFull3D().setUnlocalizedName(Strings.Astralblast); GameRegistry.registerItem(AstralBlast, Strings.Astralblast);
		DarkerThanDarkMaterial = EnumHelperClient.addToolMaterial(Strings.Darkerthandark, 3, -1, 6.0F, 8, 30); DarkerThanDark = new ItemDarkerThanDark(DarkerThanDarkMaterial).setFull3D().setUnlocalizedName(Strings.Darkerthandark); GameRegistry.registerItem(DarkerThanDark, Strings.Darkerthandark);
		LunarEclipseMaterial = EnumHelperClient.addToolMaterial(Strings.Lunareclipse, 3, -1, 6.0F, 6, 30); LunarEclipse = new ItemLunarEclipse(LunarEclipseMaterial).setFull3D().setUnlocalizedName(Strings.Lunareclipse); GameRegistry.registerItem(LunarEclipse, Strings.Lunareclipse);
		SilentDirgeMaterial = EnumHelperClient.addToolMaterial(Strings.Silentdirge, 3, -1, 6.0F, 7, 30); SilentDirge = new ItemSilentDirge(SilentDirgeMaterial).setFull3D().setUnlocalizedName(Strings.Silentdirge); GameRegistry.registerItem(SilentDirge, Strings.Silentdirge);
		TotalEclipseMaterial = EnumHelperClient.addToolMaterial(Strings.Totaleclipse, 3, -1, 6.0F, 9, 30); TotalEclipse = new ItemTotalEclipse(TotalEclipseMaterial).setFull3D().setUnlocalizedName(Strings.Totaleclipse); GameRegistry.registerItem(TotalEclipse, Strings.Totaleclipse);
		GlimpseOfDarknessMaterial = EnumHelperClient.addToolMaterial(Strings.Glimpseofdarkness, 3, -1, 6.0F, 6, 30); GlimpseOfDarkness = new ItemGlimpseOfDarkness(GlimpseOfDarknessMaterial).setFull3D().setUnlocalizedName(Strings.Glimpseofdarkness); GameRegistry.registerItem(GlimpseOfDarkness, Strings.Glimpseofdarkness);
		MidnightRoarMaterial = EnumHelperClient.addToolMaterial(Strings.Midnightroar, 3, -1, 6.0F, 6, 30); MidnightRoar = new ItemMidnightRoar(MidnightRoarMaterial).setFull3D().setUnlocalizedName(Strings.Midnightroar); GameRegistry.registerItem(MidnightRoar, Strings.Midnightroar);
		RejectionOfFateMaterial = EnumHelperClient.addToolMaterial(Strings.Rejectionoffate, 3, -1, 6.0F, 8, 30); RejectionOfFate = new ItemRejectionOfFate(RejectionOfFateMaterial).setFull3D().setUnlocalizedName(Strings.Rejectionoffate); GameRegistry.registerItem(RejectionOfFate, Strings.Rejectionoffate);
		TrueLightsFlightMaterial = EnumHelperClient.addToolMaterial(Strings.Truelightsflight, 3, -1, 6.0F, 8, 30); TrueLightsFlight = new ItemTrueLightsFlight(TrueLightsFlightMaterial).setFull3D().setUnlocalizedName(Strings.Truelightsflight); GameRegistry.registerItem(TrueLightsFlight, Strings.Truelightsflight);
		LeviathanMaterial = EnumHelperClient.addToolMaterial(Strings.Leviathan, 3, -1, 6.0F, 9, 30); Leviathan = new ItemLeviathan(LeviathanMaterial).setFull3D().setUnlocalizedName(Strings.Leviathan); GameRegistry.registerItem(Leviathan, Strings.Leviathan);
		AbyssalTideMaterial = EnumHelperClient.addToolMaterial(Strings.Abyssaltide, 3, -1, 6.0F, 7, 30); AbyssalTide = new ItemAbyssalTide(AbyssalTideMaterial).setFull3D().setUnlocalizedName(Strings.Abyssaltide); GameRegistry.registerItem(AbyssalTide, Strings.Abyssaltide);
		CrownOfGuiltMaterial = EnumHelperClient.addToolMaterial(Strings.Crownofguilt, 3, -1, 6.0F, 9, 30); CrownOfGuilt = new ItemCrownOfGuilt(CrownOfGuiltMaterial).setFull3D().setUnlocalizedName(Strings.Crownofguilt); GameRegistry.registerItem(CrownOfGuilt, Strings.Crownofguilt);
		SignOfInnocenceMaterial = EnumHelperClient.addToolMaterial(Strings.Signofinnocence, 3, -1, 6.0F, 6, 30); SignOfInnocence = new ItemSignOfInnocence(SignOfInnocenceMaterial).setFull3D().setUnlocalizedName(Strings.Signofinnocence); GameRegistry.registerItem(SignOfInnocence, Strings.Signofinnocence);
		PainOfSolitudeMaterial = EnumHelperClient.addToolMaterial(Strings.Painofsolitude, 3, -1, 6.0F, 5, 30); PainOfSolitude = new ItemPainOfSolitude(PainOfSolitudeMaterial).setFull3D().setUnlocalizedName(Strings.Painofsolitude); GameRegistry.registerItem(PainOfSolitude, Strings.Painofsolitude);
		AbaddonPlasmaMaterial = EnumHelperClient.addToolMaterial(Strings.Abbadonplasma, 3, -1, 6.0F, 7, 30); AbaddonPlasma = new ItemAbaddonplasma(AbaddonPlasmaMaterial).setFull3D().setUnlocalizedName(Strings.Abbadonplasma); GameRegistry.registerItem(AbaddonPlasma, Strings.Abbadonplasma);
		OminousBlightMaterial = EnumHelperClient.addToolMaterial(Strings.Ominousblight, 3, -1, 6.0F, 10, 30); OminousBlight = new ItemOminousBlight(OminousBlightMaterial).setFull3D().setUnlocalizedName(Strings.Ominousblight); GameRegistry.registerItem(OminousBlight, Strings.Ominousblight);
		MissingAcheMaterial = EnumHelperClient.addToolMaterial(Strings.Missingache, 3, -1, 6.0F, 8, 30); MissingAche = new ItemMissingAche(MissingAcheMaterial).setFull3D().setUnlocalizedName(Strings.Missingache); GameRegistry.registerItem(MissingAche, Strings.Missingache);
		WinnersProofMaterial = EnumHelperClient.addToolMaterial(Strings.Winnersproof, 3, -1, 6.0F, 12, 30); WinnersProof = new ItemWinnersProof(WinnersProofMaterial).setFull3D().setUnlocalizedName(Strings.Winnersproof); GameRegistry.registerItem(WinnersProof, Strings.Winnersproof);
		FatalCrestMaterial = EnumHelperClient.addToolMaterial(Strings.Fatalcrest, 3, -1, 6.0F, 17, 30); FatalCrest = new ItemFatalCrest(FatalCrestMaterial).setFull3D().setUnlocalizedName(Strings.Fatalcrest); GameRegistry.registerItem(FatalCrest, Strings.Fatalcrest);
		TwoBecomesOneMaterial = EnumHelperClient.addToolMaterial(Strings.Twobecomesone, 3, -1, 6.0F, 20, 30); TwoBecomesOne = new ItemTwoBecomeOne(TwoBecomesOneMaterial).setFull3D().setUnlocalizedName(Strings.Twobecomesone); GameRegistry.registerItem(TwoBecomesOne, Strings.Twobecomesone);
		BondOfFlamesMaterial = EnumHelperClient.addToolMaterial(Strings.Bondofflame, 3, -1, 6.0F, 14, 30); BondOfFlames = new ItemBondOfFlame(BondOfFlamesMaterial).setFull3D().setUnlocalizedName(Strings.Bondofflame); GameRegistry.registerItem(BondOfFlames, Strings.Bondofflame);
		FenrirMaterial = EnumHelperClient.addToolMaterial(Strings.Fenrir, 3, -1, 6.0F, 24, 30); Fenrir = new ItemFenrir(FenrirMaterial).setFull3D().setUnlocalizedName(Strings.Fenrir); GameRegistry.registerItem(Fenrir, Strings.Fenrir);
		SleepingLionMaterial = EnumHelperClient.addToolMaterial(Strings.Sleepinglion, 3, -1, 6.0F, 13, 30); SleepingLion = new ItemSleepingLion(SleepingLionMaterial).setFull3D().setUnlocalizedName(Strings.Sleepinglion); GameRegistry.registerItem(SleepingLion, Strings.Sleepinglion);
		GuardianSoulMaterial = EnumHelperClient.addToolMaterial(Strings.Guardiansoul, 3, -1, 6.0F, 8, 30); GuardianSoul = new ItemGuardianSoul(GuardianSoulMaterial).setFull3D().setUnlocalizedName(Strings.Guardiansoul); GameRegistry.registerItem(GuardianSoul, Strings.Guardiansoul);
		GullwingMaterial = EnumHelperClient.addToolMaterial(Strings.Gullwing, 3, -1, 6.0F, 5, 30); Gullwing = new ItemGullWing(GullwingMaterial).setFull3D().setUnlocalizedName(Strings.Gullwing); GameRegistry.registerItem(Gullwing, Strings.Gullwing);
		PhotonDebuggerMaterial = EnumHelperClient.addToolMaterial(Strings.Photondebugger, 3, -1, 6.0F, 6, 30); PhotonDebugger = new ItemPhotonDebugger(PhotonDebuggerMaterial).setFull3D().setUnlocalizedName(Strings.Photondebugger); GameRegistry.registerItem(PhotonDebugger, Strings.Photondebugger);
		SweetMemoriesMaterial = EnumHelperClient.addToolMaterial(Strings.Sweetmemories, 3, -1, 6.0F, 7, 30); SweetMemories = new ItemSweetMemories(SweetMemoriesMaterial).setFull3D().setUnlocalizedName(Strings.Sweetmemories); GameRegistry.registerItem(SweetMemories, Strings.Sweetmemories);
		CircleOfLifeMaterial = EnumHelperClient.addToolMaterial(Strings.Circleoflife, 3, -1, 6.0F, 9, 30); CircleOfLife = new ItemCircleOfLife(CircleOfLifeMaterial).setFull3D().setUnlocalizedName(Strings.Circleoflife); GameRegistry.registerItem(CircleOfLife, Strings.Circleoflife);
		DecisivePumpkinMaterial = EnumHelperClient.addToolMaterial(Strings.Decisivepumpkin, 3, -1, 6.0F, 21, 30); DecisivePumpkin = new ItemDecisivePumpkin(DecisivePumpkinMaterial).setFull3D().setUnlocalizedName(Strings.Decisivepumpkin); GameRegistry.registerItem(DecisivePumpkin, Strings.Decisivepumpkin);
		WishingLampMaterial = EnumHelperClient.addToolMaterial(Strings.Wishinglamp, 3, -1, 6.0F, 7, 30); WishingLamp = new ItemWishingLamp(WishingLampMaterial).setFull3D().setUnlocalizedName(Strings.Wishinglamp); GameRegistry.registerItem(WishingLamp, Strings.Wishinglamp);
		FollowTheWindMaterial = EnumHelperClient.addToolMaterial(Strings.Followthewind, 3, -1, 6.0F, 8, 30); FollowTheWind = new ItemFollowTheWind(FollowTheWindMaterial).setFull3D().setUnlocalizedName(Strings.Followthewind); GameRegistry.registerItem(FollowTheWind, Strings.Followthewind);
		MysteriousAbyssMaterial = EnumHelperClient.addToolMaterial(Strings.Mysteriousabyss, 3, -1, 6.0F, 6, 30); MysteriousAbyss = new ItemMysteriousAbyss(MysteriousAbyssMaterial).setFull3D().setUnlocalizedName(Strings.Mysteriousabyss); GameRegistry.registerItem(MysteriousAbyss, Strings.Mysteriousabyss);
		MonochromeMaterial = EnumHelperClient.addToolMaterial(Strings.Monochrome, 3, -1, 6.0F, 6, 30); Monochrome = new ItemMonochrome(MonochromeMaterial).setFull3D().setUnlocalizedName(Strings.Monochrome); GameRegistry.registerItem(Monochrome, Strings.Monochrome);
		HerosCrestMaterial = EnumHelperClient.addToolMaterial(Strings.Heroscrest, 3, -1, 6.0F, 6, 30); HerosCrest = new ItemHerosCrest(HerosCrestMaterial).setFull3D().setUnlocalizedName(Strings.Heroscrest); GameRegistry.registerItem(HerosCrest, Strings.Heroscrest);
		RumblingRoseMaterial = EnumHelperClient.addToolMaterial(Strings.Rumblingrose, 3, -1, 6.0F, 11, 30); RumblingRose = new ItemRumblingRose(RumblingRoseMaterial).setFull3D().setUnlocalizedName(Strings.Rumblingrose); GameRegistry.registerItem(RumblingRose, Strings.Rumblingrose);
		HiddenDragonMaterial = EnumHelperClient.addToolMaterial(Strings.Hiddendragon, 3, -1, 6.0F, 7, 30); HiddenDragon = new ItemHiddenDragon(HiddenDragonMaterial).setFull3D().setUnlocalizedName(Strings.Hiddendragon); GameRegistry.registerItem(HiddenDragon, Strings.Hiddendragon);
		EndsOfEarthMaterial = EnumHelperClient.addToolMaterial(Strings.Endsofearth, 3, -1, 6.0F, 9, 30); EndsOfEarth = new ItemEndsOfEarth(EndsOfEarthMaterial).setFull3D().setUnlocalizedName(Strings.Endsofearth); GameRegistry.registerItem(EndsOfEarth, Strings.Endsofearth);
		StormfallMaterial = EnumHelperClient.addToolMaterial(Strings.Stormfall, 3, -1, 6.0F, 8, 30); Stormfall = new ItemStormFall(StormfallMaterial).setFull3D().setUnlocalizedName(Strings.Stormfall); GameRegistry.registerItem(Stormfall, Strings.Stormfall);
		DestinysEmbraceMaterial = EnumHelperClient.addToolMaterial(Strings.Destinysembrace, 3, -1, 6.0F, 7, 30); DestinysEmbrace = new ItemDestinysEmbrace(DestinysEmbraceMaterial).setFull3D().setUnlocalizedName(Strings.Destinysembrace); GameRegistry.registerItem(DestinysEmbrace, Strings.Destinysembrace);
		WayToDawnMaterial = EnumHelperClient.addToolMaterial(Strings.Waytodawn, 3, -1, 6.0F, 9, 30); WayToDawn = new ItemWayToDawn(WayToDawnMaterial).setFull3D().setUnlocalizedName(Strings.Waytodawn); GameRegistry.registerItem(WayToDawn, Strings.Waytodawn);
		OneWingedAngelMaterial = EnumHelperClient.addToolMaterial(Strings.Onewingedangel, 3, -1, 6.0F, 15, 30); OneWingedAngel = new ItemOneWingedAngel(OneWingedAngelMaterial).setFull3D().setUnlocalizedName(Strings.Onewingedangel); GameRegistry.registerItem(OneWingedAngel, Strings.Onewingedangel);
		DiamondDustMaterial = EnumHelperClient.addToolMaterial(Strings.Diamonddust, 3, -1, 6.0F, 10, 30); DiamondDust = new ItemDiamondDust(DiamondDustMaterial).setFull3D().setUnlocalizedName(Strings.Diamonddust); GameRegistry.registerItem(DiamondDust, Strings.Diamonddust);
		LionHeartMaterial = EnumHelperClient.addToolMaterial(Strings.Lionheart, 3, -1, 6.0F, 7, 30); LionHeart = new ItemLionHeart(LionHeartMaterial).setFull3D().setUnlocalizedName(Strings.Lionheart); GameRegistry.registerItem(LionHeart, Strings.Lionheart);
		MetalChocoboMaterial = EnumHelperClient.addToolMaterial(Strings.Metalchocobo, 3, -1, 6.0F, 7, 30); MetalChocobo = new ItemMetalChocobo(MetalChocoboMaterial).setFull3D().setUnlocalizedName(Strings.Metalchocobo); GameRegistry.registerItem(MetalChocobo, Strings.Metalchocobo);
		SpellBinderMaterial = EnumHelperClient.addToolMaterial(Strings.Spellbinder, 3, -1, 6.0F, 6, 30); SpellBinder = new ItemSpellbinder(SpellBinderMaterial).setFull3D().setUnlocalizedName(Strings.Spellbinder); GameRegistry.registerItem(SpellBinder, Strings.Spellbinder);
		DivineRoseMaterial = EnumHelperClient.addToolMaterial(Strings.Divinerose, 3, -1, 6.0F, 6, 30); DivineRose = new ItemDivineRose(DivineRoseMaterial).setFull3D().setUnlocalizedName(Strings.Divinerose); GameRegistry.registerItem(DivineRose, Strings.Divinerose);
		FairyHarpMaterial = EnumHelperClient.addToolMaterial(Strings.Fairyharp, 3, -1, 6.0F, 7, 30); FairyHarp = new ItemFairyHarp(FairyHarpMaterial).setFull3D().setUnlocalizedName(Strings.Fairyharp); GameRegistry.registerItem(FairyHarp, Strings.Fairyharp);
		CrabClawMaterial = EnumHelperClient.addToolMaterial(Strings.Crabclaw, 3, -1, 6.0F, 5, 30); CrabClaw = new ItemCrabClaw(CrabClawMaterial).setFull3D().setUnlocalizedName(Strings.Crabclaw); GameRegistry.registerItem(CrabClaw, Strings.Crabclaw);
		WishingStarMaterial = EnumHelperClient.addToolMaterial(Strings.Wishingstar, 3, -1, 6.0F, 9, 30); WishingStar = new ItemWishingStar(WishingStarMaterial).setFull3D().setUnlocalizedName(Strings.Wishingstar); GameRegistry.registerItem(WishingStar, Strings.Wishingstar);
		PumpkinHeadMaterial = EnumHelperClient.addToolMaterial(Strings.Pumpkinhead, 3, -1, 6.0F, 10, 30); PumpkinHead = new ItemPumpkinHead(PumpkinHeadMaterial).setFull3D().setUnlocalizedName(Strings.Pumpkinhead); GameRegistry.registerItem(PumpkinHead, Strings.Pumpkinhead);
		ThreeWishesMaterial = EnumHelperClient.addToolMaterial(Strings.Threewishes, 3, -1, 6.0F, 8, 30); ThreeWishes = new ItemThreeWishes(ThreeWishesMaterial).setFull3D().setUnlocalizedName(Strings.Threewishes); GameRegistry.registerItem(ThreeWishes, Strings.Threewishes);
		JungleKingMaterial = EnumHelperClient.addToolMaterial(Strings.Jungleking, 3, -1, 6.0F, 7, 30); JungleKing = new ItemJungleKing(JungleKingMaterial).setFull3D().setUnlocalizedName(Strings.Jungleking); GameRegistry.registerItem(JungleKing, Strings.Jungleking);
		OlympiaMaterial = EnumHelperClient.addToolMaterial(Strings.Olympia, 3, -1, 6.0F, 9, 30); Olympia = new ItemOlympia(OlympiaMaterial).setFull3D().setUnlocalizedName(Strings.Olympia); GameRegistry.registerItem(Olympia, Strings.Olympia);
		LadyLuckMaterial = EnumHelperClient.addToolMaterial(Strings.Ladyluck, 3, -1, 6.0F, 6, 30); LadyLuck = new ItemLadyLuck(LadyLuckMaterial).setFull3D().setUnlocalizedName(Strings.Ladyluck); GameRegistry.registerItem(LadyLuck, Strings.Ladyluck);
		PeoplesHeartsMaterial = EnumHelperClient.addToolMaterial(Strings.Peopleshearts, 3, -1, 6.0F, 13, 30); PeoplesHearts = new ItemKeybladeOfPeoplesHearts(PeoplesHeartsMaterial).setFull3D().setUnlocalizedName(Strings.Peopleshearts); GameRegistry.registerItem(PeoplesHearts, Strings.Peopleshearts);
		UltimaWeaopnMaterial = EnumHelperClient.addToolMaterial(Strings.Ultimaweapon, 3, -1, 6.0F, 18, 30); UltimaWeaopon = new ItemUltimaWeapon(UltimaWeaopnMaterial).setFull3D().setUnlocalizedName(Strings.Ultimaweapon); GameRegistry.registerItem(UltimaWeaopon, Strings.Ultimaweapon);
		TreasureTroveMaterial = EnumHelperClient.addToolMaterial(Strings.Treasuretrove, 3, -1, 6.0F, 7, 30); TreasureTrove = new ItemTreasureTrove(TreasureTroveMaterial).setFull3D().setUnlocalizedName(Strings.Treasuretrove); GameRegistry.registerItem(TreasureTrove, Strings.Treasuretrove);
		StarseekerMaterial = EnumHelperClient.addToolMaterial(Strings.Starseeker, 3, -1, 6.0F, 12, 30); StarSeeker = new ItemStarseeker(StarseekerMaterial).setFull3D().setUnlocalizedName(Strings.Starseeker); GameRegistry.registerItem(StarSeeker, Strings.Starseeker);
		KingdomKeyMaterial = EnumHelperClient.addToolMaterial(Strings.KingdomKey, 3, -1, 6.0F, 5, 30); KingdomKey = new ItemKingdomKey(KingdomKeyMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKey); GameRegistry.registerItem(KingdomKey, Strings.KingdomKey);
		KingdomKeyDMaterial = EnumHelperClient.addToolMaterial(Strings.KingdomKeyD, 3, -1, 6.0F, 5, 30); KingdomKeyD = new ItemKingdomKeyD(KingdomKeyDMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKeyD); GameRegistry.registerItem(KingdomKeyD, Strings.KingdomKeyD);
		OathkeeperMaterial = EnumHelperClient.addToolMaterial(Strings.Oathkeeper, 3, -1, 6.0F, 11, 30); Oathkeeper = new ItemOathKeeper(OathkeeperMaterial).setFull3D().setUnlocalizedName(Strings.Oathkeeper); GameRegistry.registerItem(Oathkeeper, Strings.Oathkeeper);
		OblivionMaterial = EnumHelperClient.addToolMaterial(Strings.Oblivion, 3, -1, 6.0F, 13, 30); Oblivion = new ItemOblivion(OblivionMaterial).setFull3D().setUnlocalizedName(Strings.Oblivion); GameRegistry.registerItem(Oblivion, Strings.Oblivion);
		WaywardWindMaterial = EnumHelperClient.addToolMaterial(Strings.Waywardwind, 3, -1, 6.0F, 8, 30); WaywardWind = new ItemWaywardWind(WaywardWindMaterial).setFull3D().setUnlocalizedName(Strings.Waywardwind); GameRegistry.registerItem(WaywardWind, Strings.Waywardwind);
		EarthshakerMaterial = EnumHelperClient.addToolMaterial(Strings.Earthshaker, 3, -1, 6.0F, 10, 30); EarthShaker = new ItemEarthShaker(EarthshakerMaterial).setFull3D().setUnlocalizedName(Strings.Earthshaker); GameRegistry.registerItem(EarthShaker, Strings.Earthshaker);
		RainfellMaterial = EnumHelperClient.addToolMaterial(Strings.Rainfell, 3, -1, 6.0F, 6, 30); Rainfell = new ItemRainFell(RainfellMaterial).setFull3D().setUnlocalizedName(Strings.Rainfell); GameRegistry.registerItem(Rainfell, Strings.Rainfell);
		StarlightMaterial = EnumHelperClient.addToolMaterial(Strings.Starlight, 3, -1, 6.0F, 6, 30); StarLight = new ItemStarLight(StarlightMaterial).setFull3D().setUnlocalizedName(Strings.Starlight); GameRegistry.registerItem(StarLight, Strings.Starlight);
		SoulEaterMaterial = EnumHelperClient.addToolMaterial(Strings.Souleater, 3, -1, 6.0F, 12, 30); SoulEater = new ItemSoulEater(SoulEaterMaterial).setFull3D().setUnlocalizedName(Strings.Souleater); GameRegistry.registerItem(SoulEater, Strings.Souleater);
		VulpeusChain = new ItemVulpeusChain().setUnlocalizedName(Strings.VulpeusChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(VulpeusChain, Strings.VulpeusChain);
		UrsusChain = new ItemUrsusChain().setUnlocalizedName(Strings.UrsusChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(UrsusChain, Strings.UrsusChain);
		UnicornisChain = new ItemUnicornisChain().setUnlocalizedName(Strings.UnicornisChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(UnicornisChain, Strings.UnicornisChain);
		LeopardosChain = new ItemLeopardosChain().setUnlocalizedName(Strings.LeopardosChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LeopardosChain, Strings.LeopardosChain);
		AnguisChain = new ItemAnguisChain().setUnlocalizedName(Strings.AnguisChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(AnguisChain, Strings.AnguisChain);
		LeasKeybladeChain = new ItemLeasKeybladeChain().setUnlocalizedName(Strings.LeaskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LeasKeybladeChain, Strings.LeaskeybladeChain);
		YoungXehanortsKeybladeChain = new ItemYoungXehanortChain().setUnlocalizedName(Strings.YoungxehanortskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(YoungXehanortsKeybladeChain, Strings.YoungxehanortskeybladeChain);
		OceanRageChain = new ItemOceanRageChain().setUnlocalizedName(Strings.OceanrageChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(OceanRageChain, Strings.OceanrageChain);
		EndOfPainChain = new ItemEndOfPainChain().setUnlocalizedName(Strings.EndofpainChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(EndOfPainChain, Strings.EndofpainChain);
		UnboundChain = new ItemUnboundChain().setUnlocalizedName(Strings.UnboundChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(UnboundChain, Strings.UnboundChain);
		SweetDreamsChain = new ItemSweetDreamsChain().setUnlocalizedName(Strings.SweetdreamsChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SweetDreamsChain, Strings.SweetdreamsChain);
		DiveWingChain = new ItemDiveWingChain().setUnlocalizedName(Strings.DivewingChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DiveWingChain, Strings.DivewingChain);
		CounterpointChain = new ItemCounterPointChain().setUnlocalizedName(Strings.CounterpointChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(CounterpointChain, Strings.CounterpointChain);
		AllForOneChain = new ItemAllForOneChain().setUnlocalizedName(Strings.AllforoneChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(AllForOneChain, Strings.AllforoneChain);
		KnockoutPunchChain = new ItemKnockoutPunchChain().setUnlocalizedName(Strings.KnockoutpunchChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(KnockoutPunchChain, Strings.KnockoutpunchChain);
		FerrisGearChain = new ItemFerrisGearChain().setUnlocalizedName(Strings.FerrisgearChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(FerrisGearChain, Strings.FerrisgearChain);
		DualDiscChain = new ItemDualDiscChain().setUnlocalizedName(Strings.DualdiscChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DualDiscChain, Strings.DualdiscChain);
		GuardianBellChain = new ItemGuardianBellChain().setUnlocalizedName(Strings.GuardianbellChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(GuardianBellChain, Strings.GuardianbellChain);
		SkullNoiseChain = new ItemSkullNoiseChain().setUnlocalizedName(Strings.SkullnoiseChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SkullNoiseChain, Strings.SkullnoiseChain);
		WoodenKeybladeChain = new ItemWoodenKeybladeChain().setUnlocalizedName(Strings.WoodenkeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(WoodenKeybladeChain, Strings.WoodenkeybladeChain);
		KyebladeBrokenChain = new ItemKyeBladeBrokenChain().setUnlocalizedName(Strings.KyebladebrokenChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(KyebladeBrokenChain, Strings.KyebladebrokenChain);
		KyebladeChain = new ItemKyeBladeChain().setUnlocalizedName(Strings.KyebladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(KyebladeChain, Strings.KyebladeChain);
		LightSeekerChain = new ItemLightSeekerChain().setUnlocalizedName(Strings.LightseekerChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LightSeekerChain, Strings.LightseekerChain);
		LostMemoryChain = new ItemLostMemoryChain().setUnlocalizedName(Strings.LostmemoryChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LostMemoryChain, Strings.LostmemoryChain);
		FrolicFlameChain = new ItemFrolicFlameChain().setUnlocalizedName(Strings.FrolicflameChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(FrolicFlameChain, Strings.FrolicflameChain);
		MasterKeeperChain = new ItemMasterKeeperChain().setUnlocalizedName(Strings.MasterkeeperChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MasterKeeperChain, Strings.MasterkeeperChain);
		BrightCrestChain = new ItemBrightCrestChain().setUnlocalizedName(Strings.BrigthcrestChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(BrightCrestChain, Strings.BrigthcrestChain);
		CrownUnlimitChain = new ItemCrownUnlimitChain().setUnlocalizedName(Strings.CrownunlimitChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(CrownUnlimitChain, Strings.CrownunlimitChain);
		NoNameChain = new ItemNoNameChain().setUnlocalizedName(Strings.NonameChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(NoNameChain, Strings.NonameChain);
		VoidGearChain = new ItemVoidGearChain().setUnlocalizedName(Strings.VoidgearChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(VoidGearChain, Strings.VoidgearChain);
		SweetStackChain = new ItemSweetStackChain().setUnlocalizedName(Strings.SweetstackChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SweetStackChain, Strings.SweetstackChain);
		PixiePetalChain = new ItemPixiePetalChain().setUnlocalizedName(Strings.PixiepetalChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(PixiePetalChain, Strings.PixiepetalChain);
		HyperdriveChain = new ItemHyperDriveChain().setUnlocalizedName(Strings.HyperdriveChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(HyperdriveChain, Strings.HyperdriveChain);
		MarkOfAHeroChain = new ItemMarkOfAHeroChain().setUnlocalizedName(Strings.MarkofaheroChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MarkOfAHeroChain, Strings.MarkofaheroChain);
		VictoryLineChain = new ItemVictoryLineChain().setUnlocalizedName(Strings.VictorylineChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(VictoryLineChain, Strings.VictorylineChain);
		FairyStarsChain = new ItemFairyStarsChain().setUnlocalizedName(Strings.FairystarsChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(FairyStarsChain, Strings.FairystarsChain);
		StrokeOfMidnightChain = new ItemStrokeOfMidnightChain().setUnlocalizedName(Strings.StrokeofmidnightChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(StrokeOfMidnightChain, Strings.StrokeofmidnightChain);
		ChaosRipperChain = new ItemChaosRipperChain().setUnlocalizedName(Strings.ChaosripperChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(ChaosRipperChain, Strings.ChaosripperChain);
		XehanortsKeybladeChain = new ItemXehanortsKeybladeChain().setUnlocalizedName(Strings.XehanortskeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(XehanortsKeybladeChain, Strings.XehanortskeybladeChain);
		DarkgnawChain = new ItemDarkGnawChain().setUnlocalizedName(Strings.DarkgnawChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DarkgnawChain, Strings.DarkgnawChain);
		ZeroOneChain = new ItemZeroOneChain().setUnlocalizedName(Strings.ZerooneChain).setCreativeTab(KingdomKeys.KHRECODEDTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(ZeroOneChain, Strings.ZerooneChain);
		DreamSwordChain = new ItemDreamSwordChain().setUnlocalizedName(Strings.DreamswordChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DreamSwordChain, Strings.DreamswordChain);
		AubadeChain = new ItemAubadeChain().setUnlocalizedName(Strings.AubadeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(AubadeChain, Strings.AubadeChain);
		UmbrellaChain = new ItemUmbrellaChain().setUnlocalizedName(Strings.UmbrellaChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(UmbrellaChain, Strings.UmbrellaChain);
		OmegaWeaponChain = new ItemOmegaWeaponChain().setUnlocalizedName(Strings.OmegaweaponChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(OmegaWeaponChain, Strings.OmegaweaponChain);
		TwilightBlazeChain = new ItemTwilightBlazeChain().setUnlocalizedName(Strings.TwilightblazeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(TwilightBlazeChain, Strings.TwilightblazeChain);
		MaverickFlareChain = new ItemMaverickFlareChain().setUnlocalizedName(Strings.MaverickflareChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MaverickFlareChain, Strings.MaverickflareChain);
		AstralBlastChain = new ItemAstralBlastChain().setUnlocalizedName(Strings.AstralblastChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(AstralBlastChain, Strings.AstralblastChain);
		DarkerThanDarkChain = new ItemDarkerThanDarkChain().setUnlocalizedName(Strings.DarkerthandarkChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DarkerThanDarkChain, Strings.DarkerthandarkChain);
		LunarEclipseChain = new ItemLunarEclipseChain().setUnlocalizedName(Strings.LunareclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LunarEclipseChain, Strings.LunareclipseChain);
		SilentDirgeChain = new ItemSilentDirgeChain().setUnlocalizedName(Strings.SilentdirgeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SilentDirgeChain, Strings.SilentdirgeChain);
		TotalEclipseChain = new ItemTotalEclipseChain().setUnlocalizedName(Strings.TotaleclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(TotalEclipseChain, Strings.TotaleclipseChain);
		GlimpseOfDarknessChain = new ItemGlimpseOfDarknessChain().setUnlocalizedName(Strings.GlimpseofdarknessChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(GlimpseOfDarknessChain, Strings.GlimpseofdarknessChain);
		MidnightRoarChain = new ItemMidnightRoarChain().setUnlocalizedName(Strings.MidnightroarChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MidnightRoarChain, Strings.MidnightroarChain);
		RejectionOfFateChain = new ItemRejectionOfFateChain().setUnlocalizedName(Strings.RejectionoffateChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(RejectionOfFateChain, Strings.RejectionoffateChain);
		TrueLightsFlightChain = new ItemTrueLightsFlightChain().setUnlocalizedName(Strings.TruelightsflightChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(TrueLightsFlightChain, Strings.TruelightsflightChain);
		LeviathanChain = new ItemLeviathanChain().setUnlocalizedName(Strings.LeviathanChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LeviathanChain, Strings.LeviathanChain);
		AbyssalTideChain = new ItemAbyssalTideChain().setUnlocalizedName(Strings.AbyssaltideChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(AbyssalTideChain, Strings.AbyssaltideChain);
		CrownOfGuiltChain = new ItemCrownOfGuiltChain().setUnlocalizedName(Strings.CrownofguiltChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(CrownOfGuiltChain, Strings.CrownofguiltChain);
		SignOfInnocenceChain = new ItemSignOfInnocenceChain().setUnlocalizedName(Strings.SignofinnocenceChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SignOfInnocenceChain, Strings.SignofinnocenceChain);
		PainOfSolitudeChain = new ItemPainOfSolitudeChain().setUnlocalizedName(Strings.PainofsolitudeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(PainOfSolitudeChain, Strings.PainofsolitudeChain);
		AbaddonPlasmaChain = new ItemAbaddonPlasmaChain().setUnlocalizedName(Strings.AbbadonplasmaChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(AbaddonPlasmaChain, Strings.AbbadonplasmaChain);
		OminousBlightChain = new ItemOminousBlightChain().setUnlocalizedName(Strings.OminousblightChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(OminousBlightChain, Strings.OminousblightChain);
		MissingAcheChain = new ItemMissingAcheChain().setUnlocalizedName(Strings.MissingacheChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MissingAcheChain, Strings.MissingacheChain);
		WinnersProofChain = new ItemWinnersProofChain().setUnlocalizedName(Strings.WinnersproofChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(WinnersProofChain, Strings.WinnersproofChain);
		FatalCrestChain = new ItemFatalCrestChain().setUnlocalizedName(Strings.FatalcrestChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(FatalCrestChain, Strings.FatalcrestChain);
		TwoBecomesOneChain = new ItemTwoBecomeOneChain().setUnlocalizedName(Strings.TwobecomesoneChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(TwoBecomesOneChain, Strings.TwobecomesoneChain);
		BondOfFlamesChain = new ItemBondOfFlameChain().setUnlocalizedName(Strings.BondofflameChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(BondOfFlamesChain, Strings.BondofflameChain);
		FenrirChain = new ItemFenrirChain().setUnlocalizedName(Strings.FenrirChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(FenrirChain, Strings.FenrirChain);
		SleepingLionChain = new ItemSleepingLionChain().setUnlocalizedName(Strings.SleepinglionChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SleepingLionChain, Strings.SleepinglionChain);
		GuardianSoulChain = new ItemGuardianSoulChain().setUnlocalizedName(Strings.GuardiansoulChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(GuardianSoulChain, Strings.GuardiansoulChain);
		GullWingChain = new ItemGullWingChain().setUnlocalizedName(Strings.GullwingChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(GullWingChain, Strings.GullwingChain);
		PhotonDebuggerChain = new ItemPhotonDebuggerChain().setUnlocalizedName(Strings.PhotondebuggerChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(PhotonDebuggerChain, Strings.PhotondebuggerChain);
		SweetMemoriesChain = new ItemSweetMemoriesChain().setUnlocalizedName(Strings.SweetmemoriesChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SweetMemoriesChain, Strings.SweetmemoriesChain);
		CircleOfLifeChain = new ItemCircleOfLifeChain().setUnlocalizedName(Strings.CircleoflifeChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(CircleOfLifeChain, Strings.CircleoflifeChain);
		DecisivePumpkinChain = new ItemDecisivePumpkinChain().setUnlocalizedName(Strings.DecisivepumpkinChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DecisivePumpkinChain, Strings.DecisivepumpkinChain);
		WishingLampChain = new ItemWishingLampChain().setUnlocalizedName(Strings.WishinglampChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(WishingLampChain, Strings.WishinglampChain);
		FollowTheWindChain = new ItemFollowTheWindChain().setUnlocalizedName(Strings.FollowthewindChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(FollowTheWindChain, Strings.FollowthewindChain);
		MysteriousAbyssChain = new ItemMysteriousAbyssChain().setUnlocalizedName(Strings.MysteriousabyssChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MysteriousAbyssChain, Strings.MysteriousabyssChain);
		MonochromeChain = new ItemMonochromeChain().setUnlocalizedName(Strings.MonochromeChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MonochromeChain, Strings.MonochromeChain);
		HerosCrestChain = new ItemHerosCrestChain().setUnlocalizedName(Strings.HeroscrestChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(HerosCrestChain, Strings.HeroscrestChain);
		RumblingRoseChain = new ItemRumblingRoseChain().setUnlocalizedName(Strings.RumblingroseChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(RumblingRoseChain, Strings.RumblingroseChain);
		HiddenDragonChain = new ItemHiddenDragonChain().setUnlocalizedName(Strings.HiddendragonChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(HiddenDragonChain, Strings.HiddendragonChain);
		EndsOfEarthChain = new ItemEndsOfEarthChain().setUnlocalizedName(Strings.EndsofearthChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(EndsOfEarthChain, Strings.EndsofearthChain);
		StormfallChain = new ItemStormFallChain().setUnlocalizedName(Strings.StormfallChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(StormfallChain, Strings.StormfallChain);
		DestinysEmbraceChain = new ItemDestinysEmbraceChain().setUnlocalizedName(Strings.DestinysembraceChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DestinysEmbraceChain, Strings.DestinysembraceChain);
		WayToDawnChain = new ItemWayToTheDawnChain().setUnlocalizedName(Strings.WaytodawnChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(WayToDawnChain, Strings.WaytodawnChain);
		OneWingedAngelChain = new ItemOneWingedAngelChain().setUnlocalizedName(Strings.OnewingedangelChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(OneWingedAngelChain, Strings.OnewingedangelChain);
		DiamondDustChain = new ItemDiamondDustChain().setUnlocalizedName(Strings.DiamonddustChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DiamondDustChain, Strings.DiamonddustChain);
		LionHeartChain = new ItemLionHeartChain().setUnlocalizedName(Strings.LionheartChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LionHeartChain, Strings.LionheartChain);
		MetalChocoboChain = new ItemMetalChocoboChain().setUnlocalizedName(Strings.MetalchocoboChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MetalChocoboChain, Strings.MetalchocoboChain);
		SpellBinderChain = new ItemSpellBinderChain().setUnlocalizedName(Strings.SpellbinderChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SpellBinderChain, Strings.SpellbinderChain);
		DivineRoseChain = new ItemDivineRoseChain().setUnlocalizedName(Strings.DivineroseChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DivineRoseChain, Strings.DivineroseChain);
		FairyHarpChain = new ItemFairyHarpChain().setUnlocalizedName(Strings.FairyharpChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(FairyHarpChain, Strings.FairyharpChain);
		CrabClawChain = new ItemCrabClawChain().setUnlocalizedName(Strings.CrabclawChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(CrabClawChain, Strings.CrabclawChain);
		WishingStarChain = new ItemWishingStarChain().setUnlocalizedName(Strings.WishingstarChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(WishingStarChain, Strings.WishingstarChain);
		PumpkinHeadChain = new ItemPumpkinHeadChain().setUnlocalizedName(Strings.PumpkinheadChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(PumpkinHeadChain, Strings.PumpkinheadChain);
		ThreeWishesChain = new ItemThreeWishesChain().setUnlocalizedName(Strings.ThreewishesChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(ThreeWishesChain, Strings.ThreewishesChain);
		JungleKingChain = new ItemJunglekingChain().setUnlocalizedName(Strings.JunglekingChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(JungleKingChain, Strings.JunglekingChain);
		OlympiaChain = new ItemOlympiaChain().setUnlocalizedName(Strings.OlympiaChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(OlympiaChain, Strings.OlympiaChain);
		LadyLuckChain = new ItemLadyLuckChain().setUnlocalizedName(Strings.LadyluckChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(LadyLuckChain, Strings.LadyluckChain);
		PeoplesHeartsChain = new ItemPeoplesHeartsChain().setUnlocalizedName(Strings.PeoplesheartsChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(PeoplesHeartsChain, Strings.PeoplesheartsChain);
		UltimaWeaponChain = new ItemUltimaWeaponChain().setUnlocalizedName(Strings.UltimaweaponChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(UltimaWeaponChain, Strings.UltimaweaponChain);
		TreasureTroveChain = new ItemTreasureTroveChain().setUnlocalizedName(Strings.TreasuretroveChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(TreasureTroveChain, Strings.TreasuretroveChain);
		StarseekerChain = new ItemStarSeekerChain().setUnlocalizedName(Strings.StarseekerChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(StarseekerChain, Strings.StarseekerChain);
		SoulEaterChain = new ItemSoulEaterChain().setUnlocalizedName(Strings.SouleaterChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(SoulEaterChain, Strings.SouleaterChain);
		StarlightChain = new ItemStarlightChain().setUnlocalizedName(Strings.StarlightChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(StarlightChain, Strings.StarlightChain);
		KingdomKeyChain = new ItemKingdomKeyChain().setUnlocalizedName(Strings.KingdomKeyChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(KingdomKeyChain, Strings.KingdomKeyChain);
		KingdomKeyDChain = new ItemKingdomKeyDChain().setUnlocalizedName(Strings.KingdomKeyDChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(KingdomKeyDChain, Strings.KingdomKeyDChain);
		OathkeeperChain = new ItemOathkeeperChain().setUnlocalizedName(Strings.OathkeeperChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(OathkeeperChain, Strings.OathkeeperChain);
		OblivionChain = new ItemOblivionChain().setUnlocalizedName(Strings.OblivionChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(OblivionChain, Strings.OblivionChain);
		WaywardWindChain = new ItemWaywardWindChain().setUnlocalizedName(Strings.WaywardwindChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(WaywardWindChain, Strings.WaywardwindChain);
		EarthShakerChain = new ItemEarthShakerChain().setUnlocalizedName(Strings.EarthshakerChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(EarthShakerChain, Strings.EarthshakerChain);
		RainfellChain = new ItemRainFellChain().setUnlocalizedName(Strings.RainfellChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(RainfellChain, Strings.RainfellChain);

		//Org XIII Weapons
		EternalFlamesMaterial = EnumHelperClient.addToolMaterial(Strings.EternalFlames, 3, -1, 6.0F, 4, 30); EternalFlames = new ItemEternalFlames(EternalFlamesMaterial).setFull3D().setUnlocalizedName(Strings.EternalFlames); GameRegistry.registerItem(EternalFlames, Strings.EternalFlames);
		BookOfRetributionMaterial = EnumHelperClient.addToolMaterial(Strings.BookOfRetribution, 3, -1, 6.0F, 2, 30); BookOfRetribution = new ItemBookOfRetribution(BookOfRetributionMaterial).setFull3D().setUnlocalizedName(Strings.BookOfRetribution); GameRegistry.registerItem(BookOfRetribution, Strings.BookOfRetribution);
		InterdictionMaterial = EnumHelperClient.addToolMaterial(Strings.Interdiction, 3, -1, 6.0F, 6, 30); Interdiction = new ItemInterdiction(InterdictionMaterial).setFull3D().setUnlocalizedName(Strings.Interdiction); GameRegistry.registerItem(Interdiction, Strings.Interdiction);
		SharpShooterMaterial = EnumHelperClient.addToolMaterial(Strings.SharpShooter, 3, -1, 6.0F, 0, 30); SharpShooter = new ItemSharpShooter(SharpShooterMaterial).setFull3D().setUnlocalizedName(Strings.SharpShooter); GameRegistry.registerItem(SharpShooter, Strings.SharpShooter);
		LindWormMaterial = EnumHelperClient.addToolMaterial(Strings.LindWorm, 3, -1, 6.0F, 3, 30); LindWorm = new ItemLindWorm(LindWormMaterial).setFull3D().setUnlocalizedName(Strings.LindWorm); GameRegistry.registerItem(LindWorm, Strings.LindWorm);
		FrozenPrideMaterial = EnumHelperClient.addToolMaterial(Strings.FrozenPride, 3, -1, 6.0F, 6, 30); FrozenPride = new ItemFrozenPride(FrozenPrideMaterial).setFull3D().setUnlocalizedName(Strings.FrozenPride); GameRegistry.registerItem(FrozenPride, Strings.FrozenPride);
		SkySplitterMaterial = EnumHelperClient.addToolMaterial(Strings.Skysplitter, 3, -1, 6.0F, 20, 30); SkySplitter = new ItemSkySplitter(SkySplitterMaterial).setFull3D().setUnlocalizedName(Strings.Skysplitter); GameRegistry.registerItem(SkySplitter, Strings.Skysplitter);
		LunaticMaterial = EnumHelperClient.addToolMaterial(Strings.Lunatic, 3, -1, 6.0F, 8, 30); Lunatic = new ItemLunatic(LunaticMaterial).setFull3D().setUnlocalizedName(Strings.Lunatic); GameRegistry.registerItem(Lunatic, Strings.Lunatic);
		ArpeggioMaterial = EnumHelperClient.addToolMaterial(Strings.Arpeggio, 3, -1, 6.0F, 5, 30); Arpeggio = new ItemArpeggio(ArpeggioMaterial).setFull3D().setUnlocalizedName(Strings.Arpeggio); GameRegistry.registerItem(Arpeggio, Strings.Arpeggio);
		FairGameMaterial = EnumHelperClient.addToolMaterial(Strings.FairGame, 3, -1, 6.0F, 2, 30); FairGame = new ItemFairGame(FairGameMaterial).setFull3D().setUnlocalizedName(Strings.FairGame); GameRegistry.registerItem(FairGame, Strings.FairGame);
		GracefulDahliaMaterial = EnumHelperClient.addToolMaterial(Strings.GracefulDahlia, 3, -1, 6.0F, 12, 30); GracefulDahlia = new ItemGracefulDahlia(GracefulDahliaMaterial).setFull3D().setUnlocalizedName(Strings.GracefulDahlia); GameRegistry.registerItem(GracefulDahlia, Strings.GracefulDahlia);
		FoudreMaterial = EnumHelperClient.addToolMaterial(Strings.Foudre, 3, -1, 6.0F, 9, 30); Foudre = new ItemFoudre(FoudreMaterial).setFull3D().setUnlocalizedName(Strings.Foudre); GameRegistry.registerItem(Foudre, Strings.Foudre);
	}

	public static void initRecipes(){
		MythrilShardRecipe = new ItemMythrilShardRecipe().setUnlocalizedName(Strings.MythrilShardRecipe).setCreativeTab(KingdomKeys.KKSMTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MythrilShardRecipe, Strings.MythrilShardRecipe);
		MythrilStoneRecipe = new ItemMythrilStoneRecipe().setUnlocalizedName(Strings.MythrilStoneRecipe).setCreativeTab(KingdomKeys.KKSMTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MythrilStoneRecipe, Strings.MythrilStoneRecipe);
		MythrilGemRecipe = new ItemMythrilGemRecipe().setUnlocalizedName(Strings.MythrilGemRecipe).setCreativeTab(KingdomKeys.KKSMTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MythrilGemRecipe, Strings.MythrilGemRecipe);
		MythrilCrystalRecipe = new ItemMythrilCrystalRecipe().setUnlocalizedName(Strings.MythrilCrystalRecipe).setCreativeTab(KingdomKeys.KKSMTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(MythrilCrystalRecipe, Strings.MythrilCrystalRecipe);

		DarkMatterRecipe = new ItemDarkMatterRecipe().setUnlocalizedName(Strings.DarkMatterRecipe).setCreativeTab(KingdomKeys.KKSMTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DarkMatterRecipe, Strings.DarkMatterRecipe);
		VoidedKnowledge = new ItemVoidedKnowledge().setUnlocalizedName(Strings.VoidedKnowledge).setCreativeTab(KingdomKeys.KKTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(VoidedKnowledge, Strings.VoidedKnowledge);
		DarkKnowledge = new ItemDarkKnowledge().setUnlocalizedName(Strings.DarkKnowledge).setCreativeTab(KingdomKeys.KKTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(DarkKnowledge, Strings.DarkKnowledge);
		
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
		if(ConfigBooleans.discSpawn == true){
			//DISC 1 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
	
			//DISC 2 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
	
			//DISC 3 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
	
			//DISC 4 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
	
			//DISC 5 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
	
			//DISC 6 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
	
			//DISC 7 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
	
			//DISC 8 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
	
			//DISC 9 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
	
			//DISC 10 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc10),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc10),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc10),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc10),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc10),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc10),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc10),0,1,15));
	
			//DISC 11 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc11),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc11),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc11),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc11),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc11),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc11),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc11),0,1,15));
	
			//DISC 12 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc12),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc12),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc12),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc12),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc12),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc12),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc12),0,1,15));
	
			//DISC 13 CHEST GENERATION
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc13),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc13),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc13),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc13),0,1,15));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc13),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc13),0,1,5));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc13),0,1,15));
		}
		//Keyblade Recipes chest generation
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));

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

		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));


	}

	public static void initOthers(){
		Disc1 = new ItemDisc1(Strings.Disc1).setUnlocalizedName(Strings.Disc1); GameRegistry.registerItem(Disc1, Strings.Disc1);
		Disc2 = new ItemDisc2(Strings.Disc2).setUnlocalizedName(Strings.Disc2); GameRegistry.registerItem(Disc2, Strings.Disc2);
		Disc3 = new ItemDisc3(Strings.Disc3).setUnlocalizedName(Strings.Disc3); GameRegistry.registerItem(Disc3, Strings.Disc3);
		Disc4 = new ItemDisc4(Strings.Disc4).setUnlocalizedName(Strings.Disc4); GameRegistry.registerItem(Disc4, Strings.Disc4);
		Disc5 = new ItemDisc5(Strings.Disc5).setUnlocalizedName(Strings.Disc5); GameRegistry.registerItem(Disc5, Strings.Disc5);
		Disc6 = new ItemDisc6(Strings.Disc6).setUnlocalizedName(Strings.Disc6); GameRegistry.registerItem(Disc6, Strings.Disc6);
		Disc7 = new ItemDisc7(Strings.Disc7).setUnlocalizedName(Strings.Disc7); GameRegistry.registerItem(Disc7, Strings.Disc7);
		Disc8 = new ItemDisc8(Strings.Disc8).setUnlocalizedName(Strings.Disc8); GameRegistry.registerItem(Disc8, Strings.Disc8);
		Disc9 = new ItemDisc9(Strings.Disc9).setUnlocalizedName(Strings.Disc9); GameRegistry.registerItem(Disc9, Strings.Disc9);
		Disc10 = new ItemDisc10(Strings.Disc10).setUnlocalizedName(Strings.Disc10); GameRegistry.registerItem(Disc10, Strings.Disc10);
		Disc11 = new ItemDisc11(Strings.Disc11).setUnlocalizedName(Strings.Disc11); GameRegistry.registerItem(Disc11, Strings.Disc11);
		Disc12 = new ItemDisc12(Strings.Disc12).setUnlocalizedName(Strings.Disc12); GameRegistry.registerItem(Disc12, Strings.Disc12);
		Disc13 = new ItemDisc13(Strings.Disc13).setUnlocalizedName(Strings.Disc13); GameRegistry.registerItem(Disc13, Strings.Disc13);

		DarkLeather = new ItemDarkLeather(); GameRegistry.registerItem(DarkLeather, Strings.DLeather);
		HP = new ItemHP(); GameRegistry.registerItem(HP, Strings.HP);
		DriveOrb = new ItemDriveOrb(); GameRegistry.registerItem(DriveOrb, Strings.DriveOrb);
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
		EmptyBottle = new ItemEmptyBottle(); GameRegistry.registerItem(EmptyBottle, Strings.EmptyBottle);
		
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