package wehavecookies56.kk.item;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;

public class ItemDisc12 extends ItemRecord {

	protected ItemDisc12(String p_i45350_1_) {
		super(p_i45350_1_);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}
	
	@Override
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation("kk:" + name);
	}

}
