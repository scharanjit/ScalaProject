package com.scala.scalaTestPractise
// P15 (**) Duplicate the elements of a list a given number of times.
//     Example:
//     scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//     res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)


object M4FlatMapDuplicate {
  def duplicateN[A](num:Int,ls :List[A]):List[A]={
  //ls flatMap { List.make(num,_) }
   ls flatMap { List.fill(num)(_) }
  }                                               //> duplicateN: [A](num: Int, ls: List[A])List[A]
  val ls =List(1,2,3,4,5)                         //> ls  : List[Int] = List(1, 2, 3, 4, 5)
  duplicateN(5, ls)                               //> res0: List[Int] = List(1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4,
                                                  //|  4, 4, 5, 5, 5, 5, 5)
}