import java.util.Scanner;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 11:35
 */
public class Ex119 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("please type the number: ");
            int x = scanner.nextInt();

            System.out.println(toBinaryString(x));
        }

    }

    public static String toBinaryString(int n) {
        if (n == 0) {
            return "0";
        } else {
            return getBinaryString("", n);
        }
    }

    public static String getBinaryString(String result, int n) {
        if (n == 0) {
            return result;
        } else {
            return getBinaryString(n % 2 + result, n / 2);
        }
    }

    // 示例
    public static String getDefaultBinaryString(int n) {
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = i % 2 + s;
        }
        return s;
    }
}
