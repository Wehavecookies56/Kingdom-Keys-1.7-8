package wehavecookies56.kk.item;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Strings;

public class ItemEmptyBottle  extends ItemKingdomKeys{

    public ItemEmptyBottle(){
    	super();
        this.setCreativeTab(KingdomKeys.KKTAB);
        this.setUnlocalizedName(Strings.EmptyBottle); 
    }
}