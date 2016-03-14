package cn.zxw.scala.matchs

object TestFor extends App{
  val map = Map("A"->1,"B"->2,"C"->"","BLANK"->"")
  
  for((k,v) <- map){
    println(k + " = " + v)
  }
  
  for((k,"") <- map){
    println(k + " = ''")
  }
  
  for((k,v) <- map if v == ""){
    println(k + " => " + v)
  }
}