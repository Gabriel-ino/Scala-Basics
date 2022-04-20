package CBNvsCBV

object CBNvsCBV extends App {
    def calledByValue(number: Long): Unit = {
        println("By value: " + number)
        println("By value: " + number)
    }

    def calledByName(number: => Long): Unit = {
        // The arrow says that the parameter will be called by name
        println("By name: " + number)
        println("By name: " + number)
    }
  /*

    In case of passed by value, the program will evaluate the value and use it inside
    the entire function definition, while in case of by name, the program will pass the expression
    literally to the function
  */

  def infinite(): Int = 1 + infinite()
  def printFirst(number: Int, y: => Int): Unit = println(number)

}
