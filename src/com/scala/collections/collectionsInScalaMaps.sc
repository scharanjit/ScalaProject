package com.scala.collections

object collectionsInScalaMaps {

  val nums = Map("i" -> 1, "ii" -> 2)             //> nums  : scala.collection.immutable.Map[String,Int] = Map(i -> 1, ii -> 2)

  nums + ("vi" -> 6)                              //> res0: scala.collection.immutable.Map[String,Int] = Map(i -> 1, ii -> 2, vi -
                                                  //| > 6)
  nums - "ii"                                     //> res1: scala.collection.immutable.Map[String,Int] = Map(i -> 1)
  nums ++ List("iii" -> 3, "v" -> 5)              //> res2: scala.collection.immutable.Map[String,Int] = Map(i -> 1, ii -> 2, iii 
                                                  //| -> 3, v -> 5)

  nums -- List("i", "ii")                         //> res3: scala.collection.immutable.Map[String,Int] = Map()
  nums.size                                       //> res4: Int = 2
  nums.contains("ii")                             //> res5: Boolean = true

  nums("ii") //	Retrieves the value at a specified key (returns 2)
                                                  //> res6: Int = 2
  nums.keys //Returns the keys (returns an Iterator over the strings "i" and "ii")
                                                  //> res7: Iterable[String] = Set(i, ii)
  nums.keySet //Returns the keys as a set (returns Set(i, ii))
                                                  //> res8: scala.collection.immutable.Set[String] = Set(i, ii)
  nums.values //Returns the values (returns an Iterator over the integers 1 and 2)
                                                  //> res9: Iterable[Int] = MapLike(1, 2)
  nums.isEmpty                                    //> res10: Boolean = false
}