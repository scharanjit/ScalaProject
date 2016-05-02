package com.scala.collections
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
//import scala.collection.mutable.Queue
import scala.collection.immutable.Queue
import scala.collection.mutable.Stack

object collectionInScalaSequences {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  var colors = List("red", "green", "blue")       //> colors  : List[String] = List(red, green, blue)

  colors.head                                     //> res0: String = red
  colors.tail                                     //> res1: List[String] = List(green, blue)

  val fiveInts = new Array[Int](5)                //> fiveInts  : Array[Int] = Array(0, 0, 0, 0, 0)

  val SixIntss = Array(1, 2, 3, 4, 5, 6, 'c')     //> SixIntss  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 99)

  val fiveIntss = Array(1, 2, 3, 4, 5, 6, 'c', "c")
                                                  //> fiveIntss  : Array[Any] = Array(1, 2, 3, 4, 5, 6, c, c)

  //Class List provides fast access to the head of the list, but not the end.
  //for fast access in reverse order create list in reverse or Another alternative, is ListBuffer
  //ListBuffer is a mutable object

  val buf = new ListBuffer[Int]                   //> buf  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()
  buf += 1                                        //> res2: com.scala.collections.collectionInScalaSequences.buf.type = ListBuffer
                                                  //| (1)
  buf += 2                                        //> res3: com.scala.collections.collectionInScalaSequences.buf.type = ListBuffer
                                                  //| (1, 2)

  buf += 3                                        //> res4: com.scala.collections.collectionInScalaSequences.buf.type = ListBuffer
                                                  //| (1, 2, 3)
  println(buf)                                    //> ListBuffer(1, 2, 3)

		//An ArrayBuffer is like an array,
		//except that you can additionally add and remove elements from the beginning and end of the sequence.

	val buf1 = new ArrayBuffer[Int]()         //> buf1  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()

buf1 +=12                                         //> res5: com.scala.collections.collectionInScalaSequences.buf1.type = ArrayBuf
                                                  //| fer(12)
buf1 +=14                                         //> res6: com.scala.collections.collectionInScalaSequences.buf1.type = ArrayBuf
                                                  //| fer(12, 14)
buf1 +=16                                         //> res7: com.scala.collections.collectionInScalaSequences.buf1.type = ArrayBuf
                                                  //| fer(12, 14, 16)

println(buf1)                                     //> ArrayBuffer(12, 14, 16)


buf1.length                                       //> res8: Int = 3

buf1(0)                                           //> res9: Int = 12


buf1.remove(0)                                    //> res10: Int = 12


//If you need a first-in-first-out sequence, you can use a Queue.
//Scala's collection library provides both mutable and immutable variants of Queue.


//val empty = new Queue[Int]
// it wont work because construcotr is proteceted




val empty = Queue(1,2,3)                          //> empty  : scala.collection.immutable.Queue[Int] = Queue(1, 2, 3)
val xzx =empty.enqueue(4)                         //> xzx  : scala.collection.immutable.Queue[Int] = Queue(1, 2, 3, 4)
val has1 = xzx.enqueue(5)                         //> has1  : scala.collection.immutable.Queue[Int] = Queue(1, 2, 3, 4, 5)
println(has1)                                     //> Queue(1, 2, 3, 4, 5)


//If you need a last-in-first-out sequence, you can use a Stack,
//which also comes in both mutable and immutable versions in the Scala collections library.

val stack = new Stack[Int]                        //> stack  : scala.collection.mutable.Stack[Int] = Stack()

stack.push(1)                                     //> res11: com.scala.collections.collectionInScalaSequences.stack.type = Stack(
                                                  //| 1)
stack.push(2,3,4)                                 //> res12: com.scala.collections.collectionInScalaSequences.stack.type = Stack(
                                                  //| 4, 3, 2, 1)
 println(stack)                                   //> Stack(4, 3, 2, 1)

stack.top                                         //> res13: Int = 4

stack.pop                                         //> res14: Int = 4

//One other sequence to be aware of is RichString, which is a Seq[Char].
//Because Predef has an implicit conversion from String to RichString, you can treat any string as a Seq[Char].


def hasUpperCase(s:String)=s.exists(_.isUpper)    //> hasUpperCase: (s: String)Boolean

hasUpperCase("Charanjit")                         //> res15: Boolean = true

hasUpperCase("test")                              //> res16: Boolean = false











}