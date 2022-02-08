package projecteuler

object ProblemOne {

  //    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  //    The sum of these multiples is 23.
  //    Find the sum of all the multiples of 3 or 5 below 1000.

  def solve(): Int = {
    multiplesOfNumber(1000, 3, 5)
  }

  def multiplesOfNumber(maxValue: Int, a: Int, b: Int): Int =
    calculate((maxValue - 1) / a, a)
      + calculate(maxValue / b, b)
      - calculate(maxValue / (a * b), a * b) - maxValue


  def calculate(a: Int, b: Int): Int =
    a * (b + (a * b)) / 2
}
