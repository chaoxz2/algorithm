/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 17:09
 */
public class Ex1124 {
    public static void main(String[] args) {

        System.out.println(euclid(1111111, 1234567));
    }

    public static int euclid(int a, int b) {
        System.out.println("p= " + a + ", q= " + b);
        if (b == 0) {
            return a;
        } else {
            return euclid(b, a % b);
        }
    }
}
