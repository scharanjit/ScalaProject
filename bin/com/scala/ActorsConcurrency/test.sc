package com.scala.ActorsConcurrency
import scala.actors.Actor._

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
    val seriousActor2 = actor {
            for (i <- 1 to 5)
              println("That is the question.")
            Thread.sleep(1000)
         }                                        //> That is the question.
                                                  //| That is the question.
                                                  //| That is the question.
                                                  //| That is the question.
                                                  //| That is the question.
                                                  //| seriousActor2  : scala.actors.Actor = scala.actors.Actor$$anon$1@4b7ae6a5

NameResolver ! ("www.scala-lang.org", self)
	
}