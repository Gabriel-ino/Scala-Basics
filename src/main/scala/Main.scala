/*
   Scala Basics
   By: Gabriel Chaves
*/
import expressions.Expressions
import functions.Functions
import recursions.Recursions
import CBNvsCBV.CBNvsCBV
import defaultArgs.DefaultArgs

object Main extends App {
  // Val is an immutable value
  val x: Int = 42
  println(x)

  // The compiler can infer types


  // Other types:
  val my_string: String = "Gabriel"
  val my_boolean: Boolean = false
  val my_char: Char = 'a'
  val my_short: Short = 2001
  val myLong: Long = 32873487292734L
  val myFloat: Float = 2.0f
  val myDouble: Double = 3.1415


  println("Hello, " + my_string)

  // Variables:
    var my_variable_number: Int = 4
    my_variable_number += 1
    println(my_variable_number)
    Expressions.start()
    println(Functions.firstFunction("Hi", 80))
    println(Functions.withoutParameter())
    println(Functions.repeatedFunction("String", 9))
    println(Functions.greetingFunction("Gabriel", 19))
    println(Functions.factorial(0))
    println(Functions.fibonacci(8))
    Recursions.factorial(8)
    println(Recursions.smarterFactorial(5000))
    println(Recursions.concatenateString("Gabriel", 5))

    CBNvsCBV.calledByValue(System.nanoTime())
    //CBNvsCBV.calledByName(System.nanoTime())
    //CBNvsCBV.printFirst(CBNvsCBV.infinite(), 34)
    CBNvsCBV.printFirst(34, CBNvsCBV.infinite())
    val testDefault = DefaultArgs.trFact(10) // Without accumulator parameter!
    println(testDefault)

}