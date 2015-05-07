package demo


class FibnonacciNew {


    def fib(n: Int): Int = {
      var a = 0
      var b = 1
      var i = 0
      while (i < n) {
        a = a + b
        b = a - b
        i = i + 1
        println("value of a = " + a)

      }
      a
    }

    def fibRec(n: Int): Int = {

      if (n <= 1) return n
      var valueIs = fibRec(n - 1) + fibRec(n - 2)
      println("value of valueIs = " + valueIs)
      valueIs
    }


}
