package cn.zxw.scala.pkg

package object people {//包对象
  val defaultName = "zhang"
}

package people{
  class Person{
    val name = defaultName
    private[pkg] def hi(){//包可见性
      println("Hi,"+name)
    }
  }
}

object TestPerson{
    def main(args: Array[String]): Unit = {
      println(cn.zxw.scala.pkg.people.defaultName)
      import cn.zxw.scala.pkg.people.Person
      val p = new Person
      p.hi()//包可见性
    }
}