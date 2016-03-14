package cn.zxw.scala.traits

import java.util.Date

object TestTrait2 extends App{
  val acc = new Account2
  acc.withdaw(200)
}
/**
 * 富接口
 */
trait Logger2{
  def log(msg:String)
  def timestamp(msg:String):String={
    new Date().toLocaleString()+" "+msg
  }
  def info(msg:String){
    log("INFO "+timestamp(msg))
  }
  def warn(msg:String){
    log("WARN "+timestamp(msg))
  }
  def error(msg:String){
    log("ERROR "+timestamp(msg))
  }
}

class Account2 extends Logger2{
  def withdaw(price:Double){
    info("user withdaw price "+price)
    warn("user withdaw price "+price)
    error("user withdaw price "+price)
  }
  def log(msg:String){
    println(msg)
  }
}