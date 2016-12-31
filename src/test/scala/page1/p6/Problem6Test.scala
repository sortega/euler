package page1.p6

import org.scalatest.{FlatSpec, Matchers}

class Problem6Test extends FlatSpec with Matchers {

  "Problem 6" should "compute the difference between the square of the sum and the sum of squares" in {
    (1 to 5).map(Problem6.naive) shouldBe List(0, 4, 22, 70, 170)
  }

  it should "do it in O(1)" in {
    (1 to 100).foreach { n =>
      Problem6.fast(n) shouldBe Problem6.naive(n)
    }
  }
}
