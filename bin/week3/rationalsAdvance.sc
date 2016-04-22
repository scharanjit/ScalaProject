package week3

object RationalAdsAdvance {
 
 	 
  val x = new RationalAd(1, 3)                    //> x  : week3.RationalAd = 1/3
  val y = new RationalAd(5, 7)                    //> y  : week3.RationalAd = 5/7
  val z = new RationalAd(3, 2)                    //> z  : week3.RationalAd = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3

  def addRationalAd(r: RationalAd, s: RationalAd): RationalAd = {
    new RationalAd(r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)
  }                                               //> addRationalAd: (r: week3.RationalAd, s: week3.RationalAd)week3.RationalAd

  def makeString(r: RationalAd) =
    r.numer + "/" + r.denom                       //> makeString: (r: week3.RationalAd)String

  makeString(addRationalAd(new RationalAd(1, 2), new RationalAd(2, 3)))
                                                  //> res2: String = 7/6

  x.neg                                           //> res3: week3.RationalAd = 1/-3
  x.add(y)                                        //> res4: week3.RationalAd = 22/21
  x.sub(y).sub(z)                                 //> res5: week3.RationalAd = -79/42
  
  y.add(y)                                        //> res6: week3.RationalAd = 10/7
  
  //infix notation
  x < y                                           //> res7: Boolean = true

 x max y                                          //> res8: week3.RationalAd = 5/7

y max x                                           //> res9: week3.RationalAd = 5/7
    

}
class RationalAd(x: Int, y: Int) {
	private  def gcd(a:Int,b:Int):Int=if (b==0) a else gcd(b ,a%b)
	private val g=gcd(x,y)
	def < (that:RationalAd) =numer * that.denom< that.numer * denom
	
	def max(that:RationalAd)=if(this<that) that else this
	
	
  def numer = x/g
  def denom = y/g

  def add(that: RationalAd) = {
    new RationalAd(numer * that.denom + that.numer * denom,
      denom * that.denom)
  }
  def neg: RationalAd = new RationalAd(-numer, denom)

  override def toString = numer + "/" + denom

  def sub(that: RationalAd) = add(that.neg)
}
 
 