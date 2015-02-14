package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.lwjgl.opengl.GL11;

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
				GL11.glPushMatrix();
				GL11.glTranslatef((screenWidth - noborderguiwidth + 30) + (currHealth * 0.75F), screenHeight - guiHeight + 2.5F, 0);
				GL11.glScalef(0.75F, 0.75F, 0.75F);
				this.drawTexturedModalRect(0, 0, 0, 12, (noborderguiwidth - currHealth) - 2, guiHeight);
				//this.drawTexturedModalRect((screenWidth - noborderguiwidth - 13) + currHealth, screenHeight - guiHeight+2, 0, 13, (noborderguiwidth - currHealth) -1, guiHeight);
				GL11.glPopMatrix();
			}
			else
			{//vida roja
				GL11.glPushMatrix();
				GL11.glTranslatef((screenWidth - noborderguiwidth + 30) + (currHealth * 0.75F), screenHeight - guiHeight + 3.5F, 0);
				GL11.glScalef(0.75F, 0.75F, 0.75F);
				//GL11.glScalef(0.5F, 0.5F, 0.5F);
				this.drawTexturedModalRect(0, 0, 0, 24, (noborderguiwidth - currHealth) - 1, guiHeight);
				GL11.glPopMatrix();
			}
			GL11.glPopMatrix();
		}
	}
}