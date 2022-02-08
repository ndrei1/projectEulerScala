package projecteuler

class ProblemTwoTest extends munit.FunSuite :

  import ProblemTwo.*

  test("projectEuler task") {
    assertEquals(4613732, solve())
    assertEquals(2, sumEvenValueFibonacci(2))
    assertEquals(10, sumEvenValueFibonacci(10))
    assertEquals(0, sumEvenValueFibonacci(0))
  }

