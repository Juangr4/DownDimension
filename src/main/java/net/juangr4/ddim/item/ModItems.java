package net.juangr4.ddim.item;

import net.juangr4.ddim.DDim;
import net.juangr4.ddim.entity.ModEntityTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DDim.MOD_ID);

    // public static final RegistryObject<Item> TEST_ZOMBIE_SPAWN_EGG = ITEMS.register("test_zombie_spawn_egg", 
    //     () -> new SpawnEggItem(ModEntityTypes.TEST_ZOMBIE.get(), 0x879995, 0x576ABC, new Item.Properties())
    // );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
}
