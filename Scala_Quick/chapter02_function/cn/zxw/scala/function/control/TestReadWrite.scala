package cn.zxw.scala.function.control

import java.text.MessageFormat

object TestReadWrite {
  /**
   * Input Output
   */
  def main(args: Array[String]): Unit = {
    val name = readLine("Input your name:")
    print("Input year:")
    var year = readInt()//readDouble/readFloat..
    //print println printf
    printf("Hi,%s,this is year %d!", name,year)
  }
  
}