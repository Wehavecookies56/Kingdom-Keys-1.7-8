package wehavecookies56.kk.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelFenrir;
import wehavecookies56.kk.client.model.ModelKeybladeChest;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class ItemRenderKKChest implements IItemRenderer {

	protected TileEntity teKKChest;
	TileEntitySpecialRenderer render;

	public ItemRenderKKChest() {

		teKKChest = new TileEntityKKChest();
		render = new TileEntityRendererKKChest();
	}


	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type){
		case ENTITY:
			GL11.glPushMatrix();
			GL11.glTranslatef(-0.5F, 0F, -0.5F);
			GL11.glPopMatrix();
			break;
		default:
			break;
		}
		this.render.renderTileEntityAt(teKKChest, 0.0D, 0.0D, 0.0D, 0.0F);
	}
}
