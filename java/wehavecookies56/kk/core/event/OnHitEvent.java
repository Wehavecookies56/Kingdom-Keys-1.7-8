package wehavecookies56.kk.core.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;

public class OnHitEvent
{

	final int valorAmmount = 2;
	boolean valorActive = false;
	
	@SubscribeEvent
	public void LivingAttackEvent (LivingHurtEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			EntityPropertyDriveForm df = EntityPropertyDriveForm.get(player);

			if(df.getCurrentState() == 0)
			{
				valorActive = true;
			}
			else
			{
				valorActive = false;
			}
		}
		if(event.entity instanceof EntityLivingBase)
		{			
				if(valorActive){
				event.ammount += valorAmmount;
			}
		}
		
		if(event.entityLiving instanceof EntityPlayer)
		{
			/*EntityPlayer player = (EntityPlayer) EntityEvent.entityLiving;
			EntityPropertyDrivePoints drive = EntityPropertyDrivePoints.get((EntityPlayer) player);
			if(
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.AbaddonPlasma|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.AbyssalTide|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.AllForOne|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Anguis|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Aubade||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.BondOfFlames|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.BrightCrest||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.ChaosRipper|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CircleOfLife|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Counterpoint|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CrabClaw|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CrownOfGuilt|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CrownUnlimit||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DarkerThanDark|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Darkgnaw|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DecisivePumpkin|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DestinysEmbrace|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DiamondDust|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DiveWing|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DivineRose|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DreamSword|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DualDisc||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.EarthShaker|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.EndOfPain||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FairyHarp|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FairyStars|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FatalCrest|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Fenrir|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FerrisGear|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FollowTheWind|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FrolicFlame||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.GlimpseOfDarkness|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.GuardianBell|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.GuardianSoul|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Gullwing||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.HerosCrest|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.HiddenDragon|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Hyperdrive||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.JungleKing||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KingdomKey|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KingdomKeyD|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KnockoutPunch|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Kyeblade|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KyebladeBroken||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LadyLuck|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LeasKeyblade|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Leopardos|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Leviathan|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Lightseeker|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LionHeart|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LostMemory|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LunarEclipse||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MarkOfAHero|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MasterKeeper|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MaverickFlare|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MetalChocobo|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MidnightRoar|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MissingAche|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Monochrome|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MysteriousAbyss||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.NoName||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Oathkeeper|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Oblivion|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Oceanrage|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Olympia|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.OmegaWeapon|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.OminousBlight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.OneWingedAngel||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PainOfSolitude|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PeoplesHearts|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PhotonDebugger|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PixiePetal|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PumpkinHead||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Rainfell|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.RejectionOfFate|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.RumblingRose||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SignOfInnocence|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SilentDirge|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SkullNoise|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SleepingLion|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SoulEater|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SpellBinder|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.StarLight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.StarSeeker|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Stormfall|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.StrokeOfMidnight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SweetDreams|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SweetMemories|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SweetStack||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.ThreeWishes|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TotalEclipse|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TreasureTrove|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TrueLightsFlight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TwilightBlaze|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TwoBecomesOne||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.UltimaWeaopon|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Umbrella|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Unbound|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Unicornis|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Ursus||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.VictoryLine|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.VoidGear|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Vulpeus||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WayToDawn|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WaywardWind|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WinnersProof|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WishingLamp|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WishingStar||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.XehanortsKeyblade||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.YoungXehanortsKeyblade||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.ZeroOne
			)
			{
				drive.addDrivePoints(1);
			}*/
		}
	}
}
