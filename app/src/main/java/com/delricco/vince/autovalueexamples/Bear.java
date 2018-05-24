package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Bear {
    abstract String getName();
    abstract int getWeight();

    static Bear create(String name, int weight) {
        return new AutoValue_Bear(name, weight);
    }
}
