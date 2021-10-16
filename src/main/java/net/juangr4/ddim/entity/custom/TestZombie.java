package net.juangr4.ddim.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class TestZombie extends ZombieEntity {

    public TestZombie(EntityType<? extends TestZombie> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 20.0D)
            .add(Attributes.FOLLOW_RANGE, 35.0D)
            .add(Attributes.MOVEMENT_SPEED, 0.23D)
            .add(Attributes.ATTACK_DAMAGE, 12.0D)
            .add(Attributes.ARMOR, 2.0D)
            .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE, 0.0D);
     }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENDERMAN_HURT;
    }
    
    
}
