import java.util.Arrays;
import java.util.Random;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 15:04
 */
public class Ex1115 {
    public static void main(String[] args) {
        int[] a = initialArray(5);
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(Arrays.toString(histogram(a, 10)));
    }

    public static int[] initialArray(int size) {
        Random random = new Random(47);
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(10);
        }
        return result;
    }

    public static int[] histogram(int[] originArray, int M) {
        int[] result = new int[M];
        for (int i = 0; i < originArray.length; i++) {
            if (originArray[i] > 0 && originArray[i] < M) {
                result[originArray[i]]++;
            }
        }
        return result;
    }
}
