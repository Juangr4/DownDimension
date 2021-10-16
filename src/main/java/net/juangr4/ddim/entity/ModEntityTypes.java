package net.juangr4.ddim.entity;

import net.juangr4.ddim.DDim;
import net.juangr4.ddim.entity.custom.DemogorgonEntity;
import net.juangr4.ddim.entity.custom.TestZombie;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, DDim.MOD_ID);

    public static final RegistryObject<EntityType<TestZombie>> TEST_ZOMBIE = ENTITY_TYPES.register("test_zombie", 
        () -> EntityType.Builder.of(TestZombie::new, EntityClassification.MONSTER).build(new ResourceLocation("minecraft", "zombie").toString())
    );

    public static final RegistryObject<EntityType<DemogorgonEntity>> DEMOGORGON = ENTITY_TYPES.register("demogorgon", 
        () -> EntityType.Builder.of(DemogorgonEntity::new, EntityClassification.MONSTER).build(new ResourceLocation(DDim.MOD_ID, "demogorgon").toString())
    );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
    
}
