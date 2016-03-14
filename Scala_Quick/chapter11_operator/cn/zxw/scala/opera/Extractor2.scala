package cn.zxw.scala.opera

object Extractor2 {
  def main(args: Array[String]): Unit = {
    val myName = "zhang xw"
    val Extractor2(name) = myName
    println(name._1 + ","+name._2)
    val Extractor2(first,last) = myName
    println(first + "," + last)
  }
  def unapply(name:String)={
    val index = name.indexOf(" ")
    if(index < 0){
      None
    }else{
      Some((name.substring(0, index),name.substring(index+1)))
    }
  }
}