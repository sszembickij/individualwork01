package task01;

import java.util.Random;

public class Game {
    int numberPointFirst = 3;
    int numberPointSecond = 4;
    int countMoves = 0;
    static Random random = new Random();
    static int[][] neighboringPoints = {{3}, {3, 4}, {4}, {0, 1, 5, 6}, {1, 2, 6, 7}, {3}, {3, 4}, {4}};

    public Game() {
    }

    public void start() {
        while (numberPointFirst != numberPointSecond) {
            numberPointFirst = neighboringPoints[numberPointFirst]
                    [random.nextInt(neighboringPoints[numberPointFirst].length)];
            numberPointSecond = neighboringPoints[numberPointSecond]
                    [random.nextInt(neighboringPoints[numberPointSecond].length)];
            countMoves++;
        }
    }

    public int getCountMoves(){
        return countMoves;
    }
}
