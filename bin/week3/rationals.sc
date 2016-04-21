package week3

object rationals {

  val x = new Rational(232, 99)                   //> x  : week3.Rational = 232/99
  x.numer                                         //> res0: Int = 232
  x.denom                                         //> res1: Int = 99

  def addRational(r: Rational, s: Rational): Rational = {
    new Rational(r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)
  }                                               //> addRational: (r: week3.Rational, s: week3.Rational)week3.Rational

def makeString(r:Rational)=
r.numer+"/"+r.denom                               //> makeString: (r: week3.Rational)String




makeString(addRational(new Rational(1,2), new Rational(2,3)))
                                                  //> res2: String = 7/6

val y= new Rational(2,3)                          //> y  : week3.Rational = 2/3
x.add(y)

}
class Rational(x: Int, y: Int) {

  def numer = x
  def denom = y
  
  
  def add(that:Rational){
  new Rational( numer * that.denom + that.numer * denom,
  denom * that.denom)
  }
  
	  override def toString = numer+"/"+denom
}