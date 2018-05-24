package com.delricco.vince.autovalueexamples;

import android.support.annotation.Nullable;
import android.util.Log;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Cat extends AbstractAnimal {
    @Override
    abstract @Nullable String getName();

    /* Notice the order of args changed when overriding getName() */
    static Cat create(@Nullable String x, int y) {
        return new AutoValue_Cat(y, x);
    }
}
