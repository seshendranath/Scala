package cn.zxw.scala.file

import java.util.Arrays

object TestRegex {
  def main(args: Array[String]): Unit = {
    regex1
    regex2
    regex3
  }
  def regex1(){
    val str = "it is year 2015,and date 09-15"
    
    val patt1 = "[0-9]+".r
    for(mat <- patt1.findAllIn(str)){
      println(mat)
    }
    
    println(patt1.findAllIn(str).toArray.mkString("-"))
    println(patt1.findFirstIn(str))
    println(patt1.findPrefixOf(str))
    println(patt1.replaceAllIn(str, "XX"))
    println(patt1.replaceFirstIn(str, "XX"))
    
    val patt2 = """\s?[0-9]+\s?""".r
    for(mat <- patt2.findAllIn(str)){
      println(mat)
    }
  }
  //分组
  def regex2(){
    val patt = """([a-zA-Z]+) ([0-9]+)""".r
    for(patt(attr,value) <- patt.findAllIn("year 2015,date 09,day 15")){
      println(attr+" : "+value)
    }
  }
  
  def regex3(){
    val patt = """([a-zA-Z]+) ([0-9]+)""".r
    val line = "scala 2015"
    line match{
      case patt(attr,value) => println(attr + " --- " + value)
      case _    => println("default case value!")
    }
  }
}