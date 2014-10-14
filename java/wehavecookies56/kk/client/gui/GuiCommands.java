package wehavecookies56.kk.client.gui;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.lib.LocalStrings;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class GuiCommands extends Gui {

	Minecraft mc = Minecraft.getMinecraft();
	final int TOP = 5, ATTACK = 4, MAGIC = 3, ITEMS = 2, DRIVE = 1;
	int selected = ATTACK;
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderOverlayPost(RenderGameOverlayEvent event){
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT) {		
			int commandWidth = 70;
			int commandHeight = 15;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			EntityPlayer player = mc.thePlayer;
			
			mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/CommandMenu.png"));
			GL11.glPushMatrix();

			this.drawTexturedModalRect(0, screenHeight - (commandHeight * TOP), 0, 0, commandWidth, commandHeight);
			
			switch(selected){
			case ATTACK:
				this.drawTexturedModalRect(5, screenHeight - (commandHeight * ATTACK), 70, 15, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * MAGIC), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ITEMS), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * DRIVE), 70, 0, commandWidth, commandHeight);
				GL11.glPushMatrix();
				
				GL11.glScalef(1.1F, 1.1F, 1.1F);

				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Attack), 10, screenHeight - (commandHeight * ATTACK) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic), 10, screenHeight - (commandHeight * MAGIC) - 14, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Items), 10, screenHeight - (commandHeight * ITEMS) - 15, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * DRIVE) - 17, 0xFFFFFF);

				GL11.glPopMatrix();

				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				break;
			case MAGIC:
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ATTACK), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(5, screenHeight - (commandHeight * MAGIC), 70, 15, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ITEMS), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * DRIVE), 70, 0, commandWidth, commandHeight);
				break;
			case ITEMS:
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ATTACK), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * MAGIC), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(5, screenHeight - (commandHeight * ITEMS), 70, 15, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * DRIVE), 70, 0, commandWidth, commandHeight);
				break;
			case DRIVE:
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ATTACK), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * MAGIC), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ITEMS), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(5, screenHeight - (commandHeight * DRIVE), 70, 15, commandWidth, commandHeight);
				break;
			}
			GL11.glPushMatrix();

			GL11.glScalef(1.1F, 1.1F, 1.1F);
			GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Command), 7, screenHeight - (commandHeight * TOP) - 12, 0x0069D1);
			GL11.glPopMatrix();

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			
			GL11.glPopMatrix();
		}
	}
}
