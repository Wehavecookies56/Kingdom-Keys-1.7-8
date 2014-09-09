package wehavecookies56.kk.client.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class EntityRenderSharpShooterBullet extends Render {


	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9){
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		this.bindEntityTexture(par1Entity);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {

		return new ResourceLocation("kk", "textures/entities/sharpShooterBullet.png");
	}


}
