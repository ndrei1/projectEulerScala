package projecteuler

class ProblemTwelveTest extends munit.FunSuite :

  import ProblemTwelve.*

  test("projectEuler task") {
    assertEquals(76576500, solve())
  }

  test("projectEuler example") {
    assertEquals(28, highlyDivisibleTriangularNumber(1, 0, 4))
  }

  test("1") {
    assertEquals(3, highlyDivisibleTriangularNumber(1, 0, 1))
  }

  test("0") {
    assertEquals(1, highlyDivisibleTriangularNumber(1, 0, 0))
  }

  test("3") {
    assertEquals(6, highlyDivisibleTriangularNumber(1, 0, 3))
  }

  test("the same result") {
    assertEquals(highlyDivisibleTriangularNumber(1, 0, 2),
      highlyDivisibleTriangularNumber(1, 0, 3))
  }





