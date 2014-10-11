package wehavecookies56.kk;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Logger;

import wehavecookies56.kk.achievements.AddedAchievments;
import wehavecookies56.kk.api.synthesis.RecipeHandler;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.core.event.DarkHeartDrops;
import wehavecookies56.kk.core.event.DriveOrbDrops;
import wehavecookies56.kk.core.event.EntityConstructEvent;
import wehavecookies56.kk.core.event.EntityDamagedEvent;
import wehavecookies56.kk.core.event.HPOrbDrops;
import wehavecookies56.kk.core.event.HeartDrops;
import wehavecookies56.kk.core.event.HurtEvent;
import wehavecookies56.kk.core.event.KingdomHeartsDrops;
import wehavecookies56.kk.core.event.LivingUpdateEevent;
import wehavecookies56.kk.core.event.Munny10Drops;
import wehavecookies56.kk.core.event.Munny1Drops;
import wehavecookies56.kk.core.event.Munny20Drops;
import wehavecookies56.kk.core.event.Munny3000Drops;
import wehavecookies56.kk.core.event.Munny50Drops;
import wehavecookies56.kk.core.event.Munny5Drops;
import wehavecookies56.kk.core.event.OnCraftedEvent;
import wehavecookies56.kk.core.event.OnHitEvent;
import wehavecookies56.kk.core.event.OnPickUpEvent;
import wehavecookies56.kk.core.event.PureHeartDrops;
import wehavecookies56.kk.core.event.RecipeDrop;
import wehavecookies56.kk.core.handlers.GiveMunny;
import wehavecookies56.kk.core.handlers.GuiHandler;
import wehavecookies56.kk.core.packet.AchievementPacket;
import wehavecookies56.kk.core.packet.ChannelHandler;
import wehavecookies56.kk.core.packet.KnowledgePacket;
import wehavecookies56.kk.core.packet.MunnyPacket;
import wehavecookies56.kk.core.packet.SummonPacket;
import wehavecookies56.kk.core.packet.SynthesisPacket;
import wehavecookies56.kk.core.proxies.ClientProxy;
import wehavecookies56.kk.core.proxies.CommonProxy;
import wehavecookies56.kk.creativetab.KHBBSTAB;
import wehavecookies56.kk.creativetab.KHCHITAB;
import wehavecookies56.kk.creativetab.KHDAYSTAB;
import wehavecookies56.kk.creativetab.KHDDDTAB;
import wehavecookies56.kk.creativetab.KHIITAB;
import wehavecookies56.kk.creativetab.KHRECODEDTAB;
import wehavecookies56.kk.creativetab.KHTAB;
import wehavecookies56.kk.creativetab.KKSMTAB;
import wehavecookies56.kk.creativetab.KKTAB;
import wehavecookies56.kk.enchantments.EnchantHeartHarvest;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.entities.EntityEternalFlamesProjectile;
import wehavecookies56.kk.entities.mob.VillagerTradeHandlerRecipes;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Recipes;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.SynthesisRecipes;
import wehavecookies56.kk.lib.ints;
import wehavecookies56.kk.updater.Update;
import wehavecookies56.kk.worldgen.ComponentRecipeHome;
import wehavecookies56.kk.worldgen.VillagerCreationHandler;
import wehavecookies56.kk.worldgen.WorldGenBlox;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER, guiFactory = "wehavecookies56.kk.client.gui.KingdomKeysModGuiFactory") 
/*
 * TODO Clean up this file
 * TODO Add more config options
 * TODO Move some stuff to other files to reduce size
 */
public class KingdomKeys {

	public static DamageSource causeChakramDamage(EntityEternalFlamesProjectile par0EntityArrow, Entity par1Entity) {
		return (new EntityDamageSourceIndirect("chakram", par0EntityArrow, par1Entity)).setProjectile();
	}

	public static Logger logger = FMLLog.getLogger();

	//World gen
	WorldGenBlox worldGen = new WorldGenBlox();

	public static Configuration config;

	@Mod.Instance(Reference.MOD_ID)
	public static KingdomKeys instance;

