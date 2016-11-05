# 桥接模式
桥接模式是为了抽象和实现的分离，使得两者可以独立的变化。

+ 抽象类：GameRender，会依赖于实现RenderGraphics
    + 抽象的实现：UserRender
+ 实现接口：RenderGraphics
    + 具体实现：WindowsGraphics,LinuxGraphics等等

一个游戏需要渲染一些东西，而具体的渲染依赖于平台的具体实现，将渲染和具体绘图分离开来，可以使得两者独立的变化。
