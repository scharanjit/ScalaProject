package com.scala.patternMatching
abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr
object test {
  val v = Var("x")                                //> v  : com.scala.patternMatching.Var = Var(x)
  val op = BinOp("+", Number(1), v)               //> op  : com.scala.patternMatching.BinOp = BinOp(+,Number(1.0),Var(x))
  
  v.name                                          //> res0: String = x
  op.operator                                     //> res1: String = +
  op.left                                         //> res2: com.scala.patternMatching.Expr = Number(1.0)
  op.right                                        //> res3: com.scala.patternMatching.Expr = Var(x)
  
  
  
  
 


}