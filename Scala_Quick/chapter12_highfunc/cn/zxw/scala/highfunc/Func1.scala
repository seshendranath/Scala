package cn.zxw.scala.highfunc

object Func1 {
 def main(args: Array[String]): Unit = {
   //test1
   var i = 5
   test2(i==0){
     println(i)
     i-=1
   }
 } 
 
 def test1(){
   (1 to 5).map("*"*_).foreach { println }
   
   val sum = (1 to 5).reduceLeft(_ * _)
   println(sum)
   
   "It a little warm".split("\\s").sortWith(_.length < _.length()).foreach{ println }
 }
 
 def test2(condition: => Boolean)(block: => Unit){
   if(!condition){
     block
     test2(condition)(block)
   }
 }
}