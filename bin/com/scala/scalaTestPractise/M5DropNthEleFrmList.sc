package com.scala.scalaTestPractise

import javax.swing.TransferHandler.DropHandler

object m5DropNthEleFrmList {

 val lsPrc= List(1,2,3,4,5)                       //> lsPrc  : List[Int] = List(1, 2, 3, 4, 5)

val v= lsPrc.tail                                 //> v  : List[Int] = List(2, 3, 4, 5)
val b=lsPrc.head                                  //> b  : Int = 1
val ddcs= lsPrc::List(6,7)                        //> ddcs  : List[Any] = List(List(1, 2, 3, 4, 5), 6, 7)



  def dropTailRecursive[A](n: Int, ls: List[A]): List[A] = {
   
    def dropR(c: Int, curList: List[A], result: List[A]): List[A] = (c, curList) match {
      case (_, Nil)       => result.reverse
      case (1, _ :: tail) => dropR(n, tail, result)
      case (_, h :: tail) => dropR(c - 1, tail, h :: result)
    }
   dropR(n, ls, Nil)
   
    //println(result)
    
  }                                               //> dropTailRecursive: [A](n: Int, ls: List[A])List[A]
  
val  ls=List('a','b','c','d','e','f','g')         //> ls  : List[Char] = List(a, b, c, d, e, f, g)
 dropTailRecursive(2, ls)                         //> res0: List[Char] = List(a, c, e, g)
}