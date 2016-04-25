package cn.zxw.scala.function.param

import java.text.MessageFormat

object TestParam {
  def main(args: Array[String]): Unit = {
    longParam
    pianFunc
  }
  
  /**
   * Parameter
   */
  def longParam():Unit={
    //def format(x$1: String, x$2: Object*): String
    val s = MessageFormat.format("This param is {0},not {1}", "zhang", 20.asInstanceOf[AnyRef])
    println(s)
  }
  
  /**
   * 偏函数
   */
  def pianFunc(){
    def sum(a:Int,b:Int,c:Int):Int={
      a+b+c
    }
    val sum_a = sum(_:Int , 2 , 3)
    println(sum_a(1))
  }
}