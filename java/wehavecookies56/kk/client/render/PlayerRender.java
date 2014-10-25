package wehavecookies56.kk.client.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;

import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.core.proxies.ClientProxy;
import wehavecookies56.kk.item.AddedItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import api.player.render.RenderPlayerAPI;
import api.player.render.RenderPlayerBase;


public class PlayerRender extends RenderPlayerBase {

	public PlayerRender(RenderPlayerAPI renderPlayerAPI) {
		super(renderPlayerAPI);

	}

	Minecraft mc = Minecraft.getMinecraft();
	//EntityPropertyDriveForm df = EntityPropertyDriveForm.get(mc.thePlayer);
	int df = 0;
	
	/*@Override
	public void afterRenderSpecials(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
	    GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
	    GL11.glDepthMask(false);

	    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	    GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
	    GL11.glEnable(GL11.GL_ALPHA_TEST);
	    GL11.glCallList(ClientProxy.sphereIdOutside);

	    GL11.glCallList(ClientProxy.sphereIdInside);
	    GL11.glPopMatrix();
	}*/

	@Override
	public void renderModel(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
		if(KeyBind.driveselected == 0  && KeyBind.submenu == 3){	
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_A.png"));
		}else if(KeyBind.driveselected == 1){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Wisdom_A.png"));
		}else if(KeyBind.driveselected == 2){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Limit_A.png"));
		}else if(KeyBind.driveselected == 3){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Master_A.png"));
		}else if(KeyBind.driveselected == 4){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Final_A.png"));
		}else if(KeyBind.driveselected == 5){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Anti_A.png"));
		}else{
			super.renderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);

		}
		ModelBiped armour = renderPlayer.modelArmor;
		armour.onGround = 0.0F;
		armour.setRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntityLivingBase);
		armour.bipedHead.showModel = true;
		armour.bipedHead.render(0.0625F);

		armour.bipedHeadwear.showModel = true;
		armour.bipedHeadwear.render(0.0625F);

		armour.bipedBody.showModel = true;
		armour.bipedBody.render(0.0625F);

		armour.bipedLeftLeg.showModel = true;
		armour.bipedLeftLeg.render(0.0625F);

		armour.bipedRightLeg.showModel = true;
		armour.bipedRightLeg.render(0.0625F);

		if(KeyBind.driveselected == 0){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_B.png"));
		}else if(KeyBind.driveselected == 1){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Wisdom_B.png"));
		}else if(KeyBind.driveselected == 2){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Limit_B.png"));
		}else if(KeyBind.driveselected == 3){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Master_B.png"));
		}else if(KeyBind.driveselected == 4){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Final_B.png"));
		}else if(KeyBind.driveselected == 5){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Anti_B.png"));
		}else{
			//super.renderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
		}
		armour.bipedLeftLeg.showModel = true;
		armour.bipedLeftLeg.render(0.0625F);

		armour.bipedRightLeg.showModel = true;
		armour.bipedRightLeg.render(0.0625F);

		super.renderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);

	}

}
