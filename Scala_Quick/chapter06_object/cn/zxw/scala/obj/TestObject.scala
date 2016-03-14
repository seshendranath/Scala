package cn.zxw.scala.obj

object TestObject {
  def apply(name:String)={
    println("my name is "+name)
    new TestObject //通常返回伴生类的对象
  }
  def main(args: Array[String]): Unit = {
    val obj = TestObject("zhang")
    obj.hi()
  }
}

class TestObject{
  def hi(){
    println("Hi,everyone!")
  }
}