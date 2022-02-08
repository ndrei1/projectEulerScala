package projecteuler

import scala.annotation.tailrec

object ProblemFive {

  //    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
  //    What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?

  def solve(): Long = {
    smallestMultiple(20)
  }

  @tailrec
  def smallestMultiple(value: Long, result: Long = 1): Long =
    if value == 0 then result else smallestMultiple(value - 1, lmc(result, value))

  def lmc(a: Long, b: Long): Long = {
    a * (b / gcd(a, b))
  }

  @tailrec
  def gcd(a: Long, b: Long): Long =
    if b == 0 then a
    else gcd(b, a % b)
}
