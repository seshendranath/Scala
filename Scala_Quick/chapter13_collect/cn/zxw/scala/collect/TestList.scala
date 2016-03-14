package cn.zxw.scala.collect

import scala.collection.mutable.LinkedList

object TestList {
  def main(args: Array[String]): Unit = {
    println(sum(List(1,2,3,4,5)))
    println(List(1,2,3,4,5).sum)
    testLink
    
  }
  def sum(list:List[Int]):Int={
    if(list == Nil){
      0
    }else{
      list.head + sum(list.tail)
    }
  }
  def testLink{
    val link1 = LinkedList(1, -1, 3, -3, 5, -5)
    var lst = link1
    while(lst != Nil){
      if(lst.elem < 0){
        lst.elem = 0
      }
      lst = lst.next
    }
    link1.foreach { x => print(x + " - ") }
    var lst1 = link1
    while(lst1.next != Nil && lst1.next.next != Nil){
      lst1.next = lst1.next.next
      lst1 = lst1.next
    }
    println
    link1.foreach { x => println("res:" + x) }
  }
}