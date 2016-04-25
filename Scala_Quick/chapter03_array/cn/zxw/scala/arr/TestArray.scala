package cn.zxw.scala.arr

import scala.collection.mutable.ArrayBuffer

object TestArray {
  def main(args: Array[String]): Unit = {
    fixedLen
    mutableLen
    loop
    operate
    transform
    matrix
  }
  
  def fixedLen(){
    val nums = new Array[Int](5)
    nums(4) = 5
    nums.foreach { x => print(x) }
    val strs = Array("hi","world")
    strs(0) = "hello"
    strs.foreach { x => print(x) }
    println()
  }
  
  def mutableLen(){
    val nums = new ArrayBuffer[Int]()
    nums += 0
    nums +=(1,2,3)
    nums ++= Array(4,5,6)
    nums.trimStart(2)
    nums.trimEnd(2)
    nums.foreach { x => print(x) }
    println()
    nums.insert(1, 5)
    nums.insert(2, 6, 7)
    nums.foreach { x => print(x) }
    println()
    nums.remove(1)
    nums.remove(1,2)
    nums.foreach { x => print(x) }
    println()
    val arr = nums.toArray
    arr.foreach { x => print(x) }
    val arrBuff = arr.toBuffer
    println()
  }
  
  def loop(){
    for(e <- 0 until (10,2)){
      print(e + " ")
    }
    println()
    for(e <- (0 until (10,2)).reverse){
      print(e + " ")
    }
    println()
  }
  
  def operate(){
    val arr = Array(1,7,3,5)
    println(arr.sum)
    println(arr.max)
    println(arr.min)
    val sortedArr = arr.sorted
    println(sortedArr.mkString(" "))
  }
  
  def transform(){
    val arr = Array(1,2,3,4,5,6,7,8)
    val newArr1 = arr.filter { _ % 2 == 0 }.map { _ * 2 }
    println(newArr1.mkString(" "))
  }
  
  def matrix(){
    val matrix = Array.ofDim[Int](2, 3)
    matrix(0)(0) = 1
    matrix(0)(1) = 2
    matrix(0)(2) = 3
    matrix(1)(0) = 4
    matrix(1)(1) = 5
    matrix(1)(2) = 6
    matrix.foreach { x => {x.foreach { y => print(y+" ") };println()}}
  }
}