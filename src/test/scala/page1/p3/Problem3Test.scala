package page1.p3

import org.scalatest.{FlatSpec, Matchers}

class Problem3Test extends FlatSpec with Matchers {

  "Problem 3" should "find the largest prime factor" in {
    Problem3.largestFactor(13195) shouldBe 29
  }

}
