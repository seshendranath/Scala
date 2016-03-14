package cn.zxw.scala.file

import scala.io.Source
import java.io.File
import java.io.FileInputStream
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Path

object TestReadFile {
  val filePath = "C:/zhangxw/workSpace/Scala/Scala_Quick/file/lines.txt"
	val filePath1= "C:/zhangxw/workSpace/Scala/Scala_Quick/file/write.txt"
	val filePath2= "C:/zhangxw/workSpace/Scala/Scala_Quick/file/"
  
  def main(args: Array[String]): Unit = {
    readLine
    readChar
    readBuffer
    readOther
    readFile
    writeFile1
    writeFile2
  }
  def readLine(){
    val source = Source.fromFile(filePath)
    //println(source.mkString)
    val lines = source.getLines()
    for (line <- lines) {
      println(line)
    }
    source.close()
  }
  def readChar(){
    val source = Source.fromFile(filePath)
    for (c <- source) {
      print(c)
    }
    println()
    source.close()
  }
  def readBuffer(){
    val source = Source.fromFile(filePath)
    val buff = source.buffered
    while(buff.hasNext) {
      print(buff.next)
    }
    source.close()
  }
  def readOther(){
    val source = Source.fromURL("http://www.baidu.com")
    val lines = source.getLines()
    for (line <- lines) {
      println(line)
    }
    source.close()
  }
  def readFile(){
    val file = new File(filePath)
    val in   = new FileInputStream(file)
    val arr  = new Array[Byte](file.length().toInt)
    in.read(arr)
    val str  = new String(arr)
    println(str)
    in.close()
  }
  def writeFile1(){
    val out = new PrintWriter(filePath1)
    out.print("88888888888")
    out.close()
  }
  def writeFile2(){
    printf("%8d , %8.2f", 12345678, 12345.678)//右对齐，不够的左补空格
    println()
    printf("%8d , %8.2f", 1234, 12.678)
  }
}