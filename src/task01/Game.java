package task01;

import java.util.Random;

class Game {
    private int numberPointFirst = 3;
    private int numberPointSecond = 4;
    private int countMoves = 0;
    private static Random random = new Random();
    private static int[][] neighboringPoints = {{3}, {3, 4}, {4}, {0, 1, 5, 6}, {1, 2, 6, 7}, {3}, {3, 4}, {4}};

    Game() {
    }

    void start() {
        while (numberPointFirst != numberPointSecond) {
            numberPointFirst = neighboringPoints[numberPointFirst]
                    [random.nextInt(neighboringPoints[numberPointFirst].length)];
            numberPointSecond = neighboringPoints[numberPointSecond]
                    [random.nextInt(neighboringPoints[numberPointSecond].length)];
            countMoves++;
        }
    }

    int getCountMoves(){
        return countMoves;
    }
}
