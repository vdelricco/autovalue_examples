package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Gorilla extends AbstractAnimal {
    static Builder builder() {
        return new AutoValue_Gorilla.Builder();
    }

    abstract Builder toBuilder();

    Gorilla withName(String name) {
        return toBuilder().name(name).build();
    }

    @AutoValue.Builder
    static abstract class Builder {
        abstract Builder name(String name);
        abstract Builder weight(int weight);
        abstract Gorilla build();
    }
}
