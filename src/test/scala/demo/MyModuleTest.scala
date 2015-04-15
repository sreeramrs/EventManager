package demo

import org.scalatest.FunSuite

class MyModuleTest extends FunSuite {
  test("Test my Main Method in MyModuleTest") {
    var myModule = new MyModule
    assert(myModule.abs(-42) == 42)
  }
}
