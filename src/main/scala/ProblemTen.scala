package projecteuler

import scala.annotation.tailrec

object ProblemTen {

  //  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  //  Find the sum of all the primes below two million.


  def solve(): Long = {
    sumOfPrimes(primeNumberGenerator(Array.fill(2000000)(true))) - 1
  }

  @tailrec
  def sumOfPrimes(array: Array[Boolean], a: Long = 0, acc: Long = 0): Long = {
    if a == array.length then acc else if array(a.toInt) then
      sumOfPrimes(array, a + 1, acc + a) else
      sumOfPrimes(array, a + 1, acc)
  }

  @tailrec
  def primeNumberGenerator(array: Array[Boolean], i: Int = 2, j: Int = 4): Array[Boolean] = {
    if j < array.length then
      array.update(j, false)
      primeNumberGenerator(array, i, j + i)
    else if i * i < array.length
    then primeNumberGenerator(array, i + 1, (i + 1) * (i + 1))
    else array
  }
}
