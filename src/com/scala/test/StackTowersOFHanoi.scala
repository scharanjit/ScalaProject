package com.scala.test
import scala.collection.mutable.Stack
import java.util.NoSuchElementException


case class NegativeNotAllowed(message: String) extends Exception(message)

object StackTowersOFHanoi {
  /*
   * This is the main method of Object
   * 1. )This is validating 0, minus & non integer input
   * Also it is giving information about disk movement
   * */
  def main(args: Array[String]): Unit = {
    var status = 0
    
    var totalDisks = 0;
    val sourceStack: Stack[Int] = new Stack
    val pivotStack: Stack[Int] = new Stack
    val destinationStack: Stack[Int] = new Stack

    println("Enter the number of disks : ")
    try {
      totalDisks = scala.io.StdIn.readLine().toInt;
      if (totalDisks <= 0) throw NegativeNotAllowed("Zero or Negative Numbers not allowed")
    } catch {
      case e: Exception => println("Invalid data !! exception caught: " + e);
    }

    var i = 0

    for (i <- (1 to totalDisks).reverse) {
      sourceStack.push(i)
    }

    var k = totalDisks % 2
    var x=0;
    do {
      //if odd disk 
      //first move to source to dest & reverse
      //& den source to aux & reverse
      if (k == 1) {
        status = checkMove(sourceStack, destinationStack)  
        if ( status == 1) {
          println(" moved from Source Tower to Destination Tower ")
        } else if(status ==2){
          println(" moved from Destination Tower to Source Tower ")
        }
        status = checkMove(sourceStack, pivotStack)
        if ( status == 1) {
          println(" moved from Source Tower to Pivot Tower ")
        } else if(status ==2){
          println(" moved from Pivot Tower to Source Tower ")
        }else{
         return
        }
      } else {
        //if even
        //source to pivot & reverse
        //source to destination & reverse
        status = checkMove(sourceStack, pivotStack)
        if ( status == 1) {
          println("  moved from Source Tower to Pivot Tower ")
        } else if(status ==2){
          println(" moved from Pivot Tower to Source Tower ")
        }
        status = checkMove(sourceStack, destinationStack)
        if ( status == 1) {
          println(" moved from Source Tower to Destination Tower ")
        } else if(status ==2){
          println(" moved from Destination Tower to Source Tower ")
        }

      }
      
      
      status = checkMove(pivotStack, destinationStack)
        if ( status == 1) {
          println("  moved from Pivot Tower to Destination Tower ")
        } else if(status == 2){
          println("  moved from Destination Tower to Pivot Tower ")
        }

    } while (destinationStack.size != totalDisks)

  }

  /*
   * This method will move one disk from One tower to another
   * depending upon different scenarios
   *  checking below constraints
   *
   * 1. Only one disk can be moved at a time.
   * 
   * 2. Each move consists of taking the upper disk from one of the stacks 
   * and placing it on top of another stack i.e. a disk can only be moved 
   * if it is the uppermost disk on a stack.
   * 
   * 3. A bigger disc can not be placed on top of a smaller disk.
   * 
   * 
   * 
   * */

  def checkMove(srcStack: Stack[Int], destStack: Stack[Int]): Int = {

    var i, j = 0

    //scenario 1  : checking when both towers are empty
    try {
      i = srcStack.top.toInt
    } catch {
      case e: Exception =>
        i = 0 //stack is empty
    }
    try {
      j = destStack.top.toInt
    } catch {
      case e: Exception =>
        j = 0 //stack is empty
    }
    if (i == j) return 0 //both towers are empty

    // if either of tower src and dest are empty

    if (i == 0) { //if tower A is empty ,pop from B push disk onto A
      print("Disk "+destStack.top+" ")
      srcStack.push(destStack.pop())
      return 2
    } else if (j == 0) { //if tower B is empty, pop from A push disk onto B
        print("Disk "+srcStack.top+" ")
      destStack.push(srcStack.pop())
      return 1
    }

    //checking weight & move
    if (i < j) {
      print("Disk "+srcStack.top+" ")
      destStack.push(srcStack.pop()) // move occurs from tower A to B i.e. source to destination
      return 1
    } else if (i > j) {
      print("Disk "+destStack.top+" ")
      srcStack.push(destStack.pop()) //move occurs from tower B to A i.e. destination to source
      return 2  
    }
    return -1

  }
}