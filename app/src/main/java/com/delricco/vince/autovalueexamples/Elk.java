package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Elk {
    abstract String getName();
    abstract int getWeight();

    static Builder builder() {
        return new AutoValue_Elk.Builder().name("None");
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder name(String name);
        abstract Builder weight(int weight);
        abstract Elk build();
    }
}
