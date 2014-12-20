package wehavecookies56.kk.client.gui;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.event.LivingUpdateEevent;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
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
	final int FIRE = 7, BLIZZARD = 6, THUNDER = 5, CURE = 4, GRAVITY = 3, AERO = 2, STOP = 1;
	final int VALOR=5, WISDOM=4, LIMIT=3, MASTER=2, FINAL=1;
	int selected = ATTACK;
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderOverlayPost(RenderGameOverlayEvent event){
		if(event.type == RenderGameOverlayEvent.ElementType.TEXT && !mc.ingameGUI.getChatGUI().getChatOpen()) {		
			int commandWidth = 70;
			int commandHeight = 15;
			int screenWidth = event.resolution.getScaledWidth();
			int screenHeight = event.resolution.getScaledHeight();
			EntityPlayer player = mc.thePlayer;
			
			if (KeyBind.selected == 0)
			{
				selected = ATTACK;
			}
			else if(KeyBind.selected == 1)
			{
				selected = MAGIC;
			}
			else if(KeyBind.selected == 2)
			{
				selected = ITEMS;
			}
			else if(KeyBind.selected == 3)
			{
				selected = DRIVE;
			}
			
			//Submenus
			switch (KeyBind.submenu)
			{
			case 1:
				mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/CommandMenu.png"));
				if (KeyBind.magicselected == -1)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * FIRE), 70, 0, commandWidth, commandHeight);
				}
				if (KeyBind.magicselected==0)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * FIRE), 70, 15, commandWidth, commandHeight);
				}else{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * FIRE), 70, 0, commandWidth, commandHeight);
				}
				if (KeyBind.magicselected==1)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * BLIZZARD), 70, 15, commandWidth, commandHeight);
				}else{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * BLIZZARD), 70, 0, commandWidth, commandHeight);
				}
				if (KeyBind.magicselected==2)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * THUNDER), 70, 15, commandWidth, commandHeight);
				}else{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * THUNDER), 70, 0, commandWidth, commandHeight);
				}
				if (KeyBind.magicselected==3)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * CURE), 70, 15, commandWidth, commandHeight);
				}else{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * CURE), 70, 0, commandWidth, commandHeight);
				}
				if (KeyBind.magicselected==4)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * GRAVITY), 70, 15, commandWidth, commandHeight);
				}else{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * GRAVITY), 70, 0, commandWidth, commandHeight);
				}
				if (KeyBind.magicselected==5)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * AERO), 70, 15, commandWidth, commandHeight);
				}else{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * AERO), 70, 0, commandWidth, commandHeight);
				}
				if (KeyBind.magicselected==6)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * STOP), 70, 15, commandWidth, commandHeight);	
				}else{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * STOP), 70, 0, commandWidth, commandHeight);	
				}
				/*
				else if (KeyBind.magicselected==7)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * FIRE), 70, 0, commandWidth, commandHeight);
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * BLIZZARD), 70, 15, commandWidth, commandHeight);
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * THUNDER), 70, 0, commandWidth, commandHeight);
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * CURE), 70, 0, commandWidth, commandHeight);
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * GRAVITY), 70, 0, commandWidth, commandHeight);
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * AERO), 70, 0, commandWidth, commandHeight);
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * STOP), 70, 0, commandWidth, commandHeight);	
				}
				*/
				GL11.glPushMatrix();
				
				//GL11.glScalef(1.1F, 1.1F, 1.1F);
				
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic_Fire), 75, screenHeight - (commandHeight * (FIRE-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic_Blizzard), 75, screenHeight - (commandHeight * (BLIZZARD-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic_Thunder), 75, screenHeight - (commandHeight * (THUNDER-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic_Cure), 75, screenHeight - (commandHeight * (CURE-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic_Gravity), 75, screenHeight - (commandHeight * (GRAVITY-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic_Aero), 75, screenHeight - (commandHeight * (AERO-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic_Stop), 75, screenHeight - (commandHeight * (STOP-1)-2) - 13, 0xFFFFFF);

				GL11.glPopMatrix();
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				break;
				
			case 2:
				mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/CommandMenu.png"));

				//items
				break;
				
			case 3:
				mc.renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/CommandMenu.png"));
				
				if(KeyBind.driveselected == -1)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * VALOR), 70, 0, commandWidth, commandHeight);
				}
				
				if(KeyBind.driveselected == 0)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * VALOR), 70, 15, commandWidth, commandHeight);
				}
				else
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * VALOR), 70, 0, commandWidth, commandHeight);
				}
				
				if(KeyBind.driveselected == 1)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * WISDOM), 70, 15, commandWidth, commandHeight);
				}
				else
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * WISDOM), 70, 0, commandWidth, commandHeight);
				}
				if(KeyBind.driveselected == 2)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * LIMIT), 70, 15, commandWidth, commandHeight);
				}
				
				else
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * LIMIT), 70, 0, commandWidth, commandHeight);
				}
				
				if(KeyBind.driveselected == 3)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * MASTER), 70, 15, commandWidth, commandHeight);
				}
				else
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * MASTER), 70, 0, commandWidth, commandHeight);
				}
				
				if(KeyBind.driveselected == 4)
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * FINAL), 70, 15, commandWidth, commandHeight);
				}
				else
				{
					this.drawTexturedModalRect(70, screenHeight - (commandHeight * FINAL), 70, 0, commandWidth, commandHeight);
				}
				
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Valor), 75, screenHeight - (commandHeight * (VALOR-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Wisdom), 75, screenHeight - (commandHeight * (WISDOM-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Limit), 75, screenHeight - (commandHeight * (LIMIT-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Master), 75, screenHeight - (commandHeight * (MASTER-1)-2) - 13, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Final), 75, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
				break;
			}
			
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
				
				//GL11.glScalef(1.1F, 1.1F, 1.1F);

				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Attack), 10, screenHeight - (commandHeight * ATTACK) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic), 10, screenHeight - (commandHeight * MAGIC) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Items), 10, screenHeight - (commandHeight * ITEMS) +4, 0xFFFFFF);
				if (EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 0 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 1 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 2 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 3 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 4 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 5)
				{
					if (LivingUpdateEevent.onDrive)
					{
						GuiDrawText.drawString(StatCollector.translateToLocal("REVERT"), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
					}
					else
					{
						GuiDrawText.drawString(StatCollector.translateToLocal("REVERT"), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0x555555);
					}
				}
				else
				{
					GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
				}
				//GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * DRIVE) +4, 0xFFFFFF);

				GL11.glPopMatrix();

				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				break;
			case MAGIC:
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ATTACK), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(5, screenHeight - (commandHeight * MAGIC), 70, 15, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ITEMS), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * DRIVE), 70, 0, commandWidth, commandHeight);
				GL11.glPushMatrix();
				
				//GL11.glScalef(1.1F, 1.1F, 1.1F);

				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Attack), 10, screenHeight - (commandHeight * ATTACK) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic), 10, screenHeight - (commandHeight * MAGIC) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Items), 10, screenHeight - (commandHeight * ITEMS) +4, 0xFFFFFF);
				if (EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 0 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 1 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 2 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 3 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 4 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 5)
				{
					if (LivingUpdateEevent.onDrive)
					{
						GuiDrawText.drawString(StatCollector.translateToLocal("REVERT"), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
					}
					else
					{
						GuiDrawText.drawString(StatCollector.translateToLocal("REVERT"), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0x555555);
					}
				}
				else
				{
					GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
				}
				//GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * DRIVE) +4, 0xFFFFFF);

				GL11.glPopMatrix();

				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				break;
			case ITEMS:
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ATTACK), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * MAGIC), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(5, screenHeight - (commandHeight * ITEMS), 70, 15, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * DRIVE), 70, 0, commandWidth, commandHeight);
				GL11.glPushMatrix();
				
				//GL11.glScalef(1.1F, 1.1F, 1.1F);

				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Attack), 10, screenHeight - (commandHeight * ATTACK) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic), 10, screenHeight - (commandHeight * MAGIC) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Items), 10, screenHeight - (commandHeight * ITEMS) +4, 0xFFFFFF);
				if (EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 0 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 1 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 2 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 3 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 4 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 5)
				{
					if (LivingUpdateEevent.onDrive)
					{
						GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Revert), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
					}
					else
					{
						GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Revert), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0x555555);
					}
				}
				else
				{
					GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
				}
				//GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * DRIVE) +4, 0xFFFFFF);

				GL11.glPopMatrix();

				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				break;
			case DRIVE:
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ATTACK), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * MAGIC), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(0, screenHeight - (commandHeight * ITEMS), 70, 0, commandWidth, commandHeight);
				this.drawTexturedModalRect(5, screenHeight - (commandHeight * DRIVE), 70, 15, commandWidth, commandHeight);
				GL11.glPushMatrix();
				
				//GL11.glScalef(1.1F, 1.1F, 1.1F);

				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Attack), 10, screenHeight - (commandHeight * ATTACK) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Magic), 10, screenHeight - (commandHeight * MAGIC) +4, 0xFFFFFF);
				GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Items), 10, screenHeight - (commandHeight * ITEMS) +4, 0xFFFFFF);
				if (EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 0 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 1 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 2 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 3 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 4 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 5)
				{
					if (LivingUpdateEevent.onDrive)
					{
						GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Revert), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
					}
					else
					{
						GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive_Revert), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0x555555);
					}
				}
				else
				{
					GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * (FINAL-1)-2) - 13, 0xFFFFFF);
				}
			//	System.out.println("Selected: "+KeyBind.selected);
			//	System.out.println("Submenu: "+KeyBind.submenu);
				//System.out.println("Selected: "+KeyBind.);


				//GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Drive), 10, screenHeight - (commandHeight * DRIVE) +4, 0xFFFFFF);

				GL11.glPopMatrix();
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				break;
			}
		
		/*	System.out.println("Selected: "+KeyBind.selected);
			System.out.println("Submenu: "+KeyBind.submenu);*/
			GL11.glPushMatrix();

			//GL11.glScalef(1.1F, 1.1F, 1.1F);
			GuiDrawText.drawString(StatCollector.translateToLocal(LocalStrings.Command_Command), 7, screenHeight - (commandHeight * TOP) +4, 0x0069D1);
			GL11.glPopMatrix();

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			
			GL11.glPopMatrix();
		}
	}
}
