package cn.zxw.scala.traits

import java.util.Date

object TestTrait1 {
  //重写抽象方法
}

trait Logger1{
  def log(msg:String)
}

trait TimestampLogger1 extends Logger1{
  abstract override def log(msg:String){
    super.log(new Date().toLocaleString()+" "+msg)
  }
}