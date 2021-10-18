package net.juangr4.ddim.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

public class DemogorgonEntity extends MonsterEntity {

    private static final double SPEED = 0.44D;

    public DemogorgonEntity(EntityType<? extends DemogorgonEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 40.0D)
            .add(Attributes.ATTACK_DAMAGE, 12.0D)
            .add(Attributes.MOVEMENT_SPEED, SPEED);
    }

    public void registerGoals() {
        this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1.0D));
        this.addBehabiourGoals();
    }

    public void addBehabiourGoals() {
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, false));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, DemogorgonEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, AnimalEntity.class, true));
    }
    
}
