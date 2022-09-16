package exception;

/**
 * @author TingxuanHu
 * @version 2022/9/11 8:40
 */

// try-catch快捷键  ctrl+alt+t
public class Exception01 {
    int num1 = 10;
    int num2 = 0;

    int res = num1 / num2;



}

// ctrl+H --> 查看层级关系
class Person {
    String name;
    int age;
    // alt+insert  --> constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}