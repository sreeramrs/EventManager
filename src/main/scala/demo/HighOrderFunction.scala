package demo


class HighOrderFunction {
  def abs(n: Int) : Int = {
   if (n < 0) - n
   else n
 }

  private def formatAbs(x: Int) = {
    val msg = "The Absoulte value of %d is %d"
    msg.format(x, abs(x))

  }

  def formatResult(name : String, n:Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name,n,f(n))
  }

  def factiorial(n:Int) = {
    def go(acc: Int, n:Int): Int = {
      if(n <= 0) acc
      else go(n*acc, n-1)
    }
    go(1,n);
  }
   def main(args: Array[String]) : Unit = {
     println(formatAbs(-42))
     println(formatResult("absolute value",-42, abs))
     println(formatResult("Factorial ",5,factiorial))
    }




}
