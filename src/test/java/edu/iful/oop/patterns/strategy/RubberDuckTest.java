package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyNoWay;
import edu.iful.oop.patterns.strategy.behavior.FlyWithWings;
import edu.iful.oop.patterns.strategy.behavior.MuteQuack;
import edu.iful.oop.patterns.strategy.behavior.Squeak;
import org.junit.Assert;
import org.junit.Test;

public class RubberDuckTest {

    @Test
    public void testFly() {
        Duck rubber = new RubberDuck ();
        Assert.assertEquals(FlyNoWay.FLY_MESSAGE, rubber.performFly());
    }

    @Test
    public void testQuack() {
        Duck rubber = new RubberDuck ();
        Assert.assertEquals(MuteQuack.MUTE_MESSAGE, rubber.performQuack());
    }
}
