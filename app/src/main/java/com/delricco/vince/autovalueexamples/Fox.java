package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Fox extends AbstractAnimal {
    static Builder builder() {
        return new AutoValue_Fox.Builder().name("None").weight(0);
    }

    abstract Builder toBuilder();

    @AutoValue.Builder
    static abstract class Builder {
        abstract Builder name(String name);
        abstract Builder weight(int weight);
        abstract Fox build();
    }
}
