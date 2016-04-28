package scalaTestPractise

object M2EncodedModified {

 val ls = List('a', 'a', 'a', 'b', 'b','c','c','c', 'd', 'd', 'a')
                                                  //> ls  : List[Char] = List(a, a, a, b, b, c, c, c, d, d, a)
//copying

 def fnc[A](ls: List[A]): List[List[A]] = {
    val (c, d) = ls span (_ == ls.head) //CURRENT ELEMENT == HEAD
    if (d == Nil) List(c)
    else c :: fnc(d)
  }                                               //> fnc: [A](ls: List[A])List[List[A]]
  
  fnc(ls)                                         //> res0: List[List[Char]] = List(List(a, a, a), List(b, b), List(c, c, c), List
                                                  //| (d, d), List(a))
  def encodde[A](ls :List[A]):List[(Int,A)]={
   fnc(ls) map{e => (e.length,e.head)}
   }                                              //> encodde: [A](ls: List[A])List[(Int, A)]
   
   encodde(ls)                                    //> res1: List[(Int, Char)] = List((3,a), (2,b), (3,c), (2,d), (1,a))
//copying 2
 
  def encd[A](ls:List[A]):List[Any]={
  encodde(ls) map(t => if (t._1==1)t._2 else t)
  }                                               //> encd: [A](ls: List[A])List[Any]
 
  val m1 = (2,3,5,4)                              //> m1  : (Int, Int, Int, Int) = (2,3,5,4)
 
    val mul = m1._1 * m1._2 * m1._4               //> mul  : Int = 24
    
    
  encd(ls)                                        //> res2: List[Any] = List((3,a), (2,b), (3,c), (2,d), a)
}