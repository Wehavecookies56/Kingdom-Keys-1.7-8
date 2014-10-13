package wehavecookies56.kk.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiDrive extends GuiMenuBase {
	
	@Override
	public void drawScreen(int x, int y, float partialTicks) {
		drawBars("keyblades");
		
		super.drawScreen(x, y, partialTicks);
	}
	
	
	
	@Override
	protected void actionPerformed(GuiButton button) {
		
		super.actionPerformed(button);
	}
	
}
