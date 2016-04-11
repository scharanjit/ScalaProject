package com.imaginea.test
import scala.util.Try;

object TowersOfHanoi {
  
def main(args: Array[String]): Unit = {
    println("Enter the number of disks")
    try{
    val v=scala.io.StdIn.readLine().toInt;
    towers(v, "Source", "Destination", "Pivot")
    }catch{
      case e: Exception => println("Invalid data !! exception caught: " + e);
    }
   

 

  }
 
  def towers(x: Int, a: String, b: String, c: String): Unit = {
    if (x == 1) {
      println("Single Disk moved from " + a + " to " + b)
    } else {
      towers(x - 1, a, c, b)
      towers(1, a, b, c)
      towers(x - 1, c, b, a)

    }

  }

 
}