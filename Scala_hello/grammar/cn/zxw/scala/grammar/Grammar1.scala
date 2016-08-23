package cn.zxw.scala.grammar

object Grammar1 {
  def main(args: Array[String]): Unit = {
    matchcase1
    matchcase2
    matchcase3
    
  }
  
  /**
   * match case
   */
  def matchcase1(){
    var myVar = "thisValue";
    myVar match {
       case "someValue"   => println(myVar + " 1")
       case "thisValue"   => println(myVar + " 2")
       case "theValue"    => println(myVar + " 3")
       case "doubleValue" => println(myVar + " 4")
    }
  }
  def matchcase2(){
    var myVar = "theValue";
    var myResult = myVar match {
           case "someValue"   => myVar + " A"
           case "thisValue"   => myVar + " B"
           case "theValue"    => myVar + " C"
           case "doubleValue" => myVar + " D"
        }
    println(myResult);
  }
  def matchcase3(){
    var myVar = "1";
    var myResult = myVar match {
           case "1" if(myVar == "2") => myVar + " A"
           case "2"   => myVar + " B"
           case "3"   => myVar + " C"
           case _     => myVar + " _"
        }
    println(myResult);
  }
  
}