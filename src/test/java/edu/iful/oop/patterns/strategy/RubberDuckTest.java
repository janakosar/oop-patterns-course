package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyWithWings;
import edu.iful.oop.patterns.strategy.behavior.MuteQuack;
import edu.iful.oop.patterns.strategy.behavior.Squeak;
import org.junit.Assert;
import org.junit.Test;

public class RubberDuckTest {

    @Test
    public void testFly() {
        Duck rubber = new RubberDuck ();
        Assert.assertEquals(null, rubber.performFly());
    }

    @Test
    public void testQuack() {
        Duck rubber = new RubberDuck ();
        Assert.assertEquals(Squeak.SQUEAK_MESSAGE, rubber.performQuack());
    }
}
