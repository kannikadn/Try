/**
  * Created by o649367 on 2/10/2017.
  */


class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  override def toString: String =
"(" + x + ", " + y + ")"

}


class multiply(var x:Int,var y:Int) {
  def multiplication(p: Int, q: Int): Unit = {
    println( "(" + x + " , " + y + ")" )
    x = x * p
    y = y * q
  }
 override def toString: String =
  "(" + x + y + ")"
 // println("(" + x + ", " + y + ")")
}


object Classes {
  def main(args: Array[String]) {
    val pt = new Point(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
   // println(s"(" + x + " , " + y + ")")
    val mul=new multiply(2, 2)
    //println(mul)
    mul.multiplication(2, 2)
    println(mul)
  }
}