package wehavecookies56.kk.driveforms;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Strings;

public class AddedDrives {

	public static DriveForm valor, wisdom, master, Final, limit, anti;
	Minecraft mc = Minecraft.getMinecraft();
	static EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;

	public static void initDrives()
	{
		valor = new DriveValor(Strings.ValorForm, 300, AddedItems.ValorFormOrb);
		wisdom = new DriveWisdom(Strings.WisdomForm, 300, AddedItems.WisdomFormOrb);
		master = new DriveMaster(Strings.MasterForm, 400, AddedItems.MasterFormOrb);
		Final = new DriveFinal(Strings.FinalForm, 500, AddedItems.FinalFormOrb);
		limit = new DriveLimit(Strings.LimitForm, 400, AddedItems.LimitFormOrb);
		anti = new DriveAnti(Strings.AntiForm, 300, null);
	//	anti = new DriveAnti(Strings.AntiForm, EntityPropertyDrivePoints.get(Minecraft.getMinecraft().thePlayer).getCurrDrivePoints(), null);
	}
}
