package scalaTestPractise
//Find the last element of a list.

object L1lastelementOFList {
 //using built in functions
  def lastBuiltin[A](ls: List[A]): A = ls.last    //> lastBuiltin: [A](ls: List[A])A

//using
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }                                               //> lastRecursive: [A](ls: List[A])A

  val list = List(1, 2, 3, 4, 5)                  //> list  : List[Int] = List(1, 2, 3, 4, 5)

  lastRecursive(list)                             //> res0: Int = 5

  lastBuiltin(list)                               //> res1: Int = 5

  def chkLst[A](ls: List[A]): A = {
    if (ls.isEmpty) throw new NoSuchElementException
    else
      ls.last

  }                                               //> chkLst: [A](ls: List[A])A

  chkLst(list)                                    //> res2: Int = 5
  
  val list1=List(1,"2",3,'c')                     //> list1  : List[Any] = List(1, 2, 3, c)
  
  lastRecursive(list1)                            //> res3: Any = c

val lx=List()                                     //> lx  : List[Nothing] = List()
lastRecursive(lx)                                 //> java.util.NoSuchElementException
                                                  //| 	at scalaTestPractise.L1lastelementOFList$$anonfun$main$1.lastRecursive$1
                                                  //| (scalaTestPractise.L1lastelementOFList.scala:12)
                                                  //| 	at scalaTestPractise.L1lastelementOFList$$anonfun$main$1.apply$mcV$sp(sc
                                                  //| alaTestPractise.L1lastelementOFList.scala:35)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at scalaTestPractise.L1lastelementOFList$.main(scalaTestPractise.L1laste
                                                  //| lementOFList.scala:4)
                                                  //| 	at scalaTestPractise.L1lastelementOFList.main(scalaTestPractise.L1lastel
                                                  //| ementOFList.scala)
	
}