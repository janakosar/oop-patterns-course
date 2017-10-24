package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyWithWings;
import edu.iful.oop.patterns.strategy.behavior.Quack;
import org.junit.Assert;
import org.junit.Test;

public class RedHeadDuckTest {

    @Test
    public void testFly() {
        Duck redHead = new RedHeadDuck ();
        Assert.assertEquals(FlyWithWings.WINGS_MESSAGE, redHead.performFly());
    }

    @Test
    public void testQuack() {
        Duck redHead = new RedHeadDuck ();
        Assert.assertEquals(Quack.QUACK_MESSAGE, redHead.performQuack());
    }
}
