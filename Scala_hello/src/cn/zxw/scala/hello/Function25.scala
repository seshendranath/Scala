package cn.zxw.scala.hello

/**
 * @author zhangxw
 */
object Function25 {
  
  def files = new java.io.File(".").listFiles()
  
  def fileMatcher(matcher:(String)=>Boolean){
    for(file <- files; if matcher(file.getName)){
      println(file.getName)
    }
  } 
  
  def fileEnding(query:String){
    fileMatcher(_.endsWith(query))
  }
  
  def filesContaining(query:String){
    fileMatcher(_.contains(query))
  }
  
  def main(args: Array[String]): Unit = {
    for(file <- files){
      println(file.getName)
    }
    println("----------------------end------------------------")
    fileEnding("in")
    println("--------------------contains---------------------")
    filesContaining("c")
    
    
    
  }
}