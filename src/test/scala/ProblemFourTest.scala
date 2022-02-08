package projecteuler

class ProblemFourTest extends munit.FunSuite :

  import ProblemFour.*

  test("projectEuler task") {
    assertEquals(906609L,solve())
  }

  test("9009") {
    assertEquals(9009L, largestPalindrome(100))
  }

  test("digit12345") {
    assertEquals(List(5L, 4L, 3L, 2L, 1L), digits(12345))
  }

  test("digit0") {
    // assertEquals(Nil, digits(0))
  }

  test("digit1") {
    assertEquals(List(1L), digits(1))
  }

  test("0") {
    assertEquals(0L, largestPalindrome(0))
  }

  test("1") {
    assertEquals(1L, largestPalindrome(1))
  }

  test("isPalindrome 1001") {
    assert(isPalindrome(1001))
  }

  test("isPalindrome 1234") {
    assert(!isPalindrome(1234))
  }




