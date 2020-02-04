import java.util.Scanner;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 10:40
 */
public class Ex115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please type x: ");
        double x = scanner.nextDouble();

        System.out.println("please type y: ");
        double y = scanner.nextDouble();

        System.out.println(between(x, y) ? "true" : "false");
    }

    public static boolean between(double x, double y) {
        return 0 < x && x < 1 && 0 < y && y < 1;
    }
}
