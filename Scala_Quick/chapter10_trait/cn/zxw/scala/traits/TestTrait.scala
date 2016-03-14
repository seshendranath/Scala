package cn.zxw.scala.traits

import java.util.Date

/**
 * 叠加在一起的特质
 */
object TestTrait extends App{
  val acc1 = new Account with ConsoleLogger with TimestampLogger with ShortLogger
  acc1.withdaw(100)
  val acc2 = new Account with ConsoleLogger with ShortLogger with TimestampLogger
  acc2.withdaw(100)
}

trait Logger{
  def log(msg:String){}
}

trait ConsoleLogger extends Logger{
  override def log(msg:String){
    println(msg)
  }
}

trait TimestampLogger extends Logger{
  override def log(msg:String){
    super.log(new Date().toLocaleString()+" "+msg)
  }
}

trait ShortLogger extends Logger{
  val maxLength = 15
  override def log(msg:String){
    super.log(
        if(msg.length() <= maxLength)
          msg
        else
          msg.substring(0, maxLength-3)+"..."
    )
  }
}

class Account extends Logger{
  def withdaw(price:Double){
    log("user withdaw price "+price)
  }
}