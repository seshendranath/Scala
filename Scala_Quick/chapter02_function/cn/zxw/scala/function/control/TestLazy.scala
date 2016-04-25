package cn.zxw.scala.function.control

object TestLazy {
  def main(args: Array[String]): Unit = {
    lazy val words = io.Source.fromFile("file/lines.txt").mkString
    println("----------")
    println(words)
  }
}