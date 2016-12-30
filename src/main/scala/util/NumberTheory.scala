package util

import scala.annotation.tailrec

object NumberTheory {

  lazy val primes: Stream[Int] = 2 #:: Stream.from(3).filter { n =>
    val bound = Math.sqrt(n).floor.toInt
    primes.takeWhile(_ < bound).forall(p => n % p != 0)
  }

  def factors(n: Long): Vector[Int] = {

    @tailrec
    def aux(primes: Stream[Int], remaining: Long, factors: Vector[Int]): Vector[Int] =
      if (remaining <= 1) factors
      else if (remaining % primes.head == 0)
        aux(primes, remaining / primes.head, factors :+ primes.head)
      else aux(primes.tail, remaining, factors)

    aux(primes, n, Vector.empty)
  }

  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (a > b) gcd(b, a)
    else if (b % a == 0) a
    else gcd(b, b % a)

  def mcm(a: Int, b: Int): Int = a * b / gcd(a, b)
}
