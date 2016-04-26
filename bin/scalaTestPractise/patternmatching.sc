package scalaTestPractise

object patternmatching {
  
  
    def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case h :: Nil => "default case ===="
    case _ => "default case "
    
    
  }                                               //> matchTest: (x: Any)Any
  println(matchTest("two"))                       //> 2
  
  println(matchTest("s"))                         //> default case 
  
  matchTest()                                     //> res0: Any = "default case "
  
  
}