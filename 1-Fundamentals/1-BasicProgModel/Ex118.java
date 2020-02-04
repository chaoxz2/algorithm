/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 11:24
 */
public class Ex118 {
    public static void main(String[] args) {

        TestA();

        TestB();

        TestC();
    }

    public static void TestA() {
        System.out.println("a: ");
        System.out.println('b');
    }

    public static void TestB() {
        System.out.println("b: ");
        System.out.println('b' + 'c');
    }

    public static void TestC() {
        System.out.println("c: ");
        System.out.println((char) ('a' + 4));
    }
}