	//Proxies
	@SidedProxy(clientSide="wehavecookies56.kk.core.proxies.ClientProxy", serverSide="wehavecookies56.kk.core.proxies.CommonProxy")
	public static CommonProxy proxy;
	public static ClientProxy cproxy;

	//Creative tabs
	public static CreativeTabs KKTAB = new KKTAB(CreativeTabs.getNextID(), "KKTAB");
	public static CreativeTabs KKSMTAB = new KKSMTAB(CreativeTabs.getNextID(), "KKSMTAB");
	public static CreativeTabs KHTAB = new KHTAB(CreativeTabs.getNextID(), "KHTAB");
	public static CreativeTabs KHIITAB = new KHIITAB(CreativeTabs.getNextID(), "KHIITAB");
	public static CreativeTabs KHBBSTAB = new KHBBSTAB(CreativeTabs.getNextID(), "KHBBSTAB");
	public static CreativeTabs KHCHITAB = new KHCHITAB(CreativeTabs.getNextID(), "KHCHITAB");
	public static CreativeTabs KHDAYSTAB = new KHDAYSTAB(CreativeTabs.getNextID(), "KHDAYSTAB");
	public static CreativeTabs KHRECODEDTAB = new KHRECODEDTAB(CreativeTabs.getNextID(), "KHRECODEDTAB");
	public static CreativeTabs KHDDDTAB = new KHDDDTAB(CreativeTabs.getNextID(), "KHDDDTAB");

	public static ChannelHandler network;

	public static final Enchantment HarvestHearts = new EnchantHeartHarvest(ints.EnchantmentID, 1);

	//Mob
	//public static int getUniqueEntityID

	//private GuiHandlerSynth guiHandlerSynth = new GuiHandlerSynth();

	//Pre initialisation
	@Mod.EventHandler
	public void modConstruct(FMLConstructionEvent event)
	{
		network = new ChannelHandler(Reference.MOD_ID, Reference.MOD_CHANNEL);
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//ModelPlayerAPI.register("kk", PlayerModel.class);
		//RenderPlayerAPI.register("kk", PlayerRender.class);
		AddedItems.initKeyBlades();
		AddedItems.initHearts();
		AddedItems.initOthers();
		AddedItems.initRecipes();
		AddedItems.intiArmour();
		AddedItems.initLoot();
		AddedBlocks.preinit();

		network.registerPacket(KnowledgePacket.class);
		network.registerPacket(SummonPacket.class);
		network.registerPacket(SynthesisPacket.class);
		network.registerPacket(MunnyPacket.class);
		network.registerPacket(AchievementPacket.class);


		int modEntityID = 0;
		EntityRegistry.registerModEntity(EntityEternalFlamesProjectile.class, "EternalFlamesProjectile", ++modEntityID, this, 64, 10, true);

		config = new Configuration(event.getSuggestedConfigurationFile());
		syncConfig();
	}


