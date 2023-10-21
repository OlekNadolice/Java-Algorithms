package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatDogTest {

    @Test
    public void catDog() {
        assertTrue(CatDog.catDog("catdog"));
        assertFalse(CatDog.catDog("catcat"));
        assertTrue(CatDog.catDog("1cat1cadodog"));
    }
}