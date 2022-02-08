package projecteuler

object ProblemSix {

  //    The sum of the squares of the first ten natural numbers is
  //    (1*1)+(2*2)+...+(10*10) = 385
  //    The square of the sum of the first ten natural numbers is,
  //    (1+2+...+10)^2 = 55^2 = 3025
  //    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is.
  //    Find the difference between the sum of the squares of the first one hundred natural numbers
  //    and the square of the sum.

  def solve(): Long = {
    sumSquareDifference(100)
  }

  def sumSquareDifference(a: Long): Long = a * (a + 1) * (3 * a + 2) * (a - 1) / 12

}


