package cn.zxw.scala.function.control

import java.text.MessageFormat

object TestControl {
  def main(args: Array[String]): Unit = {
    //ioFunc
    //longParam
    pianFunc
  }
  
  /**
   * Input Output
   */
  def ioFunc():Unit={
    val name = readLine("Input your name:")
    print("Input year:")
    var year = readInt()
    printf("Hi,%s,this is year %d!", name,year)
  }
  
  /**
   * Parameter
   */
  def longParam():Unit={
    //def format(x$1: String, x$2: Object*): String
    val s = MessageFormat.format("This param is {0},not {1}", "zhang",20.asInstanceOf[AnyRef])
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