package cn.zxw.scala.extend

class Person {
  val name = "zhang"
  override def toString = getClass.getName+"[name="+name+"]"
}

class Employee extends Person{
  val salary = 1000
  override def toString = super.toString()+"[salary="+salary+"]"
}

object Employee extends App{
  val em = new Employee
  println(em.toString())
  val p = new Person
  println(p.toString())
  
  if(em.isInstanceOf[Person]){
    val p1 = em.asInstanceOf[Person]
    println("em is sub class of Person")
  }
  
  if(em.getClass == classOf[Employee]){
    println("em is class of Employee")
  }
  
  p match {
    case employ:Employee => println("em is type of Employee")
    case person:Person   => println("em is type of Person")
    case _               => println("obj unknow type")
  }
}