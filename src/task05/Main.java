/*5. Задан круг с радиусом r с центром в точке (x,y).
Вернуть список точек с целочисленными координатами
которые попадают в круг.*/

package task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final int[] CIRCLE_CENTER = {2, 2};
    private static final int RADIUS = 2;
    private static List<int[]> internalPoints = new ArrayList<>();

    public static void main(String[] args) {
        internalPoints.add(CIRCLE_CENTER);
        for (int i = 0; i <= RADIUS; i++) {
            int j = 1;
            while (i * i + j * j <= RADIUS * RADIUS) {
                internalPoints.add(new int[]{i + CIRCLE_CENTER[0], j + CIRCLE_CENTER[1]});
                internalPoints.add(new int[]{j + CIRCLE_CENTER[0], -i + CIRCLE_CENTER[1]});
                internalPoints.add(new int[]{-i + CIRCLE_CENTER[0], -j + CIRCLE_CENTER[1]});
                internalPoints.add(new int[]{-j + CIRCLE_CENTER[0], i + CIRCLE_CENTER[1]});
                j++;
            }
        }
        for (int[] arr : internalPoints) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
