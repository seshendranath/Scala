package cn.zxw.scala.hello

/**
 * @author zhangxw
 */
object Package54 {
  
  def main(args: Array[String]): Unit = {
    showFruit(new Fruit)
  }
  
  def showFruit(fruit:Fruit){
    import fruit.{color=>_,_}//hide color
    println(name + " are " )
    //println(name + " are " + color)
  }
  
}

class Fruit{
    val name = "apple"
    val color = "red"
}