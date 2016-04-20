forSome :存在类型
::相比于逆变和协变,更具有针对性
:: Couple[_ <: Creature]
http://scalada.blogspot.jp/2008/01/existential-types.html

List中的 :: 是一个case class
：：case head :: tail 实际是 ::(head, tail)的中值表达式的形式。
：：当“unapply方法产生一个对偶，则可以在case语句中使用中值表示法”。

case a @ b : 将b的值绑定到变量a上
：：b可以是任何能够在case中进行匹配的值或者被应用的unapply方法
   另外的例子：case A(a) @ B(b) :如果能成功匹配B(b)，再匹配A(a)
：：@提供了在匹配a之前更为细致的匹配方式，同 case a if … => ，但使用场景不太一样，@ 更想一个预先的匹配检测。

case a @ methodA() : 等同于case methodA(a)
：：这种写法在scala 2.11.7版本中不再支持。

－－－－－－－－－Actor－－－－－－－－－
system.actorOf(Props[MyActor], name = "myactor”): 创建一个最顶层的actor

context.actorOf(Props[MyActor], name = "myactor”): 在Actor内创建一个子actor
：：关于name：
	1.位于同级别的actor不能同名，否则InvalidActorNameException的异常会被抛出。
	2.名字不能为空或者以$开头。

actorOf(Props[MyActor]) : 使用无参数的构造函数创建actor

actorOf(Props(new MyActor("...")), name = "myactor”): 实例化有参数Actor

val `x-x` = 1: 定义一个名字为`x-x`的的变量
` ： Denote constant or enable arbitrary identifiers
` 重音号 backquote/grave accent

private关键字的权限，只能在所在内的范围内允许访问。
：：trait中使用的private，只能在该trait中访问

ClassA.this: 获取当前作用域ClassA的引用
：：ClassA.this represent outer class rather than annoy class.
：：eg:
class superThis
class ClassA extends superThis {
  def andthen = {
    new ClassA {
      println(ClassA.this.## + ":inner-ClassA.this.##")
      println(this.## + ":inner-this.##")
      new ClassA {
        println(THIS.this.## + ":inner-inner-ClassA.this.##")
        println(this.## + ":inner-this.##")
      }
    }
  }
  def getInfo = {
    println(ClassA.this.## + ":ClassA.this.##")
    println(this.## + ":this.##")
  }
}

class Foo private[package] (param: ...) {
  /* class body goes here... */
}
::declare the default constructor as private

scala> :paste
//Entering paste mode (ctrl-D to finish)

scala.tools.nsc.Properties.versionString: 输出运行环境下scala的版本号

def a(x : => Unit){x}： 定义一个含by-name参数的函数
a(() => println("DONE 1"))：这里不会输出DONE 1，因为执行x实际返回了一个lambda表达式，而不是一个可用的计算。
