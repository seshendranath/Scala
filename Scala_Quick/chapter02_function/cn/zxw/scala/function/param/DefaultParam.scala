package cn.zxw.scala.function.param

object DefaultParam {
  def decorate(content:String, left:String="[", right:String="]"){
    println(left + content + right)
  }
  def main(args: Array[String]): Unit = {
    decorate("Hello")
    decorate("Hello",">>>[")
    decorate("Hello","<<<",">>>")
    decorate("Hello",right="]>>>")
    decorate(right="]>>>",left="<<<[",content="Hello")
  }
}