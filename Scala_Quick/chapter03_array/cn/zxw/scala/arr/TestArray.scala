package cn.zxw.scala.arr

object TestArray {
  def main(args: Array[String]): Unit = {
    transform
    
    
    
    
  }
  //transform
  def transform(){
    val arr = Array(1,2,3,4,5,6,7,8)
    val newArr1 = arr.filter { _ % 2 == 0 }.map { _ * 2 }
    println(newArr1.mkString)
  }
  
}