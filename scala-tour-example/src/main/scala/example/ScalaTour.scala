package example

object ScalaTour {
  def main(args: Array[String]): Unit = {
    var intBox = new Box[Int](10)
    println(intBox.get())
  }

  def fizzBuzz(n: Int): Unit =
    for { i <- (1 to n) } {
      if (i % 15 == 0) {
        println("FizzBuzz")
      } else if (i % 3 == 0) {
        println("Fizz")
      } else if (i % 5 == 0) {
        println("Buzz")
      } else {
        println(i)
      }
    }
  def fizzBuzz2(n: Int): Unit =
    for { i <- (1 to n) } {
      i match {
        case x if x % 15 == 0 =>
          println("FizzBuzz")
        case x if x % 3 == 0 =>
          println("Fizz")
        case x if x % 5 == 0 =>
          println("Buzz")
        case x =>
          println(x)
      }
    }
}

class Box[T](var element: T) {
  def get(): T = element
  def set(newElement: T): Unit = {
    element = newElement
  }
}
