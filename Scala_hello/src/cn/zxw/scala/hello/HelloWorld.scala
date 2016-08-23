package cn.zxw.scala.hello

/**
 * @author zhangxw
 */
object HelloWorld {
  
 def main(args: Array[String]): Unit = {
    println("hello,world!")
    println(funcif("zhang"))
    funcwhile()
    funcfor()
    funcmatch()
    
    
  }
  
  /**
   * 11.if
   */
  def funcif(arg:String):String={
      if(arg == "zhang") "zhangsan"
      else "lisi"
  }
  
  /**
   * 12.while
   */
  def funcwhile(){
    var count = 0
    while(count < 5){
      print(count)
      count=count+1
    }
    do{
      print(count)
      count = count - 1
    }while(count > 0)
    println
  }
  
  /**
   * 13.for
   */
  def funcfor(){
    val files = new java.io.File(".").listFiles()
    for(file <- files
        if file.isFile
        if file.getName.startsWith(".c")){
      println(file)
    }
  }
  
  /**
   * 15.match
   */
  def funcmatch(){
    var word=readLine()
    var res = word match {
      case "hi" => "hello,world"
      case "smile" => "hahaha"
      case _ => "I donot know"
    }
    println(res)
  }
  
}