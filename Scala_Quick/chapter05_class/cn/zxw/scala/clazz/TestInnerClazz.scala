package cn.zxw.scala.clazz

import scala.collection.mutable.ArrayBuffer

class TestInnerClazz {
  class Member(val name:String){
    val contacts1 = new ArrayBuffer[Member]
    val contacts2 = new ArrayBuffer[TestInnerClazz#Member] //类型投影
    //TestInnerClazz.this // 获取外部类对象实例的方式
  }
  
  def join(name:String)={
    val m = new Member(name)
    m
  }
  
  def main(args: Array[String]): Unit = {
    val t1 = new TestInnerClazz
    val t2 = new TestInnerClazz
    val m1 = t1.join("zhang1")
    val m2 = t1.join("zhang2")
    val m3 = t2.join("zhang3")
    
    m1.contacts1 += m2
    //m1.contacts1 += m3 //ERROR,不同类型不能相加
    
    m1.contacts2 += m2
    m1.contacts2 += m3 //类型投影后类型一致
  }
}