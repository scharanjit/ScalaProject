package scalaTestPractise

object _operatorColon {
 val ls= List(1,2,3)                              //> ls  : List[Int] = List(1, 2, 3)
 val ls1 = 0 :: ls                                //> ls1  : List[Int] = List(0, 1, 2, 3)
 
 val ls2 = List(5,6,7)                            //> ls2  : List[Int] = List(5, 6, 7)
 
 val ls3= ls1 :: ls2                              //> ls3  : List[Any] = List(List(0, 1, 2, 3), 5, 6, 7)
 
 List(1,2,3) :: List(4,5,6)                       //> res0: List[Any] = List(List(1, 2, 3), 4, 5, 6)
 
  List(1,2,3) ::: List(4,5,6)                     //> res1: List[Int] = List(1, 2, 3, 4, 5, 6)
}