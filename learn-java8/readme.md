# java8

### 参数化代码
- 因为需求的不断变化，我们需要代码参数化
    - 传统方法使用策略模式，参数定义为接口，然后传递的是接口的不同实现。
    这样在查看代码的时候避免了多参数带来的方法语义不明确，缺点是代码被包裹在
    对象里面传递，属于“内联传递代码”，旨在使用同一个方法给他不同的行为达到不同的目的
    
### lambda
- 可以使用lambda简化以上代码
    - lambda前提条件函数式接口定义值定义一个抽象方法
    - java.util.function包中引入了几个新的函数式接口
        - 典型代表Predicate、 Consumer和Function
        
    - 专门为某些类设计的函数式接口
        - 废除自动装箱
```java
public interface IntPredicate{
boolean test(int t);
}
IntPredicate evenNumbers = (int i) -> i % 2 == 0;
evenNumbers.test(1000);  //true
Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
oddNumbers.test(1000);  //false
```

- 针对专门的输入参数类型的函数式接口的名称都要加上对应的原始类型前缀，比
  如DoublePredicate、 IntConsumer、 LongBinaryOperator、 IntFunction等。 Function
  接口还有针对输出参数类型的变种： ToIntFunction<T>、 IntToDoubleFunction等。

- 任何函数式接口都不允许抛出受检异常（ checked exception）。如果你需要Lambda
  表达式来抛出异常， 有两种办法： 定义一个自己的函数式接口，并声明受检异常，或者把Lambda
  包在一个try/catch块中
  
#### 类型检查
  
- 我们通过代码的语义（赋值、参数上下文）来知道lambda的实现的是哪个函数式接口（目标类型）
```java
Runnable r = () -> {System.out.println("Tricky example"); };
```
-  自动寻找上下文：Java编译器会从上下文（目标类型）推断出用什么函数式接
  口来配合Lambda表达式，这意味着它也可以推断出适合Lambda的签名

```java
Comparator<Apple> c =
(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
Comparator<Apple> c =
(a1, a2) -> a1.getWeight().compareTo(a2.getWeight()); //编译器根据上下文自己推断类型
```

#### 闭包
- 闭包：闭包可以作为参数传递给另一个函数。它也可以访
     问和修改其作用域之外的变量。现在， Java 8的Lambda和匿名类可以做类似于闭包的事情：
     它们可以作为参数传递给方法，并且可以访问其作用域之外的变量
```java
//lambda只能访问闭包函数外的局部变量，不能修改
        int a = 2;
        Runnable runnable = () -> {
          // a - 1;   变异不通过
            System.out.println(a);
        };
```

#### 方法引用

- 方法引用就是让你根据已有的方法实现来创建
  Lambda表达式

- Apple::getWeight就是引用了Apple类中定义的方法getWeight

- 比较器链

```java
inventory.sort(comparing(Apple::getWeight)
.reversed()                             //按重量递降
.thenComparing(Apple::getCountry));    //如果重量相同就比较国际
```



