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
	int maxDrive0 = 100;
	int maxDrive1 = 200;
	int maxDrive2 = 300;
	int maxDrive3 = 400;
	int maxDrive4 = 500;
	int maxDrive5 = 600;
	int maxDrive6 = 700;
	int maxDrive7 = 800;
	int maxDrive8 = 900;
	int maxDrive9 = 1000;
	int maxBars = 9;

	double oneValue = (47D / 100D);
	
	int currDrive;
	
	public GuiDriveBar(){
		
	}
	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){

		EntityPropertyDrivePoints props = EntityPropertyDrivePoints.get(mc.thePlayer);

		if (props.getCurrDrivePoints()<= maxDrive0)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-32);
		}
		
		else if(props.getCurrDrivePoints()<= maxDrive1 && props.getCurrDrivePoints()> maxDrive0)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-116);
		}

		else if(props.getCurrDrivePoints()<= maxDrive2 && props.getCurrDrivePoints()> maxDrive1)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-170);
		}

		else if(props.getCurrDrivePoints()<= maxDrive3 && props.getCurrDrivePoints()> maxDrive2)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-250);
		}

		else if(props.getCurrDrivePoints()<= maxDrive4 && props.getCurrDrivePoints()> maxDrive3)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-400);
		}

		else if(props.getCurrDrivePoints()<= maxDrive5 && props.getCurrDrivePoints()> maxDrive4)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-500);
		}

		else if(props.getCurrDrivePoints()<= maxDrive6 && props.getCurrDrivePoints()> maxDrive5)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-600);
		}

		else if(props.getCurrDrivePoints()<= maxDrive7 && props.getCurrDrivePoints()> maxDrive6)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-700);
		}

		else if(props.getCurrDrivePoints()<= maxDrive8 && props.getCurrDrivePoints()> maxDrive7)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-800);
		}
		
		else if(props.getCurrDrivePoints()<= maxDrive9 && props.getCurrDrivePoints()> maxDrive8)
		{
			currDrive = (int) (oneValue * props.getCurrDrivePoints()-900);
		}
		if(props.getCurrDrivePoints() == maxDrive0)
		{
			currDrive = 0;
			currBar = 1;
		}
		
		else if(props.getCurrDrivePoints() == maxDrive1)
		{
			currDrive = 0;
			currBar = 2;
		}
		
		else if(props.getCurrDrivePoints() == maxDrive2)
		{
			currDrive = 0;
			currBar = 3;
		}
		
		else if(props.getCurrDrivePoints() == maxDrive3)
		{
			currDrive = 0;
			currBar = 4;
		}
		else if(props.getCurrDrivePoints() == maxDrive4)
		{
			currDrive = 0;
			currBar = 5;
		}
		
		else if(props.getCurrDrivePoints() == maxDrive5)
		{
			currDrive = 0;
			currBar = 6;
		}
		
		else if(props.getCurrDrivePoints() == maxDrive6)
		{
			currDrive = 0;
			currBar = 7;
		}
		
		else if(props.getCurrDrivePoints() == maxDrive7)
		{
			currDrive = 0;
			currBar = 8;
		}
		
		else if(props.getCurrDrivePoints() == maxDrive8)
		{
			currDrive = 0;
			currBar = 9;
		}
		
		else if(props.getCurrDrivePoints() >= maxDrive9 && currBar == maxBars)
		{
			props.setCurrDrivePoints(maxDrive9);
			currDrive = (int) (oneValue * props.getCurrDrivePoints());
		}
		
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT) {
			//Temp will be an extended entity property

			//CommonProxy.getEntityData(props.EXT_PROP_NAME);			
			System.out.println("Drive points: " + props.getCurrDrivePoints());
			System.out.println("Current Bar: " + currBar);
			System.out.println("currDrive: " + currDrive);
			System.out.println("Drive points: " + props.getCurrDrivePoints());
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
			this.drawTexturedModalRect((screenWidth - guiWidth - 34), screenHeight - guiHeight - 12, 0, 18, currDrive, guiHeight);
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
