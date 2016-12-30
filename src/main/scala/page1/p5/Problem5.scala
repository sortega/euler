package page1.p5

import util.NumberTheory

/** 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without
  * any remainder.
  *
  * What is the smallest positive number that is evenly divisible by all of the numbers from
  * 1 to 20?
  */
object Problem5 extends App {

  case class Factors(entries: Map[Int, Int]) {
    def combine(other: Factors): Factors = Factors(
      (entries.keySet union other.entries.keySet).map { p =>
        p -> (entries.getOrElse(p, 0) max other.entries.getOrElse(p, 0))
      }.toMap
    )

    def toInt: Int =
      entries.map {
        case (p, count) => List.fill(count)(p).product
      }.product
  }

  object Factors {
    def from(n: Int) =
      Factors(NumberTheory.factors(n).groupBy(identity).map {
        case (p, occurrences) => p -> occurrences.size
      })
  }

  def mcmFirstN(n: Int): Int = (2 to n).map(Factors.from).reduce(_ combine _).toInt

  println(mcmFirstN(20))
}
