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

	int currBar = 0;
	int maxDrive = 100;
	int maxBars = 9;

	float oneValue = (83F / 100F);
	
	int currDrive;
	
	public GuiDriveBar(){

		
	}
	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){

		EntityPropertyDrivePoints props = EntityPropertyDrivePoints.get(mc.thePlayer);

		currDrive = (int) (oneValue * props.getCurrDrivePoints());

		if(props.getCurrDrivePoints() >= maxDrive)
		{
			System.out.println("Tweaking bar");
			props.setCurrDrivePoints(0);
			currDrive = (int) (oneValue * props.getCurrDrivePoints());
			currBar += 1;
		}
		else if(props.getCurrDrivePoints() >= maxDrive && currBar == maxBars)
		{
			props.setCurrDrivePoints(maxDrive);
			currDrive = (int) (oneValue * props.getCurrDrivePoints());
		}
		
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT) {
			//Temp will be an extended entity property

			//CommonProxy.getEntityData(props.EXT_PROP_NAME);			
			System.out.println("Drive points:" + props.getCurrDrivePoints());
			int guiWidth = 95;
			int guiBarWidth = 83;
			int guiHeight = 18;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			EntityPlayer player = mc.thePlayer;


			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/DriveBar.png"));

			GL11.glPushMatrix();
			//Background
			this.drawTexturedModalRect(screenWidth - guiWidth - 70, screenHeight - guiHeight - 10, 0, 0, guiWidth, guiHeight);
			//Yellow meter
			this.drawTexturedModalRect((screenWidth - guiWidth - 70), screenHeight - guiHeight - 12, 0, 18, currDrive, guiHeight);
			//Level
			if(currBar == 0)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 0, 38, 8, guiHeight);
			}
			else if(currBar == 1)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 10, 38, 8, guiHeight);
			}
			else if(currBar == 2)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 20, 38, 8, guiHeight);
			}
			else if(currBar == 3)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 30, 38, 8, guiHeight);
			}
			else if(currBar == 4)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 40, 38, 8, guiHeight);
			}
			else if(currBar == 5)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 50, 38, 8, guiHeight);
			}
			else if(currBar == 6)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 60, 38, 8, guiHeight);
			}
			else if(currBar == 7)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 70, 38, 8, guiHeight);
			}
			else if(currBar == 8)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 80, 38, 8, guiHeight);
			}
			else if(currBar == 9)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 12, 90, 38, 8, guiHeight);
			}
			else if(currBar > 9){
				currBar = 9;
			}
			GL11.glPopMatrix();
		}
	}
}
