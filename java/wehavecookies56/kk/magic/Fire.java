package wehavecookies56.kk.magic;

import net.minecraft.entity.projectile.EntitySmallFireball;
import wehavecookies56.kk.client.KeyBind;

public class Fire {

	//Magic execution
	if(KeyBind.magicselected == 0)
	{
		EntitySmallFireball entitysmallfireball = new EntitySmallFireball(par2World);
        par2World.spawnEntityInWorld(new EntitySmallFireball(par2World));
		System.out.println("Boom");
	}
}
