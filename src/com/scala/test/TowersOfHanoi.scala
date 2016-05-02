package com.scala.test

object TowersOfHanoi {
  
  case class NegativeNotAllowed(message:String) extends Exception(message)
def main(args: Array[String]): Unit = {
    println("Enter the number of disks")
    try{
    val v=scala.io.StdIn.readLine().toInt;
    if (v<= 0) throw NegativeNotAllowed("Zero or Negative Numbers not allowed")
    towers(v, "Source", "Destination", "Pivot")
    }catch{
      case e: Exception => println("Invalid data !! exception caught: " + e);
    }
   

 

  }
 
  def towers(x: Int, a: String, b: String, c: String): Unit = {
    if (x == 1) {
      println(" Disk" + x +" moved from " + a + " to " + b)
    } else {
      towers(x - 1, a, c, b)
      towers(1, a, b, c)
      towers(x - 1, c, b, a)

    }

  }

 
}