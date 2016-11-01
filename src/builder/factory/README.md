# 工厂模式
含：
+ 简单工厂
+ 工厂方法
+ 抽象工厂

## 简单工厂
抽象对象：Car
+ 具体对象1：AudiCar
+ 具体对象2：BmwCar

简单工厂
+ 获取抽象对象()：getCar()

```
Car c = CarFactory.getCar("bmw");
c.drive();
```

## 工厂方法
抽象对象：Car
+ 具体对象1：AudiCar
+ 具体对象2：BmwCar

抽象工厂：CarFactory
+ 具体工厂1：AudiCarFactory
+ 具体工厂2：BmwCarFactory

```
CarFactory factory = new BmwCarFactory();
Car car = factory.getCar();
car.drive();
```

## 抽象工厂
抽象对象：Car
+ 抽象子对象1：Trunk
    + 具体对象1.1：BenzTrunk
    + 具体对象1.2：YiqiTrunk
+ 抽象子对象2：Dredge
    + 具体对象2.1：YiqiDredge
    + 具体对象2.2：SanDredge

抽象工厂：CarFactory 含所有类型的创建方法
+ 具体工厂1：TrunkFactory 实现其中一个方法
+ 具体工厂2：DredgeFactory 实现其中一个方法

```
CarFactory factory = new TrunkFactory();
Trunk trunk = factory.getTrunk("Benz");
trunk.load();
trunk.drive();
```
## 总结
+ 简单工厂：
    + 特点：一个静态工厂方法获取所有类型对象。
    + 优点：实现简单。
    + 缺点：添加一个产品时需要修改工厂类的方法。
    + 改进：利用反射和配置文件的方法，简化静态工厂方法的判断语句。
+ 工厂方法：
    + 特点：一个工厂对应一个产品。
    + 优点：在新增产品时不需要修改原有代码。
    + 缺点：产品增多时，工厂方法也同步增多。
    + 改进：对产品进行分类，同类产品采用简单工厂模式实现。
+ 抽象工厂： 
    + 特点：一个工厂对应一类产品。
    + 优点：有效处理多各类型的产品。
    + 缺点：因为抽象工厂的声明中包含所有产品类的获取方法，新增一个类型的产品，需要修改其它所有工厂类的代码。
    + 改进：同工厂方法的改进策略。