package oop;

/**
 * @author TingxuanHu
 * @version 2022/9/16 13:33
 */

public class Encapsulation {
    /* 封装三部曲
    1) 属性私有化  不能直接修改属性
    2） 提供公共的set方法 用于对属性判断进行赋值
        public void setXXX(类型 参数名称) {
            // 加入数据验证的业务逻辑
            属性 = 参数名;
        }
    3) 提供公共的get方法 用于获取属性的值
        public XX getXXX() {
            // 加入权限判断 if needed
            return xx;
        }

    加入构造器是不是可以绕开这个get 和set方法的限制  起不到验证数据合理性的效果了呢？
    解决办法是在构造器中定义set方法
     */

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("burt");
        person.setAge(30);
        person.setSalary(300000);
        System.out.println(person.info());
        System.out.println(person.getName());

    }

}

class Person {
    public String name;  // 姓名信息公开
    private int age;  // 年龄私有化
    private double salary;  //

    // 构造器 alt+insert

    public Person() {
    }

    public Person(String name, int age, double salary) {
        // 下面这样直接定义会绕开set方法的数据验证 所以把set方法定义在构造器中间
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    // set get方法  ---> alt + insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 封装的灵魂 在set方法里面限制传参的特点 范围
        if (2 <= name.length() && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度有误");
            this.name = null;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 封装的灵魂 在set方法里面限制传参的特点 范围
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120岁之间，输入有误，默认设定为18岁");
            this.age = 18;  // 给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写方法 返回属性的信息
    public String info() {
        return "信息为：" + name + " age=" + age + " salary=" + salary;
    }
}