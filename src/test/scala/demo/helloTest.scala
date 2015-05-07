package demo

import org.scalatest.FunSuite


class helloTest extends FunSuite {
  test("say HelloMethod works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello Scala")
  }
}
