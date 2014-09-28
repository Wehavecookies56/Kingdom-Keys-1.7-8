package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.core.proxies.CommonProxy;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GuiDriveBar extends Gui{

	Minecraft mc = Minecraft.getMinecraft();
	
	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){

		EntityPropertyDrivePoints props = EntityPropertyDrivePoints.get(mc.thePlayer);

		if(event.type == RenderGameOverlayEvent.ElementType.TEXT) {
			//Temp will be an extended entity property
			int maxDrive = 100;
			int maxBars = 9;
			int currBar = 1;
			CommonProxy.getEntityData(props.EXT_PROP_NAME);			
			//System.out.println("Drive points:" + props.getCurrDrivePoints());
			int guiWidth = 95;
			int guiBarWidth = 83;
			int guiHeight = 18;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			EntityPlayer player = mc.thePlayer;
			float oneValue = (83F / 100F);
			int currDrive = (int) (oneValue * props.getCurrDrivePoints());

			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/DriveBar.png"));
			if(currDrive >= 100 && currBar != 9)
			{
				props.setCurrDrivePoints(0);
				currBar += 1;
			}else if(currDrive >= maxDrive && currBar == maxBars){
				currBar = maxBars;
				props.setCurrDrivePoints(maxDrive);
			}

			//System.out.println(currBar);
			//System.out.println(props.getCurrDrivePoints());
			GL11.glPushMatrix();
			//Background
			this.drawTexturedModalRect(screenWidth - guiWidth - 65, screenHeight - guiHeight - 10, 0, 0, guiWidth, guiHeight);
			//Yellow meter
			this.drawTexturedModalRect((screenWidth - guiWidth - 65), screenHeight - guiHeight - 12, 0, 18, currDrive, guiHeight);
			GL11.glPopMatrix();
		}
	}
}
