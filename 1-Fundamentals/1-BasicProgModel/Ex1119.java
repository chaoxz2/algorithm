/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 16:16
 */
public class Ex1119 {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F(new long[N + 1], N));
        }
    }

    public static long F(long[] resultArray, int N) {
        resultArray[0] = 0;
        if (resultArray.length > 1) {
            resultArray[1] = 1;
        }
        if (resultArray.length > 2) {
            for (int i = 2; i <= N; i++) {
                resultArray[i] = resultArray[i - 1] + resultArray[i - 2];
            }
        }
        return resultArray[N];
    }
}
