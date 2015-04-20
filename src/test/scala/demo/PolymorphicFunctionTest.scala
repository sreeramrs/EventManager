package demo

import org.scalatest.FunSuite


class PolymorphicFunctionTest extends FunSuite {
  test (" Search for an item in an array") {
    var polymorphic =  new PolymorphicFunction
    polymorphic.main(new Array[String](1))
  }

}
