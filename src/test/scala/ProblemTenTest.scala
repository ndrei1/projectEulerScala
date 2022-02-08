package projecteuler

class ProblemTenTest extends munit.FunSuite :

  import ProblemTen.*

  test("calculate 1") {
    assertEquals(-1L, sumOfPrimes(primeNumberGenerator(Array.fill(1)(true))) - 1)
  }

  test("calculate 0") {
    assertEquals(-1L, sumOfPrimes(primeNumberGenerator(Array.fill(00)(true))) - 1)
  }

  test("projectEuler task") {
    assertEquals(142913828922L, solve())
  }

  test("calculate 5") {
    assertEquals(5L, sumOfPrimes(primeNumberGenerator(Array.fill(5)(true))) - 1)
  }

  test("calculate 10") {
    assertEquals(17L, sumOfPrimes(primeNumberGenerator(Array.fill(10)(true))) - 1)
  }






