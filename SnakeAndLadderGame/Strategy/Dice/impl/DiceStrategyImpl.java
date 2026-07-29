package Strategy.Dice.impl;

import java.util.Random;

import Strategy.Dice.DiceStrategy;

public class DiceStrategyImpl implements DiceStrategy {
    public int roll(int mn, int mx) {
        return mn + new Random().nextInt(mx - mn + 1);
    }
}
