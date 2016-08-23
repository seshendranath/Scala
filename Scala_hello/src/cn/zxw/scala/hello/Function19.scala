package cn.zxw.scala.hello

import scala.io.Source

/**
 * 函数字面量
 * @author zhangxw
 */
object Function19 {
  
  def func(x:Int){
    var increase = (x:Int)=>x+1
    val res = increase(x)
    println(res)
  }
  
  def main(args: Array[String]): Unit = {
    func(100)
    
    val numList = List(-5,-3,0,3,5,10)
    //numList.foreach( (x:Int) => println(x+1))
    numList.foreach(println _)//简化写法
    //numList.foreach(println)//简化写法
    
    //var res=numList.filter ( x => x>0 )
    var res=numList.filter ( _>0 )//简化写法
    println(res)
  }
  
}