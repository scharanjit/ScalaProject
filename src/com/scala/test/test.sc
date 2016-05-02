package com.imaginea.test

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sw(x:Int):Int ={
    if(x >=0) x else x
  }                                               //> sw: (x: Int)Int
    
    sw(5)                                         //> res0: Int = 5
    
    def or(x:Boolean,y:Boolean):Boolean =
    if(x) x else y                                //> or: (x: Boolean, y: Boolean)Boolean
    
    or(true,false)                                //> res1: Boolean = true
    or(false,false)                               //> res2: Boolean = false
    or(true,true)                                 //> res3: Boolean = true
    or(false,true)                                //> res4: Boolean = true
    
  def towers( x :Int, a :String, b:String, c :String) :Unit={
  if(x==1) println("Single Disk moved from "+a+" to "+c)
  	else{
  	towers(x-1,a,c,b)
  	towers(1,a,b,c)
  	towers(x-1,c,a,b)
  	}
  
  
  }                                               //> towers: (x: Int, a: String, b: String, c: String)Unit
  
  towers(2,"a","b","c")                           //> Single Disk moved from a to b
                                                  //| Single Disk moved from a to c
                                                  //| Single Disk moved from c to b
  
  def addInt(a :Int,b:Int):Int={
  var sum:Int=0
  sum=a+b
  return sum
  }                                               //> addInt: (a: Int, b: Int)Int
  
  addInt(5,6)                                     //> res5: Int = 11













}