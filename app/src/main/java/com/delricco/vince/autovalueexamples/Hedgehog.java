package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

import java.util.Optional;

@AutoValue
public abstract class Hedgehog {
    abstract Optional<String> getName();
    abstract int getWeight();

    static Builder builder() {
        return new AutoValue_Hedgehog.Builder();
    }

    abstract Builder toBuilder();

    @AutoValue.Builder
    static abstract class Builder {
        abstract Builder name(String name);
        abstract Builder weight(int weight);
        abstract Hedgehog build();
    }
}
