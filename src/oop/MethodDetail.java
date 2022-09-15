package oop;

/**
 * @author TingxuanHu
 * @version 2022/9/15 16:43
 */

public class MethodDetail {
    public static void main(String[] args) {
        // 调用另一个类中的方法 先创建对象 然后用对象名.属性名的方式调用
        A a = new A();
        a.sayOK();
    }
}


class A {
    public void print(int n) {
        System.out.println("This method has been called" + n)  ;
    }

    public void sayOK() {
        // 同一个类中间的方法调用  可以直接调用
        print(10);
    }
}
