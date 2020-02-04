/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 15:15
 */
public class Ex1116 {
    public static void main(String[] args) {
        System.out.println(exR1(2));
    }


    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        } else {
            return exR1(n - 3) + n + exR1(n - 2) + n;
        }
    }
}
