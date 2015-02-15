package wehavecookies56.kk.item;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import wehavecookies56.kk.KingdomKeys;

public class ItemDisc13 extends ItemRecord {

	protected ItemDisc13(String p_i45350_1_) {
		super(p_i45350_1_);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}
	
	@Override
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation("kk:" + name);
	}

}
