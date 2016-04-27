package scalaTestPractise

object L5ReverseAList {

  val ls = List(1, 2, 3, 4, 5)                    //> ls  : List[Int] = List(1, 2, 3, 4, 5)

  //builtIn
  def builtInRev[A](ls: List[A]): List[A] = ls.reverse
                                                  //> builtInRev: [A](ls: List[A])List[A]

  builtInRev(ls)                                  //> res0: List[Int] = List(5, 4, 3, 2, 1)

  //simple recursion

  def reverseRecursion[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => reverseRecursion(tail) ::: List(h)

  }                                               //> reverseRecursion: [A](ls: List[A])List[A]

  reverseRecursion(ls)                            //> res1: List[Int] = List(5, 4, 3, 2, 1)

  //pure funtional

  def functionalReverse[A](ls: List[A]): List[A] = {
    ls.foldLeft(List[A]()) { (r, h) => h :: r }

  }                                               //> functionalReverse: [A](ls: List[A])List[A]

  functionalReverse(ls)                           //> res2: List[Int] = List(5, 4, 3, 2, 1)
}