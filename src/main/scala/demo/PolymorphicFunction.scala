package demo

/**
 * Created by binu on 4/20/15.
 */
class PolymorphicFunction {
  var keys= ""
  def findFirstPolymorphic[A](as: Array[A], p: A => Boolean) : Int = {
    def loop(n:Int) : Int = {
      if (n >= as.length) - 1
      else if (p(as(n))) n
      else loop(n +1 )
    }
    loop(0)
  }

  def findFirst(ss: Array[String], key: String) : Int = {
    def loop(n: Int) : Int = {
      if( n >= ss.length) - 1
      else if (ss(n) == key) n
      else loop(n +1)
    }
    loop(0)
  }

    def compareStringFun(n:String) : Boolean = {
    if ( n == this.keys) true
    else false
  }

  def compareSecondStringFun(n:String, keyV2: String) : Boolean = {
    if ( n == keyV2) true
    else false
  }


  def findSecondPolymorphic[A,B](as: Array[A],b:B, p: (A,B) => Boolean) : Int = {
    def loop(n:Int) : Int = {
      if (n >= as.length) - 1
      else if (p(as(n),b)) n
      else loop(n +1 )
    }
    loop(0)
  }
  def main(args: Array[String]) : Unit = {
    val arrayOfNumbers : Array[String] =  new Array[String](3)
    arrayOfNumbers(0) = "1"
    arrayOfNumbers(1) = "4"
    arrayOfNumbers(2) = "5"
    println("The Non PolymorphicFunction Index is ="+ findFirst(arrayOfNumbers,"5"))
    this.keys = "5"
    println("The PolymorphicFunction Index is ="+ findFirstPolymorphic(arrayOfNumbers,compareStringFun)
    )
    println("The PolymorphicFunction Index Two is ="+ findSecondPolymorphic(arrayOfNumbers,"5",compareSecondStringFun))
  }

}
