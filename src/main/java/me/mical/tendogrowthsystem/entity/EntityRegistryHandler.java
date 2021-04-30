package me.mical.tendogrowthsystem.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class EntityRegistryHandler
{
    public static final EntityEntry TENDO =
            EntityEntryBuilder.create().entity(EntityTendo.class)
            .id(EntityTendo.ID, 0).name(EntityTendo.NAME).tracker(80, 3, true)
                    .egg(0x438195, 0x419204)
                    .spawn(EnumCreatureType.CREATURE, 5, 4, 4, EntityTendo.BIOMES)
                    .build();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<EntityEntry> event)
    {
        IForgeRegistry<EntityEntry> registry = event.getRegistry();
        registry.register(TENDO);
    }
}
