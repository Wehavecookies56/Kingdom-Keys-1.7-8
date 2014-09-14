package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.lib.LocalStrings;

public class GuiMenuBase extends GuiScreen {

	public int barLength = 96;
	public int barHeight = 114;
	private String locName;
	private int locID;
	private long worldTime;
	Minecraft mc = Minecraft.getMinecraft();
	private String Menu_Title;
	
	EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer) mc.thePlayer);
	
	public void drawBars(String name){
		Menu_Title = "gui.menu." + name;
		ResourceLocation barTop = new ResourceLocation("kk", "textures/gui/TopBar.png");
		ResourceLocation barBottom = new ResourceLocation("kk", "textures/gui/BottomBar.png");
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		drawDefaultBackground();
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		mc.renderEngine.bindTexture(barTop);
		drawTexturedModalRect(0, 0, 0, 0, width * 2, 90);
		drawTexturedModalRect(0, height * 2 - 90, 0, 90, width * 2, 90);
		GL11.glScalef(2.5F, 2.5F, 2.5F);
		fontRendererObj.drawString(StatCollector.translateToLocal(Menu_Title), 20, 20, 0xFFFFFF);
		GL11.glScalef(0.8F, 0.8F, 0.8F);
		locName = mc.thePlayer.worldObj.provider.getDimensionName();
		locID = mc.thePlayer.worldObj.provider.dimensionId;
		worldTime = mc.theWorld.getWorldTime();
		System.currentTimeMillis();
		fontRendererObj.drawString(locName + "(" + locID +")", width - (locName.length() * 8 + 4), 32, 0xFFFFFF);
		fontRendererObj.drawString(StatCollector.translateToLocal(LocalStrings.Synthesis_Munny) + ": " + props.getMunny(), 10, height - 20, 0xFFF000);
		Long time = Long.valueOf(mc.theWorld.provider.getWorldTime());
		String t = locName + " " + StatCollector.translateToLocal(LocalStrings.Menu_Time) + ": " + formatTime(time);
		fontRendererObj.drawString(t, width - fontRendererObj.getStringWidth(t) - 10, height - 20, 0xFFFFFF);
	}
	
	public static String formatTime(Long time) {
		int hours24 = (int)(time.longValue() / 1000L + 6L) % 24;
		int hours = hours24 % 12;
		int minutes = (int)((float)time.longValue() / 16.666666F % 60.0F);

		String Time = String.format("%02d:%02d %s", new Object[] { Integer.valueOf(hours < 1 ? 12 : hours), Integer.valueOf(minutes), hours24 < 12 ? "AM" : "PM" });
		return Time;
	}
}
