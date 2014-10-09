package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddedBlocks {

    public static Block
    NormalBlox, HardBlox, MetalBlox, PrizeBlox, RarePrizeBlox, BounceBlox, DangerBlox, BlastBlox, Synthesiser, BlazingOre, BlazingOreN, LightningOre, FrostOre, DenseOre, PowerOre, PowerOreE, EnergyOre, EnergyOreN, RemembranceOre, RemembranceOreN, SerenityOre, TwilightOre, TwilightOreN, TranquilOre, BrightOre, DarkOre, DarkOreN, DarkOreE, LucidOre, KKChest;

    public static void preinit(){
    	//Bug Blox
        NormalBlox = new BlockNormalBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(NormalBlox, Strings.NBlox);
        HardBlox = new BlockHardBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(HardBlox, Strings.HBlox);
        MetalBlox = new BlockMetalBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(MetalBlox, Strings.MBlox);
        PrizeBlox = new BlockPrizeBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(PrizeBlox, Strings.PBlox);
        RarePrizeBlox = new BlockRarePrizeBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(RarePrizeBlox, Strings.RPBlox);
        BounceBlox = new BlockBounceBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(BounceBlox, Strings.BBlox);
        DangerBlox = new BlockDangerBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(DangerBlox, Strings.DBlox);
        BlastBlox = new BlockBlastBlox().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(BlastBlox, Strings.BLBlox);
        Synthesiser = new BlockSynthesis().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(Synthesiser, Strings.Synthesiser);      
      
        //Synthesis ores
        BlazingOre = new BlockBlazingOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(BlazingOre, Strings.BlazingOre);
        LightningOre = new BlockLightningOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(LightningOre, Strings.LightningOre);
        FrostOre = new BlockFrostOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(FrostOre, Strings.FrostOre);
        DenseOre = new BlockDenseOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(DenseOre, Strings.DenseOre);
        PowerOre = new BlockPowerOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(PowerOre, Strings.PowerOre);
        PowerOreE = new BlockPowerOreE().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(PowerOreE, Strings.PowerOreE);
        EnergyOre = new BlockEnergyOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(EnergyOre, Strings.EnergyOre);
        RemembranceOre = new BlockRemembranceOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(RemembranceOre, Strings.RemembranceOre);
        SerenityOre = new BlockSerenityOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(SerenityOre, Strings.SerenityOre);
        TwilightOre = new BlockTwilightOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(TwilightOre, Strings.TwilightOre);
        TranquilOre = new BlockTranquilOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(TranquilOre, Strings.TranquilOre);
        BrightOre = new BlockBrightOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(BrightOre, Strings.BrightOre);
        DarkOre = new BlockDarkOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(DarkOre, Strings.DarkOre);
        DarkOreE = new BlockDarkOreE().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(DarkOreE, Strings.DarkOreE);
        LucidOre = new BlockLucidOre().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(LucidOre, Strings.LucidOre);
        
        KKChest = new BlockKKChest().setCreativeTab(KingdomKeys.KKTAB); GameRegistry.registerBlock(KKChest, Strings.KKChest);
        //BlazingOreN = new BlockBlazingOreN(); GameRegistry.registerBlock(BlazingOreN, Strings.BlazingOreN);
        //RemembranceOreN = new BlockRemembranceOreN(); GameRegistry.registerBlock(RemembranceOreN, Strings.RemembranceOreN);
        //DarkOreN = new BlockDarkOreN(); GameRegistry.registerBlock(DarkOreN, Strings.DarkOreN);
        //TwilightOreN = new BlockTwilightOreN(); GameRegistry.registerBlock(TwilightOreN, Strings.TwilightOreN);
        //EnergyOreN = new BlockEnergyOreN(); GameRegistry.registerBlock(EnergyOreN, Strings.EnergyOreN);
        GameRegistry.registerTileEntity(TileEntitySynthesis.class, Strings.Synthesiser);
        GameRegistry.registerTileEntity(TileEntityKKChest.class, Strings.KKChest);        
    } 
    
}