package wehavecookies56.kk.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class DisplayOnHUD extends Gui {

	public static final ResourceLocation mpbar = new ResourceLocation("kk", "textures/gui/MPBar.png");
	private static Minecraft mc;
	public static int MP = 100;

	public DisplayOnHUD(Minecraft mc){
		super();
		this.mc = mc;
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderExperienceBar(RenderGameOverlayEvent event)
	{
		int MPBar_xPos = event.resolution.getScaledWidth() / 2;
		int MPBar_yPos = event.resolution.getScaledHeight() / 2;
		int MPBar_texture_width = 124;
		int MPBar_texture_height = 13;
		if(event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			int MPBar_startX = 0;
			int MPBar_startY = 0;
			return;
		}

		int MPBar_startX = (mc.displayWidth - MPBar_texture_width) / 2;
		int MPBar_startY = (mc.displayHeight - MPBar_texture_height) / 2;
		Gui gig = new Gui();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); // Renders Texture 'as is'
		GL11.glDisable(GL11.GL_LIGHTING); // Disabled lightning
		this.mc.renderEngine.bindTexture(mpbar); // Texture

		gig.drawTexturedModalRect(MPBar_xPos, MPBar_yPos, MPBar_startX, MPBar_startY, MPBar_texture_width, MPBar_texture_height);
	}
}
