package wehavecookies56.kk.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelWaywardWind;
import wehavecookies56.kk.lib.ConfigBooleans;


@SideOnly(Side.CLIENT)
public class ItemRenderWaywardWind implements IItemRenderer {

	protected ModelWaywardWind model;

	public ItemRenderWaywardWind() {

		model = new ModelWaywardWind();
	}


	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {

		switch(type){
		case EQUIPPED_FIRST_PERSON: return true;
		case EQUIPPED: return true; 
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		switch (type) {

		case EQUIPPED: 
		case EQUIPPED_FIRST_PERSON: {
			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/WaywardWind.png"));

			if(ConfigBooleans.altWaywardWind == false){
				GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
				GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);

				GL11.glTranslatef(-0.6F, 0.5F, 0.0F); 

				model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			}

			if(ConfigBooleans.altWaywardWind == true){
				GL11.glRotatef(-80.0F, 0.0F, 0.0F, 1.0F);
				GL11.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(45.0F, 0.0F, 0.0F, 1.0F);

				GL11.glTranslatef(-0.8F, -0.8F, 0.0F); 

				model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			}

			GL11.glPopMatrix();

		}

		default:
			break;
		}
	}
}
