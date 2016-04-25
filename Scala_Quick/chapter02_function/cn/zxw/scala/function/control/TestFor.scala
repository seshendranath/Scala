package cn.zxw.scala.function.control

object TestFor {
  def main(args: Array[String]): Unit = {
    //基本循环
    //while
    var i = 0
    while(i < 3){
      println(i)
      i += 1
    }
    
    //do-while
    do{
      println(i)
      i += 1
    }while(i < 3)
      
    //for
    for(c <- "hi"){
      println(c)
    }
    
    //高级循环
    //for-ij
    for(i <- 1 to 3;j <- 1 to 3){
      print((10*i + j) + " ")
    }
    println
    
    //for-ij-if
    for(i <- 1 to 3;j <- 1 to 3 if i != j){
      print((10*i + j) + " ")
    }
    println
    
    //for-ij-from
    for(i <- 1 to 3;from = 3 - i;j <- from to 3){
      print((10*i + j) + " ")
    }
    println
    
    //for-ij-from-if
    for(i <- 1 to 3;from = 3 - i;j <- from to 3 if i != j){
      print((10*i + j) + " ")
    }
    println
    
    //for推导式
    val v = for(i <- 1 to 10) yield i % 3
    println(v)//Vector
    
    val v1 = for(c <- "hello"; i <- 0 to 1) yield (c + i).toChar
    println(v1)//String
    
    val v2 = for(i <- 0 to 1; c <- "hello") yield (c + i).toChar
    println(v2)//Vector
  }
}