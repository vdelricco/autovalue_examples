package com.delricco.vince.autovalueexamples;

import com.google.common.collect.ImmutableSet;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class AutoValueTest {
    @Test
    public void autovalue_ex1() {
        /* Example 1, simplest */
        Aardvark aardvark = Aardvark.create("Steven", 65);
        Aardvark aardvark2 = Aardvark.create("Steven", 65);

        assertEquals("Steven", aardvark.name());
        assertEquals(65, aardvark.weight());
        assertTrue(aardvark.equals(aardvark2));
    }

    @Test
    public void autovalue_ex2() {
        /* Example 2, using get prefix for methods */
        Bear bear = Bear.create("Lawrence", 321);

        assertEquals("Lawrence", bear.getName());
        assertEquals(321, bear.getWeight());
    }

    @Test
    public void autovalue_ex3() {
        /* Example 3, accepting null values */
        Cat cat = Cat.create(null, 25);

        assertEquals(null, cat.getName());
        assertEquals(25, cat.getWeight());
    }

    @Test
    public void autovalue_ex4() {
        /* Example 4, using a builder */
        Dog dog = Dog.builder().name("Rex").weight(64).build();

        assertEquals("Rex", dog.getName());
        assertEquals(64, dog.getWeight());
    }

    @Test
    public void autovalue_ex5() {
        /* Example 5, default values with a builder */
        Elk elk = Elk.builder().weight(120).build();

        assertEquals("None", elk.getName());
        assertEquals(120, elk.getWeight());
    }

    @Test
    public void autovalue_ex6() {
        /* Example 6, toBuilder() for free */
        Fox fox = Fox.builder().build();
        Fox fox2 = fox.toBuilder().name("Freddy").weight(45).build();

        assertEquals("None", fox.getName());
        assertEquals(0, fox.getWeight());

        assertEquals("Freddy", fox2.getName());
        assertEquals(45, fox2.getWeight());
    }

    @Test
    public void autovalue_ex7() {
        /* Example 7, more uses of toBuilder() */
        Gorilla gorilla = Gorilla.builder().name("Harambe").weight(452).build();
        Gorilla gorilla2 = gorilla.withName("Donkey Kong");

        assertEquals("Harambe", gorilla.getName());
        assertEquals(452, gorilla.getWeight());

        assertEquals("Donkey Kong", gorilla2.getName());
        assertEquals(452, gorilla2.getWeight());
    }

    @Test
    public void autovalue_ex8() {
        /* Example 8, built-in support for Optional */
        Hedgehog hedgehog = Hedgehog.builder().weight(4).build();
        Hedgehog hedgehog2 = hedgehog.toBuilder().name("Sonic").build();

        assertEquals(Optional.empty(), hedgehog.getName());
        assertEquals(4, hedgehog.getWeight());

        assertEquals(Optional.of("Sonic"), hedgehog2.getName());
    }

    @Test
    public void autovalue_ex9() {
        /* Example 9, support for immutable collections */
        Iguana iguana = Iguana.builder()
            .name("Paul")
            .weight(3)
            .addFavoriteFood("leaves")
            .addFavoriteFood("bugs")
            .addFavoriteFood("berries")
            .build();

        ImmutableSet<String> testSet = ImmutableSet.<String>builder()
            .add("berries")
            .add("leaves")
            .add("bugs")
            .build();

        assertEquals(testSet, iguana.getFavoriteFoods());
    }
}
