package com.scala.collections
import scala.collection.mutable.Map

object collectionsInScalaImmutibiltyMutuabilty {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val people = Set("Nancy", "Jane")               //> people  : scala.collection.immutable.Set[String] = Set(Nancy, Jane)
	//people += "Bob"
	var people1 = Set("Nancy", "Jane")        //> people1  : scala.collection.immutable.Set[String] = Set(Nancy, Jane)
	people1 += "Bob"
	
	people1                                   //> res0: scala.collection.immutable.Set[String] = Set(Nancy, Jane, Bob)
	println(people1)                          //> Set(Nancy, Jane, Bob)
	
	 var capital = Map("US" -> "Washington", "France" -> "Paris")
                                                  //> capital  : scala.collection.mutable.Map[String,String] = Map(France -> Paris
                                                  //| , US -> Washington)
  capital += ("Japan" -> "Tokyo")                 //> res1: scala.collection.mutable.Map[String,String] = Map(France -> Paris, Jap
                                                  //| an -> Tokyo, US -> Washington)
  println(capital("France"))                      //> Paris
   println(capital("Japan"))                      //> Tokyo
   
   //By the way, this syntactic treatment works on any kind of value, not just collections.
   //For example, here it is being used on floating-point numbers:
   
   var roughlyPi = 3.0                            //> roughlyPi  : Double = 3.0
   roughlyPi += 0.1
   roughlyPi += 0.04
   roughlyPi                                      //> res2: Double = 3.14
   
}