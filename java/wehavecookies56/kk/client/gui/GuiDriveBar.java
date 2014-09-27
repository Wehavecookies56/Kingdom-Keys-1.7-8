package wehavecookies56.kk.client.gui;

import mods.battlegear2.api.IDefaultRender.RenderType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.core.event.OnHitEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.Type;

public class GuiDriveBar extends Gui{

	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){

		if(event.type == RenderGameOverlayEvent.ElementType.TEXT) {
			//Temp will be an extended entity property
			int maxDrive = 100;
			int maxBars = 9;
			int currBar = 1;

			int guiWidth = 95;
			int guiHeight = 18;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer player = mc.thePlayer;
			float oneValue = (guiWidth / maxDrive);
			int currDrive = guiWidth + (int) (oneValue * OnHitEvent.currDrive);

			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/DriveBar.png"));

			GL11.glPushMatrix();
			//Background
			this.drawTexturedModalRect(screenWidth - guiWidth, screenHeight - guiHeight, 0, 0, guiWidth, guiHeight);
			//Yellow meter
			this.drawTexturedModalRect((screenWidth - guiWidth) + currDrive, screenHeight - guiHeight, 0, 18, (guiWidth - currDrive), guiHeight);
			GL11.glPopMatrix();
		}
	}
}
