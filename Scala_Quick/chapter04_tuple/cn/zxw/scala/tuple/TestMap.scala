package cn.zxw.scala.tuple

object TestMap {
  def main(args: Array[String]): Unit = {
    testMap
    
    
  }
  
  /**
   * 映射Map
   */
  def testMap(){
    //4.1 define
    val m1 = Map("A"->1, "B"->2)
    val m2 = scala.collection.mutable.Map("C"->3)
    m2.put("D", 4)
    val m3 = Map(("E",5), ("F",6))
    val m4 = new collection.mutable.HashMap[String,Int]
    m4.put("M", 10)
    m4.put("N", 100)
    
    //4.2 Get
    println(m1.get("A"))//Some(1),Option对象(Some or None)
    println(m1("A"))//1
    val v1 = if(m2.contains("C")){
      m2("C")
    }else{
      -1
    }
    println(v1)//3
    println(m3.getOrElse("F", -1))//6
    println(m3.getOrElse("G", -1))//-1
    for((k,v) <- m4){
      println(k+" -> "+v)
    }
    
    //4.3 Update
    m2("D") = 31 //update
    m2("X") = 10 //add
    
    m2 += ("Y"->11,("Z",12))
    println(m2.mkString(","))
    m2 -= ("C","D")
    println(m2.mkString(","))
    
    var t1 = m3 + ("M"->51)
    println(t1.mkString(","))
    t1 = t1 - ("M","E")
    println(t1.mkString(","))
    
    //4.4 for
    for(k <- m4.keySet){
      print(k+" ")
    }
    for(v <- m4.values){
      print(v+" ")
    }
    println
    val newm4 = for((k,v) <- m4)yield (v,k)
    println(newm4.mkString(","))
    
    //4.5 sorted
    println("-------------------- 4.5 --------------------")
    val m5 = collection.immutable.SortedMap("E"->5,"A"->1,"C"->3,"D"->4,"B"->2)
    println(m5.mkString(","))
    
    //4.6 java
    println("-------------------- 4.6 --------------------")
    import collection.JavaConversions.mapAsScalaMap
    val m6:collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]
    import collection.JavaConversions.propertiesAsScalaMap
    val prop1:collection.Map[String,String] = System.getProperties
    val prop2:collection.mutable.Map[String,String] = System.getProperties
    //val prop3:collection.immutable.Map[String,String] = System.getProperties //ERROR
    import collection.JavaConversions.mapAsJavaMap
    import java.awt.font.TextAttribute._
    val attrs = Map(FAMILY->"",SIZE->10)
    val font = new java.awt.Font(attrs)
    
    //4.7 tuple
    val tu1 = (10,10.5,"zhang")
    println(tu1._1 + " : " + tu1._3 + " : " + tu1._2)
    val (first,second,third) = tu1
    println(first + " : " + third + " : " + second)
    
    //4.8 zip
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val dzip = symbols.zip(counts)
    println(dzip.mkString(","))
    for((s,n) <- dzip){
      print(s*n)
    }
    val symMap = dzip.toMap
  }
  
}