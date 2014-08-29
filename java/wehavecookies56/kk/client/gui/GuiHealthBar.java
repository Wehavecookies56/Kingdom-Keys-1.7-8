package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.Type;

public class GuiHealthBar extends Gui{

	@SubscribeEvent
	public void onRenderOverlayPost(TickEvent event){
		
		if(event.type != Type.RENDER){
			return;
		}
		
		int guiWidth = 164 / 2;
		int guiHeight = 15;
		
		if(event.phase == Phase.END){
		Minecraft mc = Minecraft.getMinecraft();
		GL11.glPushMatrix();
		
		mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/HPBar.png"));

		EntityPlayer player = mc.thePlayer;
		float health = 20;
		float maxHealth = 20;
		if(player != null){
			health = player.getHealth();
			maxHealth = player.getMaxHealth();
		}
		int healthBarWidth = (int)(((float)health/maxHealth)* guiWidth - 4 / 4);
		this.drawTexturedModalRect(0, 0, 0, 25, healthBarWidth, guiHeight);
		
		this.drawTexturedModalRect(0, 0, 0, 0, guiWidth, guiHeight);
					

		
		GL11.glPopMatrix();
		}
	}
}
