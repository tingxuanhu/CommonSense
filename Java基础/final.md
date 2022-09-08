# final
## 简述final作用
+ 修饰类：类不可被子类继承（阉割当前类使之不留子嗣，变为叶子节点）
+ 修饰方法时：方法不可被子类重写(锁定方法使子类不能修改)；可以在本类中重载方法
+ 修饰变量时：赋值后变量不可更改其值
    + 修饰成员变量与类变量
        + 修饰类变量(静态变量)则只能在声明时或在静态初始化块指定具体值
            ```java
            public class FinalVar {
                final static int a = 0;   // 声明时赋值 或在静态代码块中赋值
                /*
                static {
                    a = 0;
                }
                */
            }
            ```
        + 修饰成员变量(实例变量)时，可以在声明时或在非静态初始化块或在构造器中执行初始值
            ```java
            public class FinalVar {
                final int b = 0; // 声明时赋值 或在代码块中赋值 或在构造器中赋值
                /*{
                 b = 0;
                }
                */         
            }
            ```     

    + 修饰局部变量
        + 局部变量必须由程序员手工初始化，这意味着用final修饰局部变量时，既可在定义的时候指定default value，也可在使用前赋值
            ```java
            public class FinalVar {
                public static void main(String[] args) {
                    final int localA;  // 局部变量只声明而不初始化不会报错  与final无关
                    localA = 0;  // 使用前一定要赋值
                    // localA = 1； 不允许二次赋值
                }
            }
            ```     

    + 修饰基本数据类型和引用数据类型
        + 修饰基本数据类型 int 等 在初始化后值不可改变

        + 修饰引用类型变量  初始化后值可以改变 但不能指向另一个对象
             ```java
            public class FinalBasicTest {
                public static void main(String[] args) {
                    final int[] iArr = {1, 2, 3, 4}; 
                    iArr[2] = -2;  // legal  可以修改值
                    iArr = null; // illegal 不能重新指向其他对象

                    final Person p = new Person(25);
                    p.setAge(24); // 合法
                    p = null; // 非法
                }
            }
            ```     

## 为何局部内部类和匿名累不累只能访问局部final变量？
待补充