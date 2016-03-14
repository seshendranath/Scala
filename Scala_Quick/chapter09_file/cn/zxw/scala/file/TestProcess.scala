package cn.zxw.scala.file

import sys.process._

object TestProcess {
  def main(args: Array[String]): Unit = {
    val p = Process("ls -l")
    val v =  p !
  }
}