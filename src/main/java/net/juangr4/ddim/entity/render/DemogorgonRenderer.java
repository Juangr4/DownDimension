package net.juangr4.ddim.entity.render;

import net.juangr4.ddim.DDim;
import net.juangr4.ddim.entity.custom.DemogorgonEntity;
import net.juangr4.ddim.entity.custom.TestZombie;
import net.juangr4.ddim.entity.model.DemogorgonModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DemogorgonRenderer extends MobRenderer<DemogorgonEntity, DemogorgonModel<DemogorgonEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(DDim.MOD_ID, "textures/entity/demogorgon.png");

    public DemogorgonRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DemogorgonModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(DemogorgonEntity p_110775_1_) {
        return TEXTURE;
    }
    
}
