package projecteuler

class ProblemSevenTest extends munit.FunSuite :

  import ProblemSeven.*

  test("projectEuler task") {
    assertEquals(104743, solve())
  }
  test("1") {
    assertEquals(2, findPrimeNumber(1))
  }
  test("22") {
    assertEquals(79, findPrimeNumber(22))
  }
  test("6") {
    assertEquals(13, findPrimeNumber(6))
  }
  test("isPrime2") {
    assert(isPrime(2, 1))
  }
  test("isPrime3") {
    assert(isPrime(3, 2))
  }
  test("isPrime7") {
    assert(isPrime(7, 6))
  }
