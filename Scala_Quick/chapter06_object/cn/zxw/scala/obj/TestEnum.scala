package cn.zxw.scala.obj

object TestEnum extends Enumeration{
  val Red    = Value(0, "Red Light")
	val Yellow = Value(1, "Yellow Light")
	val Green  = Value(2, "Green Light")
  
  def doWhat(color:TestEnum.Value){
    if(color.id == 0){
      print(0 + " ")
    }else if(color.id == 1){
      print(1 + " ")
    }else if(color.id == 2){
      print(2 + " ")
    }
    if(color.toString() == "Red Light"){
      println(color.toString())
    }else if(color.toString() == "Yellow Light"){
      println(color.toString())
    }else if(color.toString() == "Green Light"){
      println(color.toString())
    }
  }
  
  def list(){
    for(v <- TestEnum.values){
      println(v.id + " -> " + v.toString())
    }
  }
  
  def main(args: Array[String]): Unit = {
    doWhat(TestEnum.Red)
    doWhat(TestEnum.Yellow)
    doWhat(TestEnum.Green)
    list
    println(TestEnum(1).id + " => " + TestEnum(1).toString())
    println(TestEnum.withName("Green Light").id + " => " + TestEnum.withName("Green Light").toString())
  }
}