package wehavecookies56.kk.item;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import wehavecookies56.kk.KingdomKeys;

public class ItemDisc5 extends ItemRecord {

	protected ItemDisc5(String par1Str) {
		super(par1Str);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}

	@Override
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation("kk:" + name);
	}
}