	//TODO Put this in a different file to make it look better
	public static void syncConfig(){
		FMLCommonHandler.instance().bus().register(instance);

		//TODO Make this work
		ints.EnchantmentID = config.get(config.CATEGORY_GENERAL, "Enchantment ID", ints.ENCHANTMENTID_DEFAULT).getInt(ints.ENCHANTMENTID_DEFAULT);
		ConfigBooleans.enableUpdateCheck = config.get(config.CATEGORY_GENERAL, ConfigBooleans.enableUpdateCheck_name, ConfigBooleans.enableUpdateCheck_default).getBoolean(ConfigBooleans.enableUpdateCheck_default);

		final String GENERATE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "World Generation";
		ConfigBooleans.enableGenerate = config.get(GENERATE, ConfigBooleans.enableGenerate_name, ConfigBooleans.enableGenerate_default).getBoolean(ConfigBooleans.enableGenerate_default);
		ConfigBooleans.enableOverworld = config.get(GENERATE, ConfigBooleans.enableOverworld_name, ConfigBooleans.enableOverworld_default).getBoolean(ConfigBooleans.enableOverworld_default);
		//ConfigBooleans.discSpawn = config.get(GENERATE, "Enable the disc spawning in chests", ConfigBooleans.discSpawn_default).getBoolean(ConfigBooleans.discSpawn_default);

		final String OVERWORLD = GENERATE + config.CATEGORY_SPLITTER + "Overworld Spawn Chances";
		config.addCustomCategoryComment(OVERWORLD, "Higher number = Higher spawn chance");
		ints.LucidOreChance = config.get(OVERWORLD, "Lucid Ore Spawn Chance", ints.LUCIDORECHANCE_DEFAULT).getInt(ints.LUCIDORECHANCE_DEFAULT);
		ints.SerenityOreChance = config.get(OVERWORLD, "Serenity Ore Spawn Chance", ints.SERENITYORECHANCE_DEFAULT).getInt(ints.SERENITYORECHANCE_DEFAULT);
		ints.TranquilOreChance = config.get(OVERWORLD, "Tranquil Ore Spawn Chance", ints.TRANQUILORECHANCE_DEFAULT).getInt(ints.TRANQUILORECHANCE_DEFAULT);
		ints.BrightOreChance = config.get(OVERWORLD, "Bright Ore Spawn Chance", ints.BRIGHTORECHANCE_DEFAULT).getInt(ints.BRIGHTORECHANCE_DEFAULT);
		ints.DarkOreChance = config.get(OVERWORLD, "Dark Ore Spawn Chance", ints.DARKORECHANCE_DEFAULT).getInt(ints.DARKORECHANCE_DEFAULT);
		ints.DenseOreChance = config.get(OVERWORLD, "Dense Ore Spawn Chance", ints.DENSEORECHANCE_DEFAULT).getInt(ints.DENSEORECHANCE_DEFAULT);
		ints.LightningOreChance = config.get(OVERWORLD, "Lightning Ore Spawn Chance", ints.LIGHTNINGORECHANCE_DEFAULT).getInt(ints.LIGHTNINGORECHANCE_DEFAULT);
		ints.BlazingOreChance = config.get(OVERWORLD, "Blazing Ore Spawn Chance", ints.BLAZINGORECHANCE_DEFAULT).getInt(ints.BLAZINGORECHANCE_DEFAULT);
		ints.PrizeBloxChance = config.get(OVERWORLD, "Prize Blox Spawn Chance", ints.PRIZEBLOXCHANCE_DEFAULT).getInt(ints.PRIZEBLOXCHANCE_DEFAULT);
		ints.RarePrizeBloxChance = config.get(OVERWORLD, "Rare Prize Blox Spawn Chance", ints.RAREPRIZEBLOXCHANCE_DEFAULT).getInt(ints.RAREPRIZEBLOXCHANCE_DEFAULT);
		ints.FrostOreChance = config.get(OVERWORLD, "Frost Ore Spawn Chance", ints.FROSTORECHANCE_DEFAULT).getInt(ints.FROSTORECHANCE_DEFAULT);
		ints.EnergyOreChance = config.get(OVERWORLD, "Energy Ore Spawn Chance", ints.ENERGYORECHANCE_DEFAULT).getInt(ints.ENERGYORECHANCE_DEFAULT);
		ints.RemembranceOreChance = config.get(OVERWORLD, "Remembrance Ore Spawn Chance", ints.REMEMBRANCEORECHANCE_DEFAULT).getInt(ints.REMEMBRANCEORECHANCE_DEFAULT);
		ints.TwilightOreChance = config.get(OVERWORLD, "Twilight Ore Spawn Chance", ints.TWILIGHTORECHANCE_DEFAULT).getInt(ints.TWILIGHTORECHANCE_DEFAULT);
		ints.NormalBlox = config.get(OVERWORLD, "Normal Blox Spawn Chance", ints.NORMALBLOX_DEFAULT).getInt(ints.NORMALBLOX_DEFAULT);
		ints.HardBlox = config.get(OVERWORLD, "Hard Blox Spawn Chance", ints.HARDBLOX_DEFAULT).getInt(ints.HARDBLOX_DEFAULT);
		ints.MetalBlox = config.get(OVERWORLD, "Metal Blox Spawn Chance", ints.METALBLOX_DEFAULT).getInt(ints.METALBLOX_DEFAULT);
		ints.DangerBlox = config.get(OVERWORLD, "Danger Blox Spawn Chance", ints.DANGERBLOX_DEFAULT).getInt(ints.DANGERBLOX_DEFAULT);
		ints.RarePrizeBlox = config.get(OVERWORLD, "Rare Prize Blox Spawn Chance", ints.RAREPRIZEBLOX_DEFAULT).getInt(ints.RAREPRIZEBLOX_DEFAULT);
		ints.PrizeBlox = config.get(OVERWORLD, "Prize Blox Spawn Chance", ints.PRIZEBLOX_DEFAULT).getInt(ints.PRIZEBLOX_DEFAULT);

		final String END = GENERATE + config.CATEGORY_SPLITTER + "End Spawn Chances";
		config.addCustomCategoryComment(END, "Higher number = Higher spawn chance");
		ints.PowerOreEChance = config.get(END, "Power Ore Spawn Chance", ints.POWEROREECHANCE_DEFAULT).getInt(ints.POWEROREECHANCE_DEFAULT);
		ints.DarkOreEChance = config.get(END, "Dark Ore Spawn Chance", ints.DARKOREECHANCE_DEFAULT).getInt(ints.DARKOREECHANCE_DEFAULT);
		ints.NormalBloxE = config.get(END, "Normal Blox Spawn Chance", ints.NORMALBLOXE_DEFAULT).getInt(ints.NORMALBLOXE_DEFAULT);
		ints.HardBloxE = config.get(END, "Hard Blox Spawn Chance", ints.HARDBLOXE_DEFAULT).getInt(ints.HARDBLOXE_DEFAULT);
		ints.MetalBloxE = config.get(END, "Metal Blox Spawn Chance", ints.METALBLOXE_DEFAULT).getInt(ints.METALBLOXE_DEFAULT);
		ints.DangerBloxE = config.get(END, "Danger Blox Spawn Chance", ints.DANGERBLOXE_DEFAULT).getInt(ints.DANGERBLOXE_DEFAULT);
		ints.RarePrizeBloxE = config.get(END, "Rare Prize Blox Spawn Chance", ints.RAREPRIZEBLOXE_DEFAULT).getInt(ints.RAREPRIZEBLOXE_DEFAULT);

		//TODO Make these work
		final String KEYBLADE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Keyblade Config";
		ConfigBooleans.enable3D = config.get(KEYBLADE, ConfigBooleans.enable3D_name, ConfigBooleans.enable3D_default).getBoolean(ConfigBooleans.enable3D_default);
		ConfigBooleans.altWaywardWind = config.get(KEYBLADE, ConfigBooleans.altWaywardWind_name, ConfigBooleans.altWaywardWind_default).getBoolean(ConfigBooleans.altWaywardWind_default);
		ConfigBooleans.enableShine = config.get(KEYBLADE, ConfigBooleans.enableShine_name, ConfigBooleans.enableShine_default).getBoolean(ConfigBooleans.enableShine_default);

		//TODO Fix these too
		final String RECIPE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Recipe Config";
		ConfigBooleans.heartRecipe = config.get(RECIPE, ConfigBooleans.heartRecipe_name, ConfigBooleans.heartRecipe_default).getBoolean(ConfigBooleans.heartRecipe_default);
		ConfigBooleans.bloxRecipe = config.get(RECIPE, ConfigBooleans.bloxRecipe_name, ConfigBooleans.bloxRecipe_default).getBoolean(ConfigBooleans.bloxRecipe_default);
		ConfigBooleans.munnyDrops = config.get(RECIPE, ConfigBooleans.munnyDrops_name, ConfigBooleans.munnyDrops_default).getBoolean(ConfigBooleans.munnyDrops_default);       
		ConfigBooleans.expensiveDarkMatter = config.get(RECIPE, ConfigBooleans.expensiveDarkMatter_name, ConfigBooleans.expensiveDarkMatter_default).getBoolean(ConfigBooleans.expensiveDarkMatter_default);
		if(config.hasChanged()){
			config.save();
		}
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.modID.equals("kk")){
			syncConfig();
		}
	}

	//Initialisation
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		network.initialise();
		SynthesisRecipes.initSynthesisRecipes();
		logger.info(Reference.MOD_NAME + ": Registered " + RecipeHandler.getTotalRegistered() + " Synthesis recipes");
		//RecipeHandler.iterateRecipes();
		AddedAchievments.initAchievements();
		logger.info(Reference.MOD_NAME + ": Registered Added Achievements");
		logger.info(Reference.MOD_NAME + ": Registering Events");
		MinecraftForge.EVENT_BUS.register(new HeartDrops());
		MinecraftForge.EVENT_BUS.register(new PureHeartDrops());
		MinecraftForge.EVENT_BUS.register(new DarkHeartDrops());
		MinecraftForge.EVENT_BUS.register(new KingdomHeartsDrops());
		MinecraftForge.EVENT_BUS.register(new Munny1Drops());
		MinecraftForge.EVENT_BUS.register(new Munny5Drops());
		MinecraftForge.EVENT_BUS.register(new Munny10Drops());
		MinecraftForge.EVENT_BUS.register(new Munny20Drops());
		MinecraftForge.EVENT_BUS.register(new Munny50Drops());
		MinecraftForge.EVENT_BUS.register(new Munny3000Drops());
		MinecraftForge.EVENT_BUS.register(new HPOrbDrops());
		MinecraftForge.EVENT_BUS.register(new RecipeDrop());
		MinecraftForge.EVENT_BUS.register(new EntityConstructEvent());
		MinecraftForge.EVENT_BUS.register(new HurtEvent());
		MinecraftForge.EVENT_BUS.register(new DriveOrbDrops());
		MinecraftForge.EVENT_BUS.register(new OnHitEvent());
		MinecraftForge.EVENT_BUS.register(new EntityDamagedEvent());
		MinecraftForge.EVENT_BUS.register(new LivingUpdateEevent());
		FMLCommonHandler.instance().bus().register(instance);
		FMLCommonHandler.instance().bus().register(new OnCraftedEvent());
		FMLCommonHandler.instance().bus().register(new OnPickUpEvent());
		FMLCommonHandler.instance().bus().register(new Update());
		logger.info(Reference.MOD_NAME + ": Registered Events");
		new GuiHandler();
		Recipes.initShapedRecipes();
		Recipes.initShapelessRecipes();
		ComponentRecipeHome.registerChest();
		GameRegistry.registerWorldGenerator(worldGen, 1);
		proxy.registerRenderers();
		proxy.initCapes();
		proxy.registerKeybinds();
		GameRegistry.registerTileEntity(TileEntityKKChest.class, "teKKChest");
		EntityRegistry.registerModEntity(EntityBlastBlox.class, "BlastBlox", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		if(ConfigBooleans.enableUpdateCheck)
		{
			MinecraftForge.EVENT_BUS.register(new Update());
			final Side side = FMLCommonHandler.instance().getEffectiveSide();
			addVillagePiece(ComponentRecipeHome.class, "SynthesistsHome");
			VillagerRegistry.instance().registerVillagerId(20);
			VillagerRegistry.instance().registerVillageTradeHandler(20, new VillagerTradeHandlerRecipes());
			VillagerRegistry.instance().registerVillageCreationHandler(new VillagerCreationHandler());
			VillagerRegistry.getRegisteredVillagers();
		}
	}

	@Mod.EventHandler
	private void serverLoad(FMLServerStartingEvent event) {
		event.registerServerCommand(new GiveMunny());

	}

	EntityPlayer entityplayer;

	//Post Initialisation
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		network.postInitialise();
	}

	public static void addVillagePiece(Class c, String s){
		try
		{
			MapGenStructureIO.func_143031_a(c, s);
		}
		catch(Exception e)
		{

		}
	}
}
