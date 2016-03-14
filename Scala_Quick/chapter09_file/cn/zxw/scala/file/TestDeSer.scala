package cn.zxw.scala.file

import scala.collection.mutable.ArrayBuffer
import java.io.ObjectOutputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.FileInputStream

@SerialVersionUID(1L) class TestDeSer(val name:String) extends Serializable{
  val friends = new ArrayBuffer[TestDeSer]
  
  def addFriend(fname:String){
    val friend = new TestDeSer(fname)
    friends += friend
  }
}

object TestDeSer{
  val filePath = "C:/zhangxw/workSpace/Scala/Scala_Quick/file/"
  def main(args: Array[String]): Unit = {
    val user = new TestDeSer("zhang")
    user.addFriend("xiaoming")
    user.addFriend("xiaoli")
    user.addFriend("xiaozhao")
    for(uf <- user.friends){
      println(uf.name)
    }
    //write
    val out = new ObjectOutputStream(new FileOutputStream(filePath+"user.obj"))
    out.writeObject(user)
    out.close()
    //read
    val in = new ObjectInputStream(new FileInputStream(filePath+"user.obj"))
    val obj = in.readObject()
    in.close()
    val userGet = obj.asInstanceOf[TestDeSer]
    for(uf <- userGet.friends){
      println(uf.name)
    }
  }
}