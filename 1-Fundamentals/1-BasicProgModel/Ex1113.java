import java.util.Random;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 14:35
 */
public class Ex1113 {
    public static void main(String[] args) {

        int[][] origin = initialArray(3, 4);
        printArray(origin);
        System.out.println();
        printArray(getTransposition(origin));
    }

    public static int[][] initialArray(int rowSize, int colSize) {
        int[][] array = new int[rowSize][colSize];
        Random random = new Random();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }

    public static int[][] getTransposition(int[][] originalArray) {
        int originalRowSize = originalArray.length;
        int originalColSize = originalArray[0].length;
        int[][] result = new int[originalColSize][originalRowSize];
        for (int i = 0; i < originalColSize; i++) {
            for (int j = 0; j < originalRowSize; j++) {
                result[i][j] = originalArray[j][i];
            }
        }
        return result;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(String.format("array[%s][%s]=%s ", i, j, array[i][j]));
            }
            System.out.println();
        }
    }
}
