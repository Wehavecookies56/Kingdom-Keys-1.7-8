package wehavecookies56.kk.client.gui;

import mods.battlegear2.api.IDefaultRender.RenderType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.core.event.OnHitEvent;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
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

			Minecraft mc = Minecraft.getMinecraft();
			EntityPropertyDrivePoints props = EntityPropertyDrivePoints.get(mc.thePlayer);
			
			int guiWidth = 100;
			int guiHeight = 20;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			EntityPlayer player = mc.thePlayer;
			float oneValue = (guiWidth / maxDrive);
			int currDrive = guiWidth + (int) (oneValue * props.maxDrivePoints);

			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/DriveBar.png"));
			
			if(currDrive >= 10 && currBar != 9)
			{
			currDrive-=10;
			currBar+=1;
			}

			GL11.glPushMatrix();
			//Background
			this.drawTexturedModalRect(screenWidth - guiWidth - 65, screenHeight - guiHeight - 10, 0, 0, guiWidth, guiHeight);
			//Yellow meter
			this.drawTexturedModalRect((screenWidth - guiWidth - 65) + currDrive, screenHeight - guiHeight - 10, 0, 18, (guiWidth - currDrive), guiHeight);
			GL11.glPopMatrix();
		}
	}
}
