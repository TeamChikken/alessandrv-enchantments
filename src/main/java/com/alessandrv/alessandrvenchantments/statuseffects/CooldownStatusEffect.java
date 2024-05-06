package com.alessandrv.alessandrvenchantments.statuseffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CooldownStatusEffect extends StatusEffect {
    public CooldownStatusEffect() {
        super(
                StatusEffectCategory.NEUTRAL, // whether beneficial or harmful for entities
                0x00000); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return false;
    }
}