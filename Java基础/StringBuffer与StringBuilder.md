> String
- final修饰，不可变，每次操作都会产生新的String对象

> StringBuffer
- 在原对象上操作
- 线程安全
    - synchronized修饰？？？

> StringBuilder
- 在原对象上操作
- 线程不安全 ？？？

> 场景对比
- 性能:StringBuilder > StringBuffer > String
- 需要改变字符串内容时优先考虑使用StringBuilder，多线程使用共享变量时使用StringBuffer