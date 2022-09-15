package loop; /**
 * @author TingxuanHu
 * @version 2022/9/15 14:17
 */

import java.util.Scanner;

public class SwitchDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a-e中的任何一个字母");
        char c1 = scanner.next().charAt(0);
        switch (c1) {
            case 'a' -> System.out.println("A");
            // 若不加break 则会自动链接到下一个case
            case 'b' -> System.out.println("B");
            // 若不加break 则会自动链接到下一个case
            case 'c' -> System.out.println("C");
            // 若不加break 则会自动链接到下一个case
            case 'd' -> System.out.println("D");
            // 若不加break 则会自动链接到下一个case
            default -> {
                System.out.println("输入有误");
            }
        }

    }
}
