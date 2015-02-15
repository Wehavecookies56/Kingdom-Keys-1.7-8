package wehavecookies56.kk.item;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import wehavecookies56.kk.KingdomKeys;

public class ItemDisc1 extends ItemRecord {

	protected ItemDisc1(String par1Str) {
		super(par1Str);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}
	
	@Override
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation("kk:" + name);
	}
}
