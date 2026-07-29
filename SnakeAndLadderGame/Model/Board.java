package Model;
import Strategy.Jump.JumpAllocationStrategy;
import Strategy.Jump.impl.LadderAllocationStrategy;
import Strategy.Jump.impl.SnakeAllocationStrategy;

import java.util.List;

public class Board {
    public Cell[][] cells;
    public List<JumpAllocationStrategy> jumpAllocationStrategies;

    public Board(int size, int snake, int ladder) {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
        jumpAllocationStrategies = List.of(new SnakeAllocationStrategy(this, snake), new LadderAllocationStrategy(this, ladder));
    }
}
