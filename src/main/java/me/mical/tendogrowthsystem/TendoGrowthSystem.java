package me.mical.tendogrowthsystem;

import me.mical.tendogrowthsystem.client.renderer.RenderRegistryHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = TendoGrowthSystem.MOD_ID, name = TendoGrowthSystem.MOD_NAME, version = TendoGrowthSystem.VERSION
)
public class TendoGrowthSystem
{
    public static final String MOD_ID = "tendogrowthsystem";
    public static final String MOD_NAME = "TendoGrowthSystem";
    public static final String VERSION = "1.0-SNAPSHOT";

    @Mod.EventHandler
    @SideOnly(Side.CLIENT)
    public void preInitClient(FMLPreInitializationEvent event)
    {
        RenderRegistryHandler.register();
    }
}
