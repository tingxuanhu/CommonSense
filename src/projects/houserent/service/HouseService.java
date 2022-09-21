package projects.houserent.service;

import projects.houserent.domain.House;

/**
 * @author TingxuanHu
 * @version 2022/9/20 10:47
 */

public class HouseService {
    private House[] houses;  // 用来存储houses信息的数组
    private int houseNums = 1; // 记录当前有多少个房屋信息 也可用来判断是否超出数组存储范围
    public HouseService(int size) {
        houses = new House[size];
        // 建出一个数据 配合测试列表信息  编号 房主信息 电话  地址  月租  状态
        houses[0] = new House(1, "老雷", "132", "海淀区", 2000, "未出租");
    }

    /**
     * add  添加新的对象
     * @return boolean
     */
    public boolean add(House newHouse) {

    }

    /**
     * @return  houses
     */
    public House[] list() {
        return houses;
    }


}
