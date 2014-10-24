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

	int currBar = EntityPropertyDrivePoints.currBar;
	int maxDrive = 1000;
	int maxLength = 100;
	int maxBars = 9;
	public static boolean max = false;
	double oneValue = (46D / 100D);
	double currDrive;
	
	public GuiDriveBar(){
		
	}
	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){

		EntityPropertyDrivePoints props = EntityPropertyDrivePoints.get(mc.thePlayer);
		int dp = props.getCurrDrivePoints();


		if (dp<= 100)
		{
			currDrive = (float) (oneValue * dp);
		}
		
		else if(dp<= 200 && dp> 100)
		{
			currDrive = (float) (oneValue * (dp -100));
		}

		else if(dp<= 300 && dp> 200)
		{
			currDrive = (float) (oneValue * (dp -200));
		}

		else if(dp<= 400 && dp> 300)
		{
			currDrive = (float) (oneValue * (dp -300));
		}

		else if(dp<= 500 && dp> 400)
		{
			currDrive = (float) (oneValue * (dp -400));
		}

		else if(dp<= 600 && dp> 500)
		{
			currDrive = (float) (oneValue * (dp -500));
		}

		else if(dp<= 700 && dp> 600)
		{
			currDrive = (float) (oneValue * (dp -600));
		}

		else if(dp<= 800 && dp> 700)
		{
			currDrive = (float) (oneValue * (dp -700));
		}

		else if(dp<= 900 && dp> 800)
		{
			currDrive = (float) (oneValue * (dp -800));
		}
		
		else if(dp<= 1000 && dp> 900)
		{
			currDrive = (float) (oneValue * (dp -900));
		}
		if(dp >= 1000){
			currDrive = 100;
			currBar = 9;
		}
		if(dp < 100){
			currBar = 0;
		}
		
		if(dp >= 100 && dp < 200)
		{
			currBar = 1;
		}
		
		else if(dp >= 200 && dp < 300)
		{
			currBar = 2;
		}
		
		else if(dp >= 300 && dp < 400)
		{
			currBar = 3;
		}
		
		else if(dp >= 400 && dp < 500)
		{
			currBar = 4;
		}
		else if(dp >= 500 && dp < 600)
		{
			currBar = 5;
		}
		
		else if(dp >= 600 && dp < 700)
		{
			currBar = 6;
		}
		
		else if(dp >= 700 && dp < 800)
		{
			currBar = 7;
		}
		
		else if(dp >= 800 && dp < 900)
		{
			currBar = 8;
		}
		
		else if(dp >= 900 && dp < 1000)
		{
			currBar = 9;
		}
		
		else if(dp >= 1000)
		{
			props.setCurrDrivePoints(maxDrive);
			currDrive = maxLength;
			max = true;
		}
		
		if(dp == 100 || dp == 200 || dp == 300 || dp == 400 || dp == 500 || dp == 600 || dp == 700 || dp == 800 || dp == 900){
			currDrive = 0;
		}
		
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT) {			
			int guiWidth = 95;
			int guiBarWidth = 83;
			int guiHeight = 18;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			EntityPlayer player = mc.thePlayer;


			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/DriveBar.png"));

			GL11.glPushMatrix();
			//Background
			this.drawTexturedModalRect(screenWidth - guiWidth - 70, screenHeight - guiHeight - 25, 0, 0, guiWidth, guiHeight);
			//Yellow meter
			this.drawTexturedModalRect((screenWidth - guiWidth - 34), screenHeight - guiHeight - 27, 0, 18, (int) currDrive, guiHeight);
			//Level
			if(currBar == 0)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 0, 38, 8, guiHeight);
			}
			else if(currBar == 1)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 10, 38, 8, guiHeight);
			}
			else if(currBar == 2)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 20, 38, 8, guiHeight);
			}
			else if(currBar == 3)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 30, 38, 8, guiHeight);
			}
			else if(currBar == 4)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 40, 38, 8, guiHeight);
			}
			else if(currBar == 5)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 50, 38, 8, guiHeight);
			}
			else if(currBar == 6)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 60, 38, 8, guiHeight);
			}
			else if(currBar == 7)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 70, 38, 8, guiHeight);
			}
			else if(currBar == 8)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 80, 38, 8, guiHeight);
			}
			else if(currBar == 9)
			{
				this.drawTexturedModalRect((screenWidth - guiWidth + 15), screenHeight - guiHeight - 27, 90, 38, 8, guiHeight);
			}
			
			if(max == true)
			{
				GL11.glPushMatrix();
				GL11.glScalef(1.5F,1.5F,0);
				this.drawTexturedModalRect((screenWidth - guiWidth - 23), screenHeight - guiHeight - 25, 0, 57, 30, guiHeight);
				GL11.glPopMatrix();
			}
			
			GL11.glPopMatrix();
		}
	}
}
