package cn.zxw.scala.opera

object Extractor3 {
  def main(args: Array[String]): Unit = {
    val myName = "zhang xiang wei "
    myName match{
      case Extractor3(all) => println(all)
      case Extractor3(f,l) => println("FL: " + f + "-" + l)
      case Extractor3(f,m,l) => println("FML: " + f + "-" + m + "-" + l)
      case _ => println("default")
    }
  }
  def unapplySeq(name:String)={
    val index = name.indexOf(" ")
    if(index < 0){
      None
    }else{
      Some(name.trim().split("\\s"))
    }
  }
}