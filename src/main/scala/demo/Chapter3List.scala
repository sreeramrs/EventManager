package demo


class Chapter3List {

  def helloList(): String = {
    val numberList = List("1", "2", "3")
    val result = numberList
    result.mkString
  }

  def conList(): String = {
    val oneTwo = List("1", "2")
    val threeFour = List("3", "4")
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)
    oneTwoThreeFour.mkString
  }

  def learnTuples(): String = {
    val simpleTuple = (99, "Learn")
    println(simpleTuple._1)
    simpleTuple._2
  }

  def learnMutuableMap(keys: Int): String = {
    import scala.collection.mutable.Map
    val simpleMap = Map[Int, String]()
    simpleMap += (1 -> "Jerry")
    simpleMap += (2 -> "Kuru")
    simpleMap += (3 -> "Baby")

    simpleMap(keys)
  }

  def learnMap(inputs: Int): String = {
    val simpleNonMutableMap = Map(1 -> "Jerry", 2 -> "Baby", 3 -> "Kuru")
    simpleNonMutableMap(inputs)
  }
}
