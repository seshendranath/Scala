package cn.zxw.scala.obj

object TestApp extends App{
  if(args.length > 0){
    println("Hi,"+args(0))
  }else{
    println("Hi,everyone!")
  }
}