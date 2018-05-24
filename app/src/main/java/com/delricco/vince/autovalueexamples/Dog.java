package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Dog {
    abstract String getName();
    abstract int getWeight();

    static Builder builder() {
        return new AutoValue_Dog.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder name(String name);
        abstract Builder weight(int weight);
        abstract Dog build();
    }
}
