package demo

import org.scalatest.FunSuite


class Chapter3ListTest extends FunSuite {
  test("Test List") {
    val listTest = new Chapter3List
    assert(listTest.helloList() == "123")
  }

  test("Test Concat List ") {
    val listContTest = new Chapter3List
    assert(listContTest.conList() == "1234")
  }

  test("Test Tuplet") {
    val learnTuplet = new Chapter3List
    assert(learnTuplet.learnTuples() == "Learn")
  }

  test("Test Mutable Map") {
    val learnMap = new Chapter3List
    assert(learnMap.learnMutuableMap(1) == "Jerry")

  }

  test("Test NonMutable Map") {
    val learnNonMutableMap = new Chapter3List
    assert(learnNonMutableMap.learnMap(1) == "Jerry")
  }
}
