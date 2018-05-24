package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Bear extends AbstractAnimal {
    static Bear create(String name, int weight) {
        return new AutoValue_Bear(name, weight);
    }
}
