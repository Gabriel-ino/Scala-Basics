package functions

object Functions extends App {
  def firstFunction(my_str: String, index: Int) = my_str + " " + index

  def withoutParameter(): Int = 87

  // Now let's discover how to avoid loop methods:
  def repeatedFunction(my_str: String, number_of_times: Int): String = {
  if (number_of_times == 1) my_str 
  else my_str + repeatedFunction(my_str, number_of_times - 1)
  }

  def greetingFunction(name: String, age: Int): Unit = {
      println("Hi! my name is " + name + " and I'm " + age + " years old")
  }

  def factorial(number: Int): Int = if (number <= 1 && number >= 0) 1 else number * factorial(number - 1) 

  def fibonacci(number: Int): Int = if (number == 1 || number == 2) 1 else fibonacci(number - 1) + fibonacci(number-2)

}
