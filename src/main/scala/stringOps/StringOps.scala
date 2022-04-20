package stringOps

object StringOps extends App{
    val str: String = "Hello, I'm learning Scala"
    println(str.charAt(2)) // Returns the letter at the passed index
    println(str.substring(7, 11)) // Returns the characters in the passed range
    println(str.split(" ").toList) // Returns an array with the words of the initial string separated by the passed argument
    /* TESTS */
    println(str.startsWith("Hello"))
    println(str.replace(" ", "-")) // Replaces the first passed parameter to the second in the original string
    println(str.toLowerCase())
    println(str.length)

    val numberString = "45"
    val aNumber = numberString.toInt
  
}
