package Model;

import Strategy.Dice.DiceStrategy;

public class Dice {
    public int n = 1;
    public int mn, mx;
    public DiceStrategy diceStrategy;

    public Dice(int n, DiceStrategy diceStrategy, int mn, int mx) {
        this.n = n;
        this.diceStrategy = diceStrategy;
        this.mn = mn;
        this.mx = mx;
    }

    public int roll() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diceStrategy.roll(mn, mx);
        }
        return sum;
    }
}
