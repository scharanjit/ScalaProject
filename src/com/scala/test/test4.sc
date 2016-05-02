package com.imaginea.test

object test4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

//Tail recursive factorial

def factorial(x:Int):Int={
 def loop(acc:Int ,x:Int):Int=
 if(x==0) acc
 else loop(acc*x,x-1)
 loop(1,x)
}                                                 //> factorial: (x: Int)Int


factorial(5)                                      //> res0: Int = 120

//advanatgae is stack overflow exception will not come
}