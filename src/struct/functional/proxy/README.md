# 代理模式
+ 接口：Eater
+ 实际对象：Person
+ 代理对象：EaterProxy，持有实际对象，并动态添加一些方法。

代理可以分为：
+ 远程代理：
+ 虚代理：创建开销很大的对象时，提供虚拟对象。
+ 保护代理：在访问对象时检查权限。
+ 智能引用：