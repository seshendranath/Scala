package cn.zxw.scala.basic.java

import scala.collection.mutable
import scala.collection.JavaConverters._

/**
  * Created by zhangxw on 2017/7/24.
  */
object BasicTest {
  def echo(): Unit ={
    println("scala echo")
  }
  def getMap(): java.util.Map[String,String] ={
    val map:mutable.HashMap[String,String] = new mutable.HashMap[String,String]
    map.put("key1","value1")
    map.put("key2","value2")
    map.put("key3","value3")
    map.asJava
  }

}
