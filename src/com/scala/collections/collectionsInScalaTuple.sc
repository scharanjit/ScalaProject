package com.scala.collections

object collectionsInScalaTuple {
  // a tuple combines a fixed number of items together so that they can be passed around as a whole.
  //Unlike an array or list, a tuple can hold objects with different types.

  def longestWord(words: Array[String]) = {
    var word = words(0)
    var idx = 0
    for (i <- 1 until words.length)
      if (words(i).length > word.length) {
        word = words(i)
        idx = i
      }
    (word, idx)
  }                                               //> longestWord: (words: Array[String])(String, Int)
  
  val longest =
           longestWord("The quick brown fox".split(" "))
                                                  //> longest  : (String, Int) = (quick,1)
           
           
           longest._1                             //> res0: String = quick
           longest._2                             //> res1: Int = 1
           
           
}