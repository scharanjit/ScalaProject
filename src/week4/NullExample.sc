package week4

object NullExample {
  
  
  val x=null                                      //> x  : Null = null
	//val z:Int=null

	val z:Null=null                           //> z  : Null = null
	
	if (true) 1 else false                    //> res0: AnyVal = 1
	//why AnyVal...1-->Int false -->Boolean..bec super type is AnyVal
}