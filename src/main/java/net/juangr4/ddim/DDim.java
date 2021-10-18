package net.juangr4.ddim;

import net.juangr4.ddim.entity.ModEntityTypes;
import net.juangr4.ddim.entity.custom.DemogorgonEntity;
import net.juangr4.ddim.entity.render.DemogorgonRenderer;
import net.juangr4.ddim.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DDim.MOD_ID)
public class DDim
{

    public static final String MOD_ID = "ddim";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public DDim() {
        
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModEntityTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.DEMOGORGON.get(), DemogorgonEntity.createAttributes().build());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DEMOGORGON.get(), DemogorgonRenderer::new);
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {}
    }
}
