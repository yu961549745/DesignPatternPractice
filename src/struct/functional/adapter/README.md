# 适配器模式
适配器模式在已有的类不能满足现有接口需求的情况下使用。

+ 已有接口：GameListener
    + 已有实现：GameControler
+ 现有需求：KeyListener
+ 适配器实现：implements KeyListener
    + 持有 GameControler 对象
    + 将相应操作交给 GameControler 对象完成

这里的例子适合多平台的编程实现，比如定义一个核心的Game模型，在Swing环境下使用KeyListener，在Android环境下使用OnTouchListener。