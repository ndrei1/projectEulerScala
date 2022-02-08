package projecteuler

import org.junit.Assert.assertEquals

class ProblemOneTest extends munit.FunSuite :

  import ProblemOne.*

  test("projectEuler task") {
    assertEquals(233168, solve())
  }

  test("100") {
    assertEquals(2318, multiplesOfNumber(100, 3, 5))
  }

  test("0") {
    assertEquals(0, multiplesOfNumber(0, 3, 5))
  }

  test("5") {
    assertEquals(3, multiplesOfNumber(5, 3, 5))
  }

  test("23") {
    assertEquals(23, multiplesOfNumber(10, 3, 5))
  }

  test("28") {
    assertEquals(28, multiplesOfNumber(10, 2, 2))
  }

  test("test from projectEuler") {
    assertEquals(23, multiplesOfNumber(10, 3, 5))
  }

  test("calculate9") {
    assertEquals(9, calculate(2, 3))
  }

  test("calculate1") {
    assertEquals(1, calculate(1, 1))
  }
  test("calculate0") {
    assertEquals(0, calculate(0, 0))
  }