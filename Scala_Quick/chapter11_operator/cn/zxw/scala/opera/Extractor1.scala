package cn.zxw.scala.opera

object Extractor1 {
  def main(args: Array[String]): Unit = {
    val Extractor1(n) = "1963"
    println(n)
  }
  def unapply(s:String)={
    Some(Integer.parseInt(s))
  }
}