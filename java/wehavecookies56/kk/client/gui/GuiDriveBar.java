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
			currBar = 0;
		}
		
		else if(dp >= 100 && dp < 200)
		{
			currBar = 1;
			currDrive = (float) (oneValue * (dp -100));
		}

		else if(dp >= 200 && dp < 300)
		{
			currBar = 2;
			currDrive = (float) (oneValue * (dp -200));
		}

		else if(dp >= 300 && dp < 400)
		{
			currBar = 3;
			currDrive = (float) (oneValue * (dp -300));
		}


		else if(dp >= 400 && dp < 500)
		{
			currBar = 4;
			currDrive = (float) (oneValue * (dp -400));
		}

		else if(dp >= 500 && dp < 600)
		{
			currBar = 5;
			currDrive = (float) (oneValue * (dp -500));
		}

		else if(dp >= 600 && dp < 700)
		{
			currBar = 6;
			currDrive = (float) (oneValue * (dp -600));
		}

		else if(dp >= 700 && dp < 800)
		{
			currBar = 7;
			currDrive = (float) (oneValue * (dp -700));
		}

		else if(dp >= 800 && dp < 900)
		{
			currBar = 8;
			currDrive = (float) (oneValue * (dp -800));
		}

		else if(dp >= 900 && dp < 1000)
		{
			currBar = 9;
			currDrive = (float) (oneValue * (dp -900));
		}
		if(dp >= 1000){
			currDrive = 100;
			currBar = 9;
			props.setCurrDrivePoints(maxDrive);
			currDrive = maxLength;

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
			GL11.glTranslatef(screenWidth - guiWidth - 34, screenHeight - guiHeight - 15, 0);
			GL11.glScalef(0.75F, 0.75F, 0.75F);
			//Background
			this.drawTexturedModalRect(0, 0, 0, 0, guiWidth, guiHeight);
			GL11.glPopMatrix();
			//Yellow meter
			GL11.glPushMatrix();
			GL11.glTranslatef((screenWidth - guiWidth - 6), screenHeight - guiHeight - 16.5F, 0);
			GL11.glScalef(0.75F, 0.75F, 0.75F);
			this.drawTexturedModalRect(0, 0, 0, 18, (int) currDrive, guiHeight);
			GL11.glPopMatrix();
			//Level
			GL11.glPushMatrix();
			GL11.glTranslatef((screenWidth - guiWidth + 30), screenHeight - guiHeight - 17, 0);
			GL11.glScalef(0.75F, 0.75F, 0.75F);
			if(currBar == 0)
			{
				this.drawTexturedModalRect(0, 0, 0, 38, 8, guiHeight);
			}
			else if(currBar == 1)
			{
				this.drawTexturedModalRect(0, 0, 10, 38, 8, guiHeight);
			}
			else if(currBar == 2)
			{
				this.drawTexturedModalRect(0, 0, 20, 38, 8, guiHeight);
			}
			else if(currBar == 3)
			{
				this.drawTexturedModalRect(0, 0, 30, 38, 8, guiHeight);
			}
			else if(currBar == 4)
			{
				this.drawTexturedModalRect(0, 0, 40, 38, 8, guiHeight);
			}
			else if(currBar == 5)
			{
				this.drawTexturedModalRect(0, 0, 50, 38, 8, guiHeight);
			}
			else if(currBar == 6)
			{
				this.drawTexturedModalRect(0, 0, 60, 38, 8, guiHeight);
			}
			else if(currBar == 7)
			{
				this.drawTexturedModalRect(0, 0, 70, 38, 8, guiHeight);
			}
			else if(currBar == 8)
			{
				this.drawTexturedModalRect(0, 0, 80, 38, 8, guiHeight);
			}
			else if(currBar == 9)
			{
				this.drawTexturedModalRect(0, 0, 90, 38, 8, guiHeight);
			}

			GL11.glPopMatrix();
			if(dp >= 1000 == true)
			{
				GL11.glPushMatrix();
				this.drawTexturedModalRect((screenWidth - guiWidth - 23), screenHeight - guiHeight - 20, 0, 57, 30, guiHeight);
				GL11.glPopMatrix();
			}
			else
			{
				GL11.glPushMatrix();
				this.drawTexturedModalRect((screenWidth - guiWidth - 23), screenHeight - guiHeight - 20, 0, 100, 30, guiHeight);
				GL11.glPopMatrix();
			}
					}
	}
}
