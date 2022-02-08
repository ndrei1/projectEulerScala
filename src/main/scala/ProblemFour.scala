package projecteuler

import scala.annotation.tailrec

object ProblemFour {

  //    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
  //    is 9009 = 91 × 99.
  //    Find the largest palindrome made from the product of two 3-digit numbers.

  def solve(): Long = {
    largestPalindrome(1000)
  }

  def isPalindrome(a: Long): Boolean = {
    val numbers: List[Long] = digits(a)
    numbers == numbers.reverse
  }

  def digits(number: Long): List[Long] = {
    if number > 0 then number % 10 :: digits(number / 10) else Nil
  }

  @tailrec
  def largestPalindrome(outIndex: Long, innerIndex: Long = 0, acc: Long = 1): Long =
    val result = outIndex * innerIndex
    if outIndex == 0 then 0 else if outIndex == 1 then acc else if acc < result
      && isPalindrome(result)
    then largestPalindrome(outIndex, innerIndex, result) else if innerIndex == 0
    then largestPalindrome(outIndex - 1, outIndex, acc) else
      largestPalindrome(outIndex, innerIndex - 1, acc)
}





