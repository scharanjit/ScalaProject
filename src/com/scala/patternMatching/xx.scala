package com.scala.patternMatching

object xx {
  def dropTailRecursive[A](n: Int, ls: List[A]): List[A] = {
    def dropR(c: Int, curList: List[A], result: List[A]): List[A] = (c, curList) match {
      case (_, Nil)       => result.reverse
      case (1, _ :: tail) => dropR(n, tail, result)
      case (_, h :: tail) => dropR(c - 1, tail, h :: result)
    }
    dropR(n, ls, Nil)
  }  
  def main(args: Array[String]): Unit = {
    val  ls=List('a','b','c','d','e','f','g')         //> ls  : List[Char] = List(a, b, c, d, e, f, g)
 dropTailRecursive(2, ls)  
  }
}