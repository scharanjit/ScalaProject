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
  
  
   val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )                                             //> romanNumeral  : scala.collection.mutable.Map[Int,String] = Map(2 -> II, 5 ->
                                                  //|  V, 4 -> IV, 1 -> I, 3 -> III)
    println(romanNumeral(4))                      //> IV
  
  //no imports required
  
  val nums = Set(1, 2, 3)                         //> nums  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  nums + 5                                        //> res3: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 5)
  println(nums) //----------------------------    //> Set(1, 2, 3)
  nums - 3                                        //> res4: scala.collection.immutable.Set[Int] = Set(1, 2)
  println(nums)  //---------------------------    //> Set(1, 2, 3)
  nums ++ List(5, 6)                              //> res5: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3)
  println(nums)                                   //> Set(1, 2, 3)
  nums -- List(1, 2)                              //> res6: scala.collection.immutable.Set[Int] = Set(3)
  println(nums)                                   //> Set(1, 2, 3)
	//nums ** Set(1, 3, 5, 7)
	nums.size                                 //> res7: Int = 3
	nums.contains(3)                          //> res8: Boolean = true
  
  
  
  
  
  
  
}