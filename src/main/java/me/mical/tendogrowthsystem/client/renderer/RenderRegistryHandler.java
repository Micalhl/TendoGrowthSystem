package me.mical.tendogrowthsystem.client.renderer;

import me.mical.tendogrowthsystem.entity.EntityTendo;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistryHandler {
    public static void register() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTendo.class, manager -> new RenderTendo(manager));
    }
}
