import java.util.Random;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 14:19
 */
public class Ex1111 {

    public static void main(String[] args) {

        boolean[][] array = initialArray(2, 3);
        printlnArray(array);
    }

    public static boolean[][] initialArray(int rowSize, int colSize) {
        boolean[][] array = new boolean[rowSize][colSize];
        Random random = new Random();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                array[i][j] = random.nextInt(2) == 1;
            }
        }
        return array;
    }

    public static void printlnArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(String.format("array[%s][%s]=%s ", i, j, array[i][j] ? "*" : " "));
            }
            System.out.println();
        }
    }
}
