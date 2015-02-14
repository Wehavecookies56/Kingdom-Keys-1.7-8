package api.player.render;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.*;

import api.player.model.*;

public class LayerPlayerArmor extends LayerBipedArmor
{
	public LayerPlayerArmor(RendererLivingEntity entity)
	{
		super(entity);
	}

	protected void func_177177_a()
	{
		this.field_177189_c = new ModelPlayerArmor(0.5F);
		this.field_177186_d = new ModelPlayerArmor(1.0F);
	}
}