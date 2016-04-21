package com.imaginea.test

object functionreturningfunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def sum2(f:Int=>Int)(a:Int,b:Int):Int={ 0}      //> sum2: (f: Int => Int)(a: Int, b: Int)Int
  
  //sum2 is a function
  //it takes a function of type Int
  //that function f has two Int paramters & reurn Int as output
  
  //sum is a function which takes a single paramter f of type int to Int
  //It returns a function as its result
  def sum(f:Int => Int):(Int,Int)=> Int ={
  def sumF(a:Int,b:Int):Int =
  if(a>b) 0 else f(a)+ sumF(a+1,b)
 sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int



def sum1(f:Int => Int)(a:Int,b:Int):Int=
if(a>b) 0 else f(a)+ sum(f)(a+1,b)                //> sum1: (f: Int => Int)(a: Int, b: Int)Int

sum(x =>x )(3,4)                                  //> res0: Int = 7

sum1(x=>x)(3,4)                                   //> res1: Int = 7


}