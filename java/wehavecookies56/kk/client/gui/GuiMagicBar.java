package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.magic.MagicAttack;

public class GuiMagicBar extends Gui
{
	
	@SubscribeEvent
	public void onRenderOverlayPost(RenderGameOverlayEvent event){
		
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT)
		{
			int guiWidth = 123;
			int guiHeight = 13;
			int noborderguiwidth = 101;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			float oneMP;
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer player = mc.thePlayer;
			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/MPBar.png"));
			if (MagicAttack.currMagic != 0)
			{
				oneMP = (guiWidth / MagicAttack.maxMagic);
			}
			else
			{
				oneMP = 0;
			}
			int cMagic = guiWidth - (int) (oneMP * MagicAttack.currMagic);
			MagicAttack.currMagic = 100;
			GL11.glPushMatrix();
			GL11.glTranslatef(screenWidth - guiWidth - 66 + 46, screenHeight - guiHeight - 6, 0);
			GL11.glScalef(0.75F, 0.75F, 0.75F);
			this.drawTexturedModalRect(0, 0, 0, 0, guiWidth, guiHeight);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef((screenWidth - noborderguiwidth-111) + cMagic + 46, screenHeight - guiHeight - 6, 0);
			GL11.glScalef(0.75F, 0.75F, 0.75F);
			this.drawTexturedModalRect(0, 0, 0, 13, (noborderguiwidth - cMagic) + 25, guiHeight);
			//this.drawTexturedModalRect((screenWidth - noborderguiwidth-16) + currHealth, screenHeight - guiHeight, 0, 12, (noborderguiwidth - currHealth) - 2, guiHeight);
			GL11.glPopMatrix();

		}
	}
}