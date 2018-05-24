package com.delricco.vince.autovalueexamples;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;

@AutoValue
public abstract class Iguana {
    abstract String getName();
    abstract int getWeight();
    abstract ImmutableSet<String> getFavoriteFoods();

    static Builder builder() {
        return new AutoValue_Iguana.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder name(String name);
        abstract Builder weight(int weight);
        abstract ImmutableSet.Builder<String> favoriteFoodsBuilder();
        public Builder addFavoriteFood(String food) {
            favoriteFoodsBuilder().add(food);
            return this;
        }
        abstract Iguana build();
    }
}
