package cn.zxw.scala.matchs

sealed abstract class P{
  //密封类
}
case class A(value:Int) extends P{
  
}
case class B(key:String,value:Int) extends P{
  
}
case object O extends P{
  
}
object TestCaseClass extends App{
  val a = A(100)
  val b = B("zhang",200)
  test(a)
  test(b)
  test(O)
  
  val c = a.copy()
  println(c.value)
  val c1 = a.copy(value=300)
  println(c1.value)
  println(c == a)
  
  def test(obj:P){
    obj match{
      case A(value) => println("type = A, value = "+value)
      case B(key,value) => println("type = B, key = " + key + ", value = "+value)
      case O => println("type = O")
      case _ => println("other ...")
    }
  }
  
}