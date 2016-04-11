package com.imaginea.test

object towersOhHanoi {
  //peg a :Source
  //peg b :Destination
  //peg c : temp
  //x : no of disks
  def towers(x: Int, a: String, b: String, c: String): Unit = {
    if (x == 1) {
      println("Single Disk moved from " + a + " to " + b)
    } else {
      towers(x - 1, a, c, b)
      towers(1, a, b, c)
      towers(x - 1, c, b, a)

    }

  }                                               //> towers: (x: Int, a: String, b: String, c: String)Unit

  towers(3, "a", "b", "c")                        //> Single Disk moved from a to b
                                                  //| Single Disk moved from a to c
                                                  //| Single Disk moved from b to c
                                                  //| Single Disk moved from a to b
                                                  //| Single Disk moved from c to a
                                                  //| Single Disk moved from c to b
                                                  //| Single Disk moved from a to b
}