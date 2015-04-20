package demo

import org.scalatest.FunSuite


class FibnonacciNewTest extends FunSuite {
  test("Test Non Recessive ") {
    var fib = new FibnonacciNew
    println("Recessive=" + fib.fib(5))

  }
  test("Test  Recessive ") {
    var fib = new FibnonacciNew
    println("Non Recessive=" + fib.fibRec(5))
  }
}
