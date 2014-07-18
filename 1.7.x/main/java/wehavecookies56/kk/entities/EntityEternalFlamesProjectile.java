package wehavecookies56.kk.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.packet.EternalFlamesPacket;
import wehavecookies56.kk.core.packet.IPacket;
import wehavecookies56.kk.item.AddedItems;

public class EntityEternalFlamesProjectile extends EntityThrowable{

	public EntityEternalFlamesProjectile(World world) {
		super(world);
	}

	public EntityEternalFlamesProjectile(World world, EntityLivingBase entity) {
		super(world, entity);
	}

	public EntityEternalFlamesProjectile(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(MovingObjectPosition mop) {
		if (mop.entityHit != null) {
			
			float shotDamage = 8;
			mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), shotDamage);
			mop.entityHit.setFire(8);
		}

		this.worldObj.spawnParticle("flame", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);

		if (!worldObj.isRemote) {
			setDead();
		}
		
	}
}