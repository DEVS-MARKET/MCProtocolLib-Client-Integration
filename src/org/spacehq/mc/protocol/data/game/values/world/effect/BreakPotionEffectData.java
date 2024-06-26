package org.spacehq.mc.protocol.data.game.values.world.effect;

public class BreakPotionEffectData implements WorldEffectData {

	private final int potionId;

	public BreakPotionEffectData(int potionId) {
		this.potionId = potionId;
	}

	public int getPotionId() {
		return this.potionId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BreakPotionEffectData that = (BreakPotionEffectData) o;

        return potionId == that.potionId;
    }

	@Override
	public int hashCode() {
		return potionId;
	}

}
