package demo

import org.scalatest.FunSuite

/**
 * Created by binu on 4/20/15.
 */
class HighOrderFunctionTest extends FunSuite {
  test(" Check if item found in array ") {
    println("HighOrderFunctionTest----Begin")
    var highOrderFun =  new HighOrderFunction
    highOrderFun.main(new Array[String](1))
    println("HighOrderFunctionTest----End")
  }

}
