package oop;

/**
 * @author TingxuanHu
 * @version 2022/9/22 13:36
 */

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中");
    }


}
