package cn.zxw.scala.basic.apply

object MyApply {
  def apply(s:String):String={
    "[" + s + "]"
  }
}
class MyApply {
  def echo(): Unit = {
    println(MyApply("test"))
  }
}