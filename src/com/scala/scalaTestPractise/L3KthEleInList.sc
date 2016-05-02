package scalaTestPractise

object L3KthEleInList {
  
  
  def kthEle[A](n:Int,ls:List[A]):A= {
  if (n>=0) ls(n)
else throw new NoSuchElementException
  }                                               //> kthEle: [A](n: Int, ls: List[A])A
  
  
  
  val lt=List(1,2,3,4,5,6,7)                      //> lt  : List[Int] = List(1, 2, 3, 4, 5, 6, 7)
  
  kthEle(5, lt)                                   //> res0: Int = 6
  
   // Not that much harder without.
  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
  // case( head cons tail)
  //:: cons
  //=>imployes
  //_ when u dont care whats the right/left node is
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }                                               //> nthRecursive: [A](n: Int, ls: List[A])A
  
  
  nthRecursive(5, lt)                             //> res1: Int = 6
}