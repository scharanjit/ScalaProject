package week4

object intsets {
  
  //first data set or root of tree
  val t1=new NonEmpty(3,new Empty,new Empty)      //> t1  : week4.NonEmpty = {.3.}
  val t2 = t1 incl 5                              //> t2  : week4.IntSet = {.3{.5.}}
  
}