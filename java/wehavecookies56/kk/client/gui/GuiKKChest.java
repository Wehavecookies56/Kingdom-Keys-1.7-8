package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.container.ContainerKKChest;
import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GuiKKChest extends GuiContainer{

	TileEntityKKChest chest = new TileEntityKKChest();

	@SideOnly(Side.CLIENT)
	public GuiKKChest(InventoryPlayer invPlayer, TileEntityKKChest chest) {
		super(new ContainerKKChest(invPlayer, chest));

		this.chest = chest;

		xSize = 176;
		ySize = 166;

	}	

	private static final ResourceLocation texture = new ResourceLocation("kk", "textures/gui/KKChest.png");

	@Override
	@SideOnly(Side.CLIENT)
	protected void drawGuiContainerBackgroundLayer(float f, int x, int y) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

	}
}
