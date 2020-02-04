import java.util.Scanner;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 14:50
 */
public class Ex1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("please input N: ");
            int N = scanner.nextInt();
            System.out.println("N = " + N + ", k = " + lg(N));
        }

    }

    public static int lg(int n) {
        if (n > 0) {
            String s = "";
            for (int i = n; i > 0; i /= 2) {
                s = i % 2 + s;
            }
            return s.length() - 1;
        } else {
            throw new RuntimeException("Wrong Number!");
        }
    }
}
