package projecteuler

class ProblemFiveTest extends munit.FunSuite :

  import ProblemFive.*

  test("projectEuler task") {
    assertEquals(232792560L, solve())
  }
  test("projectEuler task") {
    assertEquals(2520L, smallestMultiple(10))
  }
  test("1") {
    assertEquals(1L, smallestMultiple(1))
  }
  test("0") {
    assertEquals(1L, smallestMultiple(0))
  }
  test("2") {
    assertEquals(2L, smallestMultiple(2))
  }
  test("3") {
    assertEquals(6L, smallestMultiple(3))
  }
  test("5") {
    assertEquals(60L, smallestMultiple(5))
  }

