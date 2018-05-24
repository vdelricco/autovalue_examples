package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Aardvark {
    abstract String name();
    abstract int weight();

    static Aardvark create(String name, int weight) {
        return new AutoValue_Aardvark(name, weight);
    }
}
