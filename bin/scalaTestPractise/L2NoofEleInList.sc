package scalaTestPractise

object L2NoofEleInList {

  def noOFEle[A](ls: List[A]): Int = {
    if (ls.isEmpty) throw new NoSuchElementException
    else
      return ls.length
  }                                               //> noOFEle: [A](ls: List[A])Int

  val ls1 = List(1, 2, 3)                         //> ls1  : List[Int] = List(1, 2, 3)
  noOFEle(ls1)                                    //> res0: Int = 3

  def NonInBuilFnc[A](ls: List[A]): Int = ls match {
    case Nil       => 0
    case _ :: tail => 1 + NonInBuilFnc(tail)

  }                                               //> NonInBuilFnc: [A](ls: List[A])Int

  NonInBuilFnc(ls1)                               //> res1: Int = 3

  // More pure functional solution, with folds.
  //0-->STARTING VALUE
  // (RESULT,CURRENT)=> RESULT+1
  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }
                                                  //> lengthFunctional: [A](ls: List[A])Int
  lengthFunctional(ls1)                           //> res2: Int = 3
  def product(list: List[Int]): Int = list.foldLeft(1)(_ * _)
                                                  //> product: (list: List[Int])Int

  def sum(list: List[Int]): Int = list.foldLeft(0)(_ + _)
                                                  //> sum: (list: List[Int])Int

  def count(list: List[Any]): Int = list.foldLeft(0)((sum, _) => sum + 1)
                                                  //> count: (list: List[Any])Int

  product(ls1)                                    //> res3: Int = 6
  sum(ls1)                                        //> res4: Int = 6
  count(ls1)                                      //> res5: Int = 3





}