/*Есть схема:
dl.dropboxusercontent.com/s/6fnasg6j3o2chdn/crystalcell.png
На ней 8 точек и 2 красных маркера. Каждый ход каждый из маркеров прыгает
на случайную из соседних точек.
Игра заканчивается когда оба красных маркера оказывается в одной точке.
Вывести вероятность того что игра закончится на 1, 2...N ходу.Есть схема:
dl.dropboxusercontent.com/s/6fnasg6j3o2chdn/crystalcell.png
На ней 8 точек и 2 красных маркера. Каждый ход каждый из маркеров прыгает
на случайную из соседних точек.
Игра заканчивается когда оба красных маркера оказывается в одной точке.
Вывести вероятность того что игра закончится на 1, 2...N ходу.*/

package task01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int ITERATIONS = 1000000;
    static List<int[]> results = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < ITERATIONS; i++) {
            Game game = new Game();
            game.start();
            addResult(game.getCountMoves());
        }

        System.out.println("Вероятность закончить игру на n-ом ходу:");
        for (int i = 0; i < results.size(); i++) {
            System.out.printf("%s - %s\n", results.get(i)[0], (double) results.get(i)[1] / ITERATIONS);
        }
    }

    private static void addResult(int result) {
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i)[0] == result) {
                 results.get(i)[1]++;
                return;
            } else if (results.get(i)[0] > result) {
                results.add(i, new int[]{result, 1});
                return;
            }
        }
        results.add(new int[]{result, 1});
    }
}
