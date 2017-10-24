package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyWithWings;
import edu.iful.oop.patterns.strategy.behavior.Quack;
import org.junit.Assert;
import org.junit.Test;

public class MallardDuckTest {

    @Test
    public void testFly() {
        Duck mallard = new MallardDuck ();
        Assert.assertEquals(FlyWithWings.WINGS_MESSAGE, mallard.performFly());
    }

    @Test
    public void testQuack() {
        Duck mallard = new MallardDuck ();
        Assert.assertEquals(Quack.QUACK_MESSAGE, mallard.performQuack());
    }
}
