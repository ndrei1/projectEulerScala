package projecteuler

class ProblemThreeTest extends munit.FunSuite :

  import ProblemThree.*

  test("projectEuler task") {
    assertEquals(6857L, solve())
  }

  test("1") {
    assertEquals(1L, largestPrimeFactor(1))
  }

  test("0") {
    assertEquals(1L, largestPrimeFactor(0))
  }

  test("3") {
    assertEquals(3L, largestPrimeFactor(6))
  }

  test("13195") {
    assertEquals(29L, largestPrimeFactor(13195))
  }

  test("13") {
    assertEquals(13L, largestPrimeFactor(13))
  }

  test("111") {
    assert(37L == largestPrimeFactor(111))
  }

  test("222") {
    assert(37L == largestPrimeFactor(222))
  }