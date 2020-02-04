import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author : lee
 * @version : 1.0.0
 * @date : 2020/2/3 16:45
 */
public class Ex1121 {

    public static void main(String[] args) {
        List<Record> recordList = new ArrayList<>();
        System.out.println("xxxx");
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            input = scanner.nextLine();
            if (!"##".equals(input)) {
                System.out.println(Arrays.toString(input.split(" ")));
                String name = input.split(" ")[0];
                int x = Integer.parseInt(input.split(" ")[1]);
                int y = Integer.parseInt(input.split(" ")[2]);
                Record record = new Record(name, x, y);
                recordList.add(record);
            }
        } while (!"##".equals(input));
        System.out.println("| name | x | y | x/y |");
        for (Record x : recordList) {
            System.out.println(x.toString());
        }
    }

    static class Record {
        public String name;
        public int x;
        public int y;

        public Record(String name, int x, int y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return String.format("| %s | %s | %s | %.3f |", name, x, y, (double) x / y);
        }
    }
}
