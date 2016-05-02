package scalaTestPractise

object L6Palindrom {
 val ls= List(1,2,1)                              //> ls  : List[Int] = List(1, 2, 1)
   def fnctPalindrom[A](ls:List[A]):Boolean=ls==ls.reverse
                                                  //> fnctPalindrom: [A](ls: List[A])Boolean
   
   fnctPalindrom(ls)                              //> res0: Boolean = true
  fnctPalindrom(ls)                               //> res1: Boolean = true
  }