package projects.houserent.view;

import java.util.Scanner;

/**
 * @author TingxuanHu
 * @version 2022/9/19 15:38
 *
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */

public class HouseView {

    private boolean showMenu = true;
    private char key = ' ';  // 接收用户选择
    public void mainMenu() {

        do {
            System.out.println("====================房屋出租系统=====================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 源");
            System.out.println("\t\t\t5 显 示 房 源");
            System.out.println("\t\t\t6 退 出 系 统");
            System.out.println("请选择您需要进行的操作");
        } while ()
    }

}
