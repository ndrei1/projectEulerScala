package projecteuler

class ProblemNineTest extends munit.FunSuite :

  import ProblemNine.*

  test("same result") {
    val a: List[Array[Int]] = filter(x => x - x == 0, pythagoreanTripletGenerate(100))
    val c: List[Array[Int]] = filter(x => true, pythagoreanTripletGenerate(100))
    assertEquals(a.length, c.length)
  }

  test("projectEuler task") {
    assertEquals(31875000, solve())
  }

  test("projectEuler example") {
    val b: Array[Int] = filter(x => x == 12, pythagoreanTripletGenerate(1)).head
    val result: Int = b(0) * b(1) * b(2)
    assertEquals(60, result)
  }

  test("1") {
    val b: List[Array[Int]] = pythagoreanTripletGenerate(1)
    val result: Int = b.head(0) * b.head(1) * b.head(2)
    assertEquals(60, result)
  }

  test("0") {
    assertEquals(pythagoreanTripletGenerate(0), Nil)
  }
