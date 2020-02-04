import java.util.Scanner;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 10:27
 */
public class Ex113 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please type the first number: ");
        long firstNumber = scanner.nextLong();

        System.out.println("please type the second number: ");
        long secondNumber = scanner.nextLong();

        System.out.println("please type the third number: ");
        long thirdNumber = scanner.nextLong();

        System.out.println((firstNumber != secondNumber || firstNumber != thirdNumber ? "not " : "") + "equal");
    }
}
