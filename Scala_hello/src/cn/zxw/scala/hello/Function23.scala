package cn.zxw.scala.hello

import scala.io.Source

/**
 * 可变参数、命名参数、缺省参数
 * @author zhangxw
 */
object Function23{
  
  def echo(arr:String *){
    for(x <- arr){
      println(x)
    }  
  }
  
  def speed(distince:Float,time:Float):Float={
    distince/time
  }
  
  def printTime(out:java.io.PrintStream = Console.out,div:Int = 100){
    out.println("time is : " +System.currentTimeMillis()/div)
  }
  
  def main(args: Array[String]): Unit = {
    //可变参数
    echo("hello","zhangsan")
    
    var sArr=Array("remember","date","2015-07-30")
    echo(sArr:_*)//什么鬼语法?
    
    //命名参数
    var s1=speed(100,10)
    var s2=speed(time=10,distince=100)
    println(s1+","+s2)
    
    //缺省参数值
    printTime();
    printTime(div=1);
    
  }
}