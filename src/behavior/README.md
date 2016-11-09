# 行为型设计模式
+ 请求者和接受者解耦
    + 责任链模式：责任链寻找接受者
    + 命令模式：Invoker寻找接受者
    + 中介者模式：中介者类负责通信
    + 观察者模式：维护一个通知者列表
+ 对象的状态和行为解耦
    + 状态模式：将状态转移和状态下的行为交个状态对象实现。
    + 备忘录模式：将状态保存下来以供恢复对象。
    + 访问者模式：将对象状态的改变交个Visitor实现。 
+ 行为抽取型
    + 迭代器模式：将遍历行为抽取出来，从而和具体实现解耦。
    + 模板方法模式：将通用的算法框架在抽象类中声明，具体的行为由子类实现，减少重复代码。
    + 策略模式：将可替换的算法抽象成一个个对象，可供运行时选择。
+ 解释器模式：编译器专用模式