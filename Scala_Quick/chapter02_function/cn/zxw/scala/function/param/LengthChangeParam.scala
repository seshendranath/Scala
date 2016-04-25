package cn.zxw.scala.function.param

object LengthChangeParam {
  
  def sum(args:Int*):Int={
    var total = 0
    for(arg <- args){
      total += arg
    }
    total
  }
  
  def main(args: Array[String]): Unit = {
    println(sum(1,3,5))
  }
}