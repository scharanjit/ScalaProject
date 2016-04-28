package scalaTestPractise

object collectionMap {
  var A: Map[Char, Int] = Map()                   //> A  : Map[Char,Int] = Map()

  A += ('I' -> 1)
  A += ('J' -> 2)
  A += ('I' -> 20)
  A += ('K' -> 100)
  A += ('L' -> 500)

  println(A)                                      //> Map(I -> 20, J -> 2, K -> 100, L -> 500)

  // A map with keys and values.
  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "yellow" -> "#FF00FF")
                                                  //> colors  : scala.collection.immutable.Map[String,String] = Map(red -> #FF0000
                                                  //| , azure -> #F0FFFF, yellow -> #FF00FF)
  colors.get("red")                               //> res0: Option[String] = Some(#FF0000)

  colors.keys.foreach { i =>
    print("Key = " + i)
    println(" Value = " + colors(i))
  }                                               //> Key = red Value = #FF0000
                                                  //| Key = azure Value = #F0FFFF
                                                  //| Key = yellow Value = #FF00FF
     
     val l= List(1,2,3,4,5)                       //> l  : List[Int] = List(1, 2, 3, 4, 5)
 
 
 l.map(x=>x*2)                                    //> res1: List[Int] = List(2, 4, 6, 8, 10)

}