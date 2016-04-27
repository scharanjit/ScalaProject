package scalaTestPractise

object L5ReverseAList {
  
  val ls =List(1,2,3,4,5)                         //> ls  : List[Int] = List(1, 2, 3, 4, 5)
  
  //builtIn
  def builtInRev[A](ls:List[A]):List[A]=ls.reverse//> builtInRev: [A](ls: List[A])List[A]
  
  builtInRev(ls)                                  //> res0: List[Int] = List(5, 4, 3, 2, 1)
  
  
}