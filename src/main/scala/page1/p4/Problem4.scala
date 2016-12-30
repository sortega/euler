package page1.p4

/** A palindromic number reads the same both ways. The largest palindrome made from the product
  * of two 2-digit numbers is 9009 = 91 × 99.
  *
  * Find the largest palindrome made from the product of two 3-digit numbers.
  */
object Problem4 extends App {

  def isPalindrome(n: Int): Boolean = {
    val s = n.toString
    s == s.reverse
  }

  val largestPalindrome = (for {
    a <- 100 to 999
    if a % 11 == 0 // The result should be divisible by 11
    b <- a to 999
    product = a * b
    if isPalindrome(product)
  } yield product).max

  println(largestPalindrome)
}
