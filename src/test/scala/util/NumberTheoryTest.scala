package util

import org.scalatest.{FlatSpec, Matchers}

class NumberTheoryTest extends FlatSpec with Matchers {

  "Primes" should "be an infinite lazy sequence of prime numbers from 2" in {
    NumberTheory.primes.take(10).toList shouldBe List(2, 3, 4, 5, 6, 7, 8, 9, 11, 13)
  }

  "Integers" should "be factorized" in {
    NumberTheory.factors(2) shouldBe Vector(2)
    NumberTheory.factors(4) shouldBe Vector(2, 2)
    NumberTheory.factors(13195) shouldBe Vector(5, 7, 13, 29)
  }

  they should "have a common greatest divisor" in {
    NumberTheory.gcd(1, 1) shouldBe 1
    NumberTheory.gcd(2, 4) shouldBe 2
    NumberTheory.gcd(8, 2) shouldBe 2
    NumberTheory.gcd(6, 4) shouldBe 2
  }

  they should "have a common least multiple" in {
    NumberTheory.mcm(1, 1) shouldBe 1
    NumberTheory.mcm(2, 3) shouldBe 6
    NumberTheory.mcm(6, 4) shouldBe 12
  }
}
