package page1.p1

/** If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  * The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  */
object Problem1 {
  def multiplesBelow(n: Int): Int =
    (1 until n).filter(i => multipleOf(3, i) || multipleOf(5, i)).sum

  private def multipleOf(k: Int, i: Int): Boolean = i % k == 0

  def main(args: Array[String]): Unit = {
    println(multiplesBelow(1000))
  }
}
