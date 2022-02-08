package projecteuler

class ProblemSixTest extends munit.FunSuite :

  import ProblemSix.*

  test("projectEuler task") {
    assertEquals(25164150L,solve())
  }
  test("10") {
    assertEquals(2640L, sumSquareDifference(10))
  }
  test("1") {
    assertEquals(0L, sumSquareDifference(1))
  }
  test("0") {
    assertEquals(0L, sumSquareDifference(0))
  }



