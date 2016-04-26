package cn.zxw.scala.impl

object ImplicitDefine {
  implicit def int2String(v:Int):String={
    "[" + v + "]"
  }
}