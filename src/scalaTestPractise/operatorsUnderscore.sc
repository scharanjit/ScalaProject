package scalaTestPractise

/*
// imports all the classes in the package matching
import scala.util.matching._
// imports all the members of the object Fun. (static import in java)
import com.test.Fun._
// imports all the members of the object Fun but renames Foo to Bar
import com.test.Fun.{ Foo => Bar , _ }
// imports all the members except Foo. To exclude a member rename it to _
import com.test.Fun.{ Foo => _ , _ }
*/

object operatorsUnderscore {
  val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)  //> nums  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  nums filter (_ % 2 == 0)                        //> res0: List[Int] = List(2, 4, 6, 8, 10)

  nums reduce (_ + _)                             //> res1: Int = 55

  nums.exists(_ > 5)                              //> res2: Boolean = true

  nums.takeWhile(_ < 8)                           //> res3: List[Int] = List(1, 2, 3, 4, 5, 6, 7)

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "anything other than one and two"
  }                                               //> matchTest: (x: Int)String

  matchTest(1)                                    //> res4: String = one
  matchTest(2)                                    //> res5: String = two
  matchTest(3)                                    //> res6: String = anything other than one and two

  List(1, 2, 3, 4, 5).foreach(println(_))         //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5

  List(1, 2, 3, 4, 5).foreach(a => println(a))    //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5

  val sum = List(1, 2, 3, 4, 5).reduceLeft(_ + _) //> sum  : Int = 15

  val sum1 = List(1, 2, 3, 4, 5).reduceLeft((a, b) => a + b)
                                                  //> sum1  : Int = 15


//In scala, a getter and setter will be implicitly defined for all non-private var in a object.
// The getter name is same as the variable name and _= is added for setter name.
  class Test {
    private var a = 0
    def age = a
    def age_=(n: Int) = {
      require(n > 0)
      a = n
    }
  }

  val t = new Test                                //> t  : scalaTestPractise.operatorsUnderscore.Test = scalaTestPractise.operato
                                                  //| rsUnderscore$$anonfun$main$1$Test$1@5bbc608f
  t.age = 5
  println(t.age)                                  //> 5
  
  
  //Scala is a functional language. So we can treat function as a normal variable.
  //If you try to assign a function to a new variable, the function will be invoked and
  //the result will be assigned to the variable. This confusion occurs due to the optional
  //braces for method invocation. We should use _ after the function name to assign it to another variable.

class Test1 {
  def fun = {
    println("Inside function")
  }
  val funLike = fun _
}
  
  
}