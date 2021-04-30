package me.mical.tendogrowthsystem.entity;

import me.mical.tendogrowthsystem.TendoGrowthSystem;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class EntityTendo extends EntityMob
{
    public static final String ID = "tendo";
    public static final String NAME = TendoGrowthSystem.MOD_ID + ".Tendo";

    public static final Biome[] BIOMES = new Biome[] {Biomes.SWAMPLAND, Biomes.MUTATED_SWAMPLAND, Biomes.FOREST};

    public EntityTendo(World worldIn)
    {
        super(worldIn);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0, false));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.8));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
    }
}
