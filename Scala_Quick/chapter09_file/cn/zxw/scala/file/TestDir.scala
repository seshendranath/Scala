package cn.zxw.scala.file

import java.io.File

object TestDir {
  def main(args: Array[String]): Unit = {
    val files = listDirs(new File("C:/zhangxw/workSpace/Scala/Scala_Quick/"))
    for(f <- files){
      println(f.getAbsolutePath)
    }
  }
  def listDirs(dir:File):Iterator[File]={
    val dirs = dir.listFiles().filter {_.isDirectory}
    dirs.iterator ++ dirs.iterator.flatMap {listDirs _}
  }
}