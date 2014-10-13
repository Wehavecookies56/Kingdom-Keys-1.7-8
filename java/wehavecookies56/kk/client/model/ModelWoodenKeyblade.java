package wehavecookies56.kk.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWoodenKeyblade extends ModelBase
{
	ModelRenderer handle1;
	ModelRenderer handle2;
	ModelRenderer handle3;
	ModelRenderer handle4;
	ModelRenderer handle5;
	ModelRenderer handle6;
	ModelRenderer handle7;
	ModelRenderer handle8;
	ModelRenderer blade1;
	ModelRenderer blade2;
	ModelRenderer blade3;
	ModelRenderer blade4;
	ModelRenderer blade5;

	public ModelWoodenKeyblade()
	{
		textureWidth = 64;
		textureHeight = 32;

		handle1 = new ModelRenderer(this, 60, 22);
		handle1.addBox(0F, 0F, 0F, 1, 9, 1);
		handle1.setRotationPoint(0F, 2F, 0F);
		handle1.setTextureSize(64, 32);
		handle1.mirror = true;
		setRotation(handle1, 0F, 0F, 0F);
		handle2 = new ModelRenderer(this, 43, 25);
		handle2.addBox(0F, 0F, 0F, 7, 2, 1);
		handle2.setRotationPoint(-3F, 0F, 0F);
		handle2.setTextureSize(64, 32);
		handle2.mirror = true;
		setRotation(handle2, 0F, 0F, 0F);
		handle3 = new ModelRenderer(this, 58, 10);
		handle3.addBox(0F, 0F, 0F, 2, 10, 1);
		handle3.setRotationPoint(3F, 0F, 0F);
		handle3.setTextureSize(64, 32);
		handle3.mirror = true;
		setRotation(handle3, 0F, 0F, -0.1745329F);
		handle4 = new ModelRenderer(this, 37, 29);
		handle4.addBox(0F, 0F, 0F, 10, 2, 1);
		handle4.setRotationPoint(-2F, 0F, 0F);
		handle4.setTextureSize(64, 32);
		handle4.mirror = true;
		setRotation(handle4, 0F, 0F, 1.745329F);
		handle5 = new ModelRenderer(this, 48, 13);
		handle5.addBox(0F, 0F, 0F, 1, 7, 1);
		handle5.setRotationPoint(7F, 7F, 0F);
		handle5.setTextureSize(64, 32);
		handle5.mirror = true;
		setRotation(handle5, 0F, 0F, 1.256637F);
		handle6 = new ModelRenderer(this, 43, 13);
		handle6.addBox(0F, 0F, 0F, 1, 7, 1);
		handle6.setRotationPoint(7F, 7F, 0F);
		handle6.setTextureSize(64, 32);
		handle6.mirror = true;
		setRotation(handle6, 0F, 0F, 1.169371F);
		handle7 = new ModelRenderer(this, 43, 22);
		handle7.addBox(0F, 0F, 0F, 7, 1, 1);
		handle7.setRotationPoint(0F, 10F, 0F);
		handle7.setTextureSize(64, 32);
		handle7.mirror = true;
		setRotation(handle7, 0F, 0F, -2.827433F);
		handle8 = new ModelRenderer(this, 53, 13);
		handle8.addBox(0F, 0F, 0F, 1, 7, 1);
		handle8.setRotationPoint(-6F, 8F, 0F);
		handle8.setTextureSize(64, 32);
		handle8.mirror = true;
		setRotation(handle8, 0F, 0F, -1.169371F);
		blade1 = new ModelRenderer(this, 28, 6);
		blade1.addBox(0F, 0F, 0F, 2, 24, 2);
		blade1.setRotationPoint(0F, -24F, -1F);
		blade1.setTextureSize(64, 32);
		blade1.mirror = true;
		setRotation(blade1, 0F, -0.7330383F, 0F);
		blade2 = new ModelRenderer(this, 5, 28);
		blade2.addBox(0F, 0F, 0F, 9, 2, 1);
		blade2.setRotationPoint(-3F, -21F, 0F);
		blade2.setTextureSize(64, 32);
		blade2.mirror = true;
		setRotation(blade2, 0F, 0F, -0.1396263F);
		blade3 = new ModelRenderer(this, 10, 25);
		blade3.addBox(0F, 0F, 0F, 6, 1, 1);
		blade3.setRotationPoint(-2F, -18F, 0F);
		blade3.setTextureSize(64, 32);
		blade3.mirror = true;
		setRotation(blade3, 0F, 0F, 0.0174533F);
		blade4 = new ModelRenderer(this, 8, 21);
		blade4.addBox(0F, 0F, 0F, 8, 2, 1);
		blade4.setRotationPoint(-3F, -16F, 0F);
		blade4.setTextureSize(64, 32);
		blade4.mirror = true;
		setRotation(blade4, 0F, 0F, 0.1047198F);
		blade5 = new ModelRenderer(this, 10, 25);
		blade5.addBox(0F, 0F, 0F, 6, 1, 1);
		blade5.setRotationPoint(-2F, -18F, 0F);
		blade5.setTextureSize(64, 32);
		blade5.mirror = true;
		setRotation(blade5, 0F, 0F, -0.0872665F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		handle1.render(f5);
		handle2.render(f5);
		handle3.render(f5);
		handle4.render(f5);
		handle5.render(f5);
		handle6.render(f5);
		handle7.render(f5);
		handle8.render(f5);
		blade1.render(f5);
		blade2.render(f5);
		blade3.render(f5);
		blade4.render(f5);
		blade5.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

}
