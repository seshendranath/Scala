package cn.zxw.scala.basic.variable

object TestVar {
  def main(args: Array[String]): Unit = {
    val x,y = "hello" //error: x=y="hello"
    val x1,y1:String = "world"
    println(x)
    println(y1)
    println(x.intersect(y1))//print lo
    
    val arr = 1 to 10
    println(arr)
    val arr1 = 1 until 10
    println(arr1)
    
  }
}