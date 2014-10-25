package wehavecookies56.kk.client.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import api.player.render.RenderPlayerAPI;
import api.player.render.RenderPlayerBase;


public class PlayerRender extends RenderPlayerBase {

	public PlayerRender(RenderPlayerAPI renderPlayerAPI) {
		super(renderPlayerAPI);
		
	}
	
	@Override
	public void renderModel(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_A.png"));
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
				
		armour.bipedLeftArm.showModel = true;
		armour.bipedLeftArm.render(0.0625F);
		
		armour.bipedRightArm.showModel = true;
		armour.bipedRightArm.render(0.0625F);
		
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_B.png"));
		
		armour.bipedLeftLeg.showModel = true;
		armour.bipedLeftLeg.render(0.0625F);
		
		armour.bipedRightLeg.showModel = true;
		armour.bipedRightLeg.render(0.0625F);
		
		super.renderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
		
	}
	
	/*@Override
	public void beforeRenderPlayer(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/armor/KEYBLADEA_1.png"));
		ModelBiped armour = renderPlayer.modelArmor;
		armour.onGround = 0.0F;
		armour.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, paramAbstractClientPlayer);
		armour.bipedHead.showModel = true;
		armour.bipedHead.rotateAngleZ = (float)Math.PI;
		armour.bipedHead.render(0.0625F);
		
		super.afterRenderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
	}*/
	
	@Override
	public void renderFirstPersonArm(EntityPlayer paramEntityPlayer) {
		ModelBiped armour = renderPlayer.modelArmor;
		armour.bipedRightArm.render(0.0625F);
		armour.bipedRightArm.showModel = true;
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_A.png"));
		armour.bipedRightArm.render(0.0625F);
		super.renderFirstPersonArm(paramEntityPlayer);
	}

}
