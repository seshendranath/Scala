package cn.zxw.scala.hello

import scala.io.Source

/**
 * 部分应用函数
 * @author zhangxw
 */
object Function21{

  def main(args: Array[String]): Unit = {
    def sum = (_:Int) + (_:Int) + (_:Int)
    var func = sum(_:Int,5,_:Int)
    println(func(1,2))
  }
  
}