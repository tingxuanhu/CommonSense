## 关于main方法调用过程中涉及的问题

public static void main(String[] args)
- public不能被其他修饰符代替
  - 原因在于main方法是被JVM调用的  JVM跟main方法不在一个包里 必须用public才找得到
- main方法是static的
  - 不能访问类中的非静态成员（属性或方法）非要访问的话 需要先创建本类对象实例再调用