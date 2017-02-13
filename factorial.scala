
class factorial [T] {
  var  x = 1
  def factor(n : Int) : Unit = {
  var fact = 1
    for ( x <- 1 to n)
      {
        fact = fact * x

      }
println( "Factorial of " + n + " is " + fact)

  }
  x = x + 1
}


object Classes {
  def main(args: Array[String]) {
    val fact = new factorial[Int]
    fact.factor(5)
  //  println(fact)
  }
}