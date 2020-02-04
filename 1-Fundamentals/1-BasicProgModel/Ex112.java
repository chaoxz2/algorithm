/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 10:57
 */
public class Ex112 {
    public static void main(String[] args) {
        System.out.println("(1 + 2.236) / 2 = " + ((1 + 2.236) / 2) + " , " + getTypeName((1 + 2.236) / 2));

        System.out.println("1 + 2 + 3 + 4.0 = " + (1 + 2 + 3 + 4.0) + " , " + getTypeName(1 + 2 + 3 + 4.0));

        System.out.println("4.1 >= 4 = " + (4.1 >= 4) + " , " + getTypeName(4.1 >= 4));

        System.out.println("1 + 2 + \"3\" = " + (1 + 2 + "3") + " , " + getTypeName(1 + 2 + "3"));
    }

    public static String getTypeName(Object x) {
        return x.getClass().getTypeName();
    }

}
