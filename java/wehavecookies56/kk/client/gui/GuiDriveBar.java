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
			
			if(event.type == RenderGameOverlayEvent.ElementType.TEXT)
			{
				int guiWidth = 165;
				int guiHeight = 9;
				int screenWidth = event.resolution.getScaledWidth();
				int screenHeight = event.resolution.getScaledHeight();
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.thePlayer;
				int currDrive = OnHitEvent.currDrive;
			
				mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/DriveBar.png"));
				
				GL11.glPushMatrix();
				//Background
				this.drawTexturedModalRect(screenWidth - guiWidth, screenHeight - guiHeight, 0, 0, guiWidth, guiHeight);
				//Yellow meter
				this.drawTexturedModalRect((screenWidth - guiWidth) + currDrive, screenHeight - guiHeight, 0, 8, (guiWidth - currDrive) - 2, guiHeight);
				GL11.glPopMatrix();
			}
		}
	}
