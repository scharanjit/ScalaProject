package scalaTestPractise
//Find the last element of a list.

object L1lastelementOFList {
 //using built in functions
  def lastBuiltin[A](ls: List[A]): A = ls.last    //> lastBuiltin: [A](ls: List[A])A

//using
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }                                               //> lastRecursive: [A](ls: List[A])A

  val list = List(1, 2, 3, 4, 5)                  //> list  : List[Int] = List(1, 2, 3, 4, 5)

  lastRecursive(list)                             //> res0: Int = 5

  lastBuiltin(list)                               //> res1: Int = 5

  def chkLst[A](ls: List[A]): A = {
    if (ls.isEmpty) throw new NoSuchElementException
    else
      ls.last

  }                                               //> chkLst: [A](ls: List[A])A

  chkLst(list)                                    //> res2: Int = 5


	
}