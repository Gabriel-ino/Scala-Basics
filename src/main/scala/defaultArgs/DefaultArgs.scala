package defaultArgs

object DefaultArgs extends App {
    def trFact(number: Int, acc: Int = 1): Int = {
        if (number <= 1) acc
        else trFact(number-1, number*acc)
    }
    // Now we can only pass the number argument
  
}
