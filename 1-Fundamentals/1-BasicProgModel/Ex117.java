/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 11:15
 */
public class Ex117 {

    public static void main(String[] args) {

        TestA();

        TestB();

        TestC();
    }

    public static void TestA() {
        System.out.println("a: ");
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.001) {
            t = (9.0 / t + t) / 2.0;
        }
        System.out.println(String.format("%.5f", t));
    }

    public static void TestB() {
        System.out.println("b: ");
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void TestC() {
        System.out.println("c: ");
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
