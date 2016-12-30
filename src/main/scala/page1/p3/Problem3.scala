package page1.p3

import util.NumberTheory

/** The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143?
  */
object Problem3 extends App {

  def largestFactor(n: Long): Int = NumberTheory.factors(n).last

  println(largestFactor(600851475143L))
}
