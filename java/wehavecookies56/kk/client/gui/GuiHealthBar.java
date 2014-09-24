package wehavecookies56.kk.client.gui;

import mods.battlegear2.api.IDefaultRender.RenderType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.Type;

public class GuiHealthBar extends Gui{

	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){
		
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT){
		
		int guiWidth = 164;
		int guiHeight = 6;
		
		Minecraft mc = Minecraft.getMinecraft();		
		mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/HPBar.png"));

		int screenWidth = event.resolution.getScaledWidth();
		int screenHeight = event.resolution.getScaledHeight();
		EntityPlayer player = mc.thePlayer;
		float oneHeart = (guiWidth / player.getMaxHealth());
		int currHealth = guiWidth - (int) (oneHeart * player.getHealth());
		GL11.glPushMatrix();
		this.drawTexturedModalRect(screenWidth - guiWidth, screenHeight - guiHeight, 0, 0, guiWidth, guiHeight);
		this.drawTexturedModalRect((screenWidth - guiWidth) + currHealth, screenHeight - guiHeight, 0, 7, (guiWidth - currHealth) - 2, guiHeight);

		GL11.glPopMatrix();
		}
	}
}
