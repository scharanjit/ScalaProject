package week4

class NonEmpty(elem :Int,left :IntSet,right :IntSet)extends IntSet {
  def contains(x:Int):Boolean={
    if(x<elem) left contains x
    else if  (x> elem)  right contains x
    else true
  }
  
  def incl(x:Int):IntSet={
    if (x<elem) new NonEmpty(elem, left incl x,right)       //include in left sub tree
    else if (x> elem)  new NonEmpty(elem,left,right incl x) //include in right subtree
    else this
    
  }
  
 override def toString= "{"+left+elem+right+"}"
 
 def union(other :IntSet):IntSet={
   ((left union right)union other)incl elem
   
 }
}