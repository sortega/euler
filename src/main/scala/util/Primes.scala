package util

import scala.annotation.tailrec

object Primes {

  lazy val stream: Stream[Int] = 2 #:: Stream.from(3).filter { n =>
    val bound = Math.sqrt(n).floor.toInt
    stream.takeWhile(_ < bound).forall(p => n % p != 0)
  }

  def factors(n: Long): Vector[Int] = {

    @tailrec
    def aux(primes: Stream[Int], remaining: Long, factors: Vector[Int]): Vector[Int] =
      if (remaining <= 1) factors
      else if (remaining % primes.head == 0)
        aux(primes, remaining / primes.head, factors :+ primes.head)
      else aux(primes.tail, remaining, factors)

    aux(stream, n, Vector.empty)
  }
}
