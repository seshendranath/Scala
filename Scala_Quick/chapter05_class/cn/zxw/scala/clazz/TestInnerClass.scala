package cn.zxw.scala.clazz

import scala.collection.mutable.ArrayBuffer
import cn.zxw.scala.clazz.TestInnerClass.Member

object TestInnerClass {
  class Member(val name:String){
    val contacts = new ArrayBuffer[Member]
  }
  
  def main(args: Array[String]): Unit = {
    val t1 = new TestInnerClass
    val t2 = new TestInnerClass
    val m1 = t1.join("zhang1")
    val m2 = t1.join("zhang2")
    val m3 = t2.join("zhang3")
    
    m1.contacts += m2
    m1.contacts += m3 //伴生对象中的内部类
    println(m1.contacts)
    //ArrayBuffer(cn.zxw.scala.clazz.TestInnerClass$Member@35d4f53, cn.zxw.scala.clazz.TestInnerClass$Member@6302d3de)
  }
}

class TestInnerClass{
  def join(name:String)={
    val m = new Member(name)
    m
  }
}