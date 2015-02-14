package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.item.AddedItems;

public class GuiReports extends GuiScreen {

	ResourceLocation pages = new ResourceLocation("kk", "textures/gui/ReportsInside.png");

	Minecraft mc = Minecraft.getMinecraft();

	public int guiWidth = 240;
	public int guiHeight = 180;
	public int section = HOME;
	
	private float scrollPos = 0;

	public int guiTop = (mc.displayHeight - guiHeight) / 2;

	public GuiButton Items, Blocks, Enchantments, Back, Close, Next, Prev, Keyblades, ARecipes, Chronicles, Munny, HPOrb, Hearts, MusicDiscs, Potion, KArmor, OrgArmor, OrgWeps, Interdiction, SharpShooter, LindWorm, FrozenPride, SkySplitter, BookOfRet, Lunatic, EternalFlames, Arpeggio, FairGame, GracefulDahlia, Foudre, Heart, DarkHeart, PureHeart, KingdomHearts;
	
	public static final int maxPageNum = 100;
	
	public static final int HOME = -1;
	public static final int ITEMS = 0;
	public static final int BLOCKS = 1;
	public static final int ENCHANTMENTS = 2;
	public static final int BACK = 3;
	public static final int CLOSE = 4;
	public static final int NEXT = 5;
	public static final int PREV = 6;
	public static final int CHRONICLES = 7;
	public static final int KEYBLADES = 8;
	public static final int MUNNY = 9;
	public static final int HPORB = 10;
	public static final int HEARTS = 11;
	public static final int MUSICDISCS = 12;
	public static final int POTION = 13;
	public static final int KARMOR = 14;
	public static final int ORGARMOR = 15;
	public static final int ARECIPES = 16;
	public static final int ORGWEPS = 17;
	public static final int INTERDICTION = 18;
	public static final int SHARPSHOOTER = 19;
	public static final int LINDWORM = 20;
	public static final int FROZENPRIDE = 21;
	public static final int SKYSPLITTER = 22;
	public static final int BOOKOFRET = 23;
	public static final int LUNATIC = 24;
	public static final int ETERNALFLAMES = 25;
	public static final int ARPEGGIO = 26;
	public static final int FAIRGAME = 27;
	public static final int GRACEFULDAHLIA = 28;
	public static final int FOUDRE = 29;
	public static final int HEART = 30;
	public static final int DHEART = 31;
	public static final int PHEART = 32;
	public static final int KHEARTS = 33;
		
	public boolean isScrollingEnabled;

