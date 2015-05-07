package demo


class Chapter3 {
  def sayGreetings(): String = {
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "world!"
    var result = ""
    for (i <- 0 to 2) {
      result += greetStrings(i)
    }
    result
  }
}
