package cn.zxw.scala.hello

import scala.io.Source

/**
 * 类成员函数
 * @author zhangxw
 */
object Function17 {
  
  def processFile(fileName:String,width:Int){
    val source=Source.fromFile(fileName)
    for(line <- source.getLines()){
      processLine(line, width)
    }
  }
  
  private def processLine(line:String,width:Int):Unit = {
    if(line.length() > width){
      println(line)
    }
  }
  
  def main(args: Array[String]): Unit = {
    Function17.processFile(".\\bin\\file.txt", 50)
  }
  
}