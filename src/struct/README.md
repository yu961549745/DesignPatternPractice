# 结构型设计模式
+ 功能拓展型
    + [适配器模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/adapter)：为了现有对象符合新的需求接口。
    + [桥接模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/bridge)：将抽象和实现解耦，典型的API调用模式。
    + [代理模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/proxy)：和使用原对象一样使用代理对象，不透明的改变类的行为。
    + [装饰器模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/functional/decorator)：动态透明的添加一个类的功能。
+ 结构简化型
    + [组合模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/simplify/compsite)：处理属性结构的对象，等价的对待单个对象和组合对象。
    + [外观模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/simplify/facade)：为用户定义一个简单的接口，实现用户和内部系统关系之间的解耦。
    + [享元模式](https://github.com/yu961549745/DesignPatternPractice/tree/master/src/struct/simplify/flyweight)：将对象的状态划分成内部状态和外部状态，通过共享外部对象来减少内存的占用。

## 功能拓展型
+ 适配器模式：使现有的类满足需求的接口。
+ 桥接模式：抽象和实现分离，典型的是API调用的模式。
+ 代理模式：持有一个对象并对对象的行为进行控制。
+ 装饰器模式：动态透明的添加一个类的功能。

### 区别
适配器模式、桥接模式、装饰器模式、代理模式，都利用了持有一个相关对象的方法，实现了类功能的拓展。这些模式的区别在哪里呢？

+ 适配器模式 vs 桥接模式：
    + 适配器模式用来帮助无关的类来协同工作，一般在系统设计完成后使用。在使用时，是新接口调用老接口。例子中的GameListener。要在Swing下工作，使用的是KeyListener接口。
    + 桥接模式使得抽象和实现能够独立的变化，一般在系统设计之初使用。在使用时，是抽象接口调用实现接口。例子中的GameRender和RenderGraphics独立变化，GameRender调用了RenderGraphics来完成绘图。
+ 代理模式 vs 装饰器模式
    + 代理模式主要是为了和使用老对象一样使用添加了特定功能的新对象，不需要新建老对象。
    + 装饰器模式是为了灵活的给老对象添加新功能，在使用时使用的是新对象，需要新建老对象。
    + 代理模式添加的功能是不透明的，装饰器模式添加的功能是透明的。

## 结构简化型
+ 组合模式：组合模式是为了处理树形对象，能够一致的处理单个元素和容器元素。
+ 外观模式：外观模式就是对于一个子系统定义一个集成的接口，以简化外部用户的访问，而专业的用户可以调用具体的类。
+ 享元模式：享元模式就是将对象的状态区分为内部状态和外部状态。外部状态所对应的对象是共享的，用于减少内存的占用，防止产生大量的对象。