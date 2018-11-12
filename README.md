# 24Pattern
开放-封闭原则：软件实体（类，模块，函数等等） 应该可以扩展，但是不可修改。
特性：对于扩展是开放的，对于更改是封闭的。无论模块是多么的封闭，都会存在一些无法对之封闭的变化，既然不能完全的封闭，设计人员必须对于他设计的模块应该对哪种变化封闭做出选择，
他必须先猜测出最有可能发生的变化种类，然后构造抽象来隔离那里变化。
    面对需求，对程序的改动是通过增加新代码进行的，而不是更改现有的代码。
    开放封闭的原则是面向对象设计的核心所在，遵循这个原则可以带来面向对象技术所声称的巨大好处，也就是可维护，可扩展，可服用，灵活性好。开发人员应该仅对程序中程序出频繁变化的那些部分作出抽象，
然而对于应用程序中的每个部分都可以地进行抽象同样不是一个好主意，拒绝不成熟的抽象和抽象本身一样重要。
2018年11月04日
责任链模式：将接受者对象连成一个链条，并在该链条上传递请求，直到有一个接受者对象处理它，通过让更多对象有机会处理请求，避免了请求发送者和接受者之间的耦合。
(大话)实现原理：Hnadler里面聚合自己，在HandlerQequest里面判断是否合适，如果没有到条件则下传递，向谁传递之前set进去。最重要的两点，一个是你需要事先给每个具体
管理者设置它的上次是哪一个类，也就是设置后继者。另外一点就是你需要在每个巨兔管理者处理请求时，做出判断，时可以处理该请求，还是必须要“推卸责任”，转移后继者取处理。

