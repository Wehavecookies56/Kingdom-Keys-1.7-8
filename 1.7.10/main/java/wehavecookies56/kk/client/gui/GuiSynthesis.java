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

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.core.packet.IPacket;
import wehavecookies56.kk.core.packet.SynthesisPacket;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GuiSynthesis extends GuiContainer {


	TileEntitySynthesis synthesis = new TileEntitySynthesis();
	public static boolean ClickedTab1 = true;
	public static boolean ClickedTab2 = false;
	public static boolean ClickedTab3 = false;

	public String SynthesizeText = "You lack the required materials to Synthesize";
	int colour = 0xFF0000;


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

		mc.fontRenderer.drawString("Synthesis", 38, 14, 0x404040);
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

		if(synthesis.getStackInSlot(0) == null){
			if(ClickedTab1){
				mc.fontRenderer.drawSplitString("Place an Attack Recipe or a Material Recipe in the slot", 30, 48, 120, 0xFF0000);
			}
			else if(ClickedTab2){
				mc.fontRenderer.drawSplitString("Place an Attack Recipe or a Material Recipe in the slot", 30, 30, 120, 0xFF0000);
			}
			else if(ClickedTab3){
				mc.fontRenderer.drawSplitString("Place an Attack Recipe or a Material Recipe in the slot", 30, 30, 120, 0xFF0000);
			}
		}
		/*
		boolean gotItems = false;
		int colorText = 0xFF0000;
		if(synthesis.getStackInSlot(0) != null) {
			if(synthesis.getStackInSlot(0).getItem() == AddedItems.K88r){
				if(ClickedTab1){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(AddedItems.K88), 28, 28);
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					fontRendererObj.drawString("+" + ((int)AddedItems.K88m.getDamageVsEntity() + 4) + " Attack Damage", 28, 48, 0x004CFF);
					fontRendererObj.drawSplitString("You lack the required materials to synthesize", 28, 60, 120, 0xFF0000);
					fontRendererObj.drawSplitString(AddedItems.K88.getItemStackDisplayName(new ItemStack(AddedItems.K88)), 46, 28, 120, 0x404040);

				}else if(ClickedTab2){
					fontRendererObj.drawString("Required Materials", 30, 27, 0x404040);

				}else if(ClickedTab3){
					fontRendererObj.drawSplitString("This keyblade has the enchantment Vanquish. It allows you to collect hearts from mobs when they are slain.", 30, 30, 120, 0x004CFF);
				}
				if(mc.thePlayer.inventory.hasItem(AddedItems.BlazingCrystal) && mc.thePlayer.inventory.hasItemStack(new ItemStack(AddedItems.BlazingGem, 0, 2))){
					gotItems = true;
				}else{
					gotItems = false;
				}
				if(gotItems){
					colorText = 0x00B330;
				}else{
					colorText = 0xFF0000;
				}
			}
		}*/


		addSynthesisRecipe(AddedItems.K1r, AddedItems.K1c, AddedItems.VulpeusMaterial, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.EnergyStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K2r, AddedItems.K2c, AddedItems.UrsusMaterial, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.PowerStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K3r, AddedItems.K3c, AddedItems.UnicornisMaterial, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.TwilightStone, AddedItems.BrightStone, AddedItems.BlazingStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K4r, AddedItems.K4c, AddedItems.K4m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DarkStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K5r, AddedItems.K5c, AddedItems.K5m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K6r, AddedItems.K6c, AddedItems.K6m, true, AddedItems.BlazingCrystal, AddedItems.DarkShard, AddedItems.MythrilShard, AddedItems.BrightGem, AddedItems.BlazingShard, AddedItems.DarkStone, AddedItems.BlazingStone, AddedItems.DarkMatter, null, null, null);
		addSynthesisRecipe(AddedItems.K7r, AddedItems.K7c, AddedItems.K7m, true, AddedItems.DarkCrystal, AddedItems.PowerCrystal, AddedItems.LucidGem, AddedItems.DenseShard, AddedItems.PowerStone, AddedItems.LucidStone, AddedItems.Orichalcum, AddedItems.DarkShard, AddedItems.LucidShard, null, null);
		addSynthesisRecipe(AddedItems.K8r, AddedItems.K8c, AddedItems.K8m, true, AddedItems.PowerCrystal, AddedItems.BrightGem, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.PowerStone, AddedItems.LucidShard, AddedItems.FrostStone, AddedItems.FrostShard, null, null, null);
		addSynthesisRecipe(AddedItems.K9r, AddedItems.K8c, AddedItems.K9m, true, AddedItems.TranquilCrystal, AddedItems.TwilightGem, AddedItems.TwilightStone, AddedItems.PowerShard, AddedItems.DenseShard, AddedItems.PowerCrystal, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K10r, AddedItems.K10c, AddedItems.K10m, true, AddedItems.DarkCrystal, AddedItems.DenseGem, AddedItems.LucidGem, AddedItems.EnergyShard, AddedItems.LucidShard, AddedItems.DenseStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K11r, AddedItems.K11c, AddedItems.K11m, true, AddedItems.BrightCrystal, AddedItems.TwilightCrystal, AddedItems.BrightGem, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerStone, AddedItems.BlazingShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K12r, AddedItems.K12c, AddedItems.K12m, true, AddedItems.PowerCrystal, AddedItems.LightningCrystal, AddedItems.LightningGem, AddedItems.BlazingStone, AddedItems.BrightGem, AddedItems.Orichalcum, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K13r, AddedItems.K13c, AddedItems.K13m, true, AddedItems.RemembranceCrystal, AddedItems.DarkGem, AddedItems.BlazingShard, AddedItems.LucidShard, AddedItems.DenseStone, AddedItems.LucidShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K14r, AddedItems.K14c, AddedItems.K14m, true, AddedItems.DenseCrystal, AddedItems.MythrilShard, AddedItems.MythrilGem, AddedItems.BrightShard, AddedItems.BrightStone, AddedItems.FrostShard, AddedItems.LightningShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K15r, AddedItems.K15c, AddedItems.K15m, true, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.MythrilCrystal, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.DarkStone, AddedItems.LucidGem, AddedItems.DenseCrystal, AddedItems.BlazingShard, null, null);
		addSynthesisRecipe(AddedItems.K16r, AddedItems.K16c, AddedItems.K16m, true, AddedItems.PowerCrystal, AddedItems.BrightShard, AddedItems.LucidGem, AddedItems.TranquilStone, AddedItems.TranquilGem, AddedItems.MythrilShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K17r, AddedItems.K17c, AddedItems.K17m, true, AddedItems.EnergyGem, AddedItems.PowerGem, AddedItems.DenseStone, AddedItems.DenseShard, AddedItems.BrightStone, AddedItems.BrightGem, AddedItems.EnergyCrystal, null, null, null, null);
		addSynthesisRecipe(AddedItems.K18r, AddedItems.K18c, AddedItems.K18m, true, AddedItems.DarkCrystal, AddedItems.ShinyCrystal, AddedItems.MythrilShard, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K19r, AddedItems.K19c, AddedItems.K19m, true, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.LucidGem, AddedItems.MythrilGem, AddedItems.BlazingStone, AddedItems.DarkShard, AddedItems.BlazingShard, AddedItems.DarkStone, null, null, null);
		addSynthesisRecipe(AddedItems.K20r, AddedItems.K20c, AddedItems.K20m, true, AddedItems.TranquilGem, AddedItems.SerenityShard, AddedItems.BrightShard, AddedItems.DenseStone, AddedItems.DenseShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K21r, AddedItems.K21c, AddedItems.K21m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkHeart, AddedItems.KingdomHearts, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.PureHeart, AddedItems.BrightStone, AddedItems.Heart);
		addSynthesisRecipe(AddedItems.K22r, AddedItems.K22c, AddedItems.K22m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkHeart, AddedItems.KingdomHearts, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.PureHeart, AddedItems.K21, AddedItems.Heart);
		addSynthesisRecipe(AddedItems.K23r, AddedItems.K23c, AddedItems.K23m, true, AddedItems.SerenityCrystal, AddedItems.BrightCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K24r, AddedItems.K24c, AddedItems.K24m, true, AddedItems.OrichalcumPlus, AddedItems.RemembranceCrystal, AddedItems.RemembranceShard, AddedItems.DarkStone, AddedItems.BrightStone, AddedItems.TwilightGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K25r, AddedItems.K25c, AddedItems.K25m, true, AddedItems.Orichalcum, AddedItems.BlazingCrystal, AddedItems.BlazingGem, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.TwilightGem, null, null);
		addSynthesisRecipe(AddedItems.K26r, AddedItems.K26c, AddedItems.K26m, true, AddedItems.OrichalcumPlus, AddedItems.MythrilGem, AddedItems.PowerShard, AddedItems.BlazingStone, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K27r, AddedItems.K27c, AddedItems.K27m, true, AddedItems.SerenityCrystal, AddedItems.MythrilCrystal, AddedItems.MythrilShard, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.SerenityShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K28r, AddedItems.K28c, AddedItems.K28m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.BrightStone, AddedItems.PowerShard, AddedItems.EnergyGem, AddedItems.EnergyShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K29r, AddedItems.K29c, AddedItems.K29m, true, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkShard, AddedItems.EnergyStone, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.PowerCrystal, null, null, null);
		addSynthesisRecipe(AddedItems.K30r, AddedItems.K30c, AddedItems.K30m, true, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkGem, AddedItems.DarkStone, AddedItems.DarkShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K31r, AddedItems.K31c, AddedItems.K31m, true, AddedItems.ShinyCrystal, AddedItems.SerenityCrystal, AddedItems.SerenityShard, AddedItems.FrostGem, AddedItems.FrostShard, AddedItems.TranquilStone, AddedItems.BrightGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K32r, AddedItems.K32c, AddedItems.K32m, true, AddedItems.MythrilCrystal, AddedItems.SerenityStone, AddedItems.TranquilStone, AddedItems.MythrilShard, AddedItems.TranquilShard, AddedItems.BrightCrystal, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K33r, AddedItems.K33c, AddedItems.K33m, true, AddedItems.PowerCrystal, AddedItems.EnergyCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.LightningShard, AddedItems.LightningStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K34r, AddedItems.K34c, AddedItems.K34m, true, AddedItems.BrightCrystal, AddedItems.SerenityCrystal, AddedItems.LucidGem, AddedItems.LucidShard, AddedItems.BrightStone, AddedItems.LightningStone, AddedItems.SerenityGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K35r, AddedItems.K35c, AddedItems.K35m, true, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.BrightCrystal, AddedItems.LightningGem, AddedItems.BrightStone, AddedItems.LucidShard, AddedItems.LightningStone, AddedItems.DarkShard, null, null, null);
		addSynthesisRecipe(AddedItems.K36r, AddedItems.K36c, AddedItems.K36m, true, AddedItems.MythrilCrystal, AddedItems.ShinyCrystal, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.DenseShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K37r, AddedItems.K37c, AddedItems.K37m, true, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostShard, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.BrightGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K38r, AddedItems.K38c, AddedItems.K38m, true, AddedItems.LucidCrystal, AddedItems.LucidShard, AddedItems.DarkCrystal, AddedItems.DarkMatter, AddedItems.DarkStone, AddedItems.DarkStone, AddedItems.DenseGem, AddedItems.DenseStone, null, null, null);
		addSynthesisRecipe(AddedItems.K39r, AddedItems.K39c, AddedItems.K39m, true, AddedItems.OrichalcumPlus, AddedItems.DarkCrystal, AddedItems.MythrilCrystal, AddedItems.DenseCrystal, AddedItems.DarkGem, AddedItems.DarkStone, AddedItems.DenseStone, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.DarkShard, AddedItems.DarkMatter);
		addSynthesisRecipe(AddedItems.K40r, AddedItems.K40c, AddedItems.K40m, true, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkShard, AddedItems.LucidShard, AddedItems.LucidStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K41r, AddedItems.K41c, AddedItems.K41m, true, AddedItems.Orichalcum, AddedItems.EnergyCrystal, AddedItems.EnergyGem, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.PowerStone, AddedItems.PowerShard, null, null);
		addSynthesisRecipe(AddedItems.K42r, AddedItems.K42c, AddedItems.K42m, true, AddedItems.RemembranceCrystal, AddedItems.TranquilCrystal, AddedItems.MythrilGem, AddedItems.TranquilGem, AddedItems.RemembranceStone, AddedItems.TranquilStone, AddedItems.TranquilShard, AddedItems.RemembranceShard, null, null, null);
		addSynthesisRecipe(AddedItems.K43r, AddedItems.K43c, AddedItems.K43m, true, AddedItems.BrightCrystal, AddedItems.PowerCrystal, AddedItems.ShinyCrystal, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K44r, AddedItems.K44c, AddedItems.K44m, true, AddedItems.FrostCrystal, AddedItems.FrostShard, AddedItems.FrostGem, AddedItems.LightningCrystal, AddedItems.LightningShard, AddedItems.LightningStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K45r, AddedItems.K45c, AddedItems.K45m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.MythrilCrystal, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K46r, AddedItems.K46c, AddedItems.K46m, true, AddedItems.TwilightCrystal, AddedItems.BlazingCrystal, AddedItems.TwilightGem, AddedItems.BlazingStone, AddedItems.TwilightShard, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K47r, AddedItems.K47c, AddedItems.K47m, true, AddedItems.DarkCrystal, AddedItems.BlazingGem, AddedItems.DarkStone, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.DarkShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K48r, AddedItems.K48c, AddedItems.K48m, true, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.MythrilStone, AddedItems.MythrilShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K49r, AddedItems.K49c, AddedItems.K49m, true, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.LucidGem, AddedItems.LucidShard, AddedItems.DarkShard, AddedItems.DarkStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K50r, AddedItems.K50c, AddedItems.K50m, true, AddedItems.Orichalcum, AddedItems.RemembranceCrystal, AddedItems.DarkGem, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.DarkStone, AddedItems.RemembranceShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K51r, AddedItems.K51c, AddedItems.K51m, true, AddedItems.SerenityCrystal, AddedItems.TranquilCrystal, AddedItems.FrostStone, AddedItems.TranquilShard, AddedItems.SerenityShard, AddedItems.FrostGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K52r, AddedItems.K52c, AddedItems.K52m, true, AddedItems.Orichalcum, AddedItems.TwilightCrystal, AddedItems.DarkGem, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.DarkStone, AddedItems.TwilightShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K53r, AddedItems.K53c, AddedItems.K53m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K54r, AddedItems.K54c, AddedItems.K54m, true, AddedItems.DarkGem, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K55r, AddedItems.K55c, AddedItems.K55m, true, AddedItems.RemembranceCrystal, AddedItems.DarkCrystal, AddedItems.DenseShard, AddedItems.EnergyCrystal, AddedItems.EnergyStone, AddedItems.PowerShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K56r, AddedItems.K56c, AddedItems.K56m, true, AddedItems.Orichalcum, AddedItems.BrightCrystal, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerCrystal, AddedItems.PowerShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K57r, AddedItems.K57c, AddedItems.K57m, true, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.EnergyCrystal, AddedItems.PowerCrystal, AddedItems.PowerStone, null, null, null, null);
		addSynthesisRecipe(AddedItems.K58r, AddedItems.K58c, AddedItems.K58m, true, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.MythrilGem, AddedItems.FrostShard, AddedItems.DenseStone, AddedItems.FrostShard, AddedItems.FrostGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K59r, AddedItems.K59c, AddedItems.K59m, true, AddedItems.Orichalcum, AddedItems.DarkGem, AddedItems.DenseStone, AddedItems.DenseShard, null, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K60r, AddedItems.K60c, AddedItems.K60m, true, AddedItems.BrightCrystal, AddedItems.SerenityCrystal, AddedItems.BrightStone, AddedItems.SerenityShard, AddedItems.SerenityStone, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K61r, AddedItems.K61c, AddedItems.K61m, true, AddedItems.DenseCrystal, AddedItems.LucidGem, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.LucidShard, AddedItems.DenseShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K62r, AddedItems.K62c, AddedItems.K62m, true, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K63r, AddedItems.K63c, AddedItems.K63m, true, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.BlazingShard, AddedItems.MythrilShard, AddedItems.BlazingGem, AddedItems.EnergyShard, AddedItems.EnergyStone, null, null, null, null);
		addSynthesisRecipe(AddedItems.K64r, AddedItems.K64c, AddedItems.K64m, true, AddedItems.RemembranceCrystal, AddedItems.ShinyCrystal, AddedItems.RemembranceGem, AddedItems.RemembranceStone, AddedItems.BrightStone, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K65r, AddedItems.K65c, AddedItems.K65m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilGem, AddedItems.BlazingGem, AddedItems.FrostGem, AddedItems.LightningGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K66r, AddedItems.K66c, AddedItems.K66m, true, AddedItems.DarkCrystal, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.DarkShard, AddedItems.DenseShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K67r, AddedItems.K67c, AddedItems.K67m, true, AddedItems.PowerCrystal, AddedItems.EnergyCrystal, AddedItems.PowerStone, AddedItems.EnergyStone, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K68r, AddedItems.K68c, AddedItems.K68m, true, AddedItems.DarkCrystal, AddedItems.BlazingCrystal, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K69r, AddedItems.K69c, AddedItems.K69m, true, AddedItems.LightningCrystal, AddedItems.MythrilCrystal, AddedItems.LightningGem, AddedItems.DenseStone, AddedItems.LightningShard, AddedItems.DenseShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K70r, AddedItems.K70c, AddedItems.K70m, true, AddedItems.TranquilCrystal, AddedItems.SerenityCrystal, AddedItems.SerenityGem, AddedItems.TranquilStone, AddedItems.SerenityShard, AddedItems.SerenityStone, AddedItems.TranquilGem, AddedItems.DarkShard, null, null, null);
		addSynthesisRecipe(AddedItems.K71r, AddedItems.K71c, AddedItems.K71m, true, AddedItems.Orichalcum, AddedItems.DenseCrystal, AddedItems.MythrilGem, AddedItems.BrightStone, AddedItems.DenseShard, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K72r, AddedItems.K72c, AddedItems.K72m, true, AddedItems.LightningCrystal, AddedItems.LightningGem, AddedItems.LightningStone, AddedItems.LightningShard, AddedItems.SerenityStone, AddedItems.TranquilCrystal, AddedItems.TranquilShard, AddedItems.SerenityGem, null, null, null);
		addSynthesisRecipe(AddedItems.K73r, AddedItems.K73c, AddedItems.K73m, true, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.MythrilGem, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.EnergyStone, null, null, null, null);
		addSynthesisRecipe(AddedItems.K74r, AddedItems.K74c, AddedItems.K74m, true, AddedItems.ShinyCrystal, AddedItems.TranquilGem, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.FrostShard, AddedItems.BrightCrystal, AddedItems.TranquilShard, AddedItems.BrightShard, null, null, null);
		addSynthesisRecipe(AddedItems.K75r, AddedItems.K75c, AddedItems.K75m, true, AddedItems.RemembranceCrystal, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.SerenityStone, AddedItems.SerenityShard, AddedItems.TranquilShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K76r, AddedItems.K76c, AddedItems.K76m, true, AddedItems.RemembranceCrystal, AddedItems.SerenityCrystal, AddedItems.DarkCrystal, AddedItems.LucidStone, AddedItems.BrightShard, AddedItems.DarkShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K77r, AddedItems.K77c, AddedItems.K77m, true, AddedItems.ShinyCrystal, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.MythrilGem, AddedItems.BrightStone, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K78r, AddedItems.K78c, AddedItems.K78m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.LightningGem, AddedItems.LightningStone, AddedItems.LightningShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K79r, AddedItems.K79c, AddedItems.K79m, true, AddedItems.FrostCrystal, AddedItems.PowerCrystal, AddedItems.MythrilGem, AddedItems.MythrilShard, AddedItems.FrostShard, AddedItems.PowerStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K80r, AddedItems.K80c, AddedItems.K80m, true, AddedItems.Orichalcum, AddedItems.LucidCrystal, AddedItems.TwilightGem, AddedItems.MythrilGem, AddedItems.TwilightStone, AddedItems.LucidStone, AddedItems.LucidShard, AddedItems.TwilightShard, null, null, null);
		addSynthesisRecipe(AddedItems.K81r, AddedItems.K81c, AddedItems.K81m, true, AddedItems.BrightCrystal, AddedItems.TwilightCrystal, AddedItems.BrightStone, AddedItems.DenseStone, AddedItems.BrightShard, AddedItems.SerenityShard, AddedItems.TranquilStone, AddedItems.TranquilCrystal, null, null, null);
		addSynthesisRecipe(AddedItems.K82r, AddedItems.K82c, AddedItems.K82m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.EnergyStone, AddedItems.PowerShard, AddedItems.MythrilShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K83r, AddedItems.K83c, AddedItems.K83m, true, AddedItems.OrichalcumPlus, AddedItems.BlazingCrystal, AddedItems.DarkGem, AddedItems.BlazingStone, AddedItems.DarkStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K84r, AddedItems.K84c, AddedItems.K84m, true, AddedItems.DenseCrystal, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.DarkStone, AddedItems.DarkShard, AddedItems.DenseShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K85r, AddedItems.K85c, AddedItems.K85m, true, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.FrostShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K86r, AddedItems.K86c, AddedItems.K86m, true, AddedItems.SerenityCrystal, AddedItems.ShinyCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.TranquilStone, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K87r, AddedItems.K87c, AddedItems.K87m, true, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.LightningGem, AddedItems.TwilightGem, AddedItems.DarkStone, AddedItems.LightningShard, AddedItems.TwilightShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K88r, AddedItems.K88c, AddedItems.K88m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.BlazingGem, AddedItems.BlazingStone, AddedItems.BlazingShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K89r, AddedItems.K89c, AddedItems.K89m, true, AddedItems.Orichalcum, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.FrostShard, AddedItems.MythrilCrystal, AddedItems.TwilightGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K90r, AddedItems.K90c, AddedItems.K90m, true, AddedItems.BlazingCrystal, AddedItems.PowerCrystal, AddedItems.PowerStone, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.PowerShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K91r, AddedItems.K91c, AddedItems.K91m, true, AddedItems.SerenityCrystal, AddedItems.LightningGem, AddedItems.SerenityStone, AddedItems.LightningShard, AddedItems.DenseCrystal, AddedItems.DenseShard, AddedItems.TranquilCrystal, null, null, null, null);
		addSynthesisRecipe(AddedItems.K92r, AddedItems.K92c, AddedItems.K92m, true, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.BrightCrystal, AddedItems.EnergyCrystal, null, null, null, null);
		addSynthesisRecipe(AddedItems.K93r, AddedItems.K93c, AddedItems.K93m, true, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightShard, null, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K94r, AddedItems.K94c, AddedItems.K94m, true, AddedItems.TwilightCrystal, AddedItems.TranquilCrystal, AddedItems.MythrilCrystal, AddedItems.TranquilGem, AddedItems.DenseStone, AddedItems.TwilightStone, AddedItems.TranquilShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K95r, AddedItems.K95c, AddedItems.K95m, true, AddedItems.FrostCrystal, AddedItems.MythrilGem, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.MythrilStone, AddedItems.FrostShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K96r, AddedItems.K96c, AddedItems.K96m, true, AddedItems.DenseCrystal, AddedItems.RemembranceCrystal, AddedItems.DenseGem, AddedItems.RemembranceGem, AddedItems.RemembranceStone, AddedItems.RemembranceShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K97r, AddedItems.K97c, AddedItems.K97m, true, AddedItems.DarkCrystal, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkStone, AddedItems.LucidShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K98r, AddedItems.K98c, AddedItems.K98m, true, AddedItems.DenseCrystal, AddedItems.SerenityCrystal, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.DenseGem, AddedItems.SerenityGem, AddedItems.DenseStone, AddedItems.SerenityStone, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.SerenityShard);
		addSynthesisRecipe(AddedItems.K99r, AddedItems.K99c, AddedItems.K99m, true, AddedItems.EnergyCrystal, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.EnergyCrystal, AddedItems.PowerShard, AddedItems.PowerStone, null, null, null);
		addSynthesisRecipe(AddedItems.K100r, AddedItems.K100c, AddedItems.K100m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilGem, AddedItems.SerenityGem, AddedItems.SerenityShard, AddedItems.PowerCrystal, AddedItems.PowerGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K101r, AddedItems.K101c, AddedItems.K101m, true, AddedItems.TranquilGem, AddedItems.SerenityGem, AddedItems.BrightCrystal, AddedItems.TranquilStone, AddedItems.SerenityShard, AddedItems.TranquilShard, AddedItems.BrightShard, null, null, null, null);
		//addSynthesisRecipe(AddedItems.K102r, AddedItems.K102c, AddedItems.K102m, true, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems., item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K103r, AddedItems.K103c, AddedItems.K103m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K104r, AddedItems.K104c, AddedItems.K104m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K105r, AddedItems.K105c, AddedItems.K105m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K106r, AddedItems.K106c, AddedItems.K106m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K107r, AddedItems.K107c, AddedItems.K107m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K108r, AddedItems.K108c, AddedItems.K108m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K109r, AddedItems.K109c, AddedItems.K109m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		addSynthesisRecipe(AddedItems.K110r, AddedItems.K110c, AddedItems.K110m, true, AddedItems.LightningCrystal, AddedItems.LightningStone, AddedItems.DenseShard, AddedItems.LightningGem, AddedItems.PowerCrystal, AddedItems.PowerGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K111r, AddedItems.K111c, AddedItems.K111m, true, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K112r, AddedItems.K112c, AddedItems.K112m, true, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K113r, AddedItems.K113c, AddedItems.K113m, true, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerCrystal, AddedItems.DenseGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K114r, AddedItems.K114c, AddedItems.K114m, true, AddedItems.OrichalcumPlus, AddedItems.DarkCrystal, AddedItems.DenseCrystal, AddedItems.PowerGem, AddedItems.TwilightCrystal, AddedItems.TwilightStone, AddedItems.DarkShard, AddedItems.LucidStone, AddedItems.DarkMatter, null, null);

		if(ClickedTab1){
			Tab2SrcY = 0;
			Tab1SrcY = 17;
			mc.renderEngine.bindTexture(texture);
			//drawTexturedModalRect(28, 28, 0, 166, 16, 16);
		}else if(ClickedTab2){
			Tab1SrcY = 0;
			Tab2SrcY = 17;
		}else if(ClickedTab3){

		}

		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab1ToolTip = new ArrayList<String>();
			Tab1ToolTip.add("Information");
			drawHoveringText(Tab1ToolTip, x - guiLeft, y - guiTop, fontRendererObj);
		}

		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab2ToolTip = new ArrayList<String>();
			Tab2ToolTip.add("Required Synthesis Materials");
			drawHoveringText(Tab2ToolTip, x - guiLeft, y - guiTop, fontRendererObj);
		}

		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab3ToolTip = new ArrayList<String>();
			Tab3ToolTip.add("Help");
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
		GuiButton Synthesize = new GuiButton(0, guiLeft + 108, guiTop + 4, 60, 20, "Synthesize");
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

	/**
	 * 
	 * @param recipe The item for the recipe that goes in the slot on the gui
	 * @param result The item made when clicking 'Synthesize'
	 * @param resultName The name of the item
	 * @param texture The resource location for the item
	 * @param material The EnumToolMaterial for the item
	 * @param isKeyblade If the result is a keyblade
	 * @param item1 The first material required for the recipe
	 * @param item2 The second material required for the recipe
	 * @param item3 The third material required for the recipe
	 * @param item4 The fourth material required for the recipe
	 * @param item5 The fifth material required for the recipe
	 * @param item6 The sixth material required for the recipe
	 * @param item7 The seventh material required for the recipe
	 * @param item8 The eighth material required for the recipe
	 * @param item9 The ninth material required for the recipe
	 * @param item10 The tenth material required for the recipe
	 * @param item11 The eleventh material required for the recipe
	 */
	public void addSynthesisRecipe(Item recipe, Item result, ToolMaterial material, boolean isKeyblade, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7, Item item8, Item item9, Item item10, Item item11){
		//Boolean for checking items
		boolean hasItems = false;
		//Colour for colour changing text
		int colour = 0x404040;

		int resultXY = 28;
		int item1X = 26;
		int item1Y = 32;
		int item2X = 43;
		int item2Y = 32;
		int item3X = 60;
		int item3Y = 32;
		int item4X = 77;
		int item4Y = 32;
		int item5X = 94;
		int item5Y = 32;
		int item6X = 111;
		int item6Y = 32;
		int item7X = 128;
		int item7Y = 32;
		int item8X = 26;
		int item8Y = 49;
		int item9X = 43;
		int item9Y = 49;
		int item10X = 60;
		int item10Y = 49;
		int item11X = 77;
		int item11Y = 49;

		//Checking item1 only if only one is specified
		if(item1 != null && item2 == null){
			if(synthesis.getStackInSlot(0) != null ){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					//if(item1X + guiLeft <= getX() && getX() <= item1X + guiLeft + 16 && item1Y + guiTop <= getY() && getY() <= item1Y + guiTop + 16){
					//ArrayList<String> Item1ToolTip = new ArrayList<String>();
					//Item1ToolTip.add(item1.getItemStackDisplayName(new ItemStack(item1)));
					//drawHoveringText(Item1ToolTip, getX() - guiLeft, getY() - guiTop, fontRendererObj);
					//}
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checking item1 and item2 if only 2 are specified
		if(item2 != null && item3 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesise";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesise";
				colour = 0xFF0000;
			}
		}
		//Checking item1, item2 and item3 if only 3 are specified
		if(item3 != null && item4 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
				}	
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesise";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesise";
				colour = 0xFF0000;
			}
		}
		//Checking item1, item2, item3 and item4 if only 4 are specified	
		if(item4 != null && item5 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesise";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesise";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4 and item5 if only 5 are specified
		if(item5 != null && item6 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesise";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesise";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4, item5 and item6 if only 6 are specified
		if(item6 != null && item7 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);

				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesise";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesise";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4, item5, item6 and item7 if only 7 are specified
		if(item7 != null && item8 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4, item5, item6, item7 and item8 if only 8 are specified
		if(item8 != null && item9 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item8), item8X, item8Y);
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesise";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesise";
				colour = 0xFF0000;
			}
		}
		//Checks item1, item2, item3, item4, item5, item6, item7, item8 and item9 if only 9 are specified
		if(item9 != null && item10 == null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item1), item1X, item1Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item2), item2X, item2Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item3), item3X, item3Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item4), item4X, item4Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item5), item5X, item5Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item6), item6X, item6Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item7), item7X, item7Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item8), item8X, item8Y);
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item9), item9X, item9Y);
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesise";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesise";
				colour = 0xFF0000;
			}
		}
		//Checks item1, item2, item3, item4, item5, item6, item7, item8, item9 and item10 if only 10 are specified
		if(item10 != null && item11 == null){
			if(synthesis.getStackInSlot(0) != null)
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
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
				}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checks all items if 11 are specified
		if(item11 != null){
			if(synthesis.getStackInSlot(0) != null){
				if(synthesis.getStackInSlot(0).getItem() == recipe && ClickedTab2){
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
				}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item11)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}

		}

		if(synthesis.getStackInSlot(0) != null){
			if(synthesis.getStackInSlot(0).getItem() == recipe){
				GL11.glColor3f(1, 1, 1);
				GL11.glDisable(GL11.GL_LIGHTING);

				//Stuff displayed on the first tab
				if(GuiSynthesis.ClickedTab1){
					fontRendererObj.drawSplitString(SynthesizeText, 28, 60, 120, colour);
					fontRendererObj.drawSplitString(result.getItemStackDisplayName(new ItemStack(result)).replace(" Chain", "") , 46, 28, 120, 0x404040);
					if(isKeyblade){
						fontRendererObj.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " Attack Damage", 28, 48, 0x004CFF);
					}else{
						fontRendererObj.drawString("Material", 28, 40, 0x004CFF);
					}
					itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(result), resultXY, resultXY);

					//Stuff displayed on the second tab
				}else if(GuiSynthesis.ClickedTab2){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					fontRendererObj.drawString("Required Materials", 30, 27, colour);
					//Stuff displayed on the third tab
				}else if(GuiSynthesis.ClickedTab3){
					GL11.glColor3f(1, 1, 1);
					GL11.glDisable(GL11.GL_LIGHTING);
					if(isKeyblade){
						fontRendererObj.drawSplitString("This keyblade has the enchantment Vanquish. It allows you to collect hearts from mobs when they are slain.", 30, 30, 120, 0x004CFF);
					}else{
						fontRendererObj.drawSplitString("This item is material used for crafting or another synthesis recipe.", 30, 30, 120, 0x004CFF);
					}
				}
			}
		}
		//Checking if the player has all the items required
		if(hasItems){
			if(ButtonPressed){
				System.out.println("SYNTH");
				Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, "kk:summon", 1, 1F);
				if(synthesis.getStackInSlot(0) != null){
					if(synthesis.getStackInSlot(0).getItem() == recipe){
						System.out.println("YEP");
						IPacket packetsynth = new SynthesisPacket(new ItemStack(recipe), new ItemStack(result), new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), new ItemStack(item6), new ItemStack(item7), new ItemStack(item8), new ItemStack(item9), new ItemStack(item10), new ItemStack(item11));
						KingdomKeys.channelHandler.sendToServer(packetsynth);
					}
				}
				ButtonPressed = false;
			}
		}
	}
}

