package oop;

/**
 * @author TingxuanHu
 * @version 2022/9/22 13:24
 */

public class AbstractExercise {

    public static void main(String[] args) {
        Manager jack = new Manager("jack", 999, 500000);
        jack.setBonus(100000);
        jack.work();

        CommonEmployee xi = new CommonEmployee("xi", 100, 200000);
        xi.work();
    }
}
