package com.imaginea.test
import scala.collection.mutable.Stack

case class NegativeNotAllowed(message:String) extends Exception(message)

object StackTowersOFHanoi {
  def main(args: Array[String]): Unit = {
    println("In Main")
    var stepNum=0
    var status=0
    var v=0;
    val sourceStack:Stack[Int]=new Stack
    val pivotStack:Stack[Int]=new Stack
    val destinationStack:Stack[Int]=new Stack
    
     println("Enter the number of disks")
    try{
     v=scala.io.StdIn.readLine().toInt;
    if (v<= 0) throw NegativeNotAllowed("Zero or Negative Numbers not allowed")
    
    }catch{
      case e: Exception => println("Invalid data !! exception caught: " + e);
    }
   
    
   var i=0
   
   for (i <- 1 to v)
     sourceStack.push(i)
     
  }
  
  
  
  
  def checkMove(A1 : Stack[Int],B1 :Stack[Int]):Any={
    
    
  }
}