package page1.p1

import org.scalatest.{FlatSpec, Matchers}

class Problem1Test extends FlatSpec with Matchers {

  "Problem 1" should "sum multiples of 3 and 5 below 10" in {
    Problem1.multiplesBelow(10) shouldBe 23
  }

}
