package scalaTestPractise
//Find the last element of a list.
			
object L1lastelementOFList {
def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }                                               //> lastRecursive: [A](ls: List[A])A

val list =List(1,2,3,4,5)                         //> list  : List[Int] = List(1, 2, 3, 4, 5)

lastRecursive(list)                               //> res0: Int = 5

}