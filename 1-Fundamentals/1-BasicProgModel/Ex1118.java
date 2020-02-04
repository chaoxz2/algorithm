/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 15:31
 */
public class Ex1118 {

    public static void main(String[] args) {

        System.out.println("mystery(2, 25) = " + mystery1(2, 25));
        System.out.println();
        System.out.println("mystery(3, 11) = " + mystery1(3, 11));

        System.out.println();

        System.out.println("mystery(2, 25) = " + mystery2(2, 25));
        System.out.println();
        System.out.println("mystery(3, 11) = " + mystery2(3, 11));

    }

    public static int mystery1(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b % 2 == 0) {
            return mystery1(a + a, b / 2);
        } else {
            return mystery1(a + a, b / 2) + a;
        }
    }

    public static int mystery2(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            return mystery1(a * a, b / 2);
        } else {
            return mystery1(a * a, b / 2) * a;
        }
    }

    public static int equalToMystery1(int a, int b) {
        return a * b;
    }
}
