> String
- final修饰，不可变，每次操作都会产生新的String对象


> StringBuffer
- 在原对象上操作
- 线程安全 比StringBuilder慢
    - synchronized修饰


> StringBuilder
- 在原对象上操作
- 线程不安全  不能保证同步  单线程优先用起来
- 主要操作是append和insert方法 可以重载这些方法以便接收任意类型的数据


> 场景对比
- 性能:StringBuilder > StringBuffer > String
- 需要改变字符串内容时优先考虑使用StringBuilder，多线程使用共享变量时使用StringBuffer