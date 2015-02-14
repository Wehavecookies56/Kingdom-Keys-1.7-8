package wehavecookies56.kk.client.gui;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;

public class GuiDrive extends GuiMenuBase {
	
	@Override
	public void drawScreen(int x, int y, float partialTicks) {
		drawBars("keyblades");
		
		super.drawScreen(x, y, partialTicks);
	}
	
	
	
	@Override
	protected void actionPerformed(GuiButton button) {
		
		try {
			super.actionPerformed(button);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
