package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiDrawText {

	public static void drawString(String text, int x, int y, int colour){
		Minecraft.getMinecraft().fontRenderer.drawString(text, x, y, colour);
	}
}
