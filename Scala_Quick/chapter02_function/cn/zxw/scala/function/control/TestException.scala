package cn.zxw.scala.function.control

import java.io.IOException

object TestException {
  
  def main(args: Array[String]): Unit = {
    try{
      val words = io.Source.fromFile("file/lines").mkString
      println(words)
    }catch{
      case err:IOException => err.printStackTrace()
      case _:Exception => println("catch error")
    }finally{
      println("finally")
    }
  }
  
}