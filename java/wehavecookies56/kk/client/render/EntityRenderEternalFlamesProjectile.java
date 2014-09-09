package wehavecookies56.kk.client.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelEternalFlames;
import wehavecookies56.kk.entities.EntityEternalFlamesProjectile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityRenderEternalFlamesProjectile extends Render {
	private static final ResourceLocation texture = new ResourceLocation("kk", "textures/entities/EternalFlames.png");

	private ModelEternalFlames model;

	public EntityRenderEternalFlamesProjectile(Item eternalFlames) {
		model = new ModelEternalFlames();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return getCustomTexture((EntityEternalFlamesProjectile) entity);
	}

	private ResourceLocation getCustomTexture(EntityEternalFlamesProjectile entity) {
		return texture;
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick) {

		GL11.glPushMatrix();

		bindTexture(texture);
		GL11.glTranslated(x, y, z);
		GL11.glRotatef(yaw + 15 * partialTick, 0F, 1F, 0F);

		GL11.glRotatef(90F, 1F, 0F, 0F);

		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}
