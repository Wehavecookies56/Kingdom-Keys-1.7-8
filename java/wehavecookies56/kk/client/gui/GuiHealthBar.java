package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GuiHealthBar extends Gui
{

	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT)
		{
			int guiWidth = 189;
			int guiHeight = 12;
			int noborderguiwidth = 171;

			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer player = mc.thePlayer;
			ScaledResolution res = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			int screenWidth = res.getScaledWidth();
			int screenHeight = res.getScaledHeight();

			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/HPBar.png"));

			float oneHeart = (noborderguiwidth / player.getMaxHealth());
			int currHealth = noborderguiwidth - (int) (oneHeart * player.getHealth());
			GL11.glPushMatrix();
			GL11.glPushMatrix();
			GL11.glTranslatef(screenWidth - guiWidth + 46, screenHeight - guiHeight + 2, 0);
			GL11.glScalef(0.75F, 0.75F, 0.75F);
			this.drawTexturedModalRect(0, 0, 0, 0, guiWidth, guiHeight);
			GL11.glPopMatrix();
			//GL11.glTranslated(event.resolution.getScaledWidth_double(), 0, 0);
			//this.drawTexturedModalRect(screenWidth - guiWidth, screenHeight - guiHeight, 0, 0, guiWidth, guiHeight);
			//GL11.glScalef(2F, 2F, 2F);
			if (player.getHealth() >= 6)
			{//vida verde

			/*	GL11.glPushMatrix();
				GL11.glTranslatef((screenWidth - noborderguiwidth + 30) + currHealth, screenHeight - guiHeight + 2, 0);
				GL11.glScalef(0.75F, 0.75F, 0.75F);
				this.drawTexturedModalRect(0, 0, 0, 12, (noborderguiwidth - currHealth) - 2, guiHeight);*/
				this.drawTexturedModalRect((screenWidth - noborderguiwidth + 30) + currHealth, screenHeight - guiHeight+2, 0, 13, (noborderguiwidth - currHealth) - 45, guiHeight);
			}
			else
			{//vida roja
				//GL11.glScalef(0.5F, 0.5F, 0.5F);
				this.drawTexturedModalRect((screenWidth - noborderguiwidth - 13) + currHealth, screenHeight - guiHeight+2, 0, 24, (noborderguiwidth - currHealth) - 2, guiHeight);
			}
			GL11.glPopMatrix();
		}
	}
}