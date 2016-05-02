package com.scala.collections
import scala.collection.mutable.Map
import com.sun.xml.internal.ws.server.RewritingMOM
import com.sun.xml.internal.bind.api.RawAccessor

object collectionsInScalaWordCount {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def countWords(text:String)={
  val counts= Map.empty[String,Int]
  for (rawWord <- text.split("[ ,!.]+")) {
             val word = rawWord.toLowerCase
             val oldCount =
               if (counts.contains(word)) counts(word)
               else 0
             counts += (word -> (oldCount + 1))
           }
           counts
         }                                        //> countWords: (text: String)scala.collection.mutable.Map[String,Int]
  
  countWords("I . < > ,am a good boy . I am  [ what I am")
                                                  //> res0: scala.collection.mutable.Map[String,Int] = Map(am -> 3, > -> 1, [ -> 1
                                                  //| , a -> 1, boy -> 1, < -> 1, i -> 3, what -> 1, good -> 1)
         
         
         
  countWords("See Spot run! Run, Spot. Run!")     //> res1: scala.collection.mutable.Map[String,Int] = Map(spot -> 2, see -> 1, ru
                                                  //| n -> 3)
                                                  
                                                  
}