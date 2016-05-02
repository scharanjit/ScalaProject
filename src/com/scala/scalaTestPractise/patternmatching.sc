package scalaTestPractise

import sun.awt.image.ToolkitImage

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
  
  trait Expr{
  def eval : Int = this match{
  case Number(n)=> n
  case Sum(e1,e2)=> e1.eval + e2.eval
  }
  }
  
  case class Number(n:Int) extends Expr
  case class Sum(e1:Expr,e2:Expr) extends Expr
  
  def show(e:Any):String =e match{
  case Number(x)=> x.toString()
  case Sum(l,r)=> show(l)+" + "+show(r)
  }                                               //> show: (e: Any)String
 
 show(Sum(Number(1),Number(2)))                   //> res1: String = 1 + 2
 show(Number(4))                                  //> res2: String = 4
 
 
 
 case class variable(v:Any)
 
 
 
 
}