	@Override
	public void drawScreen(int x, int y, float renderPartials) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(pages);
		switch(section){
		case HOME:
			//int offset = (int) scrollPos;
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth / 2, guiHeight);
			fontRendererObj.drawString("Reports", guiX + 40, guiY + 20, 0xFFFFFF);
			buttonList.clear();
			buttonList.add(Items = new GuiButton(ITEMS, guiX + 14, guiY + 35, 94, 18, "Items"));
			buttonList.add(Blocks = new GuiButton(BLOCKS, guiX + 14, guiY + 55, 94, 18, "Blocks"));
			buttonList.add(Enchantments = new GuiButton(ENCHANTMENTS, guiX + 14, guiY + 75, 94, 18, "Enchantments")); 
			buttonList.add(Chronicles = new GuiButton(CHRONICLES, guiX + 14, guiY + 95, 94, 18, "Chronicles"));
			buttonList.add(Back = new GuiButton(BACK, guiX + 14, guiY + 150, 94, 18, "Back"));
			break;
		case ITEMS:
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
			scrollPos = 0;
			fontRendererObj.drawString("Items", guiX + 47, guiY + 20, 0xFFFFFF);
			buttonList.clear();
			buttonList.add(Keyblades = new GuiButton(KEYBLADES, guiX + 14, guiY + 35, 94, 18, "Keyblades"));
			buttonList.add(Munny = new GuiButton(MUNNY, guiX + 14, guiY + 55, 94, 18, "Munny"));
			buttonList.add(HPOrb = new GuiButton(HPORB, guiX + 14, guiY + 75, 94, 18, "HP Orb"));
			buttonList.add(Hearts = new GuiButton(HEARTS, guiX + 14, guiY + 95, 94, 18, "Hearts"));
			buttonList.add(MusicDiscs = new GuiButton(MUSICDISCS, guiX + 14, guiY + 115, 94, 18, "Music Discs"));
			buttonList.add(Potion = new GuiButton(POTION, guiX + 14, guiY + 135, 94, 18, "Potion"));
			buttonList.add(KArmor = new GuiButton(KARMOR, guiX + 132, guiY + 15, 94, 18, "Keyblade Armor"));
			buttonList.add(OrgArmor = new GuiButton(ORGARMOR, guiX + 132, guiY + 35, 94, 18, "Dark Robe"));
			buttonList.add(ARecipes = new GuiButton(ARECIPES, guiX + 132, guiY + 55, 94, 18, "Attack Recipes"));
			buttonList.add(OrgWeps = new GuiButton(ORGWEPS, guiX + 132, guiY + 75, 94, 18, "Org 13 Weapons"));
			buttonList.add(Back = new GuiButton(BACK, guiX + 132, guiY + 155, 94, 18, "Back"));
			break;
		case BLOCKS:               
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
			fontRendererObj.drawString("Blocks", guiX + 47, guiY + 20, 0xFFFFFF);
			buttonList.clear();
			buttonList.add(Back = new GuiButton(BACK, guiX + 140, guiY + 150, 78, 18, "Back"));
			break;
		case ENCHANTMENTS:
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
			fontRendererObj.drawString("Enchantments", guiX + 28, guiY + 20, 0xFFFFFF);
			buttonList.clear();
			buttonList.add(Back = new GuiButton(BACK, guiX + 140, guiY + 150, 78, 18, "Back"));
			break;
		case CHRONICLES:
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
			fontRendererObj.drawString("Chronicles", guiX + 34, guiY + 20, 0xFFFFFF);
			buttonList.clear();
			buttonList.add(Back = new GuiButton(BACK, guiX + 140, guiY + 150, 78, 18, "Back"));
			break;
		case KEYBLADES:
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
			fontRendererObj.drawString("Keyblades", guiX + 34, guiY + 20, 0xFFFFFF);
			fontRendererObj.drawSplitString("Keyblades are weapons like swords which cannot break and have much higher power. Each keyblade has a unique keychain which is used to summon the corresponding keyblade.", guiX + 14, guiY + 35, 100, 0x404040);
			fontRendererObj.drawSplitString("To make a keycahin a synthesis table is required and the corresponding attack recipe.", guiX + 132, guiY + 10, 100, 0x404040);
			buttonList.clear();
			buttonList.add(Back = new GuiButton(BACK, guiX + 140, guiY + 150, 78, 18, "Back"));
			break;
		case MUNNY:
			GL11.glPushMatrix();
			GL11.glDisable(GL11.GL_LIGHTING);
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
			fontRendererObj.drawString("Munny", guiX + 34, guiY + 20, 0xFFFFFF);
			fontRendererObj.drawSplitString("Munny is the currency used in Kingdom Hearts, which can be obtained through either slaying mobs or from prize blox. When munny is picked up it adds to the amount of munny you have which is displayed in the bottom left of the menu it also", guiX + 14, guiY + 35, 100, 0x404040);
			fontRendererObj.drawSplitString("is not added to the player's inventory.", guiX + 132, guiY + 10, 100, 0x404040);
			fontRendererObj.drawSplitString("", guiX + 132, guiY + 10, 100, 0x404040);
			GL11.glPopMatrix();
			buttonList.clear();
			buttonList.add(Back = new GuiButton(BACK, guiX + 140, guiY + 150, 78, 18, "Back"));
			itemRender.renderItemIntoGUI(fontRendererObj, mc.renderEngine, new ItemStack(AddedItems.Munny1), guiX + 36, guiY + 20);
			break;
			default:
				buttonList.clear();
				mc.displayGuiScreen(new GuiMenu());
				break;
		}
		super.drawScreen(x, y, renderPartials);
	}

	@Override
	protected void keyTyped(char c, int key) {
		switch(key) {
		case Keyboard.KEY_ESCAPE:
		case Keyboard.KEY_E:
			close();
			break;
		}
		super.keyTyped(c, key);
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		switch(button.id){
		case ITEMS:
			section = ITEMS;
			break;
		case BLOCKS:
			section = BLOCKS;
			//scrollPos += 2;
			//if(scrollPos > 40){
			//	scrollPos = 40;
			//}
			break;
		case ENCHANTMENTS:
			section = ENCHANTMENTS;
			//scrollPos -= 2;
			//if(scrollPos <= 0){
			//	scrollPos = 0;
			//}
			break;
		case BACK:
			switch(section){
			case HOME:
				mc.displayGuiScreen(new GuiMenu());
				break;
			case ITEMS:
				section = HOME;
				break;
			case BLOCKS:
				section = HOME;
				break;
			case ENCHANTMENTS:
				section = HOME;
				break;
			case CHRONICLES:
				section = HOME;
				break;
			case KEYBLADES:
				section = ITEMS;
				break;
			case MUNNY:
				section = ITEMS;
			}
			break;
		case CLOSE:
			section = HOME;
			close();
			break;
		case NEXT:
			
			break;
		case PREV:
			
			break;
		case CHRONICLES:
			section = CHRONICLES;
			break;
		case KEYBLADES:
			section = KEYBLADES;
			break;
		case MUNNY:
			section = MUNNY;
		}
		super.actionPerformed(button);
	}

	private void close() {
		mc.displayGuiScreen(null);
	}
	
	public void handleMouseInput()
    {
        super.handleMouseInput();
        int i = Mouse.getEventDWheel();
        int m = Mouse.getEventButton();
        
		if(isScrollingEnabled)
		{
			this.scrollPos += i * ((float)(height - 40) / (float)((2) * (20 + 5)) / 33F);
			scrollPos = scrollPos > 1.0F ? 1.0F : scrollPos < 0.0F ? 0.0F : scrollPos;
		}
	}
	
	//public static void startClip(int x, int y, int width, int height, int guiX, int guiY)
	//{
	//	GL11.glEnable(GL11.GL_SCISSOR_TEST);
	//	GL11.glScissor(guiX + x, guiY + y, (guiX + x) + width, (guiY + y) + height);	
	//}
	
	//public static void stopClip()
	//{
	//	GL11.glDisable(GL11.GL_SCISSOR_TEST);
	//}
}
