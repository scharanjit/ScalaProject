package scalaTestPractise

object L9DuplicateEleINSUbliSt {

  val ls = List('a', 'a', 'a', 'b', 'b', 'c', 'd', 'd', 'a')
                                                  //> ls  : List[Char] = List(a, a, a, b, b, c, d, d, a)

  def fnc[A](ls: List[A]): List[List[A]] = {
    val (c, d) = ls span (_ == ls.head) //CURRENT ELEMENT == HEAD
    if (d == Nil) List(c)
    else c :: fnc(d)
  }                                               //> fnc: [A](ls: List[A])List[List[A]]

  fnc(ls)                                         //> res0: List[List[Char]] = List(List(a, a, a), List(b, b), List(c), List(d, d)
                                                  //| , List(a))

}