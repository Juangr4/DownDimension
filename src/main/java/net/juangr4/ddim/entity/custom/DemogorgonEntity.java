package net.juangr4.ddim.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class DemogorgonEntity extends MonsterEntity {

    public DemogorgonEntity(EntityType<? extends DemogorgonEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 40.0D);
    }
    
}
