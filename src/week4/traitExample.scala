package week4
//multiple inheritance prohibited in java :- trait can be multiple inherited
//trait is quite similar to interface but with advantage of concrete method with implementation
//  Traits cannot have (value) parameters ,only classes can.
trait traitExample {
  def height :Int
  def width :Int
  def surface =height * width 
  
}