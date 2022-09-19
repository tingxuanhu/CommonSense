package projects.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author TingxuanHu
 * @version 2022/9/18 22:13
 */
public class SmallChangeSys {
    // 化繁为简
    // 1.先完成显示菜单 并可以选择菜单 给出对应提示
    // 2.完成零钱通明细
    // 3.收益入账
    // 4.完成消费

    public static void main(String[] args) {
        // 定义相关变量
        boolean loop = true;   // 是否要循环显示界面
        Scanner scanner = new Scanner(System.in);
        String key = "";  // 接收输入的内容

        // 明细部分 最简单实现  字符串拼接
        String details = "-------------------零钱通明细-------------------";

        // 完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null;   // 标识日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 日期格式化

        // 定义新变量 保存消费的内容
        String note = "";

        do {
            System.out.println("\n=================" + "零钱通菜单" + "=================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.print("请选择一项需要进行的操作(1-4):" );
            key = scanner.next();

            // switch case control
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;   // 不接break会顺到下一个case里去
                case "2":
                    System.out.print("收益入账金额");
                    money = scanner.nextDouble();  // 要校验double
                    // 校验收益入账的思路：不是处理合理情况 而是找出不正确的金额的条件 而后给出提示 直接break 同时代码可读性更好
                    if (money <= 0) {
                        System.out.println("入账金额不正确 需要大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();  //获取当前日期
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();  // 要校验double
                    if (money <= 0 || money > balance) {
                        System.out.println("您的消费金额范围有误");
                        break;
                    }

                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();  //获取当前日期
                    details += "\n" + note + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    System.out.println("退出");
                    // 校验是否输入的是"y"或"n" 否则不继续
                    String choice = "";
                    do {
                        System.out.println("确定退出否？ (y/n)");
                        choice = scanner.next();
                    } while (!"y".equals(choice) && !"n".equals(choice));
                    // 判断是y还是n  下面这个代码不在while里判断 单独列出来写 这种风格是  一段代码实现一件事情 比较清晰
                    // 之后如果有新加入的其他选项 可扩展性也更好
                    loop = !choice.equals("y");
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);

        System.out.println("--------退出零钱通-------");

    }
}
