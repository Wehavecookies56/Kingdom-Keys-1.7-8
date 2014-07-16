package wehavecookies56.kk;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.handlers.GuiHandler;
import wehavecookies56.kk.core.packet.ChannelHandler;
import wehavecookies56.kk.core.packet.EternalFlamesPacket;
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
import wehavecookies56.kk.entities.EntityEternalFlames;
import wehavecookies56.kk.entities.EntityEternalFlamesProjectile;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Recipes;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.ints;
import wehavecookies56.kk.mob.DarkHeartDrops;
import wehavecookies56.kk.mob.HeartDrops;
import wehavecookies56.kk.mob.KingdomHeartsDrops;
import wehavecookies56.kk.mob.PureHeartDrops;
import wehavecookies56.kk.updater.Update;
import wehavecookies56.kk.world.gen.WorldGenBlox;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
//import wehavecookies56.kk.core.handlers.MPTickHandler;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER, guiFactory = "wehavecookies56.kk.client.gui.KingdomKeysModGuiFactory") 

public class KingdomKeys {

	public static DamageSource causeChakramDamage(EntityEternalFlames par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("chakram", par0EntityArrow, par1Entity)).setProjectile();
    }
	
	//World gen
	WorldGenBlox worldGen = new WorldGenBlox();
		
	public static Configuration config;
	
    @Mod.Instance(Reference.MOD_ID)
    public static KingdomKeys instance;
    
    public static ChannelHandler channelHandler;
    
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
    
    //Enchanment
    public static final Enchantment HarvestHearts = new EnchantHeartHarvest(52, 1);
    
    //Mob
    //public static int getUniqueEntityID
    
    //private GuiHandlerSynth guiHandlerSynth = new GuiHandlerSynth();
    
    //Pre initialisation
    @Mod.EventHandler
    public void modConstruct(FMLConstructionEvent event) {
        channelHandler = new ChannelHandler(Reference.MOD_NAME, Reference.MOD_CHANNEL);
    }
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        AddedItems.initKeyBlades();
        AddedItems.initHearts();
        AddedItems.initOthers();
        AddedItems.initRecipes();
        AddedItems.intiArmour();
        AddedItems.initLoot();
        AddedBlocks.preinit();
        
        int modEntityID = 0;
        EntityRegistry.registerModEntity(EntityEternalFlamesProjectile.class, "Sharpshooter Bullet", ++modEntityID, this, 64, 10, true);
        
        config = new Configuration(event.getSuggestedConfigurationFile());
        
        channelHandler.registerPacket(SynthesisPacket.class);
        channelHandler.registerPacket(SummonPacket.class);
        
        syncConfig();
    }
    
    public static void syncConfig(){
    	FMLCommonHandler.instance().bus().register(instance);
    	final String WORLDGENERATION = ConfigCategory.getQualifiedName("World Generation", null);
        final String OVERWORLD = WORLDGENERATION + config.CATEGORY_SPLITTER + "Overworld Spawn Chances";
        final String END = WORLDGENERATION + config.CATEGORY_SPLITTER + "End Spawn Chances";
        final String GENERATE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "World Generation";
        ConfigBooleans.enableGenerate = config.get(GENERATE, ConfigBooleans.enableGenerate_name, ConfigBooleans.enableGenerate_default).getBoolean(ConfigBooleans.enableGenerate_default);
        ConfigBooleans.enableOverworld = config.get(GENERATE, ConfigBooleans.enableOverworld_name, ConfigBooleans.enableOverworld_default).getBoolean(ConfigBooleans.enableOverworld_default);
        final String UPDATECHECK = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Update Check";
        ConfigBooleans.enableUpdateCheck = config.get(UPDATECHECK, ConfigBooleans.enableUpdateCheck_name, ConfigBooleans.enableUpdateCheck_default).getBoolean(ConfigBooleans.enableUpdateCheck_default);
        final String KEYBLADE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Keyblade Config";
        ConfigBooleans.enable3D = config.get(KEYBLADE, ConfigBooleans.enable3D_name, ConfigBooleans.enable3D_default).getBoolean(ConfigBooleans.enable3D_default);
        ConfigBooleans.altWaywardWind = config.get(KEYBLADE, ConfigBooleans.altWaywardWind_name, ConfigBooleans.altWaywardWind_default).getBoolean(ConfigBooleans.altWaywardWind_default);
        final String RECIPE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Recipe Config";
        ConfigBooleans.heartRecipe = config.get(RECIPE, ConfigBooleans.heartRecipe_name, ConfigBooleans.heartRecipe_default).getBoolean(ConfigBooleans.heartRecipe_default);
        ConfigBooleans.bloxRecipe = config.get(RECIPE, ConfigBooleans.bloxRecipe_name, ConfigBooleans.bloxRecipe_default).getBoolean(ConfigBooleans.bloxRecipe_default);
        final String MOBDROPS = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Mob Drops";
        ConfigBooleans.munnyDrops = config.get(RECIPE, ConfigBooleans.munnyDrops_name, ConfigBooleans.munnyDrops_default).getBoolean(ConfigBooleans.munnyDrops_default);
        
        //OTHER
        config.addCustomCategoryComment(END, "Higher number = higher spawn chance");
        config.addCustomCategoryComment(OVERWORLD, "Higher number = higher spawn chance");
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
        ints.PowerOreEChance = config.get(END, "Power Ore Spawn Chance", ints.POWEROREECHANCE_DEFAULT).getInt(ints.POWEROREECHANCE_DEFAULT);
        ints.DarkOreEChance = config.get(END, "Dark Ore Spawn Chance", ints.DARKOREECHANCE_DEFAULT).getInt(ints.DARKOREECHANCE_DEFAULT);
    	
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
    	channelHandler.initialise();
        MinecraftForge.EVENT_BUS.register(new HeartDrops());
        MinecraftForge.EVENT_BUS.register(new PureHeartDrops());
        MinecraftForge.EVENT_BUS.register(new DarkHeartDrops());
        MinecraftForge.EVENT_BUS.register(new KingdomHeartsDrops());
    	FMLCommonHandler.instance().bus().register(instance);
    	new GuiHandler();
        Recipes.initShapedRecipes();
        Recipes.initShapelessRecipes();
        GameRegistry.registerWorldGenerator(worldGen, 1);
        proxy.registerRenderers();
        EntityRegistry.registerModEntity(EntityBlastBlox.class, "BlastBlox", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
        if(ConfigBooleans.enableUpdateCheck){
        MinecraftForge.EVENT_BUS.register(new Update());
        final Side side = FMLCommonHandler.instance().getEffectiveSide();
        }
    }

    EntityPlayer entityplayer;
    
    //Post Initialisation
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	channelHandler.postInitialise();
    }
    
}
