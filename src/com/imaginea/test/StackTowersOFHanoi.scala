package com.imaginea.test
import scala.collection.mutable.Stack
import java.util.NoSuchElementException
import util.control.Breaks._

case class NegativeNotAllowed(message: String) extends Exception(message)

object StackTowersOFHanoi {
  def main(args: Array[String]): Unit = {
    println("In Main")
    var stepNum = 0
    
    var status = 0
    
    var v = 0;
    val sourceStack: Stack[Int] = new Stack
    val pivotStack: Stack[Int] = new Stack
    val destinationStack: Stack[Int] = new Stack

    println("Enter the number of disks")
    try {
      v = scala.io.StdIn.readLine().toInt;
      if (v <= 0) throw NegativeNotAllowed("Zero or Negative Numbers not allowed")

    } catch {
      case e: Exception => println("Invalid data !! exception caught: " + e);
    }

    var i = 0

    for (i <- (1 to v).reverse) {
      sourceStack.push(i)
    }

    var k = v % 2
    var x=0;
    println(sourceStack+"--- "+k)
    do {
      //if odd disk 
      //first move to source to dest & reverse
      //& den source to aux & reverse
      if (k == 1) {
        status = checkMove(sourceStack, destinationStack)
        

        if ( status == 1) {
         stepNum=stepNum+1
         
          println("Disk moved from Source Tower to Destination Tower ")
        } else if(status ==2){
         stepNum=stepNum+1
          println("Disk moved from Destination Tower to Source Tower ")
        }
        
        status = checkMove(sourceStack, pivotStack)
        if ( status == 1) {
     stepNum=stepNum+1
          println("Disk  moved from Source Tower to Pivot Tower ")
        } else if(status ==2){
         stepNum=stepNum+1
          println("Disk  moved from Pivot Tower to Source Tower ")
        }else{
         return
        }
      } else {
        //if even
        //source to pivot & reverse
        //source to destination & reverse
        status = checkMove(sourceStack, pivotStack)
        if ( status == 1) {
          stepNum=stepNum+1
          println("Disk  moved from Source Tower to Pivot Tower ")
        } else if(status ==2){
           stepNum=stepNum+1
          println("Disk moved from Pivot Tower to Source Tower ")
        }
        
      
        status = checkMove(sourceStack, destinationStack)
        if ( status == 1) {
          stepNum=stepNum+1
          println("Disk moved from Source Tower to Destination Tower ")
        } else if(status ==2){
          stepNum=stepNum+1
          println("Disk moved from Destination Tower to Source Tower ")
        }

      }
      
      
      status = checkMove(pivotStack, destinationStack)
        if ( status == 1) {
           stepNum=stepNum+1
          println("Disk  moved from Pivot Tower to Destination Tower ")
        } else if(status == 2){
           stepNum=stepNum+1
          println("Disk  moved from Destination Tower to Pivot Tower ")
        }

    } while (destinationStack.size != v)

  }

  /*
   * This method will move one disk from One tower to another
   * depending upon different scenarios
   * 1.) check emptiness
   * 2.) checking weight or disk size
   * */

  def checkMove(srcStack: Stack[Int], destStack: Stack[Int]): Int = {

    var i, j = 0

    //scenario 1  : checking when both towers are empty
    try {
      i = srcStack.top.toInt
    } catch {
      case e: Exception =>
//        println("Empty Stack")
        i = 0 //stack is empty
    }
    try {
      j = destStack.top.toInt
    } catch {
      case e: Exception =>
//        println("Empty Stack")
        j = 0 //stack is empty
    }
    if (i == j) return 0 //both towers are empty

    // if either of tower src and dest are empty

    if (i == 0) { //if tower A is empty ,pop from B push disk onto A
      srcStack.push(destStack.pop())
      return 2
    } else if (j == 0) { //if tower B is empty, pop from A push disk onto B
      destStack.push(srcStack.pop())
      return 1
    }

    //checking weight & move
    if (i < j) {
      destStack.push(srcStack.pop()) // move occurs from tower A to B i.e. source to destination
      return 1
    } else if (i > j) {
      srcStack.push(destStack.pop()) //move occurs from tower B to A i.e. destination to source
      return 2  
    }
    return -1

  }
}