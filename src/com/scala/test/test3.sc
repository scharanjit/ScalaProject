package com.imaginea.test

object test3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val x = 0                                       //> x  : Int = 0
  def f(y: Int) = y + 1                           //> f: (y: Int)Int

  val result = {
    val x = f(3)
    x * x
  } + x                                           //> result  : Int = 16

def  gcd (a :Int,b:Int):Int={ //tail recursive
if(b==0) a else gcd (b,a%b)
}                                                 //> gcd: (a: Int, b: Int)Int

gcd (14,21)                                       //> res0: Int = 7


def factorial(n:Int):Int={  //non tail recursive
if (n==0)1 else n* factorial(n-1)
}                                                 //> factorial: (n: Int)Int

factorial(5)                                      //> res1: Int = 120


//in factorial it will be 5*4*3*2*1  chk 2.7 video

}