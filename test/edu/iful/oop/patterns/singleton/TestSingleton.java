package edu.iful.oop.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

public class TestSingleton {

    @Test
    public void testConstructor() throws NoSuchMethodException {

        Class<Singleton> singletonClass = Singleton.class;
        int modifiers = singletonClass.getDeclaredConstructor().getModifiers();
        Assert.assertEquals(Modifier.PRIVATE, modifiers);
    }

    @Test
    public void testSingle() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Assert.assertTrue(s1 == s2);
    }
}
