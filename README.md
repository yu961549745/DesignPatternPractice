# DesignPatternPractice
设计模式学完之后名字和实现对不上，写点示例代码好记一些。

含以下设计模式：
+ [创建型模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/builder)
    + [单例模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/builder/singleton)：为了实现系统中只有一个对象的实例。
    + [工厂模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/builder/factory)：实现对象的声明和实例化的解耦。
        + 简单工厂：一个静态工厂方法获取所有类型的产品。
        + 工厂方法：一个产品一个工厂。
        + 抽象工厂：针对产品族，一个工厂。
    + [建造者模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/builder/builder)：用于构造复杂对象，将对象的构建和各部件的实现解耦。
    + [原型模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/builder/prototype)：采用克隆的方法避免创建代价很大的对象。
+ [结构型模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct)
    + 功能拓展型
        + [适配器模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/adapter)：为了现有对象符合新的需求接口。
        + [桥接模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/bridge)：将抽象和实现解耦，典型的API调用模式。
        + [代理模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/proxy)：和使用原对象一样使用代理对象，不透明的改变类的行为。
        + [装饰器模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/decorator)：动态透明的添加一个类的功能。
    + 结构简化型
        + [组合模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/simplify/compsite)：处理属性结构的对象，等价的对待单个对象和组合对象。
        + [外观模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/simplify/facade)：为用户定义一个简单的接口，实现用户和内部系统关系之间的解耦。
        + [享元模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/simplify/flyweight)：将对象的状态划分成内部状态和外部状态，通过共享外部对象来减少内存的占用。
+ [行为型模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior)
    + 请求者和接受者解耦
        + [责任链模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/chain_of_responsibility)：责任链寻找接受者
        + [命令模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/command)：Invoker寻找接受者
        + [中介者模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/mediator)：中介者类负责通信
        + [观察者模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/observer)：维护一个通知者列表
    + 对象的状态和行为解耦
        + [状态模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/state)：将状态转移和状态下的行为交个状态对象实现。
        + [备忘录模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/memento)：将状态保存下来以供恢复对象。
        + [访问者模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/visitor)：将对象状态的改变交个Visitor实现。 
    + 行为抽取型
        + [迭代器模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/iterator)：将遍历行为抽取出来，从而和具体实现解耦。
        + [模板方法模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/template_method)：将通用的算法框架在抽象类中声明，具体的行为由子类实现，减少重复代码。
        + [策略模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/strategy)：将可替换的算法抽象成一个个对象，可供运行时选择。
    + [解释器模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/behavior/interpreter)：编译器专用模式
