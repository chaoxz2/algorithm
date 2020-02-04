/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 16:38
 */
public class Ex1120 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println("ln(" + i + "!) = " + ln(i));
        }
    }

    public static double ln(int n) {
        if (n == 1) {
            return 0;
        } else {
            return Math.log10(n) + ln(n - 1);
        }
    }
}
