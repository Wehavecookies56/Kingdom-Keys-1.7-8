package wehavecookies56.kk.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;

public class PlayerModel extends ModelPlayerBase {

	protected ModelFenrir modelFenrir;
	@SideOnly(Side.CLIENT)

	public PlayerModel(ModelPlayerAPI renderPlayerAPI) {
		super(renderPlayerAPI);
	}
	
	Minecraft mc = Minecraft.getMinecraft();
	//int df = 0;
	@Override
	public void afterRender(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
		EntityPropertyDriveForm df = EntityPropertyDriveForm.get(mc.thePlayer);	

		if(df.getCurrentState() == 0){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Valor_A.png"));
		}else if(df.getCurrentState() == 1){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Wisdom_A.png"));
		}else if(df.getCurrentState() == 2){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Limit_A.png"));
		}else if(df.getCurrentState() == 3){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Master_A.png"));
		}else if(df.getCurrentState() == 4){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Final_A.png"));
		}else if(df.getCurrentState() == 5){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/forms/Anti_A.png"));
		}
		modelPlayer.bipedLeftArm.render(0.0625F);
		modelPlayer.bipedRightArm.render(0.0625F);		
		super.afterRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
	}
	

}
