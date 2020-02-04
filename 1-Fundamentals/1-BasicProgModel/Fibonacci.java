/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 16:18
 */
public class Fibonacci {

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F(N));
        }
    }

    public static long F(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return F(N - 1) + F(N - 2);
        }
    }
}
