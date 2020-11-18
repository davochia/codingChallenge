package com.wisekingdavid.Electronics;

public class SoundSystem {
    private SoundType soundType;
    private int weight;

    public SoundSystem(SoundType soundType, int weight) {
        this.soundType = soundType;
        this.weight = weight;
    }

    public SoundType getSoundType() {
        return soundType;
    }

    public int getWeight() {
        return weight;
    }
}
