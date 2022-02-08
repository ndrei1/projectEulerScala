package projecteuler

import scala.annotation.tailrec

object ProblemThree {

  //    The prime factors of 13195 are 5, 7, 13 and 29.
  //    What is the largest prime factor of the number 600851475143 ?

  def solve(): Long = {
    largestPrimeFactor(600851475143L)
  }

  @tailrec
  def largestPrimeFactor(maxValue: Long, result: Long = 1): Long =
    if maxValue <= 1 then result
    else if maxValue % result == 0 && result != 1 then largestPrimeFactor(maxValue / result, result)
    else largestPrimeFactor(maxValue, result + 1)
}
