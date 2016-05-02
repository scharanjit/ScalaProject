package week4

object overrideExample {
  
  abstract class Base{
  def foo= 1
  def bar: Int
  }
  
  class Subs extends Base{
  override def foo=2
  def bar=3
  }
  
  
}