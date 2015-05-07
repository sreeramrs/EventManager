package demo

import org.scalatest.FunSuite


class Chapter3Test extends FunSuite {
  test("say Greetings ") {
    val greet = new Chapter3
    println(greet.sayGreetings())
    assert(greet.sayGreetings() == "Hello,world!")
  }

}
