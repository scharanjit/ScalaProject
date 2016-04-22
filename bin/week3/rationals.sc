package week3

object rationals {

  val x = new Rational(1, 3)                      //> x  : week3.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : week3.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week3.Rational = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3

  def addRational(r: Rational, s: Rational): Rational = {
    new Rational(r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)
  }                                               //> addRational: (r: week3.Rational, s: week3.Rational)week3.Rational

  def makeString(r: Rational) =
    r.numer + "/" + r.denom                       //> makeString: (r: week3.Rational)String

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res2: String = 7/6

  x.neg                                           //> res3: week3.Rational = -1/3
  x.add(y)                                        //> res4: week3.Rational = 22/21
  x.sub(y).sub(z)                                 //> res5: week3.Rational = -79/42
  
  y.add(y)                                        //> res6: week3.Rational = 70/49
}
class Rational(x: Int, y: Int) {

  def numer = x
  def denom = y

  def add(that: Rational) = {
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)
  }
  def neg: Rational = new Rational(-numer, denom)

  override def toString = numer + "/" + denom

  def sub(that: Rational) = add(that.neg)
}