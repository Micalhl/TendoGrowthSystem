package me.mical.tendogrowthsystem.client.renderer;

import me.mical.tendogrowthsystem.TendoGrowthSystem;
import me.mical.tendogrowthsystem.entity.EntityTendo;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderTendo extends RenderLiving
{
    private static final ResourceLocation ENTITY_TENDO_TEXTURE = new ResourceLocation(
            TendoGrowthSystem.MOD_ID + ":textures/entity/" + EntityTendo.ID + "/" + EntityTendo.ID + ".png"
    );

    public RenderTendo(RenderManager manager)
    {
        super(manager, new ModelPlayer(0.0F, true), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return ENTITY_TENDO_TEXTURE;
    }
}
