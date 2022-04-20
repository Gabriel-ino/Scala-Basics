package recursions

import scala.annotation.tailrec


// Now let's see how recursions are computed


object Recursions extends App {
    def factorial(number: Int): Int = {
    
    if (number <= 1){
        1
    }else{
        println("Computing factorial of " + number + "-I first need factorial of " + (number-1))
        number * factorial(number - 1)
    }
    // If the number is so much big, it'll throw a stack overflow error
    }

    def smarterFactorial(number: Int): BigInt = {
        // Without stack overflow error
        @tailrec
        def helperFactorial(x: Int, accumulator: BigInt): BigInt = {
            if (x <= 1) accumulator
            else helperFactorial(x - 1, x * accumulator)
        }
        helperFactorial(number, 1)

        // WHEN YOU NEED LOOPS, USE _TAIL_RECURSION
    }

    def concatenateString(s: String, times: Int): String = {
        @tailrec
        def helperConcatenate(passed_string: String, accumulator: String, number:Int): String = {
            if (number <= 1) accumulator
            else helperConcatenate(passed_string, passed_string + accumulator, number - 1)
        }

        helperConcatenate(s, s, times)
    }


    /*
    smarterFactorial(10) = helperFactorial(10)
    = helperFactorial(9, 10 * 1)
    = helperFactorial(8, 9 * 10 * 1)
    = helperFactorial(7, 8 * 9 * 10 * 1)
    ...
    = helperFactorial(2, 3 * 4 * ... * 10 * 1)
    = helperFactorial(1, 1 * 2 * 3 * 4 ... * 10)
    = 1 * 2 * 3 * 4 ... * 10



    */
  
}
