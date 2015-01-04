package wehavecookies56.kk.client.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.client.model.ModelKeybladeChest;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;

public class TileEntityRendererKKChest extends TileEntitySpecialRenderer{

	private final ModelKeybladeChest modelKKChest;

	public TileEntityRendererKKChest() {
		this.modelKKChest = new ModelKeybladeChest();
	}

	private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
		
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);

        TileEntityKKChest teKK = (TileEntityKKChest)te;
		
		renderBlock(teKK, te.getWorldObj(), te.xCoord, te.yCoord, te.zCoord, AddedBlocks.KKChest);

		GL11.glPopMatrix();
	}

	public void renderBlock(TileEntityKKChest te, World world, int x, int y, int z, Block block){
        int dir = 0;
        if(te.getWorldObj() != null){
        	dir = te.getBlockMetadata();
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(0.5F, 0, 0.5F);
        GL11.glRotatef(dir * (-90F), 0F, 1F, 0F);
        if(dir == 1){
        	GL11.glTranslatef(0F, 0F, 0.9F);
        }
        if(dir == 2){
        	GL11.glTranslatef(1F, 0F, 0.9F);
        }
        if(dir == 3){
        	GL11.glTranslatef(1F, 0F, 0F);
        }
        GL11.glTranslatef(-0.5F, 0, -0.5F);

		ResourceLocation texture = new ResourceLocation("kk", "textures/entities/KeybladeChest.png");
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
    	GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		this.modelKKChest.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
	}
	
	private void adjustLightFixture(World world, int i, int j, int k, Block block) {
		Tessellator tess = Tessellator.instance;
		float brightness = block.getLightValue(world, i, j, k);
		int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
		int modulousModifier = skyLight % 65536;
		int divModifier = skyLight / 65536;
		tess.setColorOpaque_F(brightness, brightness, brightness);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
	}

}
