package projecteuler

import scala.annotation.tailrec

object ProblemNine {

  //    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  //    a2 + b2 = c2
  //    For example, 32 + 42 = 9 + 16 = 25 = 52.
  //    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  //    Find the product abc.

  def solve(): Int = {
    val b: Array[Int] = filter(x => x == 1000, pythagoreanTripletGenerate(1000)).head
    b(0) * b(1) * b(2)
  }

  @tailrec
  def pythagoreanTripletGenerate(quantityOfTriplet: Int, c: Int = 5, acc: List[Array[Int]] = Nil): List[Array[Int]] = {

    @tailrec
    def pythagoreanTripletGenerateAcc(a: Int = 3, b: Int = 4, c: Int = 5, acc: List[Array[Int]] = Nil): List[Array[Int]] = {
      if (Math.pow(a, 2) + Math.pow(b, 2)) / Math.pow(c, 2) == 1 then {
        if b < c then pythagoreanTripletGenerateAcc(a, b + 1, c, Array(a, b, c) :: acc) else if a < c
        then pythagoreanTripletGenerateAcc(a + 1, a + 2, c, Array(a, b, c) :: acc) else acc
      } else {
        if b < c then pythagoreanTripletGenerateAcc(a, b + 1, c, acc) else if a < c
        then pythagoreanTripletGenerateAcc(a + 1, a + 2, c, acc) else acc
      }
    }

    val result = pythagoreanTripletGenerateAcc(3, 4, c)
    if acc.length + result.length > quantityOfTriplet then acc else if result.isEmpty then
      pythagoreanTripletGenerate(quantityOfTriplet, c + 1, acc) else pythagoreanTripletGenerate(quantityOfTriplet, c + 1, acc ::: result)

  }

  @tailrec
  def filter(p: Int => Boolean, pythagoreanTriplets: List[Array[Int]], acc: List[Array[Int]] = Nil): List[Array[Int]] = {
    if pythagoreanTriplets.isEmpty then acc
    else if p(pythagoreanTriplets.head(0) + pythagoreanTriplets.head(1) + pythagoreanTriplets.head(2))
    then filter(p, pythagoreanTriplets.tail, pythagoreanTriplets.head :: acc) else
      filter(p, pythagoreanTriplets.tail, acc)
  }

}
