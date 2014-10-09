package wehavecookies56.kk.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class GuiKKChest extends GuiContainer{

	public GuiKKChest(Container p_i1072_1_) {
		super(p_i1072_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		//draw your Gui here, only thing you need to change is the path
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		ResourceFile.houseGen_Img =  new ResourceLocation("mschouses", "directory/to/BlockBase.png);"
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(new ResourceLocation("kk", ""));
		
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
}
