import Actor.Player;
import Model.Board;
import Model.Dice;
import Strategy.Dice.impl.DiceStrategyImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        Board board = new Board(size, 5, 3);
        Dice dice = new Dice(1, new DiceStrategyImpl(), 1, 6);
        List<Player> players = List.of(new Player("zanam", 0), new Player("xyz", 0));

        int index = 0;
        while (true) {
            Player winner = getWinner(players, size * size - 1);
            
            if (winner != null) {
                System.out.println(winner.username);
                break;
            }

            Player currentPlayer = players.get(index);
            currentPlayer.position = Math.max(currentPlayer.position + dice.roll(), size * size - 1);

            int i = getRowIndex(currentPlayer.position, size);
            int j = getColumnIndex(currentPlayer.position, size);

            if (board.cells[i][j].jump != null) {
                currentPlayer.position = board.cells[i][j].jump.to;
            }

            index = (index + 1) % players.size();
        }
    }

    private static Player getWinner(List<Player> players, int destination) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).position == destination) {
                return players.get(i);
            }
        }

        return null;
    }


    private static int getRowIndex(int position, int size) {
        return position / size;
    }

    private static int getColumnIndex(int position, int size) {
        return position % size;
    }
}
