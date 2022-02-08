package projecteuler

import scala.annotation.tailrec

object ProblemSeven {

  //    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
  //    What is the 10 001st prime number?
  def solve(): Int = {
    findPrimeNumber(10001)
  }

  @tailrec
  def findPrimeNumber(lastNumber: Int, acc: Int = 1, result: Int = 3): Int =
    if lastNumber == 1 then 2 else if acc == lastNumber then result - 2 else if isPrime(result, result - 1) then findPrimeNumber(lastNumber, acc + 1, result + 2)
    else findPrimeNumber(lastNumber, acc, result + 2)

  @tailrec
  def isPrime(n: Int, d: Int): Boolean = {
    if d == 1 then true
    else if n % d == 0 then false
    else isPrime(n, d - 1)
  }

}
