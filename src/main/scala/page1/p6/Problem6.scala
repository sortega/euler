package page1.p6

/** The sum of the squares of the first ten natural numbers is,
  *
  * 12 + 22 + ... + 102 = 385
  * The square of the sum of the first ten natural numbers is,
  *
  * (1 + 2 + ... + 10)2 = 552 = 3025
  *
  * Hence the difference between the sum of the squares of the first ten natural numbers and the
  * square of the sum is 3025 − 385 = 2640.
  *
  * Find the difference between the sum of the squares of the first one hundred natural numbers and
  * the square of the sum.
  */
object Problem6 extends App {

  def naive(n: Int): Int = square((1 to n).sum) - (1 to n).map(square).sum

  def fast(n: Int): Int = n * (n + 1) * (3 * square(n) - n - 2) / 12

  private def square(n: Int): Int = n * n

  println(fast(100))
}
