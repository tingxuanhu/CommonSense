package projects.houserent;

import projects.houserent.view.HouseView;

/**
 * @author TingxuanHu
 * @version 2022/9/19 15:16
 */

public class HouseRentApp {
    public static void main(String[] args) {
        // 创建HouseView对象 显示主菜单  是整个项目的程序入口
        new HouseView().mainMenu();
        System.out.println("=====退出房屋租赁系统=====");
    }
}
