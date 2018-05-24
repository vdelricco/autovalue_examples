package com.delricco.vince.autovalueexamples;

import android.support.annotation.Nullable;
import android.util.Log;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Cat {
    abstract @Nullable String getName();
    abstract int getWeight();

    static Cat create(@Nullable String x, int y) {
        return new AutoValue_Cat(x, y);
    }

    public void eat(String food) {
        Log.v(Cat.class.getName(),"Eating " + food + "...nom nom");
    }
}
