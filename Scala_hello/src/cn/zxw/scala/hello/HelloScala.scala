package cn.zxw.scala.hello

/**
 * @author zhangxw
 */
object HelloScala extends App{
  
  //var line = readLine()
  //println(line)
  
  //3
  val oneTwo = List(1,2)
  val threeFour = List(3,4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println (oneTwo + " and " + threeFour + " were not mutated.")
  println ("Thus, " + oneTwoThreeFour + " is a new list")
  
  val oneTowThree = 1 :: 2 ::3 :: Nil 
  println(oneTowThree) 
  
  val pair = (22,"tuple")
  print(pair._1)
  println(pair._2)
  
  var jetSet = Set ("Boeing","Airbus")
  jetSet +="Lear"
  println(jetSet.contains("Cessna"))

  val romanNumeral = Map ( 1 -> "I" , 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
  println (romanNumeral(4))
  
  
}
