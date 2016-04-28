package scalaTestPractise


object M1Encode {

 def fnc[A](ls: List[A]): List[List[A]] = {
    val (c, d) = ls span (_ == ls.head) //CURRENT ELEMENT == HEAD
    if (d == Nil) List(c)
    else c :: fnc(d)
  }                                               //> fnc: [A](ls: List[A])List[List[A]]
  def encodde[A](ls :List[A]):List[(Int,A)]={
   fnc(ls) map{e => (e.length,e.head)}
   }                                              //> encodde: [A](ls: List[A])List[(Int, A)]
   
  val ls = List('a', 'a', 'a', 'b', 'b', 'c', 'd', 'd', 'a')
                                                  //> ls  : List[Char] = List(a, a, a, b, b, c, d, d, a)
  
   encodde(ls)                                    //> res0: List[(Int, Char)] = List((3,a), (2,b), (1,c), (2,d), (1,a))
}