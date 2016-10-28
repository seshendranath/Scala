package cn.zxw.scala.collect

/**
 * @author lx
 */
object CollectFunction {
  def main(args: Array[String]): Unit = {
    var lst = List(2,9,1,3,6,7,12,8)
    println(lst.filter { x => x>5 })
    println(lst.exists { x => x>10 })//true if one element pass
    println(lst.forall { x => x>0 })//true if all element pass
    println(lst.groupBy{ x => x%2 })//Map(1 -> List(9, 1, 3, 7), 0 -> List(2, 6, 12, 8))
    println(lst.sortBy { x => x }) //List(1, 2, 3, 6, 7, 8, 9, 12)
    println(lst.sortBy { x => x }.reverse) //List(12, 9, 8, 7, 6, 3, 2, 1)
    println(lst.sortBy { x => -x }) //List(12, 9, 8, 7, 6, 3, 2, 1)
    val words = "The quick brown fox jumped over the lazy dog".split(' ')
    // this works because scala.Ordering will implicitly provide an Ordering[Tuple2[Int, Char]]
    println(words.sortBy(x => (x.length, x.head)).mkString(" "))
    //The dog fox the lazy over brown quick jumped
    println(words.toList.sortBy { x => x })
    //List(The, brown, dog, fox, jumped, lazy, over, quick, the)
    println(words.toList.sortBy { x => x }.reverse)
    //List(the, quick, over, lazy, jumped, fox, dog, brown, The)
  }
  
}