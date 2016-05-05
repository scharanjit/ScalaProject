package com.scala.scalaTestPractise

object M6ListSplit {
  def splitFunctional[A](n: Int, ls: List[A]): (List[A], List[A]) =
    (ls.take(n), ls.drop(n))                      //> splitFunctional: [A](n: Int, ls: List[A])(List[A], List[A])
    
    val ls = List(1,2,3,4,5,6,7,8,9)              //> ls  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    splitFunctional(3, ls)                        //> res0: (List[Int], List[Int]) = (List(1, 2, 3),List(4, 5, 6, 7, 8, 9))
}