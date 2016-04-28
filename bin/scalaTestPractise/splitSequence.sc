package scalaTestPractise

object splitSequence {
 
 val ls= List(15,15,15,20,3,4,121,43,6,7,20,21,21)
 
 val y=ls.groupBy( _ >15)
    
    
    val (a,b)=ls.partition( _>15 )
 
 
 val(c,d)= ls span(_==ls.head)
 val y1= ls.partition( _ >10)
 
 val y2= ls.span( _ < 20)
 
 val y3= ls.splitAt(2)

def fnc[A](ls:List[A]):List[List[A]]={
val(c,d)=ls span(_==ls.head)
if (d==Nil) List(c)
else c :: fnc(d)
}

fnc(ls)

}