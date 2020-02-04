/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 16:48
 */
public class Ex1122 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("length = " + i + ", key = " + j + ", index = " + rank(j, initialArray(i)));
            }
        }
    }

    public static int[] initialArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i;
        }
        return result;
    }

    public static int rank(int key, int[] a) {
        return rank(0, key, a, 0, a.length - 1);
    }

    public static int rank(int depth, int key, int[] a, int lo, int hi) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= depth; i++) {
            stringBuilder.append("  ");
        }
        stringBuilder.append("lo: ").append(lo).append(" hi: ").append(hi);
        System.out.println(stringBuilder.toString());
        if (lo > hi) {
            return -1;
        }
        int mid = (hi + lo) / 2;
        depth++;
        if (key < a[mid]) {
            return rank(depth, key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(depth, key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }
}
