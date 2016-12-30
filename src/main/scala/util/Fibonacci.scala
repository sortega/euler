package util

object Fibonacci {
  lazy val stream: Stream[Int] = custom((1, 1), _ + _)

  def custom(seed: (Int, Int), relation: (Int, Int) => Int): Stream[Int] =
    Stream.iterate(seed) { case (a, b) => (b, relation(a, b)) }.map(_._1)
}
