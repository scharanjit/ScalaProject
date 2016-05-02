package com.scala.ActorsConcurrency

import scala.actors._

object SeriousActor extends Actor {
  def act() {
    for (i <- 1 to 5) {
      println("To be or not to be.")
      Thread.sleep(1000)
    }
  }
  
  
  def main(args: Array[String]): Unit = {
    SillyActor.start()
    SeriousActor.start()
  }
}