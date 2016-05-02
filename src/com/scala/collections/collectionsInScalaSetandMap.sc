package com.scala.collections
 import scala.collection.immutable.HashSet
 import scala.collection.mutable.Map
 
object collectionsInScalaSetandMap {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //arrays are always mutable, whereas lists are always immutable.
  
  
  
  var jetSet = Set("Boeing", "Airbus")            //> jetSet  : scala.collection.immutable.Set[String] = Set(Boeing, Airbus)
  jetSet += "Lear"
  println(jetSet.contains("Cessna"))              //> false
  
 
  val hashSet = HashSet("Tomatoes", "Chilies")    //> hashSet  : scala.collection.immutable.HashSet[String] = Set(Chilies, Tomatoe
                                                  //| s)
                                
  println(hashSet + "Coriander")                  //> Set(Chilies, Tomatoes, Coriander)
  
  val treasureMap = Map[Int, String]()            //> treasureMap  : scala.collection.mutable.Map[Int,String] = Map()
    treasureMap += (1 -> "Go to island.")         //> res0: com.scala.collections.collectionsInScalaSetandMap.treasureMap.type = M
                                                  //| ap(1 -> Go to island.)
    treasureMap += (2 -> "Find big X on ground.") //> res1: com.scala.collections.collectionsInScalaSetandMap.treasureMap.type = M
                                                  //| ap(2 -> Find big X on ground., 1 -> Go to island.)
    treasureMap += (3 -> "Dig.")                  //> res2: com.scala.collections.collectionsInScalaSetandMap.treasureMap.type = M
                                                  //| ap(2 -> Find big X on ground., 1 -> Go to island., 3 -> Dig.)
    println(treasureMap(2))                       //> Find big X on ground.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}