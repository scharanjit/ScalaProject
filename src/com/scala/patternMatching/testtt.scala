package com.scala.patternMatching

object testtt {
   abstract class Expr
    case class Var(name: String) extends Expr
    case class Number(num: Double) extends Expr
    case class UnOp(operator: String, arg: Expr) extends Expr
    case class BinOp(operator: String, left: Expr, right: Expr) extends Expr
    
     def simplifyTop(expr: Expr): Expr = expr match {
      case UnOp("-", UnOp("-", e))  => e   // Double negation
      case BinOp("+", e, Number(0)) => e   // Adding zero
      case BinOp("*", e, Number(1)) => e   // Multiplying by one
      case _ => expr
    }
    def main(args: Array[String]): Unit = {
      println(simplifyTop(UnOp("-", UnOp("-", Var("x")))))
      println(simplifyTop(UnOp("+", UnOp("-", Var("x")))))
    }
   
   
}