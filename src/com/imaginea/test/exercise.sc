package com.imaginea.test
import math.abs

object exercise {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val tolerance =0.0001                           //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x:Double,y:Double)=
  abs((x-y)/x)/x<tolerance                        //> isCloseEnough: (x: Double, y: Double)Boolean
  
  	def fixedpoint(f:Double =>Double)(firstGuess :Double)={
  	def iterate(guess:Double):Double={
  	val next=f(guess)
  	if (isCloseEnough(guess,next))next
  	else iterate(next)
  	}
  	iterate(firstGuess)
  	}                                         //> fixedpoint: (f: Double => Double)(firstGuess: Double)Double
}