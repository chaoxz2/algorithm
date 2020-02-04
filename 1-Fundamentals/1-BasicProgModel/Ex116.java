/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 10:47
 */
public class Ex116 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
