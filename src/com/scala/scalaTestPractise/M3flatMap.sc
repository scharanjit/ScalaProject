package com.scala.scalaTestPractise
//Duplicate the elements of a list.
//     scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//     res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)


object M3flatMap {
val ls = List(1,2,3,4,5)                          //> ls  : List[Int] = List(1, 2, 3, 4, 5)
  def duplicate[A](ls: List[A]): List[A] = ls flatMap { e => List(e, e) }
                                                  //> duplicate: [A](ls: List[A])List[A]
            
            duplicate(ls)                         //> res0: List[Int] = List(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
            
            
            
            ls.flatMap(x=>List(x,x+0.5))          //> res1: List[Double] = List(1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5)
}