package week4

object Exception {
 
 def error(msg:String) = throw new  Error(msg)    //> error: (msg: String)Nothing
 
 error("testing")                                 //> java.lang.Error: testing
                                                  //| 	at week4.Exception$$anonfun$main$1.error$1(week4.Exception.scala:5)
                                                  //| 	at week4.Exception$$anonfun$main$1.apply$mcV$sp(week4.Exception.scala:7)
                                                  //| 
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week4.Exception$.main(week4.Exception.scala:3)
                                                  //| 	at week4.Exception.main(week4.Exception.scala)
	
	


}