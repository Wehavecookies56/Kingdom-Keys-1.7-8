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

public class GuiMenu extends GuiMenuBase {

	public int barLength = 96;
	public int barHeight = 114;
	private GuiButton Items;
	private GuiButton Reports;
	private GuiButton Stats;
	private GuiButton Abilities;
	private GuiButton Close;
	private GuiButton Config;
	private GuiButton Back;
	private GuiButton Keyblades;
	private String locName;
	private int locID;
	private long worldTime;
	private int section = 0;

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
		this.buttonList.clear();
		if(section == 0){
			drawBars("menu");
			this.buttonList.add(Items = new GuiButton(0, 5, 55, 80, 20, StatCollector.translateToLocal(LocalStrings.Menu_Items)));
			this.buttonList.add(Reports = new GuiButton(1, 5, 80, 80, 20, StatCollector.translateToLocal(LocalStrings.Menu_Reports)));
			this.buttonList.add(Stats = new GuiButton(2, 5, 105, 80, 20, StatCollector.translateToLocal(LocalStrings.Menu_Stats)));
			this.buttonList.add(Abilities = new GuiButton(3, 5, 130, 80, 20, StatCollector.translateToLocal(LocalStrings.Menu_Abilities)));
			this.buttonList.add(Config = new GuiButton(5, 5, 155, 80, 20, StatCollector.translateToLocal(LocalStrings.Menu_Config)));
		}
		if(section == 1){
			drawBars("items");
			this.buttonList.add(Keyblades = new GuiButton(7, 5, 55, 80, 20, StatCollector.translateToLocal(LocalStrings.Menu_Keyblades)));
			this.buttonList.add(Back = new GuiButton(6, 5, 80, 80, 20, StatCollector.translateToLocal(LocalStrings.Menu_Back)));

		}
		this.buttonList.add(Close = new GuiButton(4, width - 25, 5, 20, 20, "x"));
		Stats.enabled = false;
		Abilities.enabled = false;
		Config.enabled = false;
		Reports.enabled = false;
		super.drawScreen(mouseX, mouseY, renderPartials);
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		switch(button.id){
		case 0:
			//TODO Keyblade summon GUI Hotbar of keychains Hold down Summon and num key to change
			section = 1;
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
			//TODO Config GUI, Change certain settings, Character customisation, Other stuff
			mc.displayGuiScreen(new GuiHair());
			break;
		case 6:
			section = 0;
			break;
		case 7:
			mc.displayGuiScreen(new GuiDrive());
			break;
		}
		super.actionPerformed(button);
	}

}
