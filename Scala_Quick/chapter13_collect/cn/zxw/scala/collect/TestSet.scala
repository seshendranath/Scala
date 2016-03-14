package cn.zxw.scala.collect

object TestSet {
  def main(args: Array[String]): Unit = {
    test1
  }
  def test1(){
    val digits = Set(1,3,5,7,9)
    val primes = Set(1,2,3)
    println(digits.contains(5))
    println(digits.subsetOf(primes))
    (digits & primes).foreach { x => print(x+",") }
    println
    (digits | primes).foreach { x => print(x+",") }
    println
    (digits &~ primes).foreach { x => print(x+",") }
    println
    (digits ++ primes).foreach { x => print(x+",") }
    println
    (digits -- primes).foreach { x => print(x+",") }
  }
}