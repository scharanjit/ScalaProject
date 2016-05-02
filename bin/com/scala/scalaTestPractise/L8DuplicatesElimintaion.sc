package scalaTestPractise

object L8DuplicatesElimintaion {
  val ls = List('a', 'a', 'a', 'b', 'b', 'c', 'd', 'd', 'a')
                                                  //> ls  : List[Char] = List(a, a, a, b, b, c, d, d, a)

  def compress[A](ls: List[A]): List[A] = {
    ls.foldRight(List[A]()) {
      (h, r) =>
        if (r.isEmpty || r.head != h) h :: r
        else r
    }
  }                                               //> compress: [A](ls: List[A])List[A]

  compress(ls)                                    //> res0: List[Char] = List(a, b, c, d, a)

  def compress1[A](l: List[A]): List[A] = l.foldLeft(List[A]()) {
    case (ls, e) if (ls.isEmpty || ls.last != e) => ls ::: List(e)
    case (ls, e)                                 => ls
  }                                               //> compress1: [A](l: List[A])List[A]

  compress1(ls)                                   //> res1: List[Char] = List(a, b, c, d, a)

}