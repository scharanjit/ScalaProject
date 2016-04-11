package com.imaginea.test

object test2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def abs(x: Double) = {
    if (x < 0) -x else x
  }                                               //> abs: (x: Double)Double

  def sqrt(guess: Double, x: Double): Double = {
    if (isGooDEnough(guess, x)) guess
    else sqrt(improve(guess, x), x)
    return 1.0
  }                                               //> sqrt: (guess: Double, x: Double)Double
  def isGooDEnough(guess: Double, x: Double) = {
    abs(guess * guess - x) < 0.01
  }                                               //> isGooDEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqr(x: Double) = {
    sqrt(1.0, x)
  }                                               //> sqr: (x: Double)Double
  
  sqr(2)                                          //> res0: Double = 1.0
  

}