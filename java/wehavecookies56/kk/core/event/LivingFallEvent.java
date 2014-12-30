package wehavecookies56.kk.core.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingFallEvent extends LivingEvent
{
    public float distance;
    public LivingFallEvent(EntityLivingBase entity, float distance)
    {
        super(entity);
        this.distance = 0;
        System.out.println(distance);
    }
}