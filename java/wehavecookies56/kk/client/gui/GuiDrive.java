package wehavecookies56.kk.client.gui;

import net.minecraft.client.gui.GuiScreen;

public class GuiDrive extends GuiMenuBase {
	
	@Override
	public void drawScreen(int x, int y, float partialTicks) {
		drawBars("keyblades");
		
		super.drawScreen(x, y, partialTicks);
	}
	
}
