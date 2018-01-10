object CalculateGCD 
{ 
  def gcd(x:Int,y:Int):Int=
  {
    if (y==0) x 
    else
    gcd(y, x%y)
  }
  def main(args: Array[String]) 
  {
    val a = args(0).toInt
    val b = args(1).toInt    
    println(gcd(a, b))   
  }
}
