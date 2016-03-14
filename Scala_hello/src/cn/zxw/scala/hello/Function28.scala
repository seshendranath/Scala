package cn.zxw.scala.hello

/**
 * 柯里化函数
 * @author zhangxw
 */
object Function28{
  
  def curriedSum(x:Int)(y:Int)={
    x+y
  }
  
  //下划线“_” 作为第二参数列表的占位符
  var onePlus = curriedSum(1)_
	var twoPlus = curriedSum(2)_
	var threePlus = curriedSum(3)_
  
  def main(args: Array[String]): Unit = {
    println(curriedSum(1)(2))
    println(onePlus(10))
    println(twoPlus(10))
    println(threePlus(10))
    
  }
}