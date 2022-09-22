package projects.houserent.view;

import projects.houserent.domain.House;
import projects.houserent.service.HouseService;
import projects.houserent.utils.Utility;

/**
 * @author TingxuanHu
 * @version 2022/9/19 15:38
 * 1.mainMenu()方法显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */

public class HouseView {
    private boolean showMenu = true;
    private char key = ' ';  // 接收用户选择
    private HouseService houseService = new HouseService(10);

    // 显示主菜单
    public void mainMenu() {
        do {
            System.out.println("====================房屋出租系统菜单=====================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 源");
            System.out.println("\t\t\t5 显 示 房 源");
            System.out.println("\t\t\t6 退 出 系 统");
            System.out.println("请选择您需要进行的操作");
            key = Utility.readChar();
            switch (key) {
                case '1' :
                    System.out.println("新增");
                    break;
                case '2' :
                    System.out.println("查找");
                    break;
                case '3' :
                    System.out.println("删除");
                    break;
                case '4' :
                    System.out.println("修改");
                    break;
                case '5' :
                    System.out.println("显示房源");
                    listHouses();
                    break;
                case '6' :
                    System.out.println("退出");
                    showMenu = false;
            }
        } while (showMenu);
    }

    // 编写listHouses()方法显示房屋列表
    public void listHouses() {
        System.out.println("====================房屋列表=====================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(已出租|未出租)");
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house == null) {
                break;
            }
            System.out.println(house);
        }
        System.out.println("====================房屋列表显示完毕=====================");
    }

    // addHouse  创建House对象  调用add方法
    public void addHouse() {
        System.out.println("====================添加房屋=====================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);

        House house = new House(0, name, phone, address, rent, state);
//        if ()
    }

}
