package com.scala.collections

object MapMarkerUsage {
  val capital = MapMaker.makeMap                  //> capital  : scala.collection.mutable.Map[String,String] = Map()
	capital +=("US" -> "Washington")          //> res0: com.scala.collections.MapMarkerUsage.capital.type = Map(US -> Washingt
                                                  //| on)
	
	capital ++=List("US" -> "Washington","Paris" -> "France", "Japan" -> "Tokyo")
                                                  //> res1: com.scala.collections.MapMarkerUsage.capital.type = Map(Paris -> Franc
                                                  //| e, Japan -> Tokyo, US -> Washington)
println(capital)                                  //> Map(Paris -> France, Japan -> Tokyo, US -> Washington)
	capital("US")                             //> res2: String = Washington
	
	capital("Japan")                          //> res3: String = Tokyo
	
	capital("India")                          //> res4: String = Why do you want to know?
	
	capital +=("India"-> "Dili Dili")         //> res5: com.scala.collections.MapMarkerUsage.capital.type = Map(Paris -> Franc
                                                  //| e, India -> Dili Dili, Japan -> Tokyo, US -> Washington)
	
	capital("India")                          //> res6: String = Dili Dili
}