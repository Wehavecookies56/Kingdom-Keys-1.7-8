package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;

import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.lib.LocalStrings;

public class GuiMenu extends GuiScreen {

	public int barLength = 96;
	public int barHeight = 114;
	private GuiButton Keyblade;
	private GuiButton Reports;
	private GuiButton Stats;
	private GuiButton Abilities;
	private GuiButton Close;
	private GuiButton Config;
	private String locName;
	private int locID;
	private long worldTime;
	private StatCollector stat = new StatCollector();

	
	Minecraft mc = Minecraft.getMinecraft();
	
	EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer) mc.thePlayer);

	@Override
	public void initGui() {

	}


	@Override
	public void onGuiClosed() {

	}
	
	@Override
    protected void keyTyped(char c, int key) {
        switch (key) {
            case Keyboard.KEY_ESCAPE:
            case Keyboard.KEY_E:
                close();
                break;
        }
    }
	
	private void close() {
        mc.displayGuiScreen(null);
    }


	@Override
	public void drawScreen(int mouseX, int mouseY, float renderPartials) {
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
		fontRendererObj.drawString(stat.translateToLocal(LocalStrings.Menu_Title), 20, 20, 0xFFFFFF);
		GL11.glScalef(0.8F, 0.8F, 0.8F);
		locName = mc.thePlayer.worldObj.provider.getDimensionName();
		locID = mc.thePlayer.worldObj.provider.dimensionId;
		worldTime = mc.theWorld.getWorldTime();
		System.currentTimeMillis();
		fontRendererObj.drawString(locName + "(" + locID +")", width - (locName.length() * 8 + 4), 32, 0xFFFFFF);
		fontRendererObj.drawString(stat.translateToLocal(LocalStrings.Synthesis_Munny) + ": " + props.getMunny(), 10, height - 20, 0xFFF000);
		Long time = Long.valueOf(mc.theWorld.provider.getWorldTime());
		String t = locName + " " + stat.translateToLocal(LocalStrings.Menu_Time) + ": " + formatTime(time);
		fontRendererObj.drawString(t, width - fontRendererObj.getStringWidth(t) - 10, height - 20, 0xFFFFFF);
		this.buttonList.clear();
        this.buttonList.add(Keyblade = new GuiButton(0, 5, 55, 80, 20, stat.translateToLocal(LocalStrings.Menu_Keyblade)));
        this.buttonList.add(Reports = new GuiButton(1, 5, 80, 80, 20, stat.translateToLocal(LocalStrings.Menu_Reports)));
        this.buttonList.add(Stats = new GuiButton(2, 5, 105, 80, 20, stat.translateToLocal(LocalStrings.Menu_Stats)));
        this.buttonList.add(Abilities = new GuiButton(3, 5, 130, 80, 20, stat.translateToLocal(LocalStrings.Menu_Abilities)));
        this.buttonList.add(Config = new GuiButton(5, 5, 155, 80, 20, stat.translateToLocal(LocalStrings.Menu_Config)));
        this.buttonList.add(Close = new GuiButton(4, width - 25, 5, 20, 20, "x"));
        Keyblade.enabled = false;
        Stats.enabled = false;
        Abilities.enabled = false;
        Config.enabled = false;
        super.drawScreen(mouseX, mouseY, renderPartials);
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		switch(button.id){
		case 0:
			//TODO Keyblade summon GUI Hotbar of keychains Hold down Summon and num key to change
			break;
		case 1:
			mc.displayGuiScreen(new GuiReports()); //TODO Add full reports information and make the reports discoverable;
			break;
		case 2:
			//TODO Stats GUI, Drive, MP, HP, Strength, Defense etc
			break;
		case 3:
			//TODO Abilities GUI, Commands, Magic, Dodge, Lock-on, Combos
			break;
		case 4:
			close();
			break;
		case 5:
			mc.displayGuiScreen(new GuiHair());
		}
		super.actionPerformed(button);
	}
	
	public static String formatTime(Long time) {
		int hours24 = (int)(time.longValue() / 1000L + 6L) % 24;
		int hours = hours24 % 12;
		int minutes = (int)((float)time.longValue() / 16.666666F % 60.0F);

		String Time = String.format("%02d:%02d %s", new Object[] { Integer.valueOf(hours < 1 ? 12 : hours), Integer.valueOf(minutes), hours24 < 12 ? "AM" : "PM" });
		return Time;
	}
	
}
