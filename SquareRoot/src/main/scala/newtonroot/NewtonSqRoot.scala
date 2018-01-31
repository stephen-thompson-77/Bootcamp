package newtonroot

import scala.io.StdIn

object NewtonSqRoot extends App {

  do {
    print("Enter a positive number: ")
    val n = StdIn.readInt()
    println(s"Root: ${root(n)}")

    println("Again? (Y,n)")

  } while (StdIn.readLine().trim.toLowerCase() == "y")

  def root(n: Int): Double = n match {
    case _ if n < 0 => throw new IllegalArgumentException("Cannot accept negative number.")
    case 0 => 0
    case 1 => 1
    case _ =>
      val est = 1d
      var g: Double = guess(n, est)
      while (!(Math.abs(n - (g * g))/2d < 0.000001)) {
        g = guess(n, g)
      }
      Math.abs(g)
  }

  def guess(n: Int, est: Double): Double = (est + (n / est)) / 2d

}

