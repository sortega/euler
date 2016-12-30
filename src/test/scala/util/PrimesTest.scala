package util

import org.scalatest.{FlatSpec, Matchers}

class PrimesTest extends FlatSpec with Matchers {

  "Primes" should "be an infinite lazy sequence of prime numbers from 2" in {
    Primes.stream.take(10).toList shouldBe List(2, 3, 4, 5, 6, 7, 8, 9, 11, 13)
  }

  it should "factorize numbers" in {
    Primes.factors(2) shouldBe Vector(2)
    Primes.factors(4) shouldBe Vector(2, 2)
    Primes.factors(13195) shouldBe Vector(5, 7, 13, 29)
  }
}
