package com.scala.collections
import scala.collection.immutable.TreeSet
 import scala.collection.immutable.TreeMap
 
object collectionsInScalaTreeSet {
  val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)  //> ts  : scala.collection.immutable.TreeSet[Int] = TreeSet(0, 1, 2, 3, 4, 5, 6,
                                                  //|  7, 8, 9)
  val cs = TreeSet('f', 'u', 'n')                 //> cs  : scala.collection.immutable.TreeSet[Char] = TreeSet(f, n, u)
  
  var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')  //> tm  : scala.collection.immutable.TreeMap[Int,Char] = Map(1 -> x, 3 -> x, 4 -
                                                  //| > x)
  tm += (2 -> 'x')
  println(tm)                                     //> Map(1 -> x, 2 -> x, 3 -> x, 4 -> x)
}