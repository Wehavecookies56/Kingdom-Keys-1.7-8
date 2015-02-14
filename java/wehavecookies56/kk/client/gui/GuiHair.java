package wehavecookies56.kk.client.gui;

import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelFenrir;

public class GuiHair extends GuiScreen {

	private final ModelFenrir Fenrir;
	
	public GuiHair() {
		Fenrir = new ModelFenrir();
	}
	int selected = 0;
	final int SELECT = 2, NEXT = 0, PREV = 1, CLOSE = 3;
	final int NONE = 0, AXEL = 1, SORA = 2, RIKU = 3, KAIRI = 4, TERRA = 5, VENTUS = 6, AQUA = 7, VANITAS = 8;
	GuiButton button_select;
	GuiButton button_next;
	GuiButton button_prev;
	GuiButton button_close;
    int page = 0;
	int guiWidth = 196;
	int guiHeight = 150;
	
	@Override
	public void drawBackground(int p_146278_1_) {
		GL11.glPushMatrix();
        GL11.glLoadIdentity();
        RenderHelper.enableStandardItemLighting();
        GL11.glScalef(1F, 1F, 1F);
        
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/Fenrir.png"));
		Fenrir.render((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);  
        RenderHelper.disableStandardItemLighting();
        GL11.glPopMatrix();
        
		super.drawBackground(p_146278_1_);
	}
	
	@Override
	public void drawScreen(int x, int y, float renderTick) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		drawDefaultBackground();
        Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/gui/HairMenu.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);           
        fontRendererObj.drawString("Select a player hair", guiX + 20, guiY + 5, 0x404040);
        buttonList.add(button_next = new GuiButton(NEXT, guiX + 30, guiY + 60, 5, 15, ">"));
        buttonList.add(button_prev = new GuiButton(PREV, guiX + 10, guiY + 60, 5, 15, "<"));
        buttonList.add(button_select = new GuiButton(SELECT, guiX + 10, guiY + 40, 20, 15, "Select"));
        buttonList.add(button_close = new GuiButton(CLOSE, guiX + 90, guiY, 5, 15, "x"));
        switch(page){
        case NONE: 
        	fontRendererObj.drawString("Nothing", guiX + 25, guiY + 20, 0x000FF);
        	if(selected == page){
        		button_select.enabled =  false;
        		button_select.displayString = "Selected";
        	}else{
        		button_select.enabled =  true;
        		button_select.displayString = "Select";
        	}
        	break;
        case AXEL:
        	fontRendererObj.drawString("Axel/Lea", guiX + 25, guiY + 20, 0x000FF);
        	break;
        case SORA:
        	fontRendererObj.drawString("Sora", guiX + 25, guiY + 20, 0x000FF);
        	break;
        case RIKU:
        	fontRendererObj.drawString("Riku", guiX + 25, guiY + 20, 0x000FF);
        	break;
        case KAIRI:
        	fontRendererObj.drawString("Kairi", guiX + 25, guiY + 20, 0x000FF);
        	break;
        case TERRA:
        	fontRendererObj.drawString("Terra", guiX + 25, guiY + 20, 0x000FF);
        	break;
        case VENTUS:
        	fontRendererObj.drawString("Ventus/Roxas", guiX + 25, guiY + 20, 0x000FF);
        	break;
        case AQUA:
        	fontRendererObj.drawString("Aqua", guiX + 25, guiY + 20, 0x000FF);
        	break;
        case VANITAS:
        	fontRendererObj.drawString("Vanitas", guiX + 25, guiY + 20, 0x000FF);
        	break;
        default:
        	page = 0;
        }
		super.drawScreen(x, y, renderTick);
		
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		switch(button.id){
		case NEXT: page++; break;
		case PREV: page--; break;
		case SELECT: selected = page; break;
		case CLOSE: mc.displayGuiScreen(null); break;
		}
		
		switch(page){
		case NONE: if(button.id == PREV){button.enabled = false;} break;
		case VANITAS: if(button.id == NEXT){button.enabled = true;} break;
		default: break;
		}
		try {
			super.actionPerformed(button);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void initGui() {
		super.initGui();
	}
	
    @Override
    public void onGuiClosed() {
    	page = selected;
    	super.onGuiClosed();
    }
    
}
