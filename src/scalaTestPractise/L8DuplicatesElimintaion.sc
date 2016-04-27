package scalaTestPractise

object L8DuplicatesElimintaion {
  val ls = List('a', 'a', 'a', 'b', 'b', 'c', 'd', 'd','a')
                                                  //> ls  : List[Char] = List(a, a, a, b, b, c, d, d, a)

  def compress[A](ls: List[A]): List[A] = {
    ls.foldRight(List[A]()) {
      (h,r) =>
        if (r.isEmpty || r.head != h) h :: r
        else r
    }
  }                                               //> compress: [A](ls: List[A])List[A]

	compress(ls)                              //> res0: List[Char] = List(a, b, c, d, a)

}