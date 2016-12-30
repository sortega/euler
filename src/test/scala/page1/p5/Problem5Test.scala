package page1.p5

import org.scalatest.{FlatSpec, Matchers}

class Problem5Test extends FlatSpec with Matchers {

  "Problem 5" should "find the smallest multiple of the first n numbers" in {
    Problem5.mcmFirstN(10) shouldBe 2520
  }
}
