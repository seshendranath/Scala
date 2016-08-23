package cn.zxw.scala.hello

import scala.io.Source

/**
 * 局部函数
 * @author zhangxw
 */
object Function18 {
  
  def processFile(fileName:String,width:Int){
    def processLine(line:String):Unit = {
      if(line.length() > width){
        println(line)
      }
    }
    val source=Source.fromFile(fileName)
    for(line <- source.getLines()){
      processLine(line)
    }
  }
  
  def main(args: Array[String]): Unit = {
    Function17.processFile(".\\bin\\file.txt", 50)
  }
  
}