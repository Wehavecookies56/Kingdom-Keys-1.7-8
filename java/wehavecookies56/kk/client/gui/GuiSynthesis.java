package wehavecookies56.kk.client.gui;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.api.synthesis.Recipe;
import wehavecookies56.kk.api.synthesis.RecipeHandler;
import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.core.packet.SynthesisPacket;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.LocalStrings;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GuiSynthesis extends GuiContainer {


	TileEntitySynthesis synthesis = new TileEntitySynthesis();
	public static boolean ClickedTab1 = true;
	public static boolean ClickedTab2 = false;
	public static boolean ClickedTab3 = false;
	
	public String SynthesizeText;

	@SideOnly(Side.CLIENT)
	public GuiSynthesis(InventoryPlayer invPlayer, TileEntitySynthesis synthesis) {
		super(new ContainerSynthesis(invPlayer, synthesis));

		this.synthesis = synthesis;

		xSize = 176;
		ySize = 166;

	}	

	private static final ResourceLocation texture = new ResourceLocation("kk", "textures/gui/Moogle.png");

	@Override
	@SideOnly(Side.CLIENT)
	protected void drawGuiContainerBackgroundLayer(float f, int x, int y) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

	}

	boolean ableToSynth = false;

	int Tab1X = 5 + guiLeft;
	int Tab1Y = 26 + guiTop;
	int Tab2X = 5 + guiLeft;
	int Tab2Y = 45 + guiTop;
	int Tab3X = 5 + guiLeft;
	int Tab3Y = 64 + guiTop;
	int Tab1SrcX = xSize;
	int Tab1SrcY = 0;
	int Tab2SrcX = xSize;
	int Tab2SrcY = 0;
	int Tab3SrcX = xSize;
	int Tab3SrcY = 0;
	int DimensionsOfTabW = 21;
	int DimensionsOfTabH = 17;

	int Tab1iconX = 14 + guiLeft;
	int Tab1iconY = 29 + guiTop;
	int Tab1iconSrcX = 16;
	int Tab1iconSrcY = ySize;
	int Tab2iconX = 10 + guiLeft;
	int Tab2iconY = 47 + guiTop;
	int Tab2iconSrcX = 21;
	int Tab2iconSrcY = ySize;
	int Tab3iconX = 12 + guiLeft;
	int Tab3iconY = 67 + guiTop;
	int Tab3iconSrcX = 34;
	int Tab3iconSrcY = ySize;
	int Tab1iconDimW = 5;
	int Tab1iconDimH = 11;
	int Tab2iconDimWH = 13;
	int Tab3iconDimW = 10;
	int Tab3iconDimH = 12;

	@Override
	@SideOnly(Side.CLIENT)
	protected void drawGuiContainerForegroundLayer(int x, int y) {
		mc.fontRenderer.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Title), 38, 5, 0x404040);
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			Tab1SrcY = 34;
		}else if(ClickedTab1){
			Tab1SrcY = 17;
		}else{
			Tab1SrcY = 0;
		}
		drawTexturedModalRect(Tab1X, Tab1Y, Tab1SrcX, Tab1SrcY, DimensionsOfTabW, DimensionsOfTabH);
		drawTexturedModalRect(Tab1iconX, Tab1iconY, Tab1iconSrcX, Tab1iconSrcY, Tab1iconDimW, Tab1iconDimH);
		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			Tab2SrcY = 34;
		}else if(ClickedTab2){
			Tab2SrcY = 17;
		}else{
			Tab2SrcY = 0;
		}
		drawTexturedModalRect(Tab2X, Tab2Y, Tab2SrcX, Tab2SrcY, DimensionsOfTabW, DimensionsOfTabH);
		drawTexturedModalRect(Tab2iconX, Tab2iconY, Tab2iconSrcX, Tab2iconSrcY, Tab2iconDimWH, Tab2iconDimWH);
		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			Tab3SrcY = 34;
		}else if(ClickedTab3){
			Tab3SrcY = 17;
		}else{
			Tab3SrcY = 0;
		}
		drawTexturedModalRect(Tab3X, Tab3Y, Tab3SrcX, Tab3SrcY, DimensionsOfTabW, DimensionsOfTabH);
		drawTexturedModalRect(Tab3iconX, Tab3iconY, Tab3iconSrcX, Tab3iconSrcY, Tab3iconDimW, Tab3iconDimH);

		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);

		mc.fontRenderer.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Munny) + ": " + props.getMunny(), 0, 168, 0xFFF000);
		
		if(synthesis.getStackInSlot(0) == null){
			if(ClickedTab1){
				mc.fontRenderer.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Place), 30, 48, 120, 0xFF0000);
			}
			else if(ClickedTab2){
				mc.fontRenderer.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Place), 30, 30, 120, 0xFF0000);
			}
			else if(ClickedTab3){
				mc.fontRenderer.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Place), 30, 30, 120, 0xFF0000);
			}
		}

		addSynthesisRecipe(AddedItems.K1r, AddedItems.VulpeusChain, AddedItems.VulpeusMaterial, true, 2400, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.EnergyStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K2r, AddedItems.UrsusChain, AddedItems.UrsusMaterial, true, 2700, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.PowerStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K3r, AddedItems.UnicornisChain, AddedItems.UnicornisMaterial, true, 2250, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.TwilightStone, AddedItems.BrightStone, AddedItems.BlazingStone);
		addSynthesisRecipe(AddedItems.K4r, AddedItems.LeopardosChain, AddedItems.LeopardosMaterial, true, 2550, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DarkStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K5r, AddedItems.AnguisChain, AddedItems.AnguisMaterial, true, 1350, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K6r, AddedItems.LeasKeybladeChain, AddedItems.LeasKeybladeMaterial, true, 1200, AddedItems.BlazingCrystal, AddedItems.DarkShard, AddedItems.MythrilShard, AddedItems.BrightGem, AddedItems.BlazingShard, AddedItems.DarkStone, AddedItems.BlazingStone, AddedItems.DarkMatter);
		addSynthesisRecipe(AddedItems.K7r, AddedItems.YoungXehanortsKeybladeChain, AddedItems.YoungXehanortsKeybladeMaterial, true, 2250, AddedItems.DarkCrystal, AddedItems.PowerCrystal, AddedItems.LucidGem, AddedItems.DenseShard, AddedItems.PowerStone, AddedItems.LucidStone, AddedItems.Orichalcum, AddedItems.DarkShard, AddedItems.LucidShard);
		addSynthesisRecipe(AddedItems.K8r, AddedItems.OceanRageChain, AddedItems.OceanRageMaterial, true, 1200, AddedItems.PowerCrystal, AddedItems.BrightGem, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.PowerStone, AddedItems.LucidShard, AddedItems.FrostStone, AddedItems.FrostShard);
		addSynthesisRecipe(AddedItems.K9r, AddedItems.EndOfPainChain, AddedItems.EndOfPainMaterial, true, 1350, AddedItems.TranquilCrystal, AddedItems.TwilightGem, AddedItems.TwilightStone, AddedItems.PowerShard, AddedItems.DenseShard, AddedItems.PowerCrystal);
		addSynthesisRecipe(AddedItems.K10r, AddedItems.UnboundChain, AddedItems.UnboundMaterial, true, 1950, AddedItems.DarkCrystal, AddedItems.DenseGem, AddedItems.LucidGem, AddedItems.EnergyShard, AddedItems.LucidShard, AddedItems.DenseStone);
		addSynthesisRecipe(AddedItems.K11r, AddedItems.SweetDreamsChain, AddedItems.SweetDreamsMaterial, true, 1350, AddedItems.BrightCrystal, AddedItems.TwilightCrystal, AddedItems.BrightGem, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K12r, AddedItems.DiveWingChain, AddedItems.DivewingMaterial, true, 1050, AddedItems.PowerCrystal, AddedItems.LightningCrystal, AddedItems.LightningGem, AddedItems.BlazingStone, AddedItems.BrightGem, AddedItems.Orichalcum);
		addSynthesisRecipe(AddedItems.K13r, AddedItems.CounterpointChain, AddedItems.CounterpointMaterial, true, 1050, AddedItems.RemembranceCrystal, AddedItems.DarkGem, AddedItems.BlazingShard, AddedItems.LucidShard, AddedItems.DenseStone, AddedItems.LucidShard);
		addSynthesisRecipe(AddedItems.K14r, AddedItems.AllForOneChain, AddedItems.AllForOneMaterial, true, 750, AddedItems.DenseCrystal, AddedItems.MythrilShard, AddedItems.MythrilGem, AddedItems.BrightShard, AddedItems.BrightStone, AddedItems.FrostShard, AddedItems.LightningShard);
		addSynthesisRecipe(AddedItems.K15r, AddedItems.KnockoutPunchChain, AddedItems.KnockoutPunchMaterial, true, 750, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.MythrilCrystal, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.DarkStone, AddedItems.LucidGem, AddedItems.DenseCrystal, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K16r, AddedItems.FerrisGearChain, AddedItems.FerrisGearMaterial, true, 900, AddedItems.PowerCrystal, AddedItems.BrightShard, AddedItems.LucidGem, AddedItems.TranquilStone, AddedItems.TranquilGem, AddedItems.MythrilShard);
		addSynthesisRecipe(AddedItems.K17r, AddedItems.DualDiscChain, AddedItems.DualDiscMaterial, true, 1050, AddedItems.EnergyGem, AddedItems.PowerGem, AddedItems.DenseStone, AddedItems.DenseShard, AddedItems.BrightStone, AddedItems.BrightGem, AddedItems.EnergyCrystal);
		addSynthesisRecipe(AddedItems.K18r, AddedItems.GuardianBellChain, AddedItems.GuardianBellMaterial, true, 1050, AddedItems.DarkCrystal, AddedItems.ShinyCrystal, AddedItems.MythrilShard, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K19r, AddedItems.SkullNoiseChain, AddedItems.SkullNoiseMaterial, true, 900, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.LucidGem, AddedItems.MythrilGem, AddedItems.BlazingStone, AddedItems.DarkShard, AddedItems.BlazingShard, AddedItems.DarkStone);
		addSynthesisRecipe(AddedItems.K20r, AddedItems.WoodenKeybladeChain, AddedItems.WoodenKeybladeMaterial, true, 300, AddedItems.TranquilGem, AddedItems.SerenityShard, AddedItems.BrightShard, AddedItems.DenseStone, AddedItems.DenseShard);
		addSynthesisRecipe(AddedItems.K21r, AddedItems.KyebladeBrokenChain, AddedItems.KyebladeBrokenMaterial, true, 300, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkHeart, AddedItems.KingdomHearts, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.PureHeart, AddedItems.BrightStone, AddedItems.Heart);
		addSynthesisRecipe(AddedItems.K22r, AddedItems.KyebladeChain, AddedItems.KyebladeMaterial, true, 3750, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkHeart, AddedItems.KingdomHearts, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.PureHeart, AddedItems.KyebladeBroken, AddedItems.Heart);
		addSynthesisRecipe(AddedItems.K23r, AddedItems.LightSeekerChain, AddedItems.LightSeekerMaterial, true, 1350, AddedItems.SerenityCrystal, AddedItems.BrightCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K24r, AddedItems.LostMemoryChain, AddedItems.LostMemoryMaterial, true, 1800, AddedItems.OrichalcumPlus, AddedItems.RemembranceCrystal, AddedItems.RemembranceShard, AddedItems.DarkStone, AddedItems.BrightStone, AddedItems.TwilightGem);
		addSynthesisRecipe(AddedItems.K25r, AddedItems.FrolicFlameChain, AddedItems.FrolicFlameMaterial, true, 900, AddedItems.Orichalcum, AddedItems.BlazingCrystal, AddedItems.BlazingGem, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.TwilightGem);
		addSynthesisRecipe(AddedItems.K26r, AddedItems.MasterKeeperChain, AddedItems.MasterKeeperMaterial, true, 1950, AddedItems.OrichalcumPlus, AddedItems.MythrilGem, AddedItems.PowerShard, AddedItems.BlazingStone, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K27r, AddedItems.BrightCrestChain, AddedItems.BrightCrestMaterial, true, 1050, AddedItems.SerenityCrystal, AddedItems.MythrilCrystal, AddedItems.MythrilShard, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.SerenityShard);
		addSynthesisRecipe(AddedItems.K28r, AddedItems.CrownUnlimitChain, AddedItems.CrownUnlimitMaterial, true, 1500, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.BrightStone, AddedItems.PowerShard, AddedItems.EnergyGem, AddedItems.EnergyShard);
		addSynthesisRecipe(AddedItems.K29r, AddedItems.NoNameChain, AddedItems.NoNameMaterial, true, 1800, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkShard, AddedItems.EnergyStone, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.PowerCrystal);
		addSynthesisRecipe(AddedItems.K30r, AddedItems.VoidGearChain, AddedItems.VoidGearMaterial, true, 1650, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkGem, AddedItems.DarkStone, AddedItems.DarkShard);
		addSynthesisRecipe(AddedItems.K31r, AddedItems.SweetStackChain, AddedItems.SweetStackMaterial, true, 1200, AddedItems.ShinyCrystal, AddedItems.SerenityCrystal, AddedItems.SerenityShard, AddedItems.FrostGem, AddedItems.FrostShard, AddedItems.TranquilStone, AddedItems.BrightGem);
		addSynthesisRecipe(AddedItems.K32r, AddedItems.PixiePetalChain, AddedItems.PixiePetalMaterial, true, 900, AddedItems.MythrilCrystal, AddedItems.SerenityStone, AddedItems.TranquilStone, AddedItems.MythrilShard, AddedItems.TranquilShard, AddedItems.BrightCrystal);
		addSynthesisRecipe(AddedItems.K33r, AddedItems.HyperdriveChain, AddedItems.HyperdriveMaterial, true, 1200, AddedItems.PowerCrystal, AddedItems.EnergyCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.LightningShard, AddedItems.LightningStone);
		addSynthesisRecipe(AddedItems.K34r, AddedItems.MarkOfAHeroChain, AddedItems.MarkOfAHeroMaterial, true, 1050, AddedItems.BrightCrystal, AddedItems.SerenityCrystal, AddedItems.LucidGem, AddedItems.LucidShard, AddedItems.BrightStone, AddedItems.LightningStone, AddedItems.SerenityGem);
		addSynthesisRecipe(AddedItems.K35r, AddedItems.VictoryLineChain, AddedItems.VictoryLineMaterial, true, 1050, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.BrightCrystal, AddedItems.LightningGem, AddedItems.BrightStone, AddedItems.LucidShard, AddedItems.LightningStone, AddedItems.DarkShard);
		addSynthesisRecipe(AddedItems.K36r, AddedItems.FairyStarsChain, AddedItems.FairyStarsMaterial, true, 900, AddedItems.MythrilCrystal, AddedItems.ShinyCrystal, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.DenseShard);
		addSynthesisRecipe(AddedItems.K37r, AddedItems.StrokeOfMidnightChain, AddedItems.StrokeOfMidnightMaterial, true, 900, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostShard, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.BrightGem);
		addSynthesisRecipe(AddedItems.K38r, AddedItems.ChaosRipperChain, AddedItems.ChaosRipperMaterial, true, 1050, AddedItems.LucidCrystal, AddedItems.LucidShard, AddedItems.DarkCrystal, AddedItems.DarkMatter, AddedItems.DarkStone, AddedItems.DarkStone, AddedItems.DenseGem, AddedItems.DenseStone);
		addSynthesisRecipe(AddedItems.K39r, AddedItems.XehanortsKeybladeChain, AddedItems.XehanortsKeybladeMaterial, true, 2700, AddedItems.OrichalcumPlus, AddedItems.DarkCrystal, AddedItems.MythrilCrystal, AddedItems.DenseCrystal, AddedItems.DarkGem, AddedItems.DarkStone, AddedItems.DenseStone, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.DarkShard, AddedItems.DarkMatter);
		addSynthesisRecipe(AddedItems.K40r, AddedItems.DarkgnawChain, AddedItems.DarkgnawMaterial, true, 1500, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkShard, AddedItems.LucidShard, AddedItems.LucidStone);
		addSynthesisRecipe(AddedItems.K41r, AddedItems.ZeroOneChain, AddedItems.ZeroOneMaterial, true, 1800, AddedItems.Orichalcum, AddedItems.EnergyCrystal, AddedItems.EnergyGem, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.PowerStone, AddedItems.PowerShard);
		addSynthesisRecipe(AddedItems.K42r, AddedItems.DreamSwordChain, AddedItems.DreamSwordMaterial, true, 750, AddedItems.RemembranceCrystal, AddedItems.TranquilCrystal, AddedItems.MythrilGem, AddedItems.TranquilGem, AddedItems.RemembranceStone, AddedItems.TranquilStone, AddedItems.TranquilShard, AddedItems.RemembranceShard);
		addSynthesisRecipe(AddedItems.K43r, AddedItems.AubadeChain, AddedItems.AubadeMaterial, true, 1350, AddedItems.BrightCrystal, AddedItems.PowerCrystal, AddedItems.ShinyCrystal, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerShard);
		addSynthesisRecipe(AddedItems.K44r, AddedItems.UmbrellaChain, AddedItems.UmbrellaMaterial, true, 600, AddedItems.FrostCrystal, AddedItems.FrostShard, AddedItems.FrostGem, AddedItems.LightningCrystal, AddedItems.LightningShard, AddedItems.LightningStone);
		addSynthesisRecipe(AddedItems.K45r, AddedItems.OmegaWeaponChain, AddedItems.OmegaWeaponMaterial, true, 1950, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.MythrilCrystal);
		addSynthesisRecipe(AddedItems.K46r, AddedItems.TwilightBlazeChain, AddedItems.TwilightBlazeMaterial, true, 1650, AddedItems.TwilightCrystal, AddedItems.BlazingCrystal, AddedItems.TwilightGem, AddedItems.BlazingStone, AddedItems.TwilightShard, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K47r, AddedItems.MaverickFlareChain, AddedItems.MaverickFlareMaterial, true, 1350, AddedItems.DarkCrystal, AddedItems.BlazingGem, AddedItems.DarkStone, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.DarkShard);
		addSynthesisRecipe(AddedItems.K48r, AddedItems.AstralBlastChain, AddedItems.AstralBlastMaterial, true, 1350, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.MythrilStone, AddedItems.MythrilShard);
		addSynthesisRecipe(AddedItems.K49r, AddedItems.DarkerThanDarkChain, AddedItems.DarkerThanDarkMaterial, true, 1200, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.LucidGem, AddedItems.LucidShard, AddedItems.DarkShard, AddedItems.DarkStone);
		addSynthesisRecipe(AddedItems.K50r, AddedItems.LunarEclipseChain, AddedItems.LunarEclipseMaterial, true, 900, AddedItems.Orichalcum, AddedItems.RemembranceCrystal, AddedItems.DarkGem, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.DarkStone, AddedItems.RemembranceShard);
		addSynthesisRecipe(AddedItems.K51r, AddedItems.SilentDirgeChain, AddedItems.SilentDirgeMaterial, true, 1050, AddedItems.SerenityCrystal, AddedItems.TranquilCrystal, AddedItems.FrostStone, AddedItems.TranquilShard, AddedItems.SerenityShard, AddedItems.FrostGem);
		addSynthesisRecipe(AddedItems.K52r, AddedItems.TotalEclipseChain, AddedItems.TotalEclipseMaterial, true, 1350, AddedItems.Orichalcum, AddedItems.TwilightCrystal, AddedItems.DarkGem, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.DarkStone, AddedItems.TwilightShard);
		addSynthesisRecipe(AddedItems.K53r, AddedItems.GlimpseOfDarknessChain, AddedItems.GlimpseOfDarknessMaterial, true, 900, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K54r, AddedItems.MidnightRoarChain, AddedItems.MidnightRoarMaterial, true, 900, AddedItems.DarkGem, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K55r, AddedItems.RejectionOfFateChain, AddedItems.RejectionOfFateMaterial, true, 1200, AddedItems.RemembranceCrystal, AddedItems.DarkCrystal, AddedItems.DenseShard, AddedItems.EnergyCrystal, AddedItems.EnergyStone, AddedItems.PowerShard);
		addSynthesisRecipe(AddedItems.K56r, AddedItems.TrueLightsFlightChain, AddedItems.TrueLightsFlightMaterial, true, 1200, AddedItems.Orichalcum, AddedItems.BrightCrystal, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerCrystal, AddedItems.PowerShard);
		addSynthesisRecipe(AddedItems.K57r, AddedItems.LeviathanChain, AddedItems.LeviathanMaterial, true, 1350, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.EnergyCrystal, AddedItems.PowerCrystal, AddedItems.PowerStone);
		addSynthesisRecipe(AddedItems.K58r, AddedItems.AbyssalTideChain, AddedItems.AbyssalTideMaterial, true, 1050, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.MythrilGem, AddedItems.FrostShard, AddedItems.DenseStone, AddedItems.FrostShard, AddedItems.FrostGem);
		addSynthesisRecipe(AddedItems.K59r, AddedItems.CrownOfGuiltChain, AddedItems.CrownOfGuiltMaterial, true, 1350, AddedItems.Orichalcum, AddedItems.DarkGem, AddedItems.DenseStone, AddedItems.DenseShard);
		addSynthesisRecipe(AddedItems.K60r, AddedItems.SignOfInnocenceChain, AddedItems.SignOfInnocenceMaterial, true, 900, AddedItems.BrightCrystal, AddedItems.SerenityCrystal, AddedItems.BrightStone, AddedItems.SerenityShard, AddedItems.SerenityStone, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K61r, AddedItems.PainOfSolitudeChain, AddedItems.PainOfSolitudeMaterial, true, 750, AddedItems.DenseCrystal, AddedItems.LucidGem, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.LucidShard, AddedItems.DenseShard);
		addSynthesisRecipe(AddedItems.K62r, AddedItems.AbaddonPlasmaChain, AddedItems.AbaddonPlasmaMaterial, true, 1050, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkShard);
		addSynthesisRecipe(AddedItems.K63r, AddedItems.OminousBlightChain, AddedItems.OminousBlightMaterial, true, 1500, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.BlazingShard, AddedItems.MythrilShard, AddedItems.BlazingGem, AddedItems.EnergyShard, AddedItems.EnergyStone);
		addSynthesisRecipe(AddedItems.K64r, AddedItems.MissingAcheChain, AddedItems.MissingAcheMaterial, true, 1200, AddedItems.RemembranceCrystal, AddedItems.ShinyCrystal, AddedItems.RemembranceGem, AddedItems.RemembranceStone, AddedItems.BrightStone);
		addSynthesisRecipe(AddedItems.K65r, AddedItems.WinnersProofChain, AddedItems.WinnersProofMaterial, true, 1800, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilGem, AddedItems.BlazingGem, AddedItems.FrostGem, AddedItems.LightningGem);
		addSynthesisRecipe(AddedItems.K66r, AddedItems.FatalCrestChain, AddedItems.FatalCrestMaterial, true, 2550, AddedItems.DarkCrystal, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.DarkShard, AddedItems.DenseShard);
		addSynthesisRecipe(AddedItems.K67r, AddedItems.TwoBecomesOneChain, AddedItems.TwoBecomesOneMaterial, true, 3000, AddedItems.PowerCrystal, AddedItems.EnergyCrystal, AddedItems.PowerStone, AddedItems.EnergyStone, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard);
		addSynthesisRecipe(AddedItems.K68r, AddedItems.BondOfFlamesChain, AddedItems.BondOfFlamesMaterial, true, 2100, AddedItems.DarkCrystal, AddedItems.BlazingCrystal, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K69r, AddedItems.FenrirChain, AddedItems.FenrirMaterial, true, 3600, AddedItems.LightningCrystal, AddedItems.MythrilCrystal, AddedItems.LightningGem, AddedItems.DenseStone, AddedItems.LightningShard, AddedItems.DenseShard);
		addSynthesisRecipe(AddedItems.K70r, AddedItems.SleepingLionChain, AddedItems.SleepingLionMaterial, true, 1950, AddedItems.TranquilCrystal, AddedItems.SerenityCrystal, AddedItems.SerenityGem, AddedItems.TranquilStone, AddedItems.SerenityShard, AddedItems.SerenityStone, AddedItems.TranquilGem, AddedItems.DarkShard);
		addSynthesisRecipe(AddedItems.K71r, AddedItems.GuardianSoulChain, AddedItems.GuardianSoulMaterial, true, 1200, AddedItems.Orichalcum, AddedItems.DenseCrystal, AddedItems.MythrilGem, AddedItems.BrightStone, AddedItems.DenseShard, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K72r, AddedItems.GullWingChain, AddedItems.GullwingMaterial, true, 750, AddedItems.LightningCrystal, AddedItems.LightningGem, AddedItems.LightningStone, AddedItems.LightningShard, AddedItems.SerenityStone, AddedItems.TranquilCrystal, AddedItems.TranquilShard, AddedItems.SerenityGem);
		addSynthesisRecipe(AddedItems.K73r, AddedItems.PhotonDebuggerChain, AddedItems.PhotonDebuggerMaterial, true, 900, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.MythrilGem, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.EnergyStone);
		addSynthesisRecipe(AddedItems.K74r, AddedItems.SweetMemoriesChain, AddedItems.SweetMemoriesMaterial, true, 1050, AddedItems.ShinyCrystal, AddedItems.TranquilGem, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.FrostShard, AddedItems.BrightCrystal, AddedItems.TranquilShard, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K75r, AddedItems.CircleOfLifeChain, AddedItems.CircleOfLifeMaterial, true, 1350, AddedItems.RemembranceCrystal, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.SerenityStone, AddedItems.SerenityShard, AddedItems.TranquilShard);
		addSynthesisRecipe(AddedItems.K76r, AddedItems.DecisivePumpkinChain, AddedItems.DecisivePumpkinMaterial, true, 3150, AddedItems.RemembranceCrystal, AddedItems.SerenityCrystal, AddedItems.DarkCrystal, AddedItems.LucidStone, AddedItems.BrightShard, AddedItems.DarkShard);
		addSynthesisRecipe(AddedItems.K77r, AddedItems.WishingLampChain, AddedItems.WishingLampMaterial, true, 1050, AddedItems.ShinyCrystal, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.MythrilGem, AddedItems.BrightStone, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K78r, AddedItems.FollowTheWindChain, AddedItems.FollowTheWindMaterial, true, 1200, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.LightningGem, AddedItems.LightningStone, AddedItems.LightningShard);
		addSynthesisRecipe(AddedItems.K79r, AddedItems.MysteriousAbyssChain, AddedItems.MysteriousAbyssMaterial, true, 900, AddedItems.FrostCrystal, AddedItems.PowerCrystal, AddedItems.MythrilGem, AddedItems.MythrilShard, AddedItems.FrostShard, AddedItems.PowerStone);
		addSynthesisRecipe(AddedItems.K80r, AddedItems.MonochromeChain, AddedItems.MonochromeMaterial, true, 900, AddedItems.Orichalcum, AddedItems.LucidCrystal, AddedItems.TwilightGem, AddedItems.MythrilGem, AddedItems.TwilightStone, AddedItems.LucidStone, AddedItems.LucidShard, AddedItems.TwilightShard);
		addSynthesisRecipe(AddedItems.K81r, AddedItems.HerosCrestChain, AddedItems.HerosCrestMaterial, true, 900, AddedItems.BrightCrystal, AddedItems.TwilightCrystal, AddedItems.BrightStone, AddedItems.DenseStone, AddedItems.BrightShard, AddedItems.SerenityShard, AddedItems.TranquilStone, AddedItems.TranquilCrystal);
		addSynthesisRecipe(AddedItems.K82r, AddedItems.RumblingRoseChain, AddedItems.RumblingRoseMaterial, true, 1650, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.EnergyStone, AddedItems.PowerShard, AddedItems.MythrilShard);
		addSynthesisRecipe(AddedItems.K83r, AddedItems.HiddenDragonChain, AddedItems.HiddenDragonMaterial, true, 1050, AddedItems.OrichalcumPlus, AddedItems.BlazingCrystal, AddedItems.DarkGem, AddedItems.BlazingStone, AddedItems.DarkStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K84r, AddedItems.EndsOfEarthChain, AddedItems.EndsOfEarthMaterial, true, 1350, AddedItems.DenseCrystal, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.DarkStone, AddedItems.DarkShard, AddedItems.DenseShard);
		addSynthesisRecipe(AddedItems.K85r, AddedItems.StormfallChain, AddedItems.StormfallMaterial, true, 1200, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.FrostShard);
		addSynthesisRecipe(AddedItems.K86r, AddedItems.DestinysEmbraceChain, AddedItems.DestinysEmbraceMaterial, true, 1050, AddedItems.SerenityCrystal, AddedItems.ShinyCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.TranquilStone, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K87r, AddedItems.WayToDawnChain, AddedItems.WayToDawnMaterial, true, 1350, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.LightningGem, AddedItems.TwilightGem, AddedItems.DarkStone, AddedItems.LightningShard, AddedItems.TwilightShard);
		addSynthesisRecipe(AddedItems.K88r, AddedItems.OneWingedAngelChain, AddedItems.OneWingedAngelMaterial, true, 2250, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.BlazingGem, AddedItems.BlazingStone, AddedItems.BlazingShard);
		addSynthesisRecipe(AddedItems.K89r, AddedItems.DiamondDustChain, AddedItems.DiamondDustMaterial, true, 1500, AddedItems.Orichalcum, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.FrostShard, AddedItems.MythrilCrystal, AddedItems.TwilightGem);
		addSynthesisRecipe(AddedItems.K90r, AddedItems.LionHeartChain, AddedItems.LionHeartMaterial, true, 1050, AddedItems.BlazingCrystal, AddedItems.PowerCrystal, AddedItems.PowerStone, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.PowerShard);
		addSynthesisRecipe(AddedItems.K91r, AddedItems.MetalChocoboChain, AddedItems.MetalChocoboMaterial, true, 1050, AddedItems.SerenityCrystal, AddedItems.LightningGem, AddedItems.SerenityStone, AddedItems.LightningShard, AddedItems.DenseCrystal, AddedItems.DenseShard, AddedItems.TranquilCrystal);
		addSynthesisRecipe(AddedItems.K92r, AddedItems.SpellBinderChain, AddedItems.SpellBinderMaterial, true, 900, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.BrightCrystal, AddedItems.EnergyCrystal);
		addSynthesisRecipe(AddedItems.K93r, AddedItems.DivineRoseChain, AddedItems.DivineRoseMaterial, true, 900, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K94r, AddedItems.FairyHarpChain, AddedItems.FairyHarpMaterial, true, 1050, AddedItems.TwilightCrystal, AddedItems.TranquilCrystal, AddedItems.MythrilCrystal, AddedItems.TranquilGem, AddedItems.DenseStone, AddedItems.TwilightStone, AddedItems.TranquilShard);
		addSynthesisRecipe(AddedItems.K95r, AddedItems.CrabClawChain, AddedItems.CrabClawMaterial, true, 750, AddedItems.FrostCrystal, AddedItems.MythrilGem, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.MythrilStone, AddedItems.FrostShard);
		addSynthesisRecipe(AddedItems.K96r, AddedItems.WishingStarChain, AddedItems.WishingStarMaterial, true, 1350, AddedItems.DenseCrystal, AddedItems.RemembranceCrystal, AddedItems.DenseGem, AddedItems.RemembranceGem, AddedItems.RemembranceStone, AddedItems.RemembranceShard);
		addSynthesisRecipe(AddedItems.K97r, AddedItems.PumpkinHeadChain, AddedItems.PumpkinHeadMaterial, true, 1500, AddedItems.DarkCrystal, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkStone, AddedItems.LucidShard);
		addSynthesisRecipe(AddedItems.K98r, AddedItems.ThreeWishesChain, AddedItems.ThreeWishesMaterial, true, 1200, AddedItems.DenseCrystal, AddedItems.SerenityCrystal, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.DenseGem, AddedItems.SerenityGem, AddedItems.DenseStone, AddedItems.SerenityStone, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.SerenityShard);
		addSynthesisRecipe(AddedItems.K99r, AddedItems.JungleKingChain, AddedItems.JungleKingMaterial, true, 1050, AddedItems.EnergyCrystal, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.EnergyCrystal, AddedItems.PowerShard, AddedItems.PowerStone);
		addSynthesisRecipe(AddedItems.K100r, AddedItems.OlympiaChain, AddedItems.OlympiaMaterial, true, 1350, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilGem, AddedItems.SerenityGem, AddedItems.SerenityShard, AddedItems.PowerCrystal, AddedItems.PowerGem);
		addSynthesisRecipe(AddedItems.K101r, AddedItems.LadyLuckChain, AddedItems.LadyLuckMaterial, true, 900, AddedItems.TranquilGem, AddedItems.SerenityGem, AddedItems.BrightCrystal, AddedItems.TranquilStone, AddedItems.SerenityShard, AddedItems.TranquilShard, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K102r, AddedItems.PeoplesHeartsChain, AddedItems.PeoplesHeartsMaterial, true, 1950,  AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.OrichalcumPlus, AddedItems.LucidGem, AddedItems.LucidStone, AddedItems.DarkGem, AddedItems.DarkStone, AddedItems.TwilightCrystal, AddedItems.Heart);
		addSynthesisRecipe(AddedItems.K103r, AddedItems.UltimaWeaponChain, AddedItems.UltimaWeaopnMaterial, true, 2700,  AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.EnergyCrystal, AddedItems.TwilightCrystal, AddedItems.DenseCrystal, AddedItems.MythrilCrystal, AddedItems.SerenityCrystal, AddedItems.ShinyCrystal);
		addSynthesisRecipe(AddedItems.K104r, AddedItems.TreasureTroveChain, AddedItems.TreasureTroveMaterial, true, 1050, AddedItems.DenseCrystal, AddedItems.BlazingGem, AddedItems.FrostGem, AddedItems.LightningGem, AddedItems.BrightShard, AddedItems.BrightStone);
		addSynthesisRecipe(AddedItems.K105r, AddedItems.StarseekerChain, AddedItems.StarseekerMaterial, true, 1800, AddedItems.Orichalcum, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.DarkStone, AddedItems.TwilightGem, AddedItems.TwilightStone);
		addSynthesisRecipe(AddedItems.K106r, AddedItems.SoulEaterChain, AddedItems.SoulEaterMaterial, true, 1800, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.RemembranceGem, AddedItems.SerenityGem, AddedItems.LucidShard, AddedItems.LucidStone, AddedItems.PowerGem);
		addSynthesisRecipe(AddedItems.K107r, AddedItems.StarlightChain, AddedItems.StarlightMaterial, true, 900, AddedItems.ShinyCrystal, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.EnergyGem, AddedItems.PowerGem);
		addSynthesisRecipe(AddedItems.K108r, AddedItems.RainfellChain, AddedItems.RainfellMaterial, true, 900, AddedItems.BrightCrystal, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.BrightShard, AddedItems.DenseShard, AddedItems.FrostShard, AddedItems.BrightStone);
		addSynthesisRecipe(AddedItems.K109r, AddedItems.EarthShakerChain, AddedItems.EarthshakerMaterial, true, 1500, AddedItems.PowerCrystal, AddedItems.DarkCrystal, AddedItems.BrightStone, AddedItems.DenseGem, AddedItems.DarkShard, AddedItems.DarkStone);
		addSynthesisRecipe(AddedItems.K110r, AddedItems.WaywardWindChain, AddedItems.WaywardWindMaterial, true, 1200, AddedItems.LightningCrystal, AddedItems.LightningStone, AddedItems.DenseShard, AddedItems.LightningGem, AddedItems.PowerCrystal, AddedItems.PowerGem);
		addSynthesisRecipe(AddedItems.K111r, AddedItems.KingdomKeyChain, AddedItems.KingdomKeyMaterial, true, 750, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K112r, AddedItems.OathkeeperChain, AddedItems.OathkeeperMaterial, true, 1650, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard);
		addSynthesisRecipe(AddedItems.K113r, AddedItems.KingdomKeyDChain, AddedItems.KingdomKeyDMaterial, true, 1650, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerCrystal, AddedItems.DenseGem);
		addSynthesisRecipe(AddedItems.K114r, AddedItems.OblivionChain, AddedItems.OblivionMaterial, true, 1950, AddedItems.OrichalcumPlus, AddedItems.DarkCrystal, AddedItems.DenseCrystal, AddedItems.PowerGem, AddedItems.TwilightCrystal, AddedItems.TwilightStone, AddedItems.DarkShard, AddedItems.LucidStone, AddedItems.DarkMatter);
		addSynthesisRecipe(AddedItems.MythrilShardRecipe, AddedItems.MythrilShard, null, false, 200, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.DenseShard, AddedItems.TwilightShard, AddedItems.TwilightStone);
		addSynthesisRecipe(AddedItems.MythrilStoneRecipe, AddedItems.MythrilStone, null, false, 200, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.DenseShard, AddedItems.TwilightShard, AddedItems.TwilightStone, AddedItems.SerenityShard);
		addSynthesisRecipe(AddedItems.MythrilGemRecipe, AddedItems.MythrilGem, null, false, 200, AddedItems.DenseShard, AddedItems.DenseGem, AddedItems.DenseCrystal, AddedItems.TwilightGem, AddedItems.TwilightCrystal);
		addSynthesisRecipe(AddedItems.MythrilCrystalRecipe, AddedItems.MythrilCrystal, null, false, 200, AddedItems.DenseShard, AddedItems.DenseGem, AddedItems.DenseCrystal, AddedItems.TwilightGem, AddedItems.TwilightCrystal, AddedItems.SerenityStone);
		addSynthesisRecipe(AddedItems.DarkMatterRecipe, AddedItems.DarkMatter, null, false, 1000, AddedItems.DarkCrystal, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkHeart);

		
		if(ClickedTab1){
			Tab2SrcY = 0;
			Tab1SrcY = 17;
			mc.renderEngine.bindTexture(texture);
		}else if(ClickedTab2){
			Tab1SrcY = 0;
			Tab2SrcY = 17;
		}else if(ClickedTab3){

		}

		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab1ToolTip = new ArrayList<String>();
			Tab1ToolTip.add(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab1));
			drawHoveringText(Tab1ToolTip, x - guiLeft, y - guiTop, fontRendererObj);
		}

		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab2ToolTip = new ArrayList<String>();
			Tab2ToolTip.add(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab2));
			drawHoveringText(Tab2ToolTip, x - guiLeft, y - guiTop, fontRendererObj);
		}

		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab3ToolTip = new ArrayList<String>();
			Tab3ToolTip.add(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3));
			drawHoveringText(Tab3ToolTip, x - guiLeft, y - guiTop, fontRendererObj);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void initGui(){
		super.initGui();
		ButtonPressed = false;
		buttonList.clear();
		Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:kupo", 1, 1F);
		GuiButton Synthesize = new GuiButton(0, guiLeft + 108, guiTop + 4, 60, 20, StatCollector.translateToLocal(LocalStrings.Synthesis_Button_Synthesize));
		buttonList.add(Synthesize);
	}

	public static boolean ButtonPressed = false;

	@Override
	protected void actionPerformed(GuiButton button){
		if(button.id == 0){
			ButtonPressed = true;
		}else{
			ButtonPressed = false;
		}

	}

	@Override
	protected void mouseClicked(int x, int y, int button) {
		GuiTabs tab = new GuiTabs(button, button, button, button);
		super.mouseClicked(x, y, button);
		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			ClickedTab1 = true;
			ClickedTab2 = false;
			ClickedTab3 = false;
		}
		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			ClickedTab1 = false;
			ClickedTab2 = true;
			ClickedTab3 = false;
		}
		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			ClickedTab1 = false;
			ClickedTab2 = false;
			ClickedTab3 = true;

			x = mouseX;
			y = mouseY;
		}

	}

	int mouseX;
	int mouseY;

	protected int getLeft() {
		return guiLeft;
	}

	protected int getTop() {
		return guiTop;
	}

	protected int getX(){
		return mouseX;
	}

	protected int getY(){
		return mouseY;
	}

	//Boolean for checking items
	boolean hasItems = false;
	//Colour for colour changing text
	int colour = 0x404040;

	int resultXY = 28;
	int item1X = 26;
	int item1Y = 34;
	int item2X = 43;
	int item2Y = 34;
	int item3X = 60;
	int item3Y = 34;
	int item4X = 77;
	int item4Y = 34;
	int item5X = 94;
	int item5Y = 34;
	int item6X = 111;
	int item6Y = 34;
	int item7X = 128;
	int item7Y = 34;
	int item8X = 26;
	int item8Y = 51;
	int item9X = 43;
	int item9Y = 51;
	int item10X = 60;
	int item10Y = 51;
	int item11X = 77;
	int item11Y = 51;
	
	//1
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1){
		//WIP - Making API work with Synthesis
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		RecipeHandler rh = new RecipeHandler();
		if(synthesis.getStackInSlot(0) != null){
			for(int i = 0; i > (rh.getTotalRegistered() + 1); i++){
				Recipe r = rh.getRecipe(Integer.toString(i));
				if(synthesis.getStackInSlot(0).getItem() == r.getRecipe()){
					//Make colour and lighting display correctly
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					//Display recipe cost
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + r.getCost(), 38, 14, 0xFFF000);
					//Tab 1 Content
					if(GuiSynthesis.ClickedTab1){
						if(mc.thePlayer.inventory.hasItem(r.getMaterials(r.materialsAmount() - r.materialsAmount() + 1).getItem())){
							
						}
					}
				}
			}
		}

		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);

				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//2
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);
				
				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//3
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);

				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//4
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);
				
				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//5
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4, Item item5){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);
				
				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//6
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);

				//Stuff displayed on the first tab
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe && props.getMunny() >= cost){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), new ItemStack(item6), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//7
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);
				
				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(LocalStrings.Synthesis_Material, 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), new ItemStack(item6), new ItemStack(item7), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//8
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7, Item item8){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);
				
				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item8), item8X, item8Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), new ItemStack(item6), new ItemStack(item7), new ItemStack(item8), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//9
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7, Item item8, Item item9){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);

				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item8), item8X, item8Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item9), item9X, item9Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), new ItemStack(item6), new ItemStack(item7), new ItemStack(item8), new ItemStack(item9), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//10
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7, Item item8, Item item9, Item item10){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);

				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item8), item8X, item8Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item9), item9X, item9Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item10), item10X, item10Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), new ItemStack(item6), new ItemStack(item7), new ItemStack(item8), new ItemStack(item9), new ItemStack(item10), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}

	//11
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, int cost, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7, Item item8, Item item9, Item item10, Item item11){
		EntityPropertyMunny props = EntityPropertyMunny.get(mc.thePlayer);
		if(synthesis.getStackInSlot(0) != null)
		{
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);
				fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Cost) + ": " + cost, 38, 14, 0xFFF000);

				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item11) && props.getMunny() >= cost){
						hasItems = true;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
						colour = 0x00B330;
					}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item11)){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
						colour = 0xFF0000;
					}else if(props.getMunny() < cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
						colour = 0xFF0000;
					}else if(props.getMunny() >= cost){
						hasItems = false;
						SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
						colour = 0xFF0000;
					}
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " " + StatCollector.translateToLocal(LocalStrings.Synthesis_Attack_Damage), 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Material), 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item8), item8X, item8Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item9), item9X, item9Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item10), item10X, item10Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item11), item11X, item11Y);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item11)){
						colour = 0x00B330;
					}else{
						colour = 0xFF0000;
					}
					fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_RequiredMats), 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Attack), 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString(StatCollector.translateToLocal(LocalStrings.Synthesis_Tab3_Mat), 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item11) && props.getMunny() >= cost){
			hasItems = true;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required1);
			colour = 0x00B330;
		}else if(props.getMunny() < cost && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item11)){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required4);
			colour = 0xFF0000;
		}else if(props.getMunny() < cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required2);
			colour = 0xFF0000;
		}else if(props.getMunny() >= cost){
			hasItems = false;
			SynthesizeText = StatCollector.translateToLocal(LocalStrings.Synthesis_Required3);
			colour = 0xFF0000;
		}

		if(hasItems){
			if(ButtonPressed){
				if (!Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().currentScreen instanceof GuiSynthesis){
					Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
					if(synthesis.getStackInSlot(0) != null){
						if(synthesis.getStackInSlot(0).getItem() == recipe){
							IMessage packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), new ItemStack(item6), new ItemStack(item7), new ItemStack(item8), new ItemStack(item9), new ItemStack(item10), new ItemStack(item11), cost);
							KingdomKeys.network.sendToServer(packetsynth);
						}
					}
				}
			}
			ButtonPressed = false;
		}
	}
}

