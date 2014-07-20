package wehavecookies56.kk.slot;

import wehavecookies56.kk.item.AddedItems;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSynthesis extends Slot {

	public SlotSynthesis(IInventory par1iInventory, int id, int x, int y) {
		super(par1iInventory, id, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack){
		return true;
		/*
		if(stack == new ItemStack(AddedItems.K1r)){
			return stack == new ItemStack(AddedItems.K1r);
		}else if(stack == new ItemStack(AddedItems.K111r)){
			return stack == new ItemStack(AddedItems.K111r);
		}else if(stack == new ItemStack(AddedItems.K2r)){
			return stack == new ItemStack(AddedItems.K2r);
		}else if(stack == new ItemStack(AddedItems.K3r)){
			return stack == new ItemStack(AddedItems.K3r);
		}else if(stack == new ItemStack(AddedItems.K4r)){
			return stack == new ItemStack(AddedItems.K4r);
		}else if(stack == new ItemStack(AddedItems.K5r)){
			return stack == new ItemStack(AddedItems.K5r);
		}else if(stack == new ItemStack(AddedItems.K6r)){
			return stack == new ItemStack(AddedItems.K6r);
		}else if(stack == new ItemStack(AddedItems.K7r)){
			return stack == new ItemStack(AddedItems.K7r);
		}else if(stack == new ItemStack(AddedItems.K8r)){
			return stack == new ItemStack(AddedItems.K8r);
		}else if(stack == new ItemStack(AddedItems.K9r)){
			return stack == new ItemStack(AddedItems.K9r);
		}else if(stack == new ItemStack(AddedItems.K10r)){
			return stack == new ItemStack(AddedItems.K10r);
		}else if(stack == new ItemStack(AddedItems.K11r)){
			return stack == new ItemStack(AddedItems.K11r);
		}else if(stack == new ItemStack(AddedItems.K12r)){
			return stack == new ItemStack(AddedItems.K12r);
		}else if(stack == new ItemStack(AddedItems.K13r)){
			return stack == new ItemStack(AddedItems.K13r);
		}else if(stack == new ItemStack(AddedItems.K14r)){
			return stack == new ItemStack(AddedItems.K14r);
		}else if(stack == new ItemStack(AddedItems.K15r)){
			return stack == new ItemStack(AddedItems.K15r);
		}else if(stack == new ItemStack(AddedItems.K16r)){
			return stack == new ItemStack(AddedItems.K16r);
		}else if(stack == new ItemStack(AddedItems.K17r)){
			return stack == new ItemStack(AddedItems.K17r);
		}else if(stack == new ItemStack(AddedItems.K18r)){
			return stack == new ItemStack(AddedItems.K18r);
		}else if(stack == new ItemStack(AddedItems.K19r)){
			return stack == new ItemStack(AddedItems.K19r);
		}else if(stack == new ItemStack(AddedItems.K20r)){
			return stack == new ItemStack(AddedItems.K20r);
		}else if(stack == new ItemStack(AddedItems.K21r)){
			return stack == new ItemStack(AddedItems.K21r);
		}else if(stack == new ItemStack(AddedItems.K22r)){
			return stack == new ItemStack(AddedItems.K22r);
		}else if(stack == new ItemStack(AddedItems.K23r)){
			return stack == new ItemStack(AddedItems.K23r);
		}else if(stack == new ItemStack(AddedItems.K24r)){
			return stack == new ItemStack(AddedItems.K24r);
		}else if(stack == new ItemStack(AddedItems.K25r)){
			return stack == new ItemStack(AddedItems.K25r);
		}else if(stack == new ItemStack(AddedItems.K26r)){
			return stack == new ItemStack(AddedItems.K26r);
		}else if(stack == new ItemStack(AddedItems.K27r)){
			return stack == new ItemStack(AddedItems.K27r);
		}else if(stack == new ItemStack(AddedItems.K28r)){
			return stack == new ItemStack(AddedItems.K28r);
		}else if(stack == new ItemStack(AddedItems.K29r)){
			return stack == new ItemStack(AddedItems.K29r);
		}else if(stack == new ItemStack(AddedItems.K30r)){
			return stack == new ItemStack(AddedItems.K30r);
		}else if(stack == new ItemStack(AddedItems.K31r)){
			return stack == new ItemStack(AddedItems.K31r);
		}else if(stack == new ItemStack(AddedItems.K32r)){
			return stack == new ItemStack(AddedItems.K32r);
		}else if(stack == new ItemStack(AddedItems.K33r)){
			return stack == new ItemStack(AddedItems.K33r);
		}else if(stack == new ItemStack(AddedItems.K34r)){
			return stack == new ItemStack(AddedItems.K34r);
		}else if(stack == new ItemStack(AddedItems.K35r)){
			return stack == new ItemStack(AddedItems.K35r);
		}else if(stack == new ItemStack(AddedItems.K36r)){
			return stack == new ItemStack(AddedItems.K36r);
		}else if(stack == new ItemStack(AddedItems.K37r)){
			return stack == new ItemStack(AddedItems.K37r);
		}else if(stack == new ItemStack(AddedItems.K38r)){
			return stack == new ItemStack(AddedItems.K38r);
		}else if(stack == new ItemStack(AddedItems.K39r)){
			return stack == new ItemStack(AddedItems.K39r);
		}else if(stack == new ItemStack(AddedItems.K40r)){
			return stack == new ItemStack(AddedItems.K40r);
		}else if(stack == new ItemStack(AddedItems.K41r)){
			return stack == new ItemStack(AddedItems.K41r);
		}else if(stack == new ItemStack(AddedItems.K42r)){
			return stack == new ItemStack(AddedItems.K42r);
		}else if(stack == new ItemStack(AddedItems.K43r)){
			return stack == new ItemStack(AddedItems.K43r);
		}else if(stack == new ItemStack(AddedItems.K44r)){
			return stack == new ItemStack(AddedItems.K44r);
		}else if(stack == new ItemStack(AddedItems.K45r)){
			return stack == new ItemStack(AddedItems.K45r);
		}else if(stack == new ItemStack(AddedItems.K46r)){
			return stack == new ItemStack(AddedItems.K46r);
		}else if(stack == new ItemStack(AddedItems.K47r)){
			return stack == new ItemStack(AddedItems.K47r);
		}else if(stack == new ItemStack(AddedItems.K48r)){
			return stack == new ItemStack(AddedItems.K48r);
		}else if(stack == new ItemStack(AddedItems.K49r)){
			return stack == new ItemStack(AddedItems.K49r);
		}else if(stack == new ItemStack(AddedItems.K50r)){
			return stack == new ItemStack(AddedItems.K50r);
		}else if(stack == new ItemStack(AddedItems.K51r)){
			return stack == new ItemStack(AddedItems.K51r);
		}else if(stack == new ItemStack(AddedItems.K52r)){
			return stack == new ItemStack(AddedItems.K52r);
		}else if(stack == new ItemStack(AddedItems.K53r)){
			return stack == new ItemStack(AddedItems.K53r);
		}else if(stack == new ItemStack(AddedItems.K54r)){
			return stack == new ItemStack(AddedItems.K54r);
		}else if(stack == new ItemStack(AddedItems.K55r)){
			return stack == new ItemStack(AddedItems.K55r);
		}else if(stack == new ItemStack(AddedItems.K56r)){
			return stack == new ItemStack(AddedItems.K56r);
		}else if(stack == new ItemStack(AddedItems.K57r)){
			return stack == new ItemStack(AddedItems.K57r);
		}else if(stack == new ItemStack(AddedItems.K58r)){
			return stack == new ItemStack(AddedItems.K58r);
		}else if(stack == new ItemStack(AddedItems.K59r)){
			return stack == new ItemStack(AddedItems.K59r);
		}else if(stack == new ItemStack(AddedItems.K60r)){
			return stack == new ItemStack(AddedItems.K60r);
		}else if(stack == new ItemStack(AddedItems.K61r)){
			return stack == new ItemStack(AddedItems.K61r);
		}else if(stack == new ItemStack(AddedItems.K62r)){
			return stack == new ItemStack(AddedItems.K62r);
		}else if(stack == new ItemStack(AddedItems.K63r)){
			return stack == new ItemStack(AddedItems.K63r);
		}else if(stack == new ItemStack(AddedItems.K64r)){
			return stack == new ItemStack(AddedItems.K64r);
		}else if(stack == new ItemStack(AddedItems.K65r)){
			return stack == new ItemStack(AddedItems.K65r);
		}else if(stack == new ItemStack(AddedItems.K66r)){
			return stack == new ItemStack(AddedItems.K66r);
		}else if(stack == new ItemStack(AddedItems.K67r)){
			return stack == new ItemStack(AddedItems.K67r);
		}else if(stack == new ItemStack(AddedItems.K68r)){
			return stack == new ItemStack(AddedItems.K68r);
		}else if(stack == new ItemStack(AddedItems.K69r)){
			return stack == new ItemStack(AddedItems.K69r);
		}else if(stack == new ItemStack(AddedItems.K70r)){
			return stack == new ItemStack(AddedItems.K70r);
		}else if(stack == new ItemStack(AddedItems.K71r)){
			return stack == new ItemStack(AddedItems.K71r);
		}else if(stack == new ItemStack(AddedItems.K72r)){
			return stack == new ItemStack(AddedItems.K72r);
		}else if(stack == new ItemStack(AddedItems.K73r)){
			return stack == new ItemStack(AddedItems.K73r);
		}else if(stack == new ItemStack(AddedItems.K74r)){
			return stack == new ItemStack(AddedItems.K74r);
		}else if(stack == new ItemStack(AddedItems.K75r)){
			return stack == new ItemStack(AddedItems.K75r);
		}else if(stack == new ItemStack(AddedItems.K76r)){
			return stack == new ItemStack(AddedItems.K76r);
		}else if(stack == new ItemStack(AddedItems.K77r)){
			return stack == new ItemStack(AddedItems.K77r);
		}else if(stack == new ItemStack(AddedItems.K78r)){
			return stack == new ItemStack(AddedItems.K78r);
		}else if(stack == new ItemStack(AddedItems.K79r)){
			return stack == new ItemStack(AddedItems.K79r);
		}else if(stack == new ItemStack(AddedItems.K80r)){
			return stack == new ItemStack(AddedItems.K80r);
		}else if(stack == new ItemStack(AddedItems.K81r)){
			return stack == new ItemStack(AddedItems.K81r);
		}else if(stack == new ItemStack(AddedItems.K82r)){
			return stack == new ItemStack(AddedItems.K82r);
		}else if(stack == new ItemStack(AddedItems.K83r)){
			return stack == new ItemStack(AddedItems.K83r);
		}else if(stack == new ItemStack(AddedItems.K84r)){
			return stack == new ItemStack(AddedItems.K84r);
		}else if(stack == new ItemStack(AddedItems.K85r)){
			return stack == new ItemStack(AddedItems.K85r);
		}else if(stack == new ItemStack(AddedItems.K86r)){
			return stack == new ItemStack(AddedItems.K86r);
		}else if(stack == new ItemStack(AddedItems.K87r)){
			return stack == new ItemStack(AddedItems.K87r);
		}else if(stack == new ItemStack(AddedItems.K88r)){
			return stack == new ItemStack(AddedItems.K88r);
		}else if(stack == new ItemStack(AddedItems.K89r)){
			return stack == new ItemStack(AddedItems.K89r);
		}else if(stack == new ItemStack(AddedItems.K90r)){
			return stack == new ItemStack(AddedItems.K90r);
		}else if(stack == new ItemStack(AddedItems.K91r)){
			return stack == new ItemStack(AddedItems.K91r);
		}else if(stack == new ItemStack(AddedItems.K92r)){
			return stack == new ItemStack(AddedItems.K92r);
		}else if(stack == new ItemStack(AddedItems.K93r)){
			return stack == new ItemStack(AddedItems.K93r);
		}else if(stack == new ItemStack(AddedItems.K94r)){
			return stack == new ItemStack(AddedItems.K94r);
		}else if(stack == new ItemStack(AddedItems.K95r)){
			return stack == new ItemStack(AddedItems.K95r);
		}else if(stack == new ItemStack(AddedItems.K96r)){
			return stack == new ItemStack(AddedItems.K96r);
		}else if(stack == new ItemStack(AddedItems.K97r)){
			return stack == new ItemStack(AddedItems.K97r);
		}else if(stack == new ItemStack(AddedItems.K98r)){
			return stack == new ItemStack(AddedItems.K98r);
		}else if(stack == new ItemStack(AddedItems.K99r)){
			return stack == new ItemStack(AddedItems.K99r);
		}else if(stack == new ItemStack(AddedItems.K100r)){
			return stack == new ItemStack(AddedItems.K100r);
		}else if(stack == new ItemStack(AddedItems.K101r)){
			return stack == new ItemStack(AddedItems.K101r);
		}else if(stack == new ItemStack(AddedItems.K102r)){
			return stack == new ItemStack(AddedItems.K102r);
		}else if(stack == new ItemStack(AddedItems.K103r)){
			return stack == new ItemStack(AddedItems.K103r);
		}else if(stack == new ItemStack(AddedItems.K104r)){
			return stack == new ItemStack(AddedItems.K104r);
		}else if(stack == new ItemStack(AddedItems.K105r)){
			return stack == new ItemStack(AddedItems.K105r);
		}else if(stack == new ItemStack(AddedItems.K106r)){
			return stack == new ItemStack(AddedItems.K106r);
		}else if(stack == new ItemStack(AddedItems.K107r)){
			return stack == new ItemStack(AddedItems.K107r);
		}else if(stack == new ItemStack(AddedItems.K108r)){
			return stack == new ItemStack(AddedItems.K108r);
		}else if(stack == new ItemStack(AddedItems.K109r)){
			return stack == new ItemStack(AddedItems.K109r);
		}else if(stack == new ItemStack(AddedItems.K110r)){
			return stack == new ItemStack(AddedItems.K110r);
		}else if(stack == new ItemStack(AddedItems.K111r)){
			return stack == new ItemStack(AddedItems.K111r);
		}else if(stack == new ItemStack(AddedItems.K112r)){
			return stack == new ItemStack(AddedItems.K112r);
		}else if(stack == new ItemStack(AddedItems.K113r)){
			return stack == new ItemStack(AddedItems.K113r);
		}else if(stack == new ItemStack(AddedItems.K114r)){
			return stack == new ItemStack(AddedItems.K114r);
		}else{
			return false;
		}
		*/
	}

}
