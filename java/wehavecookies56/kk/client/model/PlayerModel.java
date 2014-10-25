package wehavecookies56.kk.client.model;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;
import api.player.render.RenderPlayerAPI;
import api.player.render.RenderPlayerBase;

public class PlayerModel extends ModelPlayerBase {

	protected ModelFenrir modelFenrir;

	public PlayerModel(ModelPlayerAPI renderPlayerAPI) {
		super(renderPlayerAPI);
	}
	
	Minecraft mc = Minecraft.getMinecraft();
	//EntityPropertyDriveForm df = EntityPropertyDriveForm.get(mc.thePlayer);
	/*TEMP*/public static int df = KeyBind.driveselected;
	
	@Override
	public void afterRender(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_A.png"));
		if(df/*.getActive()*/ != 1){	
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_A.png"));
		}else if(df/*.getActive()*/ == 2){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Wisdom_A.png"));
		}else if(df/*.getActive()*/ == 3){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Limit_A.png"));
		}else if(df/*.getActive()*/ == 4){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Master_A.png"));
		}else if(df/*.getActive()*/ == 5){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Final_A.png"));
		}else if(df/*.getActive()*/ == 6){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Anti_A.png"));
		}else{
			super.afterRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
		}
		modelPlayer.bipedLeftArm.render(0.0625F);
		modelPlayer.bipedRightArm.render(0.0625F);		
		super.afterRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
	}
	

}
