package wehavecookies56.kk.client.render;

import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemRenderVoidedKnowledge implements IItemRenderer {

	private static RenderItem renderItem = new RenderItem();
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type){
        case INVENTORY: return true;
        default: return false;
    }
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		IIcon icon = item.getIconIndex();
        renderItem.renderIcon(0, 0, icon, 16, 16);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1, 1, 1, 1);

        GL11.glDepthMask(true);
        GL11.glDisable(GL11.GL_BLEND);
        
        GL11.glEnable(GL11.GL_TEXTURE_2D);

	}

}